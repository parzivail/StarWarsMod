package com.parzivail.pswm.models.lightsabers;

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
import org.lwjgl.opengl.GL11;

/**
 * StarkillerHilt - Undefined Created using Tabula 4.1.1
 */
public class ModelStarkillerHilt extends ModelBase implements IHandlesRender
{

	ResourceLocation tA = new ResourceLocation(Resources.MODID, "textures/models/lightsabers/starkiller_A.png");
	ResourceLocation tB = new ResourceLocation(Resources.MODID, "textures/models/lightsabers/starkiller_B.png");

	public ModelRenderer Shape1;

	public ModelRenderer Shape2;

	public ModelRenderer Shape3;

	public ModelRenderer Shape4;

	public ModelRenderer Shape5;
	public ModelRenderer Shape6;
	public ModelRenderer Shape7;
	public ModelRenderer Shape8;
	public ModelRenderer Shape9;
	public ModelRenderer Shape10;
	public ModelRenderer Shape11;
	public ModelRenderer Shape12;
	public ModelRenderer Shape13;
	public ModelRenderer Shape14;
	public ModelRenderer Shape15;
	public ModelRenderer Shape16;
	public ModelRenderer Shape17;
	public ModelRenderer Shape18;
	public ModelRenderer Shape19;
	public ModelRenderer Shape20;
	public ModelRenderer Shape21;
	public ModelRenderer Shape22;
	public ModelRenderer Shape23;
	public ModelRenderer Shape24;
	public ModelRenderer Shape25;
	public ModelRenderer Shape26;
	public ModelRenderer Shape28;
	public ModelRenderer Shape29;
	public ModelRenderer Shape30;
	public ModelRenderer Shape31;
	public ModelRenderer Shape33;
	public ModelRenderer Shape34;
	public ModelRenderer Shape35;
	public ModelRenderer Shape36;
	public ModelRenderer Shape32;
	public ModelRenderer Shape37;
	public ModelRenderer Shape38;
	public ModelRenderer Shape39;
	public ModelRenderer Shape40;
	public ModelRenderer Shape41;
	public ModelRenderer Shape42;
	public ModelRenderer Shape43;
	public ModelRenderer Shape44;
	public ModelRenderer Shape45;

