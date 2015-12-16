package com.parzi.starwarsmod.rendering.vehicles;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.parzi.starwarsmod.StarWarsMod;
import com.parzi.starwarsmod.rendering.models.vehicles.ModelTIEInterceptor;

public class RenderTIEInterceptor extends RenderVehicAirBase
{
	public static ResourceLocation texture = new ResourceLocation(StarWarsMod.MODID, "textures/models/tieInterceptor.png");

	public RenderTIEInterceptor(ModelTIEInterceptor model, float par2)
	{
		super(model, par2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return texture;
	}
}
/*
 * Location: C:\Users\Colby\Downloads\Parzi's Star Wars Mod
 * v1.2.0-dev7.jar!\com\
 * parzi\starwarsmod\rendering\vehicles\RenderSpeederBike.class Java compiler
 * version: 6 (50.0) JD-Core Version: 0.7.1
 */