package com.parzi.util.ui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;

public class RenderHelper
{
	private Minecraft mc;

	/**
	 * Initiates a new RenderHelper class
	 *
	 * @param mc
	 *            The minecraft to wrap
	 */
	public RenderHelper(Minecraft mc)
	{
		this.mc = mc;
	}

	/**
	 * Gets the camera mode
	 *
	 * @return Returns true if the camera is in 1st person mode
	 */
	public boolean isFirstPerson()
	{
		return this.mc.gameSettings.thirdPersonView == 0;
	}

	/**
	 * Sets the camera mode
	 */
	public void setCameraMode(int mode)
	{
		this.mc.gameSettings.thirdPersonView = mode;
	}

	public static void disableLightmap()
	{
		OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
	}

	public static void enableLightmap()
	{
		OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
	}
}