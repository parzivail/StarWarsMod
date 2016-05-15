package com.parzivail.pswm.registry;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.Resources.ConfigOptions;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.dimension.PlanetInformation;
import com.parzivail.pswm.dimension.dagobah.BiomeGenDagobah;
import com.parzivail.pswm.dimension.dagobah.DagobahProvider;
import com.parzivail.pswm.dimension.endor.BiomeGenEndor;
import com.parzivail.pswm.dimension.endor.EndorProvider;
import com.parzivail.pswm.dimension.hoth.BiomeGenHoth;
import com.parzivail.pswm.dimension.hoth.HothProvider;
import com.parzivail.pswm.dimension.ilum.BiomeGenIlum;
import com.parzivail.pswm.dimension.ilum.IlumProvider;
import com.parzivail.pswm.dimension.kashyyyk.BiomeGenKashyyyk;
import com.parzivail.pswm.dimension.kashyyyk.KashyyykProvider;
import com.parzivail.pswm.dimension.mustafar.BiomeGenMustafar;
import com.parzivail.pswm.dimension.mustafar.MustafarProvider;
import com.parzivail.pswm.dimension.tatooine.BiomeGenTatooine;
import com.parzivail.pswm.dimension.tatooine.TatooineProvider;
import com.parzivail.pswm.dimension.yavin.BiomeGenYavin;
import com.parzivail.pswm.dimension.yavin.YavinProvider;
import com.parzivail.pswm.handlers.TerrainGenHandler;
import com.parzivail.pswm.mobs.*;
import com.parzivail.pswm.mobs.trooper.MobSandtrooper;
import com.parzivail.pswm.world.OreGenerator;
import com.parzivail.util.ui.Lumberjack;
import com.parzivail.util.world.WorldUtils;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;

