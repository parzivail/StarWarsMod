package com.parzivail.pswm.rendering;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.models.blocks.ModelDSTurret;
import com.parzivail.pswm.weaponry.WeaponDSTurret;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderDSTurret extends RenderLiving
{
	ModelBase model;
	public static ResourceLocation texture = new ResourceLocation(Resources.MODID, "textures/models/dsTurret.png");

	public RenderDSTurret(ModelDSTurret par1ModelBase, float par2)
	{
		super(par1ModelBase, par2);
		this.model = par1ModelBase;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return texture;
	}

	@Override
	protected void preRenderCallback(EntityLivingBase entity, float f)
	{
		this.mainModel = this.setRotations(this.model, entity, f);
		GL11.glScalef(4.0F, 4.0F, 4.0F);
	}

	public ModelBase setRotations(ModelBase modelBase, EntityLivingBase entity, float partialTicks)
	{
		if (entity.riddenByEntity == null)
			return modelBase;

		WeaponDSTurret ds = (WeaponDSTurret)entity;

		ModelDSTurret t = (ModelDSTurret)modelBase;
		t.MainBarrel.rotateAngleX = ds.rotationPitchLast;

		return modelBase;
	}
}
