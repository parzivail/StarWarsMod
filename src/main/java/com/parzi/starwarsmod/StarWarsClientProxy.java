package com.parzi.starwarsmod;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import com.parzi.starwarsmod.entities.EntityBlasterBolt;
import com.parzi.starwarsmod.mobs.MobDroidAstromech;
import com.parzi.starwarsmod.mobs.MobJawa;
import com.parzi.starwarsmod.mobs.MobTauntaun;
import com.parzi.starwarsmod.mobs.MobTusken;
import com.parzi.starwarsmod.mobs.MobWookiee;
import com.parzi.starwarsmod.rendering.RenderBlasterBolt;
import com.parzi.starwarsmod.rendering.RenderDroidAstromech;
import com.parzi.starwarsmod.rendering.RenderJawa;
import com.parzi.starwarsmod.rendering.RenderTauntaun;
import com.parzi.starwarsmod.rendering.RenderTusken;
import com.parzi.starwarsmod.rendering.RenderWookiee;
import com.parzi.starwarsmod.rendering.gui.JediGUI;
import com.parzi.starwarsmod.rendering.models.ModelDroidAstromech;
import com.parzi.starwarsmod.rendering.models.ModelJawa;
import com.parzi.starwarsmod.rendering.models.ModelTauntaun;
import com.parzi.starwarsmod.rendering.models.ModelWookiee;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class StarWarsClientProxy extends StarWarsCommonProxy implements IGuiHandler {
	@Override
	public void registerRendering() {
		/* Mobs */
		RenderingRegistry.registerEntityRenderingHandler(MobWookiee.class,
				new RenderWookiee(new ModelWookiee(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobJawa.class,
				new RenderJawa(new ModelJawa(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobTauntaun.class,
				new RenderTauntaun(new ModelTauntaun(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(MobTusken.class,
				new RenderTusken(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(
				MobDroidAstromech.class, new RenderDroidAstromech(
						new ModelDroidAstromech(), 0.5F));

		/* Entities */
		RenderingRegistry.registerEntityRenderingHandler(
				EntityBlasterBolt.class, new RenderBlasterBolt(
						StarWarsMod.blasterBolt));

		/* Events */
		MinecraftForge.EVENT_BUS.register(new StarWarsEventHandler());
	}

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    	return null;
    }
}
