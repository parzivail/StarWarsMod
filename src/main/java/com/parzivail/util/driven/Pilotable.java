package com.parzivail.util.driven;

import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.dimension.PlanetInformation;
import com.parzivail.pswm.handlers.KeyHandler;
import com.parzivail.pswm.network.MessageDamageShip;
import com.parzivail.pswm.network.MessageDrivableControl;
import com.parzivail.pswm.network.MessageShipData;
import com.parzivail.util.lwjgl.Vector3f;
import com.parzivail.util.math.RotatedAxes;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public abstract class Pilotable extends Entity implements IEntityAdditionalSpawnData
{
	public ShipData data;
	public float throttle;

	public EntitySeat[] seats;

	public float prevRotationRoll;
	public double serverYaw, serverPitch, serverRoll;
	public RotatedAxes prevAxes;
	public RotatedAxes axes;

	public Vector3f angularVelocity = new Vector3f(0F, 0F, 0F);

	@SideOnly(Side.CLIENT)
	public EntityLivingBase camera;

	public boolean syncFromServer = true;
	public double serverPosX, serverPosY, serverPosZ;
	public int serverPositionTransitionTicker;

	private boolean hasInit = false;

	public Pilotable(World world)
	{
		super(world);
		data = createShipInfo();
		axes = new RotatedAxes();
		prevAxes = new RotatedAxes();
		preventEntitySpawning = true;
		setSize(1F, 1F);
		//yOffset = 6F / 16F;
		ignoreFrustumCheck = true;
		renderDistanceWeight = 200D;
		forceSpawn = true;
		seats = new EntitySeat[data.numPassengers];
		setupShipData();
	}

	protected void setupShipData()
	{

	}

	private ShipData createShipInfo()
	{
		return new ShipData();
	}

	public Pilotable(World world, double x, double y, double z)
	{
		this(world);
		setPosition(x, y, z);
		prevPosX = x;
		prevPosY = y;
		prevPosZ = z;
	}

	private void createSeats()
	{
		for (int i = 0; i < data.numPassengers; i++)
		{
			seats[i] = new EntitySeat(worldObj, this, i);
			seats[i].setPosition(posX, posY, posZ);
			worldObj.spawnEntityInWorld(seats[i]);
		}
		hasInit = true;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer)
	{
		if (isDead)
			return false;

		//Check each seat in order to see if the entity can sit in it
		for (int i = 0; i < data.numPassengers; i++)
			if (seats[i] != null && seats[i].interactFirst(entityplayer))
				return true;

		return false;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tag)
	{
		tag.setFloat("RotationYaw", axes.getYaw());
		tag.setFloat("RotationPitch", axes.getPitch());
		tag.setFloat("RotationRoll", axes.getRoll());
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tag)
	{
		prevRotationYaw = tag.getFloat("RotationYaw");
		prevRotationPitch = tag.getFloat("RotationPitch");
		prevRotationRoll = tag.getFloat("RotationRoll");
		axes = new RotatedAxes(prevRotationYaw, prevRotationPitch, prevRotationRoll);
	}

	@Override
	public void writeSpawnData(ByteBuf data)
	{
		data.writeFloat(axes.getYaw());
		data.writeFloat(axes.getPitch());
		data.writeFloat(axes.getRoll());
	}

	@Override
	public void readSpawnData(ByteBuf data)
	{
		try
		{
			axes.setAngles(data.readFloat(), data.readFloat(), data.readFloat());
			prevRotationYaw = axes.getYaw();
			prevRotationPitch = axes.getPitch();
			prevRotationRoll = axes.getRoll();
		}
		catch (Exception e)
		{
			super.setDead();
			e.printStackTrace();
		}

		if (this.camera == null)
		{
			camera = new EntityCamera(worldObj, this);
			worldObj.spawnEntityInWorld(camera);
		}
	}

	@SideOnly(Side.CLIENT)
	public EntityLivingBase getCamera()
	{
		return camera;
	}

	@Override
	protected boolean canTriggerWalking()
	{
		return false;
	}

	@Override
	protected void entityInit()
	{
	}

	@Override
	public AxisAlignedBB getCollisionBox(Entity entity)
	{
		return null;
	}

	@Override
	public AxisAlignedBB getBoundingBox()
	{
		return boundingBox;
	}

	@Override
	public boolean canBePushed()
	{
		return false;
	}

	@Override
	public double getMountedYOffset()
	{
		return -0.3D;
	}

	@Override
	public void setDead()
	{
		super.setDead();

		if (worldObj.isRemote)
			camera.setDead();

		for (EntitySeat seat : seats)
			if (seat != null)
				seat.setDead();
	}

	@Override
	public void onCollideWithPlayer(EntityPlayer par1EntityPlayer)
	{
	}

	@Override
	public boolean canBeCollidedWith()
	{
		return !isDead;
	}

	@Override
	public void applyEntityCollision(Entity entity)
	{
		if (!isPartOfThis(entity))
			super.applyEntityCollision(entity);
	}

	@Override
	public void setPositionAndRotation2(double d, double d1, double d2, float f, float f1, int i)
	{
		if (!(riddenByEntity instanceof EntityPlayer) || !StarWarsMod.proxy.isThePlayer((EntityPlayer)riddenByEntity))
		{
			if (syncFromServer)
			{
				serverPositionTransitionTicker = i + 5;
			}
			else
			{
				double var10 = d - posX;
				double var12 = d1 - posY;
				double var14 = d2 - posZ;
				double var16 = var10 * var10 + var12 * var12 + var14 * var14;

				if (var16 <= 1.0D)
				{
					return;
				}

				serverPositionTransitionTicker = 3;
				this.setPosition(d, d1, d2);
			}
			serverPosX = d;
			serverPosY = d1;
			serverPosZ = d2;
			serverYaw = f;
			serverPitch = f1;
		}
	}

	public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll, double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt, float steeringYaw)
	{
		if (worldObj.isRemote)
		{
			serverPosX = x;
			serverPosY = y;
			serverPosZ = z;
			serverYaw = yaw;
			serverPitch = pitch;
			serverRoll = roll;
			serverPositionTransitionTicker = 5;
		}
		else
		{
			setPosition(x, y, z);
			prevRotationYaw = yaw;
			prevRotationPitch = pitch;
			prevRotationRoll = roll;
			setRotation(yaw, pitch, roll);
		}
		//Set the motions regardless of side.
		motionX = motX;
		motionY = motY;
		motionZ = motZ;
		angularVelocity = new Vector3f(velYaw, velPitch, velRoll);
		throttle = throt;
	}


	@Override
	public void setVelocity(double d, double d1, double d2)
	{
		motionX = d;
		motionY = d1;
		motionZ = d2;
	}

	public Vector3f getInWorldPositionOf(Vector3f modelCoordinate)
	{
		Vector3f localPosition = new Vector3f(modelCoordinate.x / 8f, modelCoordinate.y / 8f, modelCoordinate.z / 8f);
		Vector3f relativePosition = axes.findLocalVectorGlobally(localPosition);
		return new Vector3f(posX + relativePosition.x, posY + relativePosition.y, posZ + relativePosition.z);
	}

	public Vector3f getLookVec3f()
	{
		return axes.getXAxis();
	}

	@Override
	public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
	{
		StarWarsMod.network.sendToServer(new MessageDamageShip(this, p_70097_1_, p_70097_2_));
		return true;
	}

	public void processDamage(String damageType, float amount)
	{
		if (amount > data.shieldHealth)
		{
			data.shipHealth -= amount - data.shieldHealth;
			data.shieldHealth = 0;
		}
		else
			data.shipHealth -= amount;

		StarWarsMod.network.sendToDimension(new MessageShipData(this), dimension);
	}

	@Override
	public void onUpdate()
	{
		if (!hasInit && !worldObj.isRemote)
			createSeats();

		super.onUpdate();

		if (this.worldObj.isRemote)
			KeyHandler.handleVehicleMovement();

		prevRotationYaw = axes.getYaw();
		prevRotationPitch = axes.getPitch();
		prevRotationRoll = axes.getRoll();
		prevAxes = axes.clone();

		if (riddenByEntity != null && riddenByEntity.isDead)
		{
			riddenByEntity = null;
		}
		if (riddenByEntity != null && isDead)
		{
			riddenByEntity.mountEntity(null);
		}
		if (riddenByEntity != null)
			riddenByEntity.fallDistance = 0F;

		if (seats[0] != null && seats[0].riddenByEntity == null && worldObj.isRemote)
		{
			this.throttle = 0;
			StarWarsMod.network.sendToServer(new MessageDrivableControl(this));
		}

		this.moveEntity(this.motionX, this.motionY, this.motionZ);

		//Work out if this is the client side and the entity is driving
		boolean thePlayerIsDrivingThis = worldObj.isRemote && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && StarWarsMod.proxy.isThePlayer((EntityPlayer)seats[0].riddenByEntity);

		//Player is not driving this. Update its position from server update packets
		if (worldObj.isRemote && !thePlayerIsDrivingThis)
		{
			//The drivable is currently moving towards its server position. Continue doing so.
			if (serverPositionTransitionTicker > 0)
			{
				double x = posX + (serverPosX - posX) / serverPositionTransitionTicker;
				double y = posY + (serverPosY - posY) / serverPositionTransitionTicker;
				double z = posZ + (serverPosZ - posZ) / serverPositionTransitionTicker;
				double dYaw = MathHelper.wrapAngleTo180_double(serverYaw - axes.getYaw());
				double dPitch = MathHelper.wrapAngleTo180_double(serverPitch - axes.getPitch());
				double dRoll = MathHelper.wrapAngleTo180_double(serverRoll - axes.getRoll());
				rotationYaw = (float)(axes.getYaw() + dYaw / serverPositionTransitionTicker);
				rotationPitch = (float)(axes.getPitch() + dPitch / serverPositionTransitionTicker);
				float rotationRoll = (float)(axes.getRoll() + dRoll / serverPositionTransitionTicker);
				--serverPositionTransitionTicker;
				setPosition(x, y, z);
				setRotation(rotationYaw, rotationPitch, rotationRoll);
			}
		}

		for (EntitySeat seat : seats)
			if (seat != null)
				seat.updatePosition();

		//Calculate movement on the client and then send position, rotation etc to the server
		if (thePlayerIsDrivingThis)
		{
			calculateMotion();

			serverPosX = posX;
			serverPosY = posY;
			serverPosZ = posZ;
			serverYaw = axes.getYaw();
			StarWarsMod.network.sendToServer(new MessageDrivableControl(this));
		}

		int ht = this.worldObj.getHeightValue((int)this.posX, (int)this.posZ) - 1;

		if (this.worldObj.getBlock((int)this.posX, ht, (int)this.posZ) == Blocks.water && this.worldObj.isRemote && this.seats[0] != null && this.seats[0].riddenByEntity instanceof EntityPlayer)
		{
			for (int i = 0; i < 70; i++)
			{
				double motionX = StarWarsMod.rngGeneral.nextGaussian() * 0.03D;
				//double motionY = 0.03 * this.move;
				double motionY = 0.03;
				motionY *= Math.max(1, 10 - (this.posY - ht));
				double motionZ = StarWarsMod.rngGeneral.nextGaussian() * 0.03D;

				float sXa = MathHelper.cos((float)Math.toRadians(this.axes.getYaw())) * 7;
				float sZa = MathHelper.sin((float)Math.toRadians(this.axes.getYaw())) * 7;

				float sXb = MathHelper.cos((float)Math.toRadians(this.axes.getYaw() + 180)) * 7;
				float sZb = MathHelper.sin((float)Math.toRadians(this.axes.getYaw() + 180)) * 7;

				float width = 1f;

				String n = "wake";
				String n2 = "explode";

				this.worldObj.spawnParticle(n, this.posX + sXa + StarWarsMod.rngGeneral.nextFloat() * width * 2.0F - width, ht + StarWarsMod.rngGeneral.nextFloat() * 0.2f, this.posZ + sZa + StarWarsMod.rngGeneral.nextFloat() * width * 2.0F - width, motionX, motionY, motionZ);
				this.worldObj.spawnParticle(n, this.posX + sXb + StarWarsMod.rngGeneral.nextFloat() * width * 2.0F - width, ht + StarWarsMod.rngGeneral.nextFloat() * 0.2f, this.posZ + sZb + StarWarsMod.rngGeneral.nextFloat() * width * 2.0F - width, motionX, motionY, motionZ);

				if (i % 5 == 0)
				{
					this.worldObj.spawnParticle(n2, this.posX + sXa + StarWarsMod.rngGeneral.nextFloat() * width * 2.0F - width, ht + StarWarsMod.rngGeneral.nextFloat() * 0.2f, this.posZ + sZa + StarWarsMod.rngGeneral.nextFloat() * width * 2.0F - width, motionX, motionY, motionZ);
					this.worldObj.spawnParticle(n2, this.posX + sXb + StarWarsMod.rngGeneral.nextFloat() * width * 2.0F - width, ht + StarWarsMod.rngGeneral.nextFloat() * 0.2f, this.posZ + sZb + StarWarsMod.rngGeneral.nextFloat() * width * 2.0F - width, motionX, motionY, motionZ);
				}

			}
		}
	}

	@Override
	protected void fall(float k)
	{
	}

	/**
	 * Takes a vector (such as the origin of a seat / gun) and translates it from local coordinates to global coordinates
	 */
	public Vector3f rotate(Vector3f inVec)
	{
		return axes.findLocalVectorGlobally(inVec);
	}

	/**
	 * Takes a vector (such as the origin of a seat / gun) and translates it from local coordinates to global coordinates
	 */
	public Vector3f rotate(Vec3 inVec)
	{
		return rotate(inVec.xCoord, inVec.yCoord, inVec.zCoord);
	}

	/**
	 * Takes a vector (such as the origin of a seat / gun) and translates it from local coordinates to global coordinates
	 */
	public Vector3f rotate(double x, double y, double z)
	{
		return rotate(new Vector3f((float)x, (float)y, (float)z));
	}

	//Rotate the plane locally by some angle about the yaw axis
	public void rotateYaw(float rotateBy)
	{
		if (Math.abs(rotateBy) < 0.01F)
			return;
		axes.rotateLocalYaw(rotateBy);
		updatePrevAngles();
	}

	//Rotate the plane locally by some angle about the pitch axis
	public void rotatePitch(float rotateBy)
	{
		if (Math.abs(rotateBy) < 0.01F)
			return;
		axes.rotateLocalPitch(rotateBy);
		updatePrevAngles();
	}

	//Rotate the plane locally by some angle about the roll axis
	public void rotateRoll(float rotateBy)
	{
		if (Math.abs(rotateBy) < 0.01F)
			return;
		axes.rotateLocalRoll(rotateBy);
		updatePrevAngles();
	}

	public void updatePrevAngles()
	{
		//Correct angles that crossed the +/- 180 line, so that rendering doesnt make them swing 360 degrees in one tick.
		double dYaw = axes.getYaw() - prevRotationYaw;
		if (dYaw > 180)
			prevRotationYaw += 360F;
		if (dYaw < -180)
			prevRotationYaw -= 360F;

		double dPitch = axes.getPitch() - prevRotationPitch;
		if (dPitch > 180)
			prevRotationPitch += 360F;
		if (dPitch < -180)
			prevRotationPitch -= 360F;

		double dRoll = axes.getRoll() - prevRotationRoll;
		if (dRoll > 180)
			prevRotationRoll += 360F;
		if (dRoll < -180)
			prevRotationRoll -= 360F;
	}

	public void setRotation(float rotYaw, float rotPitch, float rotRoll)
	{
		axes.setAngles(rotYaw, rotPitch, rotRoll);
	}

	//Used to stop self collision
	public boolean isPartOfThis(Entity ent)
	{
		for (EntitySeat seat : seats)
		{
			if (seat == null)
				continue;
			if (ent == seat)
				return true;
			if (seat.riddenByEntity == ent)
				return true;
		}
		return ent == this;
	}

	@Override
	public float getShadowSize()
	{
		return 0.0F;
	}

	public boolean isDead()
	{
		return isDead;
	}

	public Entity getControllingEntity()
	{
		if (seats == null || seats.length == 0 || seats[0] == null)
			return null;
		return seats[0].getControllingEntity();
	}

	public Seat getSeatData(int id)
	{
		return data.seatInfo[id];
	}

	public boolean isControlling(EntityPlayer thePlayer)
	{
		return getControllingEntity() != null && thePlayer != null && getControllingEntity().getEntityId() == thePlayer.getEntityId();
	}

	public void acceptInput(ShipInput input)
	{
		if (this.seats[0] == null)
			return;

		this.seats[0].acceptInput(input);
	}

	public void keyTyped(char eventCharacter, int eventKey, boolean eventKeyState)
	{
		if (this.seats[0] == null)
			return;

		this.seats[0].keyTyped(eventCharacter, eventKey, eventKeyState);
	}

	private void calculateMotion()
	{
		Vector3f forwards = (Vector3f)axes.getXAxis().normalise();

		//Apply gravity
		PlanetInformation info = PlanetInformation.getPlanet(this.worldObj.provider.dimensionId);
		float g = info == null ? 0.98f / 20f : info.getGravity();

		motionY -= g;

		float amountOfLift = 2F * g * throttle;
		if (amountOfLift > g)
			amountOfLift = g;

		motionY += amountOfLift;

		//Add the corrected pos
		motionX += throttle * forwards.x;
		motionY += throttle * forwards.y;
		motionZ += throttle * forwards.z;

		float drag = info == null ? 0.75f : info.getAtmosphericDrag();

		//Apply drag
		motionX *= drag;
		motionY *= drag;
		motionZ *= drag;
	}
}