public class WorldRegister
{
	public static void registerAll()
	{
		StarWarsMod.biomeTatooine = new BiomeGenTatooine(ConfigOptions.biomeTatooineId);
		BiomeManager.removeSpawnBiome(StarWarsMod.biomeTatooine);
		StarWarsMod.biomeHoth = new BiomeGenHoth(ConfigOptions.biomeHothId);
		BiomeManager.removeSpawnBiome(StarWarsMod.biomeHoth);
		StarWarsMod.biomeKashyyyk = new BiomeGenKashyyyk(ConfigOptions.biomeKashyyykId);
		BiomeManager.removeSpawnBiome(StarWarsMod.biomeKashyyyk);
		StarWarsMod.biomeYavin4 = new BiomeGenYavin(ConfigOptions.biomeYavin4Id);
		BiomeManager.removeSpawnBiome(StarWarsMod.biomeYavin4);
		StarWarsMod.biomeEndor = new BiomeGenEndor(ConfigOptions.biomeEndorId);
		BiomeManager.removeSpawnBiome(StarWarsMod.biomeEndor);
		StarWarsMod.biomeIlum = new BiomeGenIlum(ConfigOptions.biomeIlumId);
		BiomeManager.removeSpawnBiome(StarWarsMod.biomeIlum);
		// StarWarsMod.biomeEndorPlains = new
		// BiomeEndorPlains(StarWarsMod.dimEndorPlainsId);
		StarWarsMod.biomeDagobah = new BiomeGenDagobah(ConfigOptions.biomeDagobahId);
		BiomeManager.removeSpawnBiome(StarWarsMod.biomeDagobah);
		StarWarsMod.biomeMustafar = new BiomeGenMustafar(ConfigOptions.biomeMustafarId);
		BiomeManager.removeSpawnBiome(StarWarsMod.biomeMustafar);

		WorldUtils.registerDimension(ConfigOptions.dimTatooineId, TatooineProvider.class);
		WorldUtils.registerDimension(ConfigOptions.dimHothId, HothProvider.class);
		WorldUtils.registerDimension(ConfigOptions.dimKashyyykId, KashyyykProvider.class);
		WorldUtils.registerDimension(ConfigOptions.dimYavin4Id, YavinProvider.class);
		WorldUtils.registerDimension(ConfigOptions.dimEndorId, EndorProvider.class);
		WorldUtils.registerDimension(ConfigOptions.dimIlumId, IlumProvider.class);
		WorldUtils.registerDimension(ConfigOptions.dimDagobahId, DagobahProvider.class);
		WorldUtils.registerDimension(ConfigOptions.dimMustafarId, MustafarProvider.class);

		EntityRegistry.addSpawn(MobGamorrean.class, 3, 1, 3, EnumCreatureType.monster, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobSandtrooper.class, 80, 5, 10, EnumCreatureType.monster, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobJawa.class, 30, 1, 5, EnumCreatureType.monster, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobTusken.class, 3, 1, 3, EnumCreatureType.monster, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobBantha.class, 7, 1, 1, EnumCreatureType.creature, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobDewback.class, 7, 1, 2, EnumCreatureType.creature, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobEwok.class, 10, 1, 1, EnumCreatureType.creature, StarWarsMod.biomeEndor);
		EntityRegistry.addSpawn(MobTauntaun.class, 6, 1, 1, EnumCreatureType.creature, StarWarsMod.biomeHoth);
		EntityRegistry.addSpawn(MobDroidProbe.class, 1, 1, 1, EnumCreatureType.creature, StarWarsMod.biomeHoth);
		EntityRegistry.addSpawn(MobWampa.class, 1, 1, 1, EnumCreatureType.monster, StarWarsMod.biomeHoth);
		EntityRegistry.addSpawn(MobWookiee.class, 15, 1, 3, EnumCreatureType.creature, StarWarsMod.biomeKashyyyk);

		GameRegistry.registerWorldGenerator(new OreGenerator(), 10);

		MinecraftForge.TERRAIN_GEN_BUS.register(new TerrainGenHandler());

		PlanetInformation alderaan = new PlanetInformation();
		alderaan.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetAlderaan.png"));
		alderaan.setDimensionId(Resources.ConfigOptions.dimAlderaanId);
		alderaan.setName("Alderaan");
		alderaan.setPosition(7.1f, 5.1f);
		alderaan.setAffiliation(Resources.allegianceNone);
		alderaan.setDescription("");
		alderaan.setObfuscated(true);
		Resources.planetInformation.add(alderaan);

		PlanetInformation bespin = new PlanetInformation();
		bespin.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetBespin.png"));
		bespin.setDimensionId(Resources.ConfigOptions.dimBespinId);
		bespin.setName("Bespin");
		bespin.setPosition(4.9f, 13.3f);
		bespin.setAffiliation(Resources.allegianceNone);
		bespin.setDescription("");
		bespin.setObfuscated(true);
		Resources.planetInformation.add(bespin);

		PlanetInformation hoth = new PlanetInformation();
		hoth.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetHoth.png"));
		hoth.setDimensionId(Resources.ConfigOptions.dimHothId);
		hoth.setName("Hoth");
		hoth.setPosition(4.6f, 13.8f);
		hoth.setAffiliation(Resources.allegianceRebel);
		hoth.setDescription("Hoth is the sixth planet of the remote Hoth system. A desolate world covered with ice and snow, located in the Anoat sector, a rarely-traveled portion of the Outer Rim Territories. Home to a large Rebel base.");
		hoth.setSuns(1);
		hoth.setMoons(3);
		hoth.addNativeSpecies("Tauntaun");
		hoth.addNativeSpecies("Wampa");
		hoth.addTerrain("Ice Caves");
		hoth.addTerrain("Tundras");
		hoth.addTerrain("Frozen Plains");
		hoth.addResource("None");
		hoth.setHyperdrive(StarWarsMod.hyperdriveHoth);
		Resources.planetInformation.add(hoth);

		PlanetInformation earth = new PlanetInformation();
		earth.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetEarth.png"));
		earth.setDimensionId(0);
		earth.setName("Earth");
		earth.setPosition(7.4f, 6.8f);
		earth.setAffiliation(Resources.allegianceNone);
		earth.setDescription("The birthplace of the Human Race and the original center of all galactic trade. Not much is known about this planet, and its place in Galactic history is still disputed.");
		earth.addTerrain("Urban");
		earth.addTerrain("Forests");
		earth.addTerrain("Plains");
		earth.addTerrain("Oceans");
		earth.addResource("Coal");
		earth.addResource("Iron");
		earth.addResource("Gold");
		earth.addResource("Diamond");
		earth.addResource("Redstone");
		earth.addResource("Lumber");
		earth.addResource("Water");
		earth.addNativeSpecies("Human");
		earth.setSuns(1);
		earth.setMoons(1);
		earth.setHyperdrive(StarWarsMod.hyperdriveEarth);
		Resources.planetInformation.add(earth);

		PlanetInformation coruscant = new PlanetInformation();
		coruscant.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetCoruscant.png"));
		coruscant.setDimensionId(Resources.ConfigOptions.dimCoruscantId);
		coruscant.setName("Coruscant");
		coruscant.setPosition(6.1f, 4.9f);
		coruscant.setAffiliation(Resources.allegianceNone);
		coruscant.setDescription("");
		coruscant.setObfuscated(true);
		Resources.planetInformation.add(coruscant);

		PlanetInformation dagobah = new PlanetInformation();
		dagobah.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetDagobah.png"));
		dagobah.setDimensionId(Resources.ConfigOptions.dimDagobahId);
		dagobah.setName("Dagobah");
		dagobah.setPosition(7.5f, 14.4f);
		dagobah.setAffiliation(Resources.allegianceJedi);
		dagobah.setDescription("Dagobah is a planet in the Dagobah system, and one of the purest places in the galaxy within the Force. A remote world of swamps and forests, it serves as a refuge for Jedi Grand Master Yoda during his exile since the destruction of the Jedi Order.");
		dagobah.setMoons(1);
		dagobah.setSuns(1);
		dagobah.addNativeSpecies("Snakes");
		dagobah.addTerrain("Swamps");
		dagobah.addTerrain("Bogs");
		dagobah.addTerrain("Jungles");
		dagobah.addResource("None");
		dagobah.setHyperdrive(StarWarsMod.hyperdriveDagobah);
		Resources.planetInformation.add(dagobah);

		PlanetInformation dathomir = new PlanetInformation();
		dathomir.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetDathomir.png"));
		dathomir.setDimensionId(Resources.ConfigOptions.dimDathomirId);
		dathomir.setName("Dathomir");
		dathomir.setPosition(9.25f, 1.35f);
		dathomir.setAffiliation(Resources.allegianceNone);
		dathomir.setDescription("");
		dathomir.setObfuscated(true);
		Resources.planetInformation.add(dathomir);

		PlanetInformation endor = new PlanetInformation();
		endor.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetEndor.png"));
		endor.setDimensionId(Resources.ConfigOptions.dimEndorId);
		endor.setName("Endor");
		endor.setPosition(2.58f, 11.6f);
		endor.setAffiliation(Resources.allegianceImperial);
		endor.setDescription("Endor (also known as the Forest Moon of Endor and the Sanctuary Moon) id a small forested moon orbiting the gas giant planet of Endor and is the farthest moon away from it. Home to the Headquarters of the Galactic Empire.");
		endor.setSuns(1);
		endor.setMoons(0);
		endor.addNativeSpecies("Ewok");
		endor.addTerrain("Forests");
		endor.addTerrain("Mountains");
		endor.addTerrain("Lakes");
		endor.addResource("None");
		endor.setHyperdrive(StarWarsMod.hyperdriveEndor);
		Resources.planetInformation.add(endor);

		PlanetInformation geonosis = new PlanetInformation();
		geonosis.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetGeonosis.png"));
		geonosis.setDimensionId(Resources.ConfigOptions.dimGeonosisId);
		geonosis.setName("Geonosis");
		geonosis.setPosition(12.7f, 11.4f);
		geonosis.setAffiliation(Resources.allegianceNone);
		geonosis.setDescription("");
		geonosis.setObfuscated(true);
		Resources.planetInformation.add(geonosis);

		PlanetInformation tatooine = new PlanetInformation();
		tatooine.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetTatooine.png"));
		tatooine.setDimensionId(Resources.ConfigOptions.dimTatooineId);
		tatooine.setName("Tatooine");
		tatooine.setPosition(12.35f, 11.75f);
		tatooine.setAffiliation(Resources.allegianceNone);
		tatooine.setDescription("Tatooine is a sparsely inhabited desert planet located in the galaxy's Outer Rim Territories. Part of a binary star system, the planet is oppressed by a scorching sun, resulting in a lack of necessary surface water.");
		tatooine.setSuns(2);
		tatooine.setMoons(3);
		tatooine.addNativeSpecies("Tusken Raider");
		tatooine.addNativeSpecies("Jawa");
		tatooine.addNativeSpecies("Gamorrean Guard");
		tatooine.addNativeSpecies("Human");
		tatooine.addNativeSpecies("Bith");
		tatooine.addNativeSpecies("Bantha");
		tatooine.addNativeSpecies("Dewback");
		tatooine.addTerrain("Deserts");
		tatooine.addTerrain("Canyons");
		tatooine.addTerrain("Rocky Bluffs");
		tatooine.addResource("Bene");
		tatooine.setHyperdrive(StarWarsMod.hyperdriveTatooine);
		Resources.planetInformation.add(tatooine);

		PlanetInformation ryloth = new PlanetInformation();
		ryloth.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetRyloth.png"));
		ryloth.setDimensionId(Resources.ConfigOptions.dimRylothId);
		ryloth.setName("Ryloth");
		ryloth.setPosition(12.75f, 12.7f);
		ryloth.setAffiliation(Resources.allegianceNone);
		ryloth.setDescription("");
		ryloth.setObfuscated(true);
		Resources.planetInformation.add(ryloth);

		PlanetInformation ilum = new PlanetInformation();
		ilum.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetIlum.png"));
		ilum.setDimensionId(Resources.ConfigOptions.dimIlumId);
		ilum.setName("Ilum");
		ilum.setPosition(1.9f, 2.4f);
		ilum.setAffiliation(Resources.allegianceJedi);
		ilum.setDescription("Ilum is an arctic planet located in the Unknown Regions. It was used by the Jedi Order for the Gathering, a rite of passage in which Jedi younglings must find and harvest kyber crystals for their lightsabers.");
		ilum.setSuns(1);
		ilum.setMoons(2);
		ilum.addNativeSpecies("None");
		ilum.addTerrain("Caverns");
		ilum.addTerrain("Crystal Caves");
		ilum.addTerrain("Icy Mountains");
		ilum.addResource("Kyber Crystal");
		ilum.setHyperdrive(StarWarsMod.hyperdriveIlum);
		Resources.planetInformation.add(ilum);

		PlanetInformation kamino = new PlanetInformation();
		kamino.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetKamino.png"));
		kamino.setDimensionId(Resources.ConfigOptions.dimKaminoId);
		kamino.setName("Kamino");
		kamino.setPosition(13.75f, 10.3f);
		kamino.setAffiliation(Resources.allegianceNone);
		kamino.setDescription("");
		kamino.setObfuscated(true);
		Resources.planetInformation.add(kamino);

		PlanetInformation kashyyyk = new PlanetInformation();
		kashyyyk.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetKashyyyk.png"));
		kashyyyk.setDimensionId(Resources.ConfigOptions.dimKashyyykId);
		kashyyyk.setName("Kashyyyk");
		kashyyyk.setPosition(10.75f, 4.7f);
		kashyyyk.setAffiliation(Resources.allegianceNone);
		kashyyyk.setDescription("Kashyyyk is a temperate jungle planet orbiting around a single star located in the Mytaranor sector of the Mid Rim, and has a complement of three moons. It was a member of the Galactic Republic and after the Clone Wars endured enslavement under the Galactic Empire.");
		kashyyyk.addNativeSpecies("Wookiee");
		kashyyyk.addTerrain("Forests");
		kashyyyk.addResource("None");
		kashyyyk.setSuns(1);
		kashyyyk.setMoons(3);
		kashyyyk.setHyperdrive(StarWarsMod.hyperdriveKashyyyk);
		Resources.planetInformation.add(kashyyyk);

		PlanetInformation kessel = new PlanetInformation();
		kessel.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetKessel.png"));
		kessel.setDimensionId(Resources.ConfigOptions.dimKesselId);
		kessel.setName("Kessel");
		kessel.setPosition(14.3f, 5.0f);
		kessel.setAffiliation(Resources.allegianceNone);
		kessel.setDescription("");
		Resources.planetInformation.add(kessel);

		PlanetInformation mandalore = new PlanetInformation();
		mandalore.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetMandalore.png"));
		mandalore.setDimensionId(Resources.ConfigOptions.dimMandaloreId);
		mandalore.setName("Mandalore");
		mandalore.setPosition(9.7f, 2.3f);
		mandalore.setAffiliation(Resources.allegianceNone);
		mandalore.setDescription("");
		mandalore.setObfuscated(true);
		Resources.planetInformation.add(mandalore);

		PlanetInformation monCalamari = new PlanetInformation();
		monCalamari.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetMonCalamari.png"));
		monCalamari.setDimensionId(Resources.ConfigOptions.dimMonCalamariId);
		monCalamari.setName("Mon Calamari");
		monCalamari.setInternalName("MonCalamari");
		monCalamari.setPosition(15.1f, 1.8f);
		monCalamari.setAffiliation(Resources.allegianceNone);
		monCalamari.setDescription("");
		monCalamari.setObfuscated(true);
		Resources.planetInformation.add(monCalamari);

		PlanetInformation mustafar = new PlanetInformation();
		mustafar.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetMustafar.png"));
		mustafar.setDimensionId(Resources.ConfigOptions.dimMustafarId);
		mustafar.setName("Mustafar");
		mustafar.setPosition(6.3f, 15f);
		mustafar.setAffiliation(Resources.allegianceNone);
		mustafar.setDescription("");
		mustafar.setObfuscated(true);
		Resources.planetInformation.add(mustafar);

		PlanetInformation naboo = new PlanetInformation();
		naboo.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetNaboo.png"));
		naboo.setDimensionId(Resources.ConfigOptions.dimNabooId);
		naboo.setName("Naboo");
		naboo.setPosition(9.4f, 12.1f);
		naboo.setAffiliation(Resources.allegianceNone);
		naboo.setDescription("");
		naboo.setObfuscated(true);
		Resources.planetInformation.add(naboo);

		PlanetInformation sullust = new PlanetInformation();
		sullust.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetSullust.png"));
		sullust.setDimensionId(Resources.ConfigOptions.dimSullustId);
		sullust.setName("Sullust");
		sullust.setPosition(7.75f, 12.5f);
		sullust.setAffiliation(Resources.allegianceNone);
		sullust.setDescription("");
		sullust.setObfuscated(true);
		Resources.planetInformation.add(sullust);

		PlanetInformation utapau = new PlanetInformation();
		utapau.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetUtapau.png"));
		utapau.setDimensionId(Resources.ConfigOptions.dimUtapauId);
		utapau.setName("Utapau");
		utapau.setPosition(8.5f, 14.75f);
		utapau.setAffiliation(Resources.allegianceNone);
		utapau.setDescription("");
		utapau.setObfuscated(true);
		Resources.planetInformation.add(utapau);

		PlanetInformation yavin4 = new PlanetInformation();
		yavin4.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetYavin4.png"));
		yavin4.setDimensionId(Resources.ConfigOptions.dimYavin4Id);
		yavin4.setName("Yavin 4");
		yavin4.setInternalName("Yavin4");
		yavin4.setPosition(10.6f, 1.0f);
		yavin4.setAffiliation(Resources.allegianceRebel);
		yavin4.setDescription("Yavin 4 is one of three habitable moons orbiting the gas giant Yavin. It is mainly covered in jungle and rainforest, and despite being remote and unheard of, it plays an important role in galactic events. Serves as the main headquarters of the Rebel Alliance.");
		yavin4.setMoons(0);
		yavin4.setSuns(1);
		yavin4.addNativeSpecies("None");
		yavin4.addResource("None");
		yavin4.addTerrain("Jungles");
		yavin4.addTerrain("Rainforests");
		yavin4.setHyperdrive(StarWarsMod.hyperdriveYavin4);
		Resources.planetInformation.add(yavin4);

		PlanetInformation jakku = new PlanetInformation();
		jakku.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetJakku.png"));
		jakku.setDimensionId(Resources.ConfigOptions.dimJakkuId);
		jakku.setName("Jakku");
		jakku.setPosition(3.8f, 8.4f);
		jakku.setAffiliation(Resources.allegianceNone);
		jakku.setDescription("");
		jakku.setObfuscated(true);
		Resources.planetInformation.add(jakku);

		PlanetInformation takodana = new PlanetInformation();
		takodana.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetTakodana.png"));
		takodana.setDimensionId(Resources.ConfigOptions.dimTakodanaId);
		takodana.setName("Takodana");
		takodana.setPosition(4.8f, 10.7f);
		takodana.setAffiliation(Resources.allegianceNone);
		takodana.setDescription("");
		takodana.setObfuscated(true);
		Resources.planetInformation.add(takodana);

		PlanetInformation dQar = new PlanetInformation();
		dQar.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetDQar.png"));
		dQar.setDimensionId(Resources.ConfigOptions.dimDQarId);
		dQar.setName("D'Qar");
		dQar.setInternalName("DQar");
		dQar.setPosition(9.3f, 13.1f);
		dQar.setAffiliation(Resources.allegianceNone);
		dQar.setDescription("");
		dQar.setObfuscated(true);
		Resources.planetInformation.add(dQar);

		PlanetInformation ahchTo = new PlanetInformation();
		ahchTo.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetAhchTo.png"));
		ahchTo.setDimensionId(Resources.ConfigOptions.dimAhchToId);
		ahchTo.setName("Ahch To");
		ahchTo.setInternalName("AhchTo");
		ahchTo.setPosition(16.8f, 8.6f);
		ahchTo.setAffiliation(Resources.allegianceNone);
		ahchTo.setDescription("");
		ahchTo.setObfuscated(true);
		Resources.planetInformation.add(ahchTo);

		PlanetInformation deathStar = new PlanetInformation();
		deathStar.setCubeTexture(new ResourceLocation(Resources.MODID + ":" + "textures/models/planets/planetDeathStar.png"));
		deathStar.setDimensionId(Resources.ConfigOptions.dimDeathStarId);
		deathStar.setName("Death Star");
		deathStar.setInternalName("DeathStar");
		deathStar.setPosition(11.2f, 1.4f);
		deathStar.setAffiliation(Resources.allegianceImperial);
		deathStar.setDescription("Under Construction");
		deathStar.setMoons(0);
		deathStar.setSuns(0);
		deathStar.addResource("None");
		deathStar.addTerrain("Barracks");
		deathStar.addTerrain("Detention Cells");
		deathStar.addTerrain("Hangars");
		deathStar.addNativeSpecies("Human");
		Resources.planetInformation.add(deathStar);

		Lumberjack.info("World, reporting for duty!");
	}
}
/*
 * Location: C:\Users\Colby\Downloads\Parzi's Star Wars Mod
 * v1.2.0-dev7.jar!\com\parzi\starwarsmod\registry\WorldRegister.class Java
 * compiler version: 6 (50.0) JD-Core Version: 0.7.1
 */