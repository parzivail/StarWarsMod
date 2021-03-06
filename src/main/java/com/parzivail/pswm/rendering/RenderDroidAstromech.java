package com.parzivail.pswm.rendering;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.mobs.MobDroidAstromechImperial;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDroidAstromech extends RenderLiving
{
	public static ResourceLocation texture = new ResourceLocation(Resources.MODID, "textures/models/astromech.png");
	public static ResourceLocation textureImperial = new ResourceLocation(Resources.MODID, "textures/models/astromechImperial.png");

	public RenderDroidAstromech(ModelBase par1ModelBase, float par2)
	{
		super(par1ModelBase, par2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		if (entity instanceof MobDroidAstromechImperial)
			return textureImperial;
		return texture;
	}
}
