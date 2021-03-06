package com.parzivail.pswm.rendering.vehicles;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.models.vehicles.ModelSpeederBike;
import com.parzivail.pswm.vehicles.VehicHothSpeederBike;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSpeederBike extends RenderLandBase
{
	public static ResourceLocation texture = new ResourceLocation(Resources.MODID, "textures/models/speederbike.png");
	public static ResourceLocation hothTexture = new ResourceLocation(Resources.MODID, "textures/models/hothSpeederbike.png");

	public RenderSpeederBike()
	{
		super(new ModelSpeederBike(), 0.5f);
		this.scale = 1.75f;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		if (entity instanceof VehicHothSpeederBike)
			return hothTexture;
		return texture;
	}
}
