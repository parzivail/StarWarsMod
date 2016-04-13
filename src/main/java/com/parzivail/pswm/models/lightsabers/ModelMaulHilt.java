package com.parzivail.pswm.models.lightsabers;

import org.lwjgl.opengl.GL11;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.rendering.IHandlesRender;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

/**
 * Maul's Hilt - Undefined Created using Tabula 4.1.1
 */
public class ModelMaulHilt extends ModelBase implements IHandlesRender
{

	ResourceLocation tA = new ResourceLocation(Resources.MODID, "textures/models/lightsabers/maul_A.png");
	ResourceLocation tB = new ResourceLocation(Resources.MODID, "textures/models/lightsabers/maul_B.png");

	public ModelRenderer Shape1;
	public ModelRenderer Shape3;
	public ModelRenderer Shape5;
	public ModelRenderer Shape6;
	public ModelRenderer Shape7;
	public ModelRenderer Shape9;
	public ModelRenderer Shape10;
	public ModelRenderer Shape11;
	public ModelRenderer Shape4;
	public ModelRenderer Shape13;
	public ModelRenderer Shape14;
	public ModelRenderer Shape15;
	public ModelRenderer Shape16;
	public ModelRenderer Shape17;
	public ModelRenderer Shape18;
	public ModelRenderer Shape12;
	public ModelRenderer Shape2;
	public ModelRenderer Shape19;
	public ModelRenderer Shape20;
	public ModelRenderer Shape21;
	public ModelRenderer Shape22;
	public ModelRenderer Shape23;
	public ModelRenderer Shape24;
	public ModelRenderer Shape25;
	public ModelRenderer Shape26;
	public ModelRenderer Shape27;
	public ModelRenderer Shape28;
	public ModelRenderer Shape29;
	public ModelRenderer Shape30;
	public ModelRenderer Shape31;
	public ModelRenderer Shape33;
	public ModelRenderer Shape35;
	public ModelRenderer Shape36;
	public ModelRenderer Shape37;
	public ModelRenderer Shape38;
	public ModelRenderer Shape39;
	public ModelRenderer Shape40;
	public ModelRenderer Shape41;
	public ModelRenderer Shape42;
	public ModelRenderer Shape43;
	public ModelRenderer Shape44;
	public ModelRenderer Shape45;
	public ModelRenderer Shape46;
	public ModelRenderer Shape47;
	public ModelRenderer Shape49;
	public ModelRenderer Shape50;
	public ModelRenderer Shape51;

