package com.parzivail.pswm.sound;

import com.parzivail.pswm.Resources.ConfigOptions;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.items.weapons.ItemLightsaber;
import com.parzivail.pswm.vehicles.*;
import com.parzivail.util.math.TickComparator;
import com.parzivail.util.sound.PSoundBank;
import com.parzivail.util.vehicle.VehicleBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.item.ItemStack;

public class SoundManager
{
	@SideOnly(Side.CLIENT)
	private static PSoundBank soundBank;

	private static MovingSound lightsaberHum;
	private static MovingSound shipMove;

	private static TickComparator inShip = new TickComparator();
	private static TickComparator holdingLightsaber = new TickComparator();

	public void init()
	{
		soundBank = new PSoundBank();
	}

	public void tick()
	{
		if (StarWarsMod.mc.theWorld == null || StarWarsMod.mc.thePlayer == null)
			return;

		inShip.is = StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicleBase;

		if (inShip.changeTrue())
		{
			// GuiToast.makeText("Sound Started", 60).show();
			String ship = "unknown";
			if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicAWing)
				ship = "awing";
			else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicXWing || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSnowspeeder || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSkyhopper || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicYWing)
				ship = "xwing";
			else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicLandspeeder)
				ship = "landspeeder";
			else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicSpeederBike || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicHothSpeederBike || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicJakkuSpeeder)
				ship = "speeder";
			else if (StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIE || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEInterceptor || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEAdvanced || StarWarsMod.mc.thePlayer.ridingEntity instanceof VehicTIEBomber)
				ship = "tie";
			SoundManager.shipMove = new SoundShipMove(ship);
			soundBank.play(SoundManager.shipMove);
		}

		if (inShip.changeFalse())
			// GuiToast.makeText("Sound Stopped", 60).show();
			soundBank.stop(SoundManager.shipMove);

		inShip.tick();

		ItemStack iLS = StarWarsMod.mc.thePlayer.inventory.getCurrentItem();

		holdingLightsaber.is = iLS != null && iLS.getItem() instanceof ItemLightsaber && iLS.stackTagCompound != null && iLS.stackTagCompound.getBoolean(ItemLightsaber.nbtBladeOn);

		if (holdingLightsaber.changeTrue() && ConfigOptions.enableLightsaberHum)
		{
			SoundManager.lightsaberHum = new SoundLightsaberHum(StarWarsMod.mc.thePlayer);
			soundBank.play(SoundManager.lightsaberHum);
		}

		if (holdingLightsaber.changeFalse() && ConfigOptions.enableLightsaberHum)
			soundBank.stop(SoundManager.lightsaberHum);

		holdingLightsaber.tick();
	}
}