	public ModelStarkillerHilt()
	{
		this.textureWidth = 512;
		this.textureHeight = 512;
		this.Shape24 = new ModelRenderer(this, 24, 94);
		this.Shape24.setRotationPoint(9.0F, 6.0F, 2.0F);
		this.Shape24.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.Shape28 = new ModelRenderer(this, 40, 68);
		this.Shape28.setRotationPoint(17.0F, 0.0F, -1.0F);
		this.Shape28.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
		this.Shape31 = new ModelRenderer(this, 26, 109);
		this.Shape31.setRotationPoint(19.0F, 4.5F, 1.5F);
		this.Shape31.addBox(0.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
		this.Shape8 = new ModelRenderer(this, 0, 138);
		this.Shape8.setRotationPoint(15.0F, -0.5F, -0.5F);
		this.Shape8.addBox(0.0F, 0.0F, 0.0F, 14, 3, 7, 0.0F);
		this.Shape44 = new ModelRenderer(this, 22, 87);
		this.Shape44.setRotationPoint(8.5F, 7.0F, 1.5F);
		this.Shape44.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
		this.Shape1 = new ModelRenderer(this, 0, 120);
		this.Shape1.setRotationPoint(4.0F, 0.0F, 0.0F);
		this.Shape1.addBox(0.0F, 0.0F, 0.0F, 11, 6, 6, 0.0F);
		this.Shape39 = new ModelRenderer(this, 65, 83);
		this.Shape39.setRotationPoint(14.0F, -2.0F, 3.5F);
		this.Shape39.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
		this.Shape37 = new ModelRenderer(this, 64, 89);
		this.Shape37.setRotationPoint(14.0F, -1.0F, 1.5F);
		this.Shape37.addBox(0.0F, 0.0F, 0.0F, 9, 1, 3, 0.0F);
		this.Shape41 = new ModelRenderer(this, 86, 11);
		this.Shape41.setRotationPoint(50.0F, -1.5F, 2.5F);
		this.Shape41.addBox(0.0F, 0.0F, 0.0F, 12, 9, 1, 0.0F);
		this.Shape16 = new ModelRenderer(this, 89, 71);
		this.Shape16.setRotationPoint(64.0F, -1.0F, -1.0F);
		this.Shape16.addBox(0.0F, 0.0F, 0.0F, 6, 8, 8, 0.0F);
		this.Shape42 = new ModelRenderer(this, 49, 5);
		this.Shape42.setRotationPoint(49.0F, 2.5F, -1.0F);
		this.Shape42.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
		this.Shape14 = new ModelRenderer(this, 51, 119);
		this.Shape14.setRotationPoint(36.0F, -0.5F, -0.5F);
		this.Shape14.addBox(0.0F, 0.0F, 0.0F, 12, 7, 7, 0.0F);
		this.Shape18 = new ModelRenderer(this, 85, 55);
		this.Shape18.setRotationPoint(37.0F, 2.5F, -1.5F);
		this.Shape18.addBox(0.0F, 0.0F, 0.0F, 12, 1, 9, 0.0F);
		this.Shape32 = new ModelRenderer(this, 65, 78);
		this.Shape32.setRotationPoint(14.0F, -2.0F, 1.5F);
		this.Shape32.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
		this.Shape3 = new ModelRenderer(this, 43, 33);
		this.Shape3.setRotationPoint(15.0F, 0.5F, 0.5F);
		this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 5, 5, 0.0F);
		this.Shape20 = new ModelRenderer(this, 0, 50);
		this.Shape20.setRotationPoint(-1.0F, 0.5F, -0.5F);
		this.Shape20.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
		this.Shape17 = new ModelRenderer(this, 86, 24);
		this.Shape17.setRotationPoint(37.0F, -1.5F, 2.5F);
		this.Shape17.addBox(0.0F, 0.0F, 0.0F, 12, 9, 1, 0.0F);
		this.Shape5 = new ModelRenderer(this, 43, 18);
		this.Shape5.setRotationPoint(18.0F, 0.5F, 0.5F);
		this.Shape5.addBox(0.0F, 0.0F, 0.0F, 2, 5, 5, 0.0F);
		this.Shape15 = new ModelRenderer(this, 51, 137);
		this.Shape15.setRotationPoint(51.0F, -0.5F, -0.5F);
		this.Shape15.addBox(0.0F, 0.0F, 0.0F, 12, 7, 7, 0.0F);
		this.Shape34 = new ModelRenderer(this, 0, 101);
		this.Shape34.setRotationPoint(11.0F, -0.5F, -0.5F);
		this.Shape34.addBox(0.0F, 0.0F, 0.0F, 3, 7, 7, 0.0F);
		this.Shape38 = new ModelRenderer(this, 66, 69);
		this.Shape38.setRotationPoint(23.0F, -2.0F, 1.5F);
		this.Shape38.addBox(0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F);
		this.Shape26 = new ModelRenderer(this, 24, 77);
		this.Shape26.setRotationPoint(4.0F, -4.5F, 4.0F);
		this.Shape26.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
		this.Shape13 = new ModelRenderer(this, 0, 170);
		this.Shape13.setRotationPoint(34.0F, 0.0F, 0.0F);
		this.Shape13.addBox(0.0F, 0.0F, 0.0F, 30, 6, 6, 0.0F);
		this.Shape7 = new ModelRenderer(this, 0, 14);
		this.Shape7.setRotationPoint(14.0F, -0.5F, -0.5F);
		this.Shape7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
		this.Shape22 = new ModelRenderer(this, 0, 34);
		this.Shape22.setRotationPoint(2.0F, 0.5F, -0.5F);
		this.Shape22.addBox(0.0F, -1.0F, 0.0F, 6, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape22, 0.0F, -0.0F, 0.471238911151886F);
		this.Shape12 = new ModelRenderer(this, 0, 153);
		this.Shape12.setRotationPoint(29.0F, 0.0F, 0.0F);
		this.Shape12.addBox(0.0F, 0.0F, 0.0F, 4, 6, 6, 0.0F);
		this.Shape23 = new ModelRenderer(this, 0, 26);
		this.Shape23.setRotationPoint(2.0F, 0.5F, 5.5F);
		this.Shape23.addBox(0.0F, -1.0F, 0.0F, 6, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape23, 0.0F, -0.0F, 0.471238911151886F);
		this.Shape36 = new ModelRenderer(this, 23, 32);
		this.Shape36.setRotationPoint(2.0F, 0.0F, 0.0F);
		this.Shape36.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape9 = new ModelRenderer(this, 62, 33);
		this.Shape9.setRotationPoint(24.0F, 0.5F, 0.5F);
		this.Shape9.addBox(0.0F, 0.0F, 0.0F, 2, 5, 5, 0.0F);
		this.Shape11 = new ModelRenderer(this, 64, 97);
		this.Shape11.setRotationPoint(28.0F, 0.5F, 0.5F);
		this.Shape11.addBox(0.0F, 0.0F, 0.0F, 6, 5, 5, 0.0F);
		this.Shape25 = new ModelRenderer(this, 24, 69);
		this.Shape25.setRotationPoint(4.0F, -4.5F, 1.0F);
		this.Shape25.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
		this.Shape29 = new ModelRenderer(this, 40, 81);
		this.Shape29.setRotationPoint(21.0F, 0.0F, -1.0F);
		this.Shape29.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
		this.Shape33 = new ModelRenderer(this, 0, 86);
		this.Shape33.setRotationPoint(9.0F, -0.5F, -0.5F);
		this.Shape33.addBox(0.0F, 0.0F, 0.0F, 2, 3, 7, 0.0F);
		this.Shape43 = new ModelRenderer(this, 85, 40);
		this.Shape43.setRotationPoint(50.0F, 2.5F, -1.5F);
		this.Shape43.addBox(0.0F, 0.0F, 0.0F, 12, 1, 9, 0.0F);
		this.Shape6 = new ModelRenderer(this, 62, 18);
		this.Shape6.setRotationPoint(21.0F, 0.5F, 0.5F);
		this.Shape6.addBox(0.0F, 0.0F, 0.0F, 2, 5, 5, 0.0F);
		this.Shape45 = new ModelRenderer(this, 0, 0);
		this.Shape45.setRotationPoint(8.0F, -2.5F, 1.5F);
		this.Shape45.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
		this.Shape2 = new ModelRenderer(this, 0, 69);
		this.Shape2.setRotationPoint(6.0F, -0.5F, -0.5F);
		this.Shape2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 7, 0.0F);
		this.Shape35 = new ModelRenderer(this, 24, 21);
		this.Shape35.setRotationPoint(3.0F, 1.0F, 1.0F);
		this.Shape35.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
		this.Shape10 = new ModelRenderer(this, 63, 49);
		this.Shape10.setRotationPoint(26.0F, 0.0F, 0.0F);
		this.Shape10.addBox(0.0F, 0.0F, 0.0F, 2, 6, 6, 0.0F);
		this.Shape40 = new ModelRenderer(this, 39, 5);
		this.Shape40.setRotationPoint(49.0F, -1.0F, 2.5F);
		this.Shape40.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
		this.Shape4 = new ModelRenderer(this, 0, 0);
		this.Shape4.setRotationPoint(17.0F, 1.0F, 1.0F);
		this.Shape4.addBox(0.0F, 0.0F, 0.0F, 7, 4, 4, 0.0F);
		this.Shape19 = new ModelRenderer(this, 0, 56);
		this.Shape19.setRotationPoint(-1.0F, -0.5F, -0.5F);
		this.Shape19.addBox(0.0F, 0.0F, 0.0F, 7, 1, 7, 0.0F);
		this.Shape30 = new ModelRenderer(this, 40, 95);
		this.Shape30.setRotationPoint(25.0F, 0.0F, 0.0F);
		this.Shape30.addBox(0.0F, 0.0F, -1.0F, 2, 2, 8, 0.0F);
		this.Shape21 = new ModelRenderer(this, 0, 43);
		this.Shape21.setRotationPoint(-1.0F, 0.5F, 5.5F);
		this.Shape21.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
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
		this.Shape24.render(f5);
		this.Shape28.render(f5);
		this.Shape31.render(f5);
		this.Shape8.render(f5);
		this.Shape44.render(f5);
		this.Shape1.render(f5);
		this.Shape39.render(f5);
		this.Shape37.render(f5);
		this.Shape41.render(f5);
		this.Shape16.render(f5);
		this.Shape42.render(f5);
		this.Shape14.render(f5);
		this.Shape18.render(f5);
		this.Shape32.render(f5);
		this.Shape3.render(f5);
		this.Shape20.render(f5);
		this.Shape17.render(f5);
		this.Shape5.render(f5);
		this.Shape15.render(f5);
		this.Shape34.render(f5);
		this.Shape38.render(f5);
		this.Shape26.render(f5);
		this.Shape13.render(f5);
		this.Shape7.render(f5);
		this.Shape22.render(f5);
		this.Shape12.render(f5);
		this.Shape23.render(f5);
		this.Shape36.render(f5);
		this.Shape9.render(f5);
		this.Shape11.render(f5);
		this.Shape25.render(f5);
		this.Shape29.render(f5);
		this.Shape33.render(f5);
		this.Shape43.render(f5);
		this.Shape6.render(f5);
		this.Shape45.render(f5);
		this.Shape2.render(f5);
		this.Shape35.render(f5);
		this.Shape10.render(f5);
		this.Shape40.render(f5);
		this.Shape4.render(f5);
		this.Shape19.render(f5);
		this.Shape30.render(f5);
		this.Shape21.render(f5);
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		switch (type)
		{
			case ENTITY:
				GL11.glPushMatrix();
				GL11.glScalef(0.025f, 0.025f, 0.025f);
				GL11.glRotatef(-90, 0, 0, 1);
				GL11.glRotatef(90, 1, 0, 0);
				GL11.glTranslatef(-38, -2, -2);
				this.render(null, 0, 0, 0, 0, 0, 0.625f);
				GL11.glPopMatrix();
				break;
			case EQUIPPED:
				GL11.glPushMatrix();
				GL11.glScalef(0.035f, 0.035f, 0.035f);
				GL11.glRotatef(180, 1, 0, 0);
				GL11.glRotatef(45, 0, 1, 0);
				GL11.glRotatef(20, 0, 0, 1);
				GL11.glRotatef(90, 1, 0, 0);
				GL11.glTranslatef(8, 1, 30);
				if (data[1] instanceof EntityPlayer)
				{
					EntityPlayer player = (EntityPlayer)data[1];
					if (player.isBlocking())
					{
						GL11.glRotatef(40, 0, 0, 1);
						GL11.glTranslatef(-8, -15, 0);
					}
				}
				GL11.glRotatef(-180, 1, 0, 0);
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
				GL11.glTranslatef(0, 18, 0);
				if (data[1] instanceof EntityPlayer)
				{
					EntityPlayer player = (EntityPlayer)data[1];
					if (player.isBlocking())
					{
						GL11.glRotatef(-20, 0, 0, 1);
						GL11.glRotatef(70, 0, 1, 0);
						GL11.glRotatef(30, 1, 0, 0);
						GL11.glTranslatef(-4, 12, 15);
					}
				}
				GL11.glRotatef(-90, 1, 0, 0);
				this.render(null, 0, 0, 0, 0, 0, 0.625f);
				GL11.glPopMatrix();
				break;
			case INVENTORY:
				GL11.glScalef(0.04f, 0.04f, 0.04f);
				GL11.glTranslatef(-23, 4, 0);
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