	public ModelMaulHilt()
	{
		this.textureWidth = 512;
		this.textureHeight = 512;
		this.Shape41 = new ModelRenderer(this, 29, 9);
		this.Shape41.setRotationPoint(-36.5F, -1.0F, 2.0F);
		this.Shape41.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.Shape49 = new ModelRenderer(this, 0, 36);
		this.Shape49.setRotationPoint(-2.0F, 0.0F, 0.0F);
		this.Shape49.addBox(0.0F, 0.0F, 0.0F, 5, 6, 6, 0.0F);
		this.Shape25 = new ModelRenderer(this, 118, 61);
		this.Shape25.setRotationPoint(-47.0F, 1.2999999523162842F, -1.0F);
		this.Shape25.addBox(-13.0F, 0.0F, 0.0F, 13, 1, 2, 0.0F);
		this.setRotateAngle(this.Shape25, 0.0F, 0.06981316953897476F, 0.0F);
		this.Shape31 = new ModelRenderer(this, 61, 96);
		this.Shape31.setRotationPoint(43.5F, -0.5F, -0.5F);
		this.Shape31.addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
		this.Shape35 = new ModelRenderer(this, 0, 58);
		this.Shape35.setRotationPoint(-45.0F, 0.0F, 0.0F);
		this.Shape35.addBox(0.0F, 0.0F, 0.0F, 11, 6, 6, 0.0F);
		this.Shape33 = new ModelRenderer(this, 0, 78);
		this.Shape33.setRotationPoint(35.0F, 0.0F, 0.0F);
		this.Shape33.addBox(0.0F, 0.0F, 0.0F, 11, 6, 6, 0.0F);
		this.Shape39 = new ModelRenderer(this, 85, 30);
		this.Shape39.setRotationPoint(-30.0F, -0.5F, -0.5F);
		this.Shape39.addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
		this.Shape12 = new ModelRenderer(this, 0, 202);
		this.Shape12.setRotationPoint(-59.0F, 0.5F, 0.5F);
		this.Shape12.addBox(0.0F, 0.0F, 0.0F, 119, 5, 5, 0.0F);
		this.Shape38 = new ModelRenderer(this, 85, 52);
		this.Shape38.setRotationPoint(-32.0F, -0.5F, -0.5F);
		this.Shape38.addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
		this.Shape43 = new ModelRenderer(this, 14, 19);
		this.Shape43.setRotationPoint(17.0F, -1.0F, 2.0F);
		this.Shape43.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.Shape28 = new ModelRenderer(this, 61, 52);
		this.Shape28.setRotationPoint(30.0F, -0.5F, -0.5F);
		this.Shape28.addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
		this.Shape29 = new ModelRenderer(this, 61, 74);
		this.Shape29.setRotationPoint(32.0F, -0.5F, -0.5F);
		this.Shape29.addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
		this.Shape17 = new ModelRenderer(this, 159, 59);
		this.Shape17.setRotationPoint(48.0F, 1.2999999523162842F, 7.0F);
		this.Shape17.addBox(0.0F, 0.0F, -2.0F, 14, 1, 2, 0.0F);
		this.setRotateAngle(this.Shape17, 0.0F, 0.06981316953897476F, 0.0F);
		this.Shape47 = new ModelRenderer(this, 0, 161);
		this.Shape47.setRotationPoint(4.0F, 0.0F, 0.0F);
		this.Shape47.addBox(0.0F, 0.0F, 0.0F, 30, 6, 6, 0.0F);
		this.Shape5 = new ModelRenderer(this, 0, 100);
		this.Shape5.setRotationPoint(-50.0F, 0.0F, 0.0F);
		this.Shape5.addBox(0.0F, 0.0F, 0.0F, 4, 6, 6, 0.0F);
		this.Shape13 = new ModelRenderer(this, 143, 125);
		this.Shape13.setRotationPoint(61.0F, -1.5F, -1.5F);
		this.Shape13.addBox(0.0F, 0.0F, 0.0F, 2, 9, 9, 0.0F);
		this.Shape46 = new ModelRenderer(this, 60, 30);
		this.Shape46.setRotationPoint(0.0F, -0.5F, -0.5F);
		this.Shape46.addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
		this.Shape4 = new ModelRenderer(this, 159, 14);
		this.Shape4.setRotationPoint(48.0F, -1.0F, 3.700000047683716F);
		this.Shape4.addBox(0.0F, 0.0F, 0.0F, 13, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape4, 0.0F, -0.0F, 0.06981316953897475F);
		this.Shape45 = new ModelRenderer(this, 14, 9);
		this.Shape45.setRotationPoint(22.5F, -1.0F, 2.0F);
		this.Shape45.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.Shape20 = new ModelRenderer(this, 117, 24);
		this.Shape20.setRotationPoint(-47.0F, -1.0F, 1.2999999523162842F);
		this.Shape20.addBox(-13.0F, 0.0F, 0.0F, 13, 1, 1, 0.0F);
		this.setRotateAngle(this.Shape20, 0.0F, -0.0F, -0.06981316953897475F);
		this.Shape27 = new ModelRenderer(this, 118, 14);
		this.Shape27.setRotationPoint(-47.0F, 7.0F, 1.2999999523162842F);
		this.Shape27.addBox(-13.0F, -2.0F, 0.0F, 13, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape27, 0.0F, -0.0F, 0.06981316953897475F);
		this.Shape3 = new ModelRenderer(this, 0, 118);
		this.Shape3.setRotationPoint(47.0F, 0.0F, 0.0F);
		this.Shape3.addBox(0.0F, 0.0F, 0.0F, 4, 6, 6, 0.0F);
		this.Shape40 = new ModelRenderer(this, 29, 0);
		this.Shape40.setRotationPoint(-42.0F, -1.0F, 2.0F);
		this.Shape40.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.Shape23 = new ModelRenderer(this, 117, 42);
		this.Shape23.setRotationPoint(-47.0F, 1.2999999523162842F, 7.0F);
		this.Shape23.addBox(-13.0F, 0.0F, -2.0F, 13, 1, 2, 0.0F);
		this.setRotateAngle(this.Shape23, 0.0F, -0.06981316953897476F, 0.0F);
		this.Shape21 = new ModelRenderer(this, 117, 33);
		this.Shape21.setRotationPoint(-47.0F, -1.0F, 3.700000047683716F);
		this.Shape21.addBox(-13.0F, 0.0F, 0.0F, 13, 3, 1, 0.0F);
		this.setRotateAngle(this.Shape21, 0.0F, -0.0F, -0.06981316953897475F);
		this.Shape14 = new ModelRenderer(this, 28, 100);
		this.Shape14.setRotationPoint(52.0F, 0.0F, 0.0F);
		this.Shape14.addBox(0.0F, 0.0F, 0.0F, 2, 6, 6, 0.0F);
		this.Shape24 = new ModelRenderer(this, 118, 70);
		this.Shape24.setRotationPoint(-47.0F, 3.700000047683716F, -1.0F);
		this.Shape24.addBox(-13.0F, 0.0F, 0.0F, 13, 1, 2, 0.0F);
		this.setRotateAngle(this.Shape24, 0.0F, 0.06981316953897476F, 0.0F);
		this.Shape7 = new ModelRenderer(this, 174, 125);
		this.Shape7.setRotationPoint(60.0F, -0.5F, -0.5F);
		this.Shape7.addBox(0.0F, 0.0F, 0.0F, 4, 7, 7, 0.0F);
		this.Shape9 = new ModelRenderer(this, 159, 33);
		this.Shape9.setRotationPoint(48.0F, 3.700000047683716F, -1.0F);
		this.Shape9.addBox(0.0F, 0.0F, 0.0F, 13, 1, 2, 0.0F);
		this.setRotateAngle(this.Shape9, 0.0F, -0.06981316953897476F, 0.0F);
		this.Shape22 = new ModelRenderer(this, 117, 51);
		this.Shape22.setRotationPoint(-47.0F, 3.700000047683716F, 7.0F);
		this.Shape22.addBox(-13.0F, 0.0F, -2.0F, 13, 1, 2, 0.0F);
		this.setRotateAngle(this.Shape22, 0.0F, -0.06981316953897476F, 0.0F);
		this.Shape18 = new ModelRenderer(this, 159, 70);
		this.Shape18.setRotationPoint(48.0F, 3.700000047683716F, 7.0F);
		this.Shape18.addBox(0.0F, 0.0F, -2.0F, 14, 1, 2, 0.0F);
		this.setRotateAngle(this.Shape18, 0.0F, 0.06981316953897476F, 0.0F);
		this.Shape37 = new ModelRenderer(this, 86, 74);
		this.Shape37.setRotationPoint(-43.5F, -0.5F, -0.5F);
		this.Shape37.addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
		this.Shape44 = new ModelRenderer(this, 14, 0);
		this.Shape44.setRotationPoint(-22.5F, -1.0F, 2.0F);
		this.Shape44.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.Shape11 = new ModelRenderer(this, 159, 25);
		this.Shape11.setRotationPoint(48.0F, 1.2999999523162842F, -1.0F);
		this.Shape11.addBox(0.0F, 0.0F, 0.0F, 13, 1, 2, 0.0F);
		this.setRotateAngle(this.Shape11, 0.0F, -0.06981316953897476F, 0.0F);
		this.Shape2 = new ModelRenderer(this, 29, 118);
		this.Shape2.setRotationPoint(-53.0F, 0.0F, 0.0F);
		this.Shape2.addBox(0.0F, 0.0F, 0.0F, 2, 6, 6, 0.0F);
		this.Shape50 = new ModelRenderer(this, 50, 1);
		this.Shape50.setRotationPoint(40.0F, 6.0F, 2.0F);
		this.Shape50.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
		this.Shape26 = new ModelRenderer(this, 118, 5);
		this.Shape26.setRotationPoint(-47.0F, 7.0F, 3.700000047683716F);
		this.Shape26.addBox(-13.0F, -2.0F, 0.0F, 13, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape26, 0.0F, -0.0F, 0.06981316953897475F);
		this.Shape51 = new ModelRenderer(this, 51, 11);
		this.Shape51.setRotationPoint(-41.0F, 6.0F, 2.0F);
		this.Shape51.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
		this.Shape30 = new ModelRenderer(this, 0, 9);
		this.Shape30.setRotationPoint(35.5F, -1.0F, 2.0F);
		this.Shape30.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.Shape6 = new ModelRenderer(this, 80, 125);
		this.Shape6.setRotationPoint(-63.0F, -0.5F, -0.5F);
		this.Shape6.addBox(0.0F, 0.0F, 0.0F, 4, 7, 7, 0.0F);
		this.Shape10 = new ModelRenderer(this, 159, 5);
		this.Shape10.setRotationPoint(48.0F, -1.0F, 1.2999999523162842F);
		this.Shape10.addBox(0.0F, 0.0F, 0.0F, 13, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape10, 0.0F, -0.0F, 0.06981316953897475F);
		this.Shape42 = new ModelRenderer(this, 0, 0);
		this.Shape42.setRotationPoint(-16.0F, -1.0F, 2.0F);
		this.Shape42.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.Shape16 = new ModelRenderer(this, 159, 50);
		this.Shape16.setRotationPoint(48.0F, 6.0F, 3.700000047683716F);
		this.Shape16.addBox(0.0F, -1.0F, 0.0F, 14, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape16, 0.0F, -0.0F, -0.06981316953897475F);
		this.Shape36 = new ModelRenderer(this, 0, 18);
		this.Shape36.setRotationPoint(41.0F, -1.0F, 2.0F);
		this.Shape36.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.Shape1 = new ModelRenderer(this, 0, 180);
		this.Shape1.setRotationPoint(-3.0F, 0.0F, 0.0F);
		this.Shape1.addBox(-30.0F, 0.0F, 0.0F, 30, 6, 6, 0.0F);
		this.Shape15 = new ModelRenderer(this, 159, 42);
		this.Shape15.setRotationPoint(48.0F, 6.0F, 1.2999999523162842F);
		this.Shape15.addBox(0.0F, -1.0F, 0.0F, 14, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape15, 0.0F, -0.0F, -0.06981316953897475F);
		this.Shape19 = new ModelRenderer(this, 111, 125);
		this.Shape19.setRotationPoint(-62.0F, -1.5F, -1.5F);
		this.Shape19.addBox(0.0F, 0.0F, 0.0F, 2, 9, 9, 0.0F);
	}

