package com.parzivail.pswm.handlers;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.achievement.StarWarsAchievements;
import com.parzivail.pswm.force.Cron;
import com.parzivail.pswm.force.powers.PowerBase;
import com.parzivail.pswm.force.powers.PowerDefend;
import com.parzivail.pswm.force.powers.PowerDeflect;
import com.parzivail.pswm.gui.GuiVehicle;
import com.parzivail.pswm.items.ItemQuestLog;
import com.parzivail.pswm.items.weapons.ItemLightsaber;
import com.parzivail.pswm.network.*;
import com.parzivail.pswm.quest.QuestStats;
import com.parzivail.pswm.registry.KeybindRegistry;
import com.parzivail.pswm.sound.SoundSFoil;
import com.parzivail.pswm.utils.BlasterBoltType;
import com.parzivail.pswm.utils.BlasterPosition;
import com.parzivail.pswm.utils.StatTrack;
import com.parzivail.pswm.vehicles.*;
import com.parzivail.util.entity.EntityUtils;
import com.parzivail.util.ui.GFX;
import com.parzivail.util.ui.GuiToast;
import com.parzivail.util.ui.LangUtils;
import com.parzivail.util.vehicle.StarshipBase;
import com.parzivail.util.vehicle.VehicleAirBase;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by colby on 9/30/2016.
 */
public class KeyHandler
{
	public void onKeyInput(InputEvent.KeyInputEvent event)
	{
		handleVehicleBlaster();

		handleVehicleSpecialWeapons();

		handleShipSpecialFunction();

		handleShipHoverMode();

		handleGuis();

		handleLightsabers();

		handleQuestAndForce();

		handleShipMovement();

		if (KeybindRegistry.keyDebug != null && KeybindRegistry.keyDebug.isPressed())
		{
			GFX.changeCameraRoll(0);
		}
	}

	private void handleShipMovement()
	{
		if (StarWarsMod.mc.thePlayer != null && StarWarsMod.mc.thePlayer.ridingEntity instanceof StarshipBase)
		{
			StarshipBase ship = (StarshipBase)StarWarsMod.mc.thePlayer.ridingEntity;
			ship.handleMovementInput();
		}
	}

	private void handleLightsabers()
	{
		if (KeybindRegistry.keyLSToggle.isPressed())
		{
			EntityPlayer player = StarWarsMod.mc.thePlayer;
			ItemStack stack = player.inventory.getCurrentItem();
			if (stack != null && stack.stackTagCompound != null && stack.stackTagCompound.getInteger(ItemLightsaber.nbtBladeTimeout) <= 0)
			{
				if (!stack.stackTagCompound.getBoolean(ItemLightsaber.nbtBladeWaterproof) && player.isInsideOfMaterial(Material.water))
				{
					stack.stackTagCompound.setInteger(ItemLightsaber.nbtBladeTimeout, 10);
					player.playSound(Resources.MODID + ":" + "item.lightsaber.fizz", 1.0F, 1.0F);
				} else
				{
					if (stack.stackTagCompound.getBoolean(ItemLightsaber.nbtBladeOn))
						player.playSound(Resources.MODID + ":" + "item.lightsaber.close", 1.0F, 1.0F);
					else player.playSound(Resources.MODID + ":" + "item.lightsaber.open", 1.0F, 1.0F);
					stack.stackTagCompound.setBoolean(ItemLightsaber.nbtBladeOn, !stack.stackTagCompound.getBoolean(ItemLightsaber.nbtBladeOn));
					stack.stackTagCompound.setInteger(ItemLightsaber.nbtBladeTimeout, 10);
					StarWarsMod.network.sendToServer(new MessageSetPlayerHolding(player, stack));
				}
			}
		}
	}

