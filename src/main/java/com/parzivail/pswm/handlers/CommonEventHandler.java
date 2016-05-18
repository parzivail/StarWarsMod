package com.parzivail.pswm.handlers;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsItems;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.achievement.StarWarsAchievements;
import com.parzivail.pswm.entities.*;
import com.parzivail.pswm.exception.UserError;
import com.parzivail.pswm.items.weapons.ItemLightsaber;
import com.parzivail.pswm.jedirobes.ArmorJediRobes;
import com.parzivail.pswm.jedirobes.powers.Power;
import com.parzivail.pswm.jedirobes.powers.PowerDefend;
import com.parzivail.pswm.network.*;
import com.parzivail.pswm.registry.KeybindRegistry;
import com.parzivail.pswm.rendering.gui.AnimationTargetingComputer;
import com.parzivail.pswm.rendering.gui.GuiVehicle;
import com.parzivail.pswm.sound.SoundSFoil;
import com.parzivail.pswm.utils.BlasterBoltType;
import com.parzivail.pswm.utils.ForceUtils;
import com.parzivail.pswm.utils.ForceUtils.EntityCooldownEntry;
import com.parzivail.pswm.vehicles.*;
import com.parzivail.util.AnimationManager;
import com.parzivail.util.entity.EntityUtils;
import com.parzivail.util.ui.GuiManager;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CommonEventHandler
{
	@SubscribeEvent
	public void logOut(PlayerLoggedInEvent event) throws UserError
	{
		this.resetRobes(event);
	}

	@SubscribeEvent
	public void logOut(PlayerLoggedOutEvent event)
	{
		this.resetRobes(event);
	}

	@SubscribeEvent
	public void logOut(PlayerRespawnEvent event)
	{
		this.resetRobes(event);
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onKeyInput(InputEvent.KeyInputEvent event)
	{
		if (KeybindRegistry.keyShootVehicle.isPressed())
		{
			if (StarWarsMod.mc.thePlayer.ridingEntity != null)
			{
				if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSpeederBike || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicHothSpeederBike)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.SPEEDER));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "fx.shoot.bike", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
				}
				else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicXWing || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicAWing || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicYWing || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSkyhopper || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicATST)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.XWING));
					if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicATST)
					{
						StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "fx.shoot.bike", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
					}
					else
					{
						StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.xwing.fire", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
					}
					GuiVehicle.isFiring = true;
					GuiVehicle.blipFrame = GuiVehicle.blipMax;
				}
				else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIE || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEInterceptor || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEAdvanced || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEBomber)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.TIE));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.tie.fire", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
				}
			}
			else if (StarWarsMod.mc.thePlayer.inventory.getCurrentItem() != null && StarWarsMod.mc.thePlayer.inventory.getCurrentItem().getItem() instanceof ItemLightsaber)
			{
				ItemStack s = StarWarsMod.mc.thePlayer.inventory.getCurrentItem();
				EntityPlayer entityPlayer = StarWarsMod.mc.thePlayer;
				if (s.stackTagCompound.getString(ItemLightsaber.nbtHilt).equals("ezra") && s.stackTagCompound.getInteger(ItemLightsaber.nbtBlasterTimeout) == 0 && !s.stackTagCompound.getBoolean(ItemLightsaber.nbtBladeOn))
				{
					entityPlayer.addStat(StarWarsAchievements.ezraBlaster, 1);
					entityPlayer.playSound(Resources.MODID + ":" + "fx.shoot.dl44", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.rngGeneral, -0.2D, 0.2D));
					s.stackTagCompound.setInteger(ItemLightsaber.nbtBlasterTimeout, 40);
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(entityPlayer, BlasterBoltType.EZRA));
				}
			}
		}

		if (KeybindRegistry.keySFoil.isPressed())
			if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicXWing)
			{
				VehicXWing xwing = (VehicXWing)StarWarsMod.mc.thePlayer.ridingEntity;
				if (xwing.getSFoil() <= 0.45f && !(xwing.isOpening || xwing.isClosing))
				{
					xwing.isOpening = true;
					Minecraft.getMinecraft().getSoundHandler().playSound(new SoundSFoil(StarWarsMod.mc.thePlayer, true));
				}
				if (xwing.getSFoil() >= 0.55f && !(xwing.isOpening || xwing.isClosing))
				{
					xwing.isClosing = true;
					Minecraft.getMinecraft().getSoundHandler().playSound(new SoundSFoil(StarWarsMod.mc.thePlayer, false));
				}
			}
			else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSkyhopper)
			{
				VehicSkyhopper skyh = (VehicSkyhopper)StarWarsMod.mc.thePlayer.ridingEntity;
				if (skyh.getWing() <= 0.45f && !(skyh.isOpening || skyh.isClosing))
				{
					skyh.isOpening = true;
					Minecraft.getMinecraft().getSoundHandler().playSound(new SoundSFoil(StarWarsMod.mc.thePlayer, false));
				}
				if (skyh.getWing() >= 0.55f && !(skyh.isOpening || skyh.isClosing))
				{
					skyh.isClosing = true;
					Minecraft.getMinecraft().getSoundHandler().playSound(new SoundSFoil(StarWarsMod.mc.thePlayer, true));
				}
			}

		if (KeybindRegistry.keyDebug != null && KeybindRegistry.keyDebug.isPressed())
		{
			if (AnimationManager.isRunning(AnimationTargetingComputer.class) != null)
				AnimationManager.isRunning(AnimationTargetingComputer.class).stop();
			else
				new AnimationTargetingComputer().start();
		}

		if (KeybindRegistry.keyLSForge.isPressed())
			StarWarsMod.mc.thePlayer.openGui(StarWarsMod.instance, Resources.GUI_LSFORGE, null, 0, 0, 0);

		if (KeybindRegistry.keyLSToggle.isPressed())
		{
			EntityPlayer player = StarWarsMod.mc.thePlayer;
			ItemStack stack = player.inventory.getCurrentItem();
			if (stack.stackTagCompound != null && stack.stackTagCompound.getInteger(ItemLightsaber.nbtBladeTimeout) <= 0)
			{
				if (!stack.stackTagCompound.getBoolean(ItemLightsaber.nbtBladeWaterproof) && player.isInsideOfMaterial(Material.water))
				{
					stack.stackTagCompound.setInteger(ItemLightsaber.nbtBladeTimeout, 10);
					player.playSound(Resources.MODID + ":" + "item.lightsaber.fizz", 1.0F, 1.0F);
				}
				else
				{
					if (stack.stackTagCompound.getBoolean(ItemLightsaber.nbtBladeOn))
						player.playSound(Resources.MODID + ":" + "item.lightsaber.close", 1.0F, 1.0F);
					else
						player.playSound(Resources.MODID + ":" + "item.lightsaber.open", 1.0F, 1.0F);
					stack.stackTagCompound.setBoolean(ItemLightsaber.nbtBladeOn, !stack.stackTagCompound.getBoolean(ItemLightsaber.nbtBladeOn));
					stack.stackTagCompound.setInteger(ItemLightsaber.nbtBladeTimeout, 10);
					StarWarsMod.network.sendToServer(new MessageSetPlayerHolding(player, stack));
				}
			}
		}

		if (KeybindRegistry.keyQuest != null && KeybindRegistry.keyQuest.isPressed())
			StarWarsMod.mc.thePlayer.openGui(StarWarsMod.instance, Resources.GUI_QUEST, null, 0, 0, 0);

		if (KeybindRegistry.keyRobeGui.isPressed())
			if (StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2) != null && StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2).getItem() == StarWarsItems.jediRobes)
				StarWarsMod.mc.thePlayer.openGui(StarWarsMod.instance, Resources.GUI_ROBES, null, 0, 0, 0);

		if (KeybindRegistry.keyRobePowerNext.isPressed())
		{
			if (StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2) != null && StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2).getItem() == StarWarsItems.jediRobes)
			{
				String current = ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer);
				ArrayList<String> powers = ForceUtils.getPowersAvailableAtLevel(ArmorJediRobes.getSide(StarWarsMod.mc.thePlayer), ArmorJediRobes.getLevel(StarWarsMod.mc.thePlayer));
				int index = Arrays.asList(powers.toArray()).indexOf(current);
				do
				{
					index++;
					if (index >= powers.size())
						index = 0;
				}
				while (ArmorJediRobes.getLevelOf(StarWarsMod.mc.thePlayer, powers.get(index)) == 0 && !powers.get(index).equals(current));
				if (index > -1 && !powers.get(index).equals(current))
				{
					if (index >= powers.size())
						index = 0;
					Power selectedPower = Power.getPowerFromName(powers.get(index));
					ForceUtils.activePower = selectedPower;
					ArmorJediRobes.setActive(StarWarsMod.mc.thePlayer, selectedPower.name);
					ArmorJediRobes.setActiveLevel(StarWarsMod.mc.thePlayer, selectedPower.currentLevel);
					ArmorJediRobes.setHealth(StarWarsMod.mc.thePlayer, selectedPower.currentLevel);
					StarWarsMod.network.sendToServer(new MessageRobesStringNBT(StarWarsMod.mc.thePlayer, Resources.nbtActive, selectedPower.name));
					StarWarsMod.network.sendToServer(new MessageRobesIntNBT(StarWarsMod.mc.thePlayer, Resources.nbtActiveLevel, Power.getPowerFromName(selectedPower.name).currentLevel));
					if (selectedPower.name.equals("defend"))
						StarWarsMod.network.sendToServer(new MessageRobesIntNBT(StarWarsMod.mc.thePlayer, Resources.nbtActiveHealth, Power.getPowerFromName(selectedPower.name).currentLevel));
				}
			}
		}

		if (KeybindRegistry.keyRobePowerPrev.isPressed())
		{
			if (StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2) != null && StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2).getItem() == StarWarsItems.jediRobes)
			{
				String current = ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer);
				ArrayList<String> powers = ForceUtils.getPowersAvailableAtLevel(ArmorJediRobes.getSide(StarWarsMod.mc.thePlayer), ArmorJediRobes.getLevel(StarWarsMod.mc.thePlayer));
				int index = Arrays.asList(powers.toArray()).indexOf(current);
				do
				{
					index--;
					if (index < 0)
						index = powers.size() - 1;
				}
				while (ArmorJediRobes.getLevelOf(StarWarsMod.mc.thePlayer, powers.get(index)) == 0 && !powers.get(index).equals(current));
				if (index > -1 && !powers.get(index).equals(current))
				{
					if (index < 0)
						index = powers.size() - 1;
					Power selectedPower = Power.getPowerFromName(powers.get(index));
					ForceUtils.activePower = selectedPower;
					ArmorJediRobes.setActive(StarWarsMod.mc.thePlayer, selectedPower.name);
					ArmorJediRobes.setActiveLevel(StarWarsMod.mc.thePlayer, selectedPower.currentLevel);
					ArmorJediRobes.setHealth(StarWarsMod.mc.thePlayer, selectedPower.currentLevel);
					StarWarsMod.network.sendToServer(new MessageRobesStringNBT(StarWarsMod.mc.thePlayer, Resources.nbtActive, selectedPower.name));
					StarWarsMod.network.sendToServer(new MessageRobesIntNBT(StarWarsMod.mc.thePlayer, Resources.nbtActiveLevel, Power.getPowerFromName(selectedPower.name).currentLevel));
					if (selectedPower.name.equals("defend"))
						StarWarsMod.network.sendToServer(new MessageRobesIntNBT(StarWarsMod.mc.thePlayer, Resources.nbtActiveHealth, Power.getPowerFromName(selectedPower.name).currentLevel));
				}
			}
		}

		if (KeybindRegistry.keyRobePower.isPressed())
		{
			if (StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2) != null && StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2).getItem() == StarWarsItems.jediRobes)
			{
				Power active = Power.getPowerFromName(ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer));

				if (active != null && ArmorJediRobes.getLevelOf(StarWarsMod.mc.thePlayer, active.name) > 0)
				{
					Entity e = EntityUtils.rayTrace(active.getRange(), StarWarsMod.mc.thePlayer, new Entity[0]);

					if (e != null)
						ArmorJediRobes.setEntityTarget(StarWarsMod.mc.thePlayer, e.getEntityId());

					active.currentLevel = ArmorJediRobes.getLevelOf(StarWarsMod.mc.thePlayer, active.name);
					if (ArmorJediRobes.getXP(StarWarsMod.mc.thePlayer) - active.getCost() >= 0 && !ForceUtils.isCooling(active.name))
					{
						StarWarsMod.network.sendToServer(new MessageRobesIntNBT(StarWarsMod.mc.thePlayer, Resources.nbtXp, ArmorJediRobes.getXP(StarWarsMod.mc.thePlayer) - active.getCost()));

						if (!active.isDurationBased)
						{
							if (active.name.equals("defend"))
							{
								if (!ArmorJediRobes.getIsRunning(StarWarsMod.mc.thePlayer))
								{
									if (active.run(StarWarsMod.mc.thePlayer))
									{
										StarWarsMod.network.sendToServer(new MessageRobesIntNBT(StarWarsMod.mc.thePlayer, Resources.nbtActiveHealth, active.currentLevel));
										StarWarsMod.network.sendToServer(new MessageRobesBooleanNBT(StarWarsMod.mc.thePlayer, Resources.nbtIsRunning, true));
									}
								}
								else
								{
									((PowerDefend)active).health = 0;
									((PowerDefend)active).isRunning = false;
									((PowerDefend)active).recharge = ((PowerDefend)active).rechargeTime;
									StarWarsMod.network.sendToServer(new MessageRobesIntNBT(StarWarsMod.mc.thePlayer, Resources.nbtActiveHealth, 0));
									StarWarsMod.network.sendToServer(new MessageRobesBooleanNBT(StarWarsMod.mc.thePlayer, Resources.nbtIsRunning, false));
									if (!ForceUtils.isCooling("defend"))
										ForceUtils.coolingPowers.add(active);
								}
							}
							else
							{
								active.run(StarWarsMod.mc.thePlayer);
								active.recharge = active.rechargeTime;
								if (!ForceUtils.isCooling(ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer)))
									ForceUtils.coolingPowers.add(active);
							}
						}
						else
						{
							ForceUtils.isUsingDuration = true;
							StarWarsMod.network.sendToServer(new MessageRobesBooleanNBT(StarWarsMod.mc.thePlayer, Resources.nbtIsUsingDuration, true));
						}
					}
				}
			}
		}
		else
			StarWarsMod.network.sendToServer(new MessageSetEntityTarget(StarWarsMod.mc.thePlayer, -1));
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onTick(TickEvent.ClientTickEvent event)
	{
		GuiManager.tick();

		AnimationManager.tick();

		ClientEventHandler.soundManager.tick();

		if (StarWarsMod.mc.theWorld == null || StarWarsMod.mc.thePlayer == null)
			return;

		if (ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer).equals("lightning") || ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer).equals("grab"))
		{
			Power power = Power.getPowerFromName(ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer));

			Entity e;

			if (ArmorJediRobes.getEntityTarget(StarWarsMod.mc.thePlayer) == -1)
				e = EntityUtils.rayTrace(power.getRange(), StarWarsMod.mc.thePlayer, new Entity[0]);
			else
				e = StarWarsMod.mc.thePlayer.worldObj.getEntityByID(ArmorJediRobes.getEntityTarget(StarWarsMod.mc.thePlayer));

			if (e != null)
			{
				ArmorJediRobes.setEntityTarget(StarWarsMod.mc.thePlayer, e.getEntityId());
				if (ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer).equals("grab") && ArmorJediRobes.getUsingDuration(StarWarsMod.mc.thePlayer))
				{
					if (ForceUtils.distanceToEntity == -1)
						ForceUtils.distanceToEntity = (float)Vec3.createVectorHelper(StarWarsMod.mc.thePlayer.posX, StarWarsMod.mc.thePlayer.posY, StarWarsMod.mc.thePlayer.posZ).distanceTo(Vec3.createVectorHelper(e.posX, e.posY, e.posZ));

					if (!e.worldObj.isRemote)
					{
						Vec3 look = StarWarsMod.mc.thePlayer.getLookVec();
						look.xCoord *= ForceUtils.distanceToEntity;
						look.yCoord *= ForceUtils.distanceToEntity;
						look.zCoord *= ForceUtils.distanceToEntity;
						look.xCoord += StarWarsMod.mc.thePlayer.posX;
						look.yCoord += StarWarsMod.mc.thePlayer.posY;
						look.zCoord += StarWarsMod.mc.thePlayer.posZ;
						e.fallDistance = 0.0f;
						e.onGround = false;
						e.isAirBorne = true;
						e.timeUntilPortal = 5;
						e.setVelocity(0, 0, 0);
						e.setLocationAndAngles(look.xCoord, look.yCoord, look.zCoord, StarWarsMod.mc.thePlayer.rotationYawHead, StarWarsMod.mc.thePlayer.rotationPitch);
						StarWarsMod.network.sendToServer(new MessageEntityGrab(e, StarWarsMod.mc.thePlayer, ForceUtils.distanceToEntity));
					}
					else
					{
						Vec3 look = StarWarsMod.mc.thePlayer.getLookVec();
						look.xCoord *= ForceUtils.distanceToEntity;
						look.yCoord *= ForceUtils.distanceToEntity;
						look.zCoord *= ForceUtils.distanceToEntity;
						look.xCoord += StarWarsMod.mc.thePlayer.posX;
						look.yCoord += StarWarsMod.mc.thePlayer.posY;
						look.zCoord += StarWarsMod.mc.thePlayer.posZ;
						e.fallDistance = 0.0f;
						e.onGround = false;
						e.isAirBorne = true;
						e.timeUntilPortal = 5;
						e.setVelocity(0, 0, 0);
						e.setLocationAndAngles(look.xCoord, look.yCoord, look.zCoord, StarWarsMod.mc.thePlayer.rotationYawHead, StarWarsMod.mc.thePlayer.rotationPitch);
						StarWarsMod.network.sendToServer(new MessageEntityGrab(e, StarWarsMod.mc.thePlayer, ForceUtils.distanceToEntity));
					}
				}
			}
			else
			{
				ArmorJediRobes.setEntityTarget(StarWarsMod.mc.thePlayer, -1);
				ForceUtils.distanceToEntity = -1;
			}
		}

		if (ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer).equals("deflect") && ArmorJediRobes.getUsingDuration(StarWarsMod.mc.thePlayer))
			StarWarsMod.mc.theWorld.getEntitiesWithinAABB(Entity.class, StarWarsMod.mc.thePlayer.boundingBox.expand(3, 3, 3)).stream().filter(entityObj -> entityObj instanceof EntityArrow || entityObj instanceof EntityBlasterRifleBolt || entityObj instanceof EntityBlasterHeavyBolt || entityObj instanceof EntityBlasterPistolBolt || entityObj instanceof EntityBlasterProbeBolt || entityObj instanceof EntitySpeederBlasterRifleBolt).forEach(entityObj -> {
				Entity entity = (Entity)entityObj;
				StarWarsMod.network.sendToServer(new MessageEntityReverse(entity));
			});

		Iterator<Power> it = ForceUtils.coolingPowers.iterator();
		while (it.hasNext())
		{
			Power cooling = it.next();
			cooling.recharge--;
			if (cooling.recharge <= 0)
				it.remove();
		}

		if (StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2) != null && StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2).getItem() == StarWarsItems.jediRobes)
		{
			ItemStack robes = StarWarsMod.mc.thePlayer.inventory.armorItemInSlot(2);
			int level = ArmorJediRobes.getLevel(robes);
			int xp = ArmorJediRobes.getXP(robes);
			int maxxp = ArmorJediRobes.getMaxXP(robes);

			if (StarWarsMod.mc.thePlayer.ticksExisted % 20 == 0)
			{
				double percent = 1 + 0.1f * Math.floor(level / 10);

				if (percent > 6)
					percent = 6;

				int addition = (int)(maxxp / 100 * percent);

				int total = 0;

				if (xp + addition < maxxp)
					total = xp + addition;
				else
					total = maxxp;

				StarWarsMod.network.sendToServer(new MessageRobesIntNBT(StarWarsMod.mc.thePlayer, Resources.nbtXp, total));
			}

			if (ForceUtils.activePower != null && ArmorJediRobes.getUsingDuration(StarWarsMod.mc.thePlayer) && !ForceUtils.isCooling(ForceUtils.activePower.name))
			{
				ForceUtils.activePower.duration++;

				ForceUtils.isUsingDuration = ForceUtils.isUsingDuration && KeybindRegistry.keyRobePower.getIsKeyPressed();
				StarWarsMod.network.sendToServer(new MessageRobesBooleanNBT(StarWarsMod.mc.thePlayer, Resources.nbtIsUsingDuration, ForceUtils.isUsingDuration && KeybindRegistry.keyRobePower.getIsKeyPressed()));

				if (ForceUtils.activePower.duration > ForceUtils.activePower.getDuration() || !ArmorJediRobes.getUsingDuration(StarWarsMod.mc.thePlayer))
				{
					if (ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer).equals("lightning") || ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer).equals("grab"))
						if (ClientEventHandler.lastPlayerTarget instanceof EntityPlayer)
							try
							{
								StarWarsMod.network.sendToServer(new MessageSetEntityTarget(StarWarsMod.mc.thePlayer, -1));
								ClientEventHandler.lastPlayerTarget = null;
							}
							catch (Exception ignored)
							{
							}
					ForceUtils.activePower.duration = 0;
					StarWarsMod.network.sendToServer(new MessageRobesBooleanNBT(StarWarsMod.mc.thePlayer, Resources.nbtIsUsingDuration, false));
					ForceUtils.activePower.recharge = ForceUtils.activePower.rechargeTime;
					ForceUtils.coolingPowers.add(ForceUtils.activePower);
				}
				else if (ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer).equals("lightning") || ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer).equals("grab"))
				{
					Power power = Power.getPowerFromName(ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer));
					if (ArmorJediRobes.getEntityTarget(StarWarsMod.mc.thePlayer) != -1)
					{
						Entity e = StarWarsMod.mc.thePlayer.worldObj.getEntityByID(ArmorJediRobes.getEntityTarget(StarWarsMod.mc.thePlayer));

						if (e != null)
						{
							if (ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer).equals("lightning"))
							{
								StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "force.lightning", 1.0F, 1.0F);
								StarWarsMod.network.sendToServer(new MessageEntityHurt(e, power.getDamage()));
							}
							if (e instanceof EntityPlayer)
								try
								{
									ClientEventHandler.lastPlayerTarget = (EntityPlayer)e;
									StarWarsMod.network.sendToServer(new MessageSetEntityTarget(StarWarsMod.mc.thePlayer, e.getEntityId()));
								}
								catch (Exception ignored)
								{
								}
						}
					}
					else if (ClientEventHandler.lastPlayerTarget instanceof EntityPlayer)
						try
						{
							StarWarsMod.network.sendToServer(new MessageSetEntityTarget(StarWarsMod.mc.thePlayer, -1));
							ClientEventHandler.lastPlayerTarget = null;
						}
						catch (Exception ignored)
						{
						}
				}
			}
		}
		else
		{
			ForceUtils.activePower = null;
			ForceUtils.isUsingDuration = false;
		}

		// if (ForceUtils.activePower != null &&
		// ForceUtils.activePower.name.equals("defend") &&
		// ((PowerDefend)ForceUtils.activePower).health <= 0 &&
		// ((PowerDefend)ForceUtils.activePower).isRunning)
		if (ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer).equals("defend") && ArmorJediRobes.getHealth(StarWarsMod.mc.thePlayer) <= 0 && ArmorJediRobes.getIsRunning(StarWarsMod.mc.thePlayer))

		{
			PowerDefend active = (PowerDefend)Power.getPowerFromName(ArmorJediRobes.getActive(StarWarsMod.mc.thePlayer));
			active.health = 0;
			active.isRunning = false;
			active.recharge = active.rechargeTime;
			StarWarsMod.network.sendToServer(new MessageRobesIntNBT(StarWarsMod.mc.thePlayer, Resources.nbtActiveHealth, 0));
			StarWarsMod.network.sendToServer(new MessageRobesBooleanNBT(StarWarsMod.mc.thePlayer, Resources.nbtIsRunning, false));
			if (!ForceUtils.isCooling("defend"))
				ForceUtils.coolingPowers.add(active);
		}
	}

	@SubscribeEvent
	public void onTick(TickEvent.ServerTickEvent event)
	{
		Iterator<EntityCooldownEntry> i = ForceUtils.entitiesWithEffects.iterator();
		while (i.hasNext())
		{
			EntityCooldownEntry entry = i.next();

			if (entry.effect.equals("disable"))
			{
				entry.entity.motionX = 0;
				entry.entity.motionY = 0;
				entry.entity.motionZ = 0;
			}
			else if (entry.effect.equals("slow"))
			{
				entry.entity.motionX = Math.min(Math.max(entry.entity.motionX, -0.005d), 0.005d);
				entry.entity.motionY = Math.min(Math.max(entry.entity.motionY, -0.005d), 0.005d);
				entry.entity.motionZ = Math.min(Math.max(entry.entity.motionZ, -0.005d), 0.005d);
			}

			entry.cooldownLeft--;

			if (entry.cooldownLeft <= 0)
				i.remove();
		}
	}

	private void resetRobes(PlayerEvent event)
	{
		ArmorJediRobes.setActive(event.player, "");
		ArmorJediRobes.setDuration(event.player, false);
		ArmorJediRobes.setEntityTarget(event.player, -1);
		ArmorJediRobes.setRunning(event.player, false);
		ForceUtils.activePower = null;
		ForceUtils.isUsingDuration = false;
	}
}
