package com.parzivail.pswm.render;

import com.parzivail.pswm.PSWM;
import com.parzivail.util.driven.Pilotable;
import com.parzivail.util.ui.GFX;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

public class RenderStarship extends Render<Pilotable>
{
	private ResourceLocation tex;
	public ModelBase model;
	public float scale = 3;
	public float zOffset = 0;
	public boolean disableFirst = true;

	public RenderStarship(RenderManager manager, ModelBase model, ResourceLocation resourceLocation)
	{
		super(manager);
		this.model = model;
		this.tex = resourceLocation;
		shadowSize = 0.5F;
	}

	public void render(Pilotable pilotable, double d, double d1, double d2, float f, float f1)
	{
		bindEntityTexture(pilotable);
		GL11.glPushMatrix();
		GL11.glTranslated(d, d1, d2);
		float dYaw = MathHelper.wrapDegrees(pilotable.axes.getYaw() - pilotable.prevAxes.getYaw());
		float dPitch = MathHelper.wrapDegrees(pilotable.axes.getPitch() - pilotable.prevAxes.getPitch());
		float dRoll = MathHelper.wrapDegrees(pilotable.axes.getRoll() - pilotable.prevAxes.getRoll());
		GL11.glRotatef(180F - pilotable.prevAxes.getYaw() - dYaw * f1, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(pilotable.prevAxes.getPitch() + dPitch * f1 + 180, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(-(pilotable.prevAxes.getRoll() + dRoll * f1), 1.0F, 0.0F, 0.0F);
		if (PSWM.mc.player.getRidingEntity() == pilotable)
			GFX.changeCameraRoll(-(pilotable.prevAxes.getRoll() + dRoll * f1));

		if (PSWM.mc.player.getRidingEntity() != pilotable || (PSWM.mc.gameSettings.thirdPersonView != 0 || !disableFirst))
		{
			GL11.glColor4f(1, 1, 1, 1);
			GL11.glScalef(scale, scale, scale);
			if (model != null)
			{
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(0, -0.85f + zOffset, 0);
				GL11.glRotatef(getTilt(pilotable, d, d1, d2, f, f1), 0, 0, 1);
				model.render(pilotable, (float)d, (float)d1, (float)d2, f, f1, 1 / 16f);
			}
		}

		GL11.glPopMatrix();
	}

	@Override
	public void doRender(Pilotable entity, double d, double d1, double d2, float f, float f1)
	{
		render(entity, d, d1, d2, f, f1);
	}

	public float getTilt(Pilotable pilotable, double d, double d1, double d2, float f, float f1)
	{
		//GFX.changeCameraRoll(-dYaw / 2f);
		return -2 * MathHelper.wrapDegrees(pilotable.axes.getYaw() - pilotable.prevAxes.getYaw());//(pilotable.dYaw + (pilotable.dYaw - pilotable.prevDYaw) * f1);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(Pilotable entity)
	{
		return tex;
	}
}