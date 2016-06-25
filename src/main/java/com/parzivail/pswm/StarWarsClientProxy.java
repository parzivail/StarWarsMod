package com.parzivail.pswm;

import com.parzivail.pswm.Resources.ConfigOptions;
import com.parzivail.pswm.entities.*;
import com.parzivail.pswm.font.FontManager;
import com.parzivail.pswm.items.weapons.ItemLightsaber;
import com.parzivail.pswm.mobs.*;
import com.parzivail.pswm.mobs.trooper.*;
import com.parzivail.pswm.models.ModelTrainingRemote;
import com.parzivail.pswm.models.blocks.ModelDSTurret;
import com.parzivail.pswm.models.mobs.*;
import com.parzivail.pswm.registry.KeybindRegistry;
import com.parzivail.pswm.registry.RegisterGuiOverlays;
import com.parzivail.pswm.rendering.*;
import com.parzivail.pswm.rendering.item.*;
import com.parzivail.pswm.rendering.itemblock.*;
import com.parzivail.pswm.rendering.itemdroid.*;
import com.parzivail.pswm.rendering.vehicles.*;
import com.parzivail.pswm.tileentities.*;
import com.parzivail.pswm.vehicles.*;
import com.parzivail.pswm.vehicles.npc.VehicNpcLandspeeder;
import com.parzivail.pswm.vehicles.npc.VehicNpcXWing;
import com.parzivail.pswm.weaponry.WeaponDSTurret;
import com.parzivail.util.ui.GLPalette;
import com.parzivail.util.ui.Lumberjack;
import com.parzivail.util.ui.ShaderHelper;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class StarWarsClientProxy extends StarWarsCommonProxy
{
	@Override
	public void doSidedThings()
	{
		//Minecraft.getMinecraft().entityRenderer = new PSWMEntityRenderer(Minecraft.getMinecraft(), Minecraft.getMinecraft().getResourceManager());

		StarWarsMod.mc = Minecraft.getMinecraft();

		StarWarsMod.clientHandler.init();

		if (Minecraft.getMinecraft().getSession().getUsername().equalsIgnoreCase("StarWarsMod") || Minecraft.getMinecraft().getSession().getUsername().equalsIgnoreCase("weaston") || ConfigOptions.enableBetaFeatures)
		{
			Resources.IS_DEV_ENVIRONVENT = true;
			Lumberjack.info("Debug/Beta mechanics implemented!");
			Lumberjack.info("Please be warned, beta features may not be fully implemented, or may crash!");
		}

		KeybindRegistry.registerAll();

		FontManager.registerAll();

		ShaderHelper.initShaders();

		if (ConfigOptions.beshOverride)
			Minecraft.getMinecraft().fontRenderer = FontManager.aurebesh;

		Lumberjack.log("Client proxy loaded!");
	}

	@Override
	public void registerRendering()
	{
		RenderingRegistry.registerEntityRenderingHandler(MobWookiee.class, new RenderWookiee(new ModelWookiee(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobJawa.class, new RenderJawa(new ModelSmallBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobEwok.class, new RenderEwok(new ModelSmallBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobTauntaun.class, new RenderTauntaun(new ModelTaunNew(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobBantha.class, new RenderBantha(new ModelBantha(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobWampa.class, new RenderWampa(new ModelWampa(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobTusken.class, new RenderTusken(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidGNK.class, new RenderGNK(new ModelDroidGNK(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobGamorrean.class, new RenderGamorrean(new ModelGamorrean(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDewback.class, new RenderDewback(new ModelDewback(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobTatooineCommoner.class, new RenderCommoner(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobBith.class, new RenderBith(new ModelBith(), 0.5F));

		RenderingRegistry.registerEntityRenderingHandler(MobSandtrooper.class, new RenderHuman(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobStormtrooper.class, new RenderHuman(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobScouttrooper.class, new RenderHuman(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobSnowtrooper.class, new RenderHuman(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobAtatPilot.class, new RenderHuman(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobTiePilot.class, new RenderHuman(new ModelBiped(), 0.5F));

		RenderingRegistry.registerEntityRenderingHandler(MobEndorRebel.class, new RenderHuman(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobHothRebel.class, new RenderHuman(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobRebelPilot.class, new RenderHuman(new ModelBiped(), 0.5F));

		RenderingRegistry.registerEntityRenderingHandler(MobBountyhunter.class, new RenderHuman(new ModelBiped(), 0.5F));

		RenderingRegistry.registerEntityRenderingHandler(MobDefaultBiped.class, new RenderHuman(new ModelBiped(), 0.5F));

		RenderingRegistry.registerEntityRenderingHandler(MobDroidAstromech.class, new RenderDroidAstromech(new ModelDroidAstromech(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidAstromech2.class, new RenderDroidAstromech2(new ModelDroidAstromech2(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidAstromechImperial.class, new RenderDroidAstromech(new ModelDroidAstromech(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidAstromechImperial2.class, new RenderDroidAstromech2(new ModelDroidAstromech2(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidAstromechBb8.class, new RenderDroidBb8(new ModelDroidBb8(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidProbe.class, new RenderDroidProbe(new ModelDroidProbe(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidProtocol.class, new RenderDroidProtocol(new ModelDroidProtocol(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidProtocol2.class, new RenderDroidProtocol(new ModelDroidProtocol(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidSurgical.class, new RenderDroidSurgical(new ModelDroidSurgical(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidTreadwell.class, new RenderDroidTreadwell(new ModelDroidTreadwell(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidMouse.class, new RenderDroidMouse(new ModelDroidMouse(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobDroidTrainingRemote.class, new RenderDroidTrainingRemote(new ModelTrainingRemote(), 0.5F));

		RenderingRegistry.registerEntityRenderingHandler(VehicHothSpeederBike.class, new RenderSpeederBike());
		RenderingRegistry.registerEntityRenderingHandler(VehicSpeederBike.class, new RenderSpeederBike());
		RenderingRegistry.registerEntityRenderingHandler(VehicLandspeeder.class, new RenderLandspeeder());
		RenderingRegistry.registerEntityRenderingHandler(VehicJakkuSpeeder.class, new RenderJakkuSpeeder());
		RenderingRegistry.registerEntityRenderingHandler(VehicATST.class, new RenderATST());

		RenderingRegistry.registerEntityRenderingHandler(VehicNpcLandspeeder.class, new RenderLandspeeder());
		RenderingRegistry.registerEntityRenderingHandler(VehicNpcXWing.class, new RenderXWing());

		RenderingRegistry.registerEntityRenderingHandler(VehicTIE.class, new RenderTIE());
		RenderingRegistry.registerEntityRenderingHandler(VehicTIEBomber.class, new RenderTIEBomber());
		RenderingRegistry.registerEntityRenderingHandler(VehicTIEAdvanced.class, new RenderTIEAdvanced());
		RenderingRegistry.registerEntityRenderingHandler(VehicTIEInterceptor.class, new RenderTIEInterceptor());
		RenderingRegistry.registerEntityRenderingHandler(VehicXWing.class, new RenderXWing());
		RenderingRegistry.registerEntityRenderingHandler(VehicYWing.class, new RenderYWing());
		RenderingRegistry.registerEntityRenderingHandler(VehicAWing.class, new RenderAWing());
		RenderingRegistry.registerEntityRenderingHandler(VehicSkyhopper.class, new RenderSkyhopper());
		RenderingRegistry.registerEntityRenderingHandler(VehicSnowspeeder.class, new RenderSnowspeeder());
		RenderingRegistry.registerEntityRenderingHandler(VehicScootemaround.class, new RenderScootemaround());
		RenderingRegistry.registerEntityRenderingHandler(VehicScootemaroundHoth.class, new RenderScootemaroundHoth());

		RenderingRegistry.registerEntityRenderingHandler(WeaponDSTurret.class, new RenderDSTurret(new ModelDSTurret(), 0.5F));

		RenderingRegistry.registerEntityRenderingHandler(EntityBlasterPistolBolt.class, new RenderBlasterBolt(GLPalette.BRIGHT_RED));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlasterRifleBolt.class, new RenderBlasterBolt(GLPalette.BRIGHT_RED));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlasterHeavyBolt.class, new RenderBlasterBolt(GLPalette.BRIGHT_RED));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlasterProbeBolt.class, new RenderBlasterBolt(GLPalette.BRIGHT_RED));
		RenderingRegistry.registerEntityRenderingHandler(EntitySpeederBlasterRifleBolt.class, new RenderBlasterBolt(GLPalette.BRIGHT_RED));
		RenderingRegistry.registerEntityRenderingHandler(EntityXWingBolt.class, new RenderBlasterBolt(GLPalette.BRIGHT_ORANGE, 2.0f));
		RenderingRegistry.registerEntityRenderingHandler(EntityTIEBolt.class, new RenderBlasterBolt(GLPalette.NEON_GREEN, 2.0f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDestruction.class, new RenderBlasterBolt(GLPalette.ELECTRIC_BLUE));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlasterEzraBolt.class, new RenderBlasterBolt(GLPalette.ELECTRIC_BLUE));
		RenderingRegistry.registerEntityRenderingHandler(EntityProtonTorpedo.class, new RenderWarhead(0xFFB20046));
		RenderingRegistry.registerEntityRenderingHandler(EntityBomb.class, new RenderWarhead(GLPalette.BLACK));

		RenderingRegistry.registerEntityRenderingHandler(EntityThrownSaber.class, new RenderThrownSaber());

		for (ItemLightsaber i : StarWarsItems.lightsaberNew)
			MinecraftForgeClient.registerItemRenderer(i, new RenderLightsaber());

		MinecraftForgeClient.registerItemRenderer(StarWarsItems.blasterPistol, new RenderBlasterPistol());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.blasterRifle, new RenderBlasterRifle());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.blasterHeavy, new RenderBlasterHeavy());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.bowcaster, new RenderBowcaster());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.gamorreanAx1, new RenderGamS());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.gamorreanAx2, new RenderGamM());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.gamorreanAx3, new RenderGamL());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.vibroLance, new RenderVibro());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.ewokSpear, new RenderSpear());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.gaffiStick, new RenderGaffi());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.binoculars, new RenderBinocularsNew());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnXwing, new RenderSpawnXWing());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnYwing, new RenderSpawnYWing());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnTie, new RenderSpawnTIE());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnTieInterceptor, new RenderSpawnTIEInterceptor());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnTieBomber, new RenderSpawnTIEBomber());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnTieAdvanced, new RenderSpawnTIEAdvanced());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnAtst, new RenderSpawnATST());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnSkyhopper, new RenderSpawnSkyhopper());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnSnowspeeder, new RenderSpawnSnowspeeder());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnAwing, new RenderSpawnAWing());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnSpeederBike, new RenderSpawnSpeederBike());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnHothSpeederBike, new RenderSpawnHothSpeederBike());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnLandspeeder, new RenderSpawnLandspeeder());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnNpcLandspeeder, new RenderSpawnLandspeeder());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnNpcXwing, new RenderSpawnXWing());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnJakkuSpeeder, new RenderSpawnJakkuSpeeder());

		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnProtocol, new RenderSpawnProtocol());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnProtocol2, new RenderSpawnProtocolHoth());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnAstromech, new RenderSpawnAstromech1());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnAstromechImperial, new RenderSpawnAstromech1Imperial());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnAstromech2, new RenderSpawnAstromech2());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnAstromechImperial2, new RenderSpawnAstromech2Imperial());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnProbe, new RenderSpawnProbe());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnSurgical, new RenderSpawnMedical());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnGonk, new RenderSpawnGNK());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnAstromechBb8, new RenderSpawnAstromechBB8());
		MinecraftForgeClient.registerItemRenderer(StarWarsItems.spawnMouse, new RenderSpawnMouse());

		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockHyperdrive), new RenderBlockHyperdrive());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockHangingBucket), new RenderBlockHangingBucket());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockHangingCauldron), new RenderBlockHangingCauldron());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockAntenna), new RenderBlockAntenna());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockBactaTank), new RenderBlockBactaTank());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockBasket), new RenderBlockBasket());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockCrystalCompressor), new RenderBlockCrystalCompressor());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockDeathStarDoor), new RenderBlockDeathStarDoor());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockLightsaberForge), new RenderBlockLightsaberForge());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockTable), new RenderBlockTatooineTable());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockTable2), new RenderBlockMudTable());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(StarWarsMod.blockMV), new RenderBlockMV());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMV.class, new RenderMV());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntenna.class, new RenderAntenna());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDeathStarDoor.class, new RenderDeathStarDoor());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHoloTableBase.class, new RenderHoloTable());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTatooineTable.class, new RenderTatooineTable());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMudTable.class, new RenderMudTable());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHangingCauldron.class, new RenderHangingCauldron());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHangingBucket.class, new RenderHangingBucket());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBasket.class, new RenderBasket());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFieldEmitter.class, new RenderFieldEmitter());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBactaTank.class, new RenderBactaTank());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientJediStatue.class, new RenderAncientJediStatue());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStaticNpc.class, new RenderStaticNpc());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHyperdrive.class, new RenderHyperdrive());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLightsaberForge.class, new RenderLightsaberForge());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrystalCompressor.class, new RenderCrystalCompressor());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrate1.class, new RenderCrate1());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFloorLight.class, new RenderFloorLight());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHolotableMass.class, new RenderHolotableMass());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLadder.class, new RenderLadder());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipeClampedMass.class, new RenderPipeClampedMass());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipeMass.class, new RenderPipeMass());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipeSleevedMass.class, new RenderPipeSleevedMass());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityConsoleHoth1.class, new RenderConsoleHoth1());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityConsoleHoth2.class, new RenderConsoleHoth2());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityConsoleHoth3.class, new RenderConsoleHoth3());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPanelHoth.class, new RenderPanelHoth());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHothCeilingLight.class, new RenderCeilingLightHoth());

		RegisterGuiOverlays.registerAll();

		Lumberjack.log("Rendering registered!");
	}
}