	private void handleQuestAndForce()
	{
		if (KeybindRegistry.keyQuest != null && KeybindRegistry.keyQuest.isPressed())
			StarWarsMod.mc.thePlayer.openGui(StarWarsMod.instance, Resources.GUI_QUEST, null, 0, 0, 0);

		if (KeybindRegistry.keyRobeGui.isPressed()) if (Cron.getHolocron(StarWarsMod.mc.thePlayer) != null)
			StarWarsMod.mc.thePlayer.openGui(StarWarsMod.instance, Resources.GUI_ROBES, null, 0, 0, 0);

		if (KeybindRegistry.keyRobePowerNext.isPressed())
		{
			if (Cron.getHolocron(StarWarsMod.mc.thePlayer) != null)
			{
				String current = Cron.getActive(StarWarsMod.mc.thePlayer).name;
				ArrayList<String> powers = Cron.getPowersAvailableAtLevel(Cron.getSide(StarWarsMod.mc.thePlayer), Cron.getLevel(StarWarsMod.mc.thePlayer));
				int index = Arrays.asList(powers.toArray()).indexOf(current);
				do
				{
					index++;
					if (index >= powers.size()) index = 0;
				}
				while (Cron.getLevelOf(StarWarsMod.mc.thePlayer, powers.get(index)) == 0 && !powers.get(index).equals(current));
				if (index < powers.size() - 1 && !powers.get(index).equals(current))
				{
					if (index < 0) index = powers.size() - 1;
					PowerBase selectedPower = Cron.initNewPower(StarWarsMod.mc.thePlayer, powers.get(index));
					//activePower = selectedPower;
					StarWarsMod.network.sendToServer(new MessageHolocronSetActive(StarWarsMod.mc.thePlayer, selectedPower.serialize()));
				}
			}
		}

		if (KeybindRegistry.keyRobePowerPrev.isPressed())
		{
			if (Cron.getHolocron(StarWarsMod.mc.thePlayer) != null)
			{
				String current = Cron.getActive(StarWarsMod.mc.thePlayer).name;
				ArrayList<String> powers = Cron.getPowersAvailableAtLevel(Cron.getSide(StarWarsMod.mc.thePlayer), Cron.getLevel(StarWarsMod.mc.thePlayer));
				int index = Arrays.asList(powers.toArray()).indexOf(current);
				do
				{
					index--;
					if (index < 0) index = powers.size() - 1;
				}
				while (Cron.getLevelOf(StarWarsMod.mc.thePlayer, powers.get(index)) == 0 && !powers.get(index).equals(current));
				if (index > -1 && !powers.get(index).equals(current))
				{
					if (index < 0) index = powers.size() - 1;
					PowerBase selectedPower = Cron.initNewPower(StarWarsMod.mc.thePlayer, powers.get(index));
					//activePower = selectedPower;
					StarWarsMod.network.sendToServer(new MessageHolocronSetActive(StarWarsMod.mc.thePlayer, selectedPower.serialize()));
				}
			}
		}

		if (KeybindRegistry.keyRobePower.isPressed())
		{
			ItemStack cron;
			if ((cron = Cron.getHolocron(StarWarsMod.mc.thePlayer)) != null)
			{
				PowerBase powerBase = Cron.getActive(cron);
				if (powerBase != null && Cron.getXP(StarWarsMod.mc.thePlayer) - powerBase.getCost() >= 0 && !Cron.isCooling(powerBase.name))
				{
					if (powerBase != null && powerBase.recharge <= 0)
					{
						boolean coolFlag = true;
						StatTrack.addStat("useForcePower-" + powerBase.name);
						switch (powerBase.name)
						{
							case "defend":
								PowerDefend powerDefend = (PowerDefend)powerBase;
								if (powerDefend.isRunning)
								{
									powerDefend.isRunning = false;
									powerDefend.health = 0;
									powerDefend.recharge = powerDefend.rechargeTime;
								} else
								{
									powerDefend.run(StarWarsMod.mc.thePlayer);
									coolFlag = false;
								}
								break;
							case "deflect":
								PowerDeflect powerDeflect = (PowerDeflect)powerBase;
								if (!powerDeflect.isRunning)
								{
									powerDeflect.isRunning = true;
									powerDeflect.recharge = 0;
									coolFlag = false;
								}
								break;
							case "lightning":
								//if (!powerBase.isRunning)
								//{
								//	powerBase.isRunning = true;
								//	powerBase.recharge = 0;
								//	coolFlag = false;
								//}
								break;
							case "grab":
								if (powerBase.isRunning)
								{
									powerBase.isRunning = false;
									powerBase.recharge = powerBase.rechargeTime;
								} else
								{
									powerBase.run(StarWarsMod.mc.thePlayer);
									coolFlag = false;
								}
								break;
							default:
								powerBase.run(StarWarsMod.mc.thePlayer);
								powerBase.recharge = powerBase.rechargeTime;
								break;
						}

						if (coolFlag) StarWarsMod.commonHandler.coolPower(powerBase);

						StarWarsMod.network.sendToServer(new MessageHolocronSetActive(StarWarsMod.mc.thePlayer, powerBase.serialize()));

						StarWarsMod.network.sendToServer(new MessageRobesIntNBT(StarWarsMod.mc.thePlayer, Resources.nbtXp, Cron.getXP(StarWarsMod.mc.thePlayer) - powerBase.getCost()));
					}
				}
			}
		}
	}

