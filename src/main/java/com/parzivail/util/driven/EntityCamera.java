package com.parzivail.util.driven;

import com.parzivail.pswm.PSWM;
import com.parzivail.util.lwjgl.Vector3f;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.ArrayList;

public class EntityCamera extends EntityLivingBase
{
	public Pilotable pilotable;

	public EntityCamera(World world)
	{
		super(world);
		setSize(0F, 0F);
	}

	@Override
	public Iterable<ItemStack> getArmorInventoryList()
	{
		return new ArrayList<>();
	}

	@Override
	public ItemStack getItemStackFromSlot(EntityEquipmentSlot slotIn)
	{
		return new ItemStack(Blocks.AIR);
	}

	@Override
	public void setItemStackToSlot(EntityEquipmentSlot slotIn, ItemStack stack)
	{

	}

	public EntityCamera(World world, Pilotable d)
	{
		this(world);
		pilotable = d;
		setPosition(d.posX, d.posY, d.posZ);
	}

	@Override
	public void onUpdate()
	{
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;

		if (pilotable == null)
			return;

		Vector3f cameraPosition = new Vector3f(-1, 0, 0);
		cameraPosition.scale(pilotable.data.cameraDistance);
		cameraPosition = pilotable.axes.findLocalVectorGlobally(cameraPosition);

		//Lerp it
		double dX = pilotable.posX + cameraPosition.x - posX;
		double dY = pilotable.posY + cameraPosition.y - posY;
		double dZ = pilotable.posZ + cameraPosition.z - posZ;

		setPosition(posX + dX * pilotable.data.cameraFloatDampening, posY + dY * pilotable.data.cameraFloatDampening, posZ + dZ * pilotable.data.cameraFloatDampening);

		rotationYaw = MathHelper.wrapDegrees(pilotable.axes.getYaw() - 90F);
		rotationPitch = MathHelper.wrapDegrees(pilotable.axes.getPitch());
	}

	@Override
	public EnumHandSide getPrimaryHand()
	{
		return EnumHandSide.RIGHT;
	}

	public static void loadAnglesFromStored()
	{
		PSWM.camera.setPositionAndRotation(PSWM.cameraPosition.x, PSWM.cameraPosition.y, PSWM.cameraPosition.z, PSWM.cameraRotation.y, PSWM.cameraRotation.x);
	}
}
