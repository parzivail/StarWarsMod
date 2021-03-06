package com.parzivail.pswm.rendering.vehicles;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.models.vehicles.ModelYWing;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderYWing extends RenderVehicBase
{
	public static ResourceLocation texture = new ResourceLocation(Resources.MODID, "textures/models/ywing.png");

	public RenderYWing()
	{
		super(new ModelYWing(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return texture;
	}
}