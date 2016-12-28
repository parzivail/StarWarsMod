package com.parzivail.pswm.dimension;

import com.parzivail.pswm.dimension.tatooine.WorldProviderTatooine;
import com.parzivail.util.common.Lumberjack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketEntityEffect;
import net.minecraft.network.play.server.SPacketPlayerAbilities;
import net.minecraft.network.play.server.SPacketRespawn;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.management.PlayerList;
import net.minecraft.world.DimensionType;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;

/**
 * Created by colby on 12/22/2016.
 */
public class DimensionInfo
{
	public static final int tatooineId = 20;
	public static final DimensionType tatooineDimension = DimensionType.register("Tatooine", "_tatooine", tatooineId, WorldProviderTatooine.class, false);

	public static void register()
	{
		DimensionManager.registerDimension(tatooineId, tatooineDimension);

		Lumberjack.log("[DIMS] Prepare to orbit the planet Yavin.");
	}

	public static void teleportPlayerTo(EntityPlayerMP player, int id)
	{
		Teleporter teleporter = new InstantTeleporter(player.getServer().worldServerForDimension(id));
		transferPlayerToDimension(player, id, teleporter);
	}

	public static void transferPlayerToDimension(EntityPlayerMP player, int dimensionIn, net.minecraft.world.Teleporter teleporter)
	{
		PlayerList plist = player.mcServer.getPlayerList();
		int i = player.dimension;
		WorldServer worldserver = player.mcServer.worldServerForDimension(player.dimension);
		player.dimension = dimensionIn;
		WorldServer worldserver1 = player.mcServer.worldServerForDimension(player.dimension);
		player.connection.sendPacket(new SPacketRespawn(player.dimension, worldserver1.getDifficulty(), worldserver1.getWorldInfo().getTerrainType(), player.interactionManager.getGameType()));
		plist.updatePermissionLevel(player);
		player.setDropItemsWhenDead(false);
		worldserver.removeEntity(player);
		//worldserver.removeEntityDangerously(player);
		player.isDead = false;
		plist.transferEntityToWorld(player, i, worldserver, worldserver1, teleporter);
		plist.preparePlayer(player, worldserver);
		player.connection.setPlayerLocation(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
		player.interactionManager.setWorld(worldserver1);
		player.connection.sendPacket(new SPacketPlayerAbilities(player.capabilities));
		plist.updateTimeAndWeatherForPlayer(player, worldserver1);
		plist.syncPlayerInventory(player);
		player.setDropItemsWhenDead(true);

		for (PotionEffect potioneffect : player.getActivePotionEffects())
		{
			player.connection.sendPacket(new SPacketEntityEffect(player.getEntityId(), potioneffect));
		}
		net.minecraftforge.fml.common.FMLCommonHandler.instance().firePlayerChangedDimensionEvent(player, i, dimensionIn);
	}

	public static void placePlayer(InstantTeleporter teleporter, Entity entity)
	{
		// TODO: spawns per planet
		entity.setLocationAndAngles(0, teleporter.getTerrainHeightAt(0, 0), 0, entity.rotationYaw, 0.0F);
	}
}