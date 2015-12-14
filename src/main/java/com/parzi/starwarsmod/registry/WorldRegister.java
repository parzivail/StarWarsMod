package com.parzi.starwarsmod.registry;

import com.parzi.starwarsmod.StarWarsMod;
import com.parzi.starwarsmod.dimension.tatooine.BiomeGenTatooine;
import com.parzi.starwarsmod.dimension.tatooine.TatooineProvider;
import com.parzi.starwarsmod.mobs.MobBantha;
import com.parzi.starwarsmod.mobs.MobDewback;
import com.parzi.starwarsmod.mobs.MobGamorrean;
import com.parzi.starwarsmod.mobs.MobJawa;
import com.parzi.starwarsmod.mobs.MobSandtrooper;
import com.parzi.starwarsmod.mobs.MobTusken;
import com.parzi.starwarsmod.utils.Lumberjack;
import com.parzi.starwarsmod.utils.WorldUtils;
import com.parzi.starwarsmod.world.OreGenerator;
import com.parzi.starwarsmod.world.provider.WorldProviderTatooine;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.DimensionManager;

public class WorldRegister
{
	public static void registerAll()
	{
		StarWarsMod.dimTatooineId = DimensionManager.getNextFreeDimId();
		//StarWarsMod.dimHothId = DimensionManager.getNextFreeDimId();
		//StarWarsMod.dimKashyyykId = DimensionManager.getNextFreeDimId();
		//StarWarsMod.dimYavin4Id = DimensionManager.getNextFreeDimId();
		//StarWarsMod.dimEndorId = DimensionManager.getNextFreeDimId();
		//StarWarsMod.dimEndorPlainsId = DimensionManager.getNextFreeDimId();
		//StarWarsMod.dimDagobahId = DimensionManager.getNextFreeDimId();

		StarWarsMod.biomeTatooine = new BiomeGenTatooine(StarWarsMod.dimTatooineId);
		BiomeManager.removeSpawnBiome(StarWarsMod.biomeTatooine);
		//StarWarsMod.biomeHoth = new BiomeHoth(StarWarsMod.dimHothId);
		//StarWarsMod.biomeKashyyyk = new BiomeKashyyyk(StarWarsMod.dimKashyyykId);
		//StarWarsMod.biomeYavin4 = new BiomeYavinFour(StarWarsMod.dimYavin4Id);
		//StarWarsMod.biomeEndor = new BiomeEndor(StarWarsMod.dimEndorId);
		//StarWarsMod.biomeEndorPlains = new BiomeEndorPlains(StarWarsMod.dimEndorPlainsId);
		//StarWarsMod.biomeDagobah = new BiomeDagobah(StarWarsMod.dimDagobahId);

		WorldUtils.registerDimension(StarWarsMod.dimTatooineId, TatooineProvider.class);
		//WorldUtils.registerDimension(StarWarsMod.dimHothId, WorldProviderHoth.class);
		//WorldUtils.registerDimension(StarWarsMod.dimKashyyykId, WorldProviderKashyyyk.class);
		//WorldUtils.registerDimension(StarWarsMod.dimYavin4Id, WorldProviderYavinFour.class);
		//WorldUtils.registerDimension(StarWarsMod.dimEndorId, WorldProviderEndor.class);
		//WorldUtils.registerDimension(StarWarsMod.dimDagobahId, WorldProviderDagobah.class);

		/*
		 * WorldUtils.removeSpawnBiome(StarWarsMod.biomeEndor);
		 * WorldUtils.removeSpawnBiome(StarWarsMod.biomeEndorPlains);
		 * WorldUtils.removeSpawnBiome(StarWarsMod.biomeHoth);
		 * WorldUtils.removeSpawnBiome(StarWarsMod.biomeKashyyyk);
		 * WorldUtils.removeSpawnBiome(StarWarsMod.biomeTatooine);
		 * WorldUtils.removeSpawnBiome(StarWarsMod.biomeYavin4);
		 * WorldUtils.removeSpawnBiome(StarWarsMod.biomeDagobah);
		 */

		EntityRegistry.addSpawn(MobGamorrean.class, 3, 1, 3, EnumCreatureType.monster, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobSandtrooper.class, 80, 5, 10, EnumCreatureType.monster, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobJawa.class, 30, 1, 5, EnumCreatureType.monster, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobTusken.class, 3, 1, 3, EnumCreatureType.monster, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobBantha.class, 7, 1, 1, EnumCreatureType.creature, StarWarsMod.biomeTatooine);
		EntityRegistry.addSpawn(MobDewback.class, 7, 1, 2, EnumCreatureType.creature, StarWarsMod.biomeTatooine);
		//EntityRegistry.addSpawn(MobEwok.class, 10, 1, 1, EnumCreatureType.creature, StarWarsMod.biomeEndor, StarWarsMod.biomeEndorPlains);
		//EntityRegistry.addSpawn(MobTauntaun.class, 6, 1, 1, EnumCreatureType.creature, StarWarsMod.biomeHoth);
		//EntityRegistry.addSpawn(MobDroidProbe.class, 1, 1, 1, EnumCreatureType.creature, StarWarsMod.biomeHoth);
		//EntityRegistry.addSpawn(MobWampa.class, 1, 1, 1, EnumCreatureType.monster, StarWarsMod.biomeHoth);
		//EntityRegistry.addSpawn(MobWookiee.class, 10, 1, 1, EnumCreatureType.creature, StarWarsMod.biomeKashyyyk);

		GameRegistry.registerWorldGenerator(new OreGenerator(), 10);
		Lumberjack.info("World, reporting for duty!");
	}
}
/*
 * Location: C:\Users\Colby\Downloads\Parzi's Star Wars Mod
 * v1.2.0-dev7.jar!\com\parzi\starwarsmod\registry\WorldRegister.class Java
 * compiler version: 6 (50.0) JD-Core Version: 0.7.1
 */