	private void handleGuis()
	{
		if (KeybindRegistry.keyLSForge.isPressed() && StarWarsMod.mc.thePlayer.capabilities.isCreativeMode)
			StarWarsMod.mc.thePlayer.openGui(StarWarsMod.instance, Resources.GUI_LSFORGE, null, 0, 0, 0);

		if (KeybindRegistry.keyShipHyperdrive.isPressed() && StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicleAirBase && !(StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSnowspeeder))
			StarWarsMod.mc.thePlayer.openGui(StarWarsMod.instance, Resources.GUI_HYPERDRIVE, null, 0, 0, 0);
	}

	private void handleShipHoverMode()
	{
		if (KeybindRegistry.keyShipHoverMode.isPressed())
		{
			boolean hover = false;
			if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicleAirBase)
				hover = !((VehicleAirBase)StarWarsMod.mc.thePlayer.ridingEntity).getHoverMode();
			StarWarsMod.network.sendToServer(new MessageShipHoverMode(StarWarsMod.mc.thePlayer, hover));
			GuiToast.makeText(LangUtils.translate("hover.mode.0", hover ? LangUtils.translate("activated") : LangUtils.translate("deactivated")), GuiToast.TIME_SHORT).show();
			StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.repulsor." + (hover ? "on" : "off"), 1, 1);
		}
	}

	private void handleShipSpecialFunction()
	{
		if (KeybindRegistry.keySFoil.isPressed()) if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicXWing)
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
		} else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSkyhopper)
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
	}

	private void handleVehicleSpecialWeapons()
	{
		if (KeybindRegistry.keyShootProton.isPressed())
		{
			if (StarWarsMod.mc.thePlayer.ridingEntity != null && StarWarsMod.shipSpecialWeaponCooldown == 0)
			{
				if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicXWing)
				{
					Entity targetted = EntityUtils.rayTrace(100, StarWarsMod.mc.thePlayer, new Entity[] { StarWarsMod.mc.thePlayer.ridingEntity });

					if (!((VehicXWing)StarWarsMod.mc.thePlayer.ridingEntity).getHasAstro()) targetted = null;

					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.PROTON, targetted, BlasterPosition.BOTH_SIDES));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.xwing.proton", 1.0F, 1.0F);
					StarWarsMod.shipSpecialWeaponCooldown = 200;

					ItemQuestLog.addStat(StarWarsMod.mc.thePlayer, QuestStats.PROTONS_SHOT);
					if (ItemQuestLog.getQuestContainer(StarWarsMod.mc.thePlayer) != null)
						StarWarsMod.network.sendToServer(new MessageSetQuestLogNbt(StarWarsMod.mc.thePlayer, ItemQuestLog.getQuestContainer(StarWarsMod.mc.thePlayer).stackTagCompound));
				} else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEBomber || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicYWing)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.BOMB, null, BlasterPosition.BOTH_SIDES));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.xwing.proton", 1.0F, 1.0F);
					StarWarsMod.shipSpecialWeaponCooldown = 200;

					String stat = StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEBomber ? QuestStats.BOMBS_DROPPED_EMPIRE : QuestStats.BOMBS_DROPPED_REBEL;

					ItemQuestLog.addStat(StarWarsMod.mc.thePlayer, stat);
					if (ItemQuestLog.getQuestContainer(StarWarsMod.mc.thePlayer) != null)
						StarWarsMod.network.sendToServer(new MessageSetQuestLogNbt(StarWarsMod.mc.thePlayer, ItemQuestLog.getQuestContainer(StarWarsMod.mc.thePlayer).stackTagCompound));
				}
			}
		}
	}

	private void handleVehicleBlaster()
	{
		if (KeybindRegistry.keyShootVehicle.isPressed())
		{
			if (StarWarsMod.mc.thePlayer.ridingEntity != null)
			{
				Entity targetted = EntityUtils.rayTrace(100, StarWarsMod.mc.thePlayer, new Entity[] { StarWarsMod.mc.thePlayer.ridingEntity });

				byte pos = (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicXWing) ? BlasterPosition.getNextXwingPosition() : BlasterPosition.getNextPosition();

				if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicXWing && !((VehicXWing)StarWarsMod.mc.thePlayer.ridingEntity).getHasAstro())
					targetted = null;
				else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicYWing && !((VehicYWing)StarWarsMod.mc.thePlayer.ridingEntity).getHasAstro())
					targetted = null;

				if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSpeederBike || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicHothSpeederBike)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.SPEEDER, null, pos));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "fx.shoot.bike", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
				} else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicXWing)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.XWING, targetted, pos));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.xwing.fire", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
				} else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicYWing)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.YWING, targetted, pos));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.xwing.fire", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
				} else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicAWing)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.AWING, targetted, pos));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.xwing.fire", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
				} else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSnowspeeder)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.SNOWSPEEDER, targetted, pos));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.xwing.fire", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
				} else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSkyhopper)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.SKYHOPPER, targetted, pos));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.xwing.fire", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
				} else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicATST)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.ATST, null, pos));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "fx.shoot.bike", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
				} else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIE || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEInterceptor || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEAdvanced || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEBomber)
				{
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(StarWarsMod.mc.thePlayer, BlasterBoltType.TIE, targetted, pos));
					StarWarsMod.mc.thePlayer.playSound(Resources.MODID + ":" + "vehicle.tie.fire", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.mc.thePlayer.worldObj.rand, -0.2D, 0.2D));
				}
				GuiVehicle.isFiring = true;
				GuiVehicle.blipFrame = GuiVehicle.blipMax;
			} else if (StarWarsMod.mc.thePlayer.inventory.getCurrentItem() != null && StarWarsMod.mc.thePlayer.inventory.getCurrentItem().getItem() instanceof ItemLightsaber)
			{
				ItemStack s = StarWarsMod.mc.thePlayer.inventory.getCurrentItem();
				EntityPlayer entityPlayer = StarWarsMod.mc.thePlayer;
				if (s.stackTagCompound.getString(ItemLightsaber.nbtHilt).equals("ezra") && s.stackTagCompound.getInteger(ItemLightsaber.nbtBlasterTimeout) == 0 && !s.stackTagCompound.getBoolean(ItemLightsaber.nbtBladeOn))
				{
					entityPlayer.addStat(StarWarsAchievements.ezraBlaster, 1);
					entityPlayer.playSound(Resources.MODID + ":" + "fx.shoot.dl44", 1.0F, 1.0F + (float)MathHelper.getRandomDoubleInRange(StarWarsMod.rngGeneral, -0.2D, 0.2D));
					s.stackTagCompound.setInteger(ItemLightsaber.nbtBlasterTimeout, 40);
					StarWarsMod.network.sendToServer(new MessageCreateBlasterBolt(entityPlayer, BlasterBoltType.EZRA, null, (byte)0));
				}
			}
		}
	}
}