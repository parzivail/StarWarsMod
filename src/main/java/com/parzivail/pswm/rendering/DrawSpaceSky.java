package com.parzivail.pswm.rendering;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.Tessellator;
import net.minecraftforge.client.IRenderHandler;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Sphere;

import java.util.Random;

public class DrawSpaceSky extends IRenderHandler
{
	public static int starList = GLAllocation.generateDisplayLists(3);
	public static int glSkyList = starList + 1;

	Sphere s = new Sphere();

	public DrawSpaceSky()
	{
		GL11.glNewList(glSkyList, 4864);
		GL11.glColor4f(0, 0, 0, 1);
		s.draw(110, 50, 50);
		GL11.glColor4f(1, 1, 1, 1);
		this.renderStars();
		GL11.glEndList();
	}

	@Override
	public void render(float partialTicks, WorldClient world, Minecraft mc)
	{
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_CULL_FACE);

		GL11.glCallList(glSkyList);

		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_BLEND);
	}

	private void renderStars()
	{
		Random rand = new Random(0);
		Tessellator var2 = Tessellator.instance;
		var2.startDrawingQuads();
		for (int starIndex = 0; starIndex < 20000; starIndex++)
		{
			double var4 = rand.nextFloat() * 2.0F - 1.0F;
			double var6 = rand.nextFloat() * 2.0F - 1.0F;
			double var8 = rand.nextFloat() * 2.0F - 1.0F;
			double var10 = 0.15F + rand.nextFloat() * 0.1F;
			double var12 = var4 * var4 + var6 * var6 + var8 * var8;
			if (var12 < 1.0D && var12 > 0.01D)
			{
				var12 = 1.0D / Math.sqrt(var12);
				var4 *= var12;
				var6 *= var12;
				var8 *= var12;
				double var14 = var4 * 100.0D;
				double var16 = var6 * 100.0D;
				double var18 = var8 * 100.0D;
				double var20 = Math.atan2(var4, var8);
				double var22 = Math.sin(var20);
				double var24 = Math.cos(var20);
				double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
				double var28 = Math.sin(var26);
				double var30 = Math.cos(var26);
				double var32 = rand.nextDouble() * 3.141592653589793D * 2.0D;
				double var34 = Math.sin(var32);
				double var36 = Math.cos(var32);
				for (int var38 = 0; var38 < 4; var38++)
				{
					double var39 = 0.0D;
					double var41 = ((var38 & 0x2) - 1) * var10;
					double var43 = ((var38 + 1 & 0x2) - 1) * var10;
					double var47 = var41 * var36 - var43 * var34;
					double var49 = var43 * var36 + var41 * var34;
					double var53 = var47 * var28 + var39 * var30;
					double var55 = var39 * var28 - var47 * var30;
					double var57 = var55 * var22 - var49 * var24;
					double var61 = var49 * var22 + var55 * var24;
					var2.addVertex(var14 + var57, var16 + var53, var18 + var61);
				}
			}
		}
		var2.draw();
	}
}