	@Override
	public ResourceLocation getResourceLocation(boolean alt)
	{
		if (alt)
			return this.tB;
		return this.tA;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		return true;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.Shape41.render(f5);
		this.Shape49.render(f5);
		this.Shape25.render(f5);
		this.Shape31.render(f5);
		this.Shape35.render(f5);
		this.Shape33.render(f5);
		this.Shape39.render(f5);
		this.Shape12.render(f5);
		this.Shape38.render(f5);
		this.Shape43.render(f5);
		this.Shape28.render(f5);
		this.Shape29.render(f5);
		this.Shape17.render(f5);
		this.Shape47.render(f5);
		this.Shape5.render(f5);
		this.Shape13.render(f5);
		this.Shape46.render(f5);
		this.Shape4.render(f5);
		this.Shape45.render(f5);
		this.Shape20.render(f5);
		this.Shape27.render(f5);
		this.Shape3.render(f5);
		this.Shape40.render(f5);
		this.Shape23.render(f5);
		this.Shape21.render(f5);
		this.Shape14.render(f5);
		this.Shape24.render(f5);
		this.Shape7.render(f5);
		this.Shape9.render(f5);
		this.Shape22.render(f5);
		this.Shape18.render(f5);
		this.Shape37.render(f5);
		this.Shape44.render(f5);
		this.Shape11.render(f5);
		this.Shape2.render(f5);
		this.Shape50.render(f5);
		this.Shape26.render(f5);
		this.Shape51.render(f5);
		this.Shape30.render(f5);
		this.Shape6.render(f5);
		this.Shape10.render(f5);
		this.Shape42.render(f5);
		this.Shape16.render(f5);
		this.Shape36.render(f5);
		this.Shape1.render(f5);
		this.Shape15.render(f5);
		this.Shape19.render(f5);
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		switch (type)
		{
			case ENTITY:
				GL11.glPushMatrix();
				GL11.glScalef(0.03f, 0.03f, 0.03f);
				GL11.glRotatef(-90, 0, 0, 1);
				GL11.glTranslatef(-40, -2, -2);
				this.render(null, 0, 0, 0, 0, 0, 0.625f);
				GL11.glPopMatrix();
				break;
			case EQUIPPED:
				GL11.glPushMatrix();
				GL11.glScalef(0.05f, 0.05f, 0.05f);
				GL11.glRotatef(180, 1, 0, 0);
				GL11.glRotatef(45, 0, 1, 0);
				GL11.glRotatef(20, 0, 0, 1);
				GL11.glRotatef(90, 1, 0, 0);
				GL11.glTranslatef(22, -2, 18);
				if (data[1] instanceof EntityPlayer)
				{
					EntityPlayer player = (EntityPlayer)data[1];
					if (player.isBlocking())
					{
						GL11.glRotatef(80, 0, 0, 1);
						GL11.glTranslatef(0, -2, -3);
					}
				}
				this.render(null, 0, 0, 0, 0, 0, 0.625f);
				GL11.glPopMatrix();
				break;
			case EQUIPPED_FIRST_PERSON:
				GL11.glPushMatrix();
				GL11.glScalef(0.05f, 0.05f, 0.05f);
				GL11.glTranslatef(0, 25, 0);
				GL11.glRotatef(-130, 0, 1, 0);
				GL11.glRotatef(180, 1, 0, 0);
				GL11.glRotatef(75, 0, 0, 1);
				GL11.glRotatef(85, 1, 0, 0);
				GL11.glTranslatef(25, 18, 0);
				if (data[1] instanceof EntityPlayer)
				{
					EntityPlayer player = (EntityPlayer)data[1];
					if (player.isBlocking())
					{
						GL11.glRotatef(-20, 0, 0, 1);
						GL11.glRotatef(70, 0, 1, 0);
						GL11.glRotatef(30, 1, 0, 0);
						GL11.glTranslatef(14, -4, -5);
					}
				}
				this.render(null, 0, 0, 0, 0, 0, 0.625f);
				GL11.glPopMatrix();
				break;
			case INVENTORY:
				GL11.glScalef(0.025f, 0.025f, 0.025f);
				GL11.glTranslatef(-3, -3, 0);
				GL11.glRotatef(160, 0, 0, 1);
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glRotatef(90, 1, 0, 0);
				this.render(null, 0, 0, 0, 0, 0, 0.625f);
				break;
			default:
				break;
		}
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return true;
	}
}