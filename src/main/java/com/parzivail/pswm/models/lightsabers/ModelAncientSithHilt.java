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
 * Ancient Sith Hilt - Undefined Created using Tabula 4.1.1
 */
public class ModelAncientSithHilt extends ModelBase implements IHandlesRender
{

	ResourceLocation tA = new ResourceLocation(Resources.MODID, "textures/models/lightsabers/sith_A.png");
	ResourceLocation tB = new ResourceLocation(Resources.MODID, "textures/models/lightsabers/sith_B.png");

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
	public ModelRenderer Shape27;
	public ModelRenderer Shape28;
	public ModelRenderer Shape29;
	public ModelRenderer Shape30;
	public ModelRenderer Shape31;
	public ModelRenderer Shape32;
	public ModelRenderer Shape33;
	public ModelRenderer Shape34;
	public ModelRenderer Shape35;
	public ModelRenderer Shape36;
	public ModelRenderer Shape37;
	public ModelRenderer Shape38;
	public ModelRenderer Shape41;
	public ModelRenderer Shape42;
	public ModelRenderer Shape39;
	public ModelRenderer Shape40;
	public ModelRenderer Shape43;
	public ModelRenderer Shape44;
	public ModelRenderer Shape45;
	public ModelRenderer Shape46;
	public ModelRenderer Shape47;
	public ModelRenderer Shape48;
	public ModelRenderer Shape49;
	public ModelRenderer Shape50;
	public ModelRenderer Shape51;
	public ModelRenderer Shape52;
	public ModelRenderer Shape53;
	public ModelRenderer Shape54;
	public ModelRenderer Shape55;

	public ModelAncientSithHilt()
	{
		this.textureWidth = 512;
		this.textureHeight = 512;
		this.Shape28 = new ModelRenderer(this, 70, 37);
		this.Shape28.setRotationPoint(-18.0F, -1.0F, -1.0F);
		this.Shape28.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape33 = new ModelRenderer(this, 110, 70);
		this.Shape33.setRotationPoint(34.0F, -1.0F, -1.0F);
		this.Shape33.addBox(0.0F, 0.0F, 0.0F, 3, 6, 6, 0.0F);
		this.Shape32 = new ModelRenderer(this, 70, 0);
		this.Shape32.setRotationPoint(32.0F, -1.0F, -1.0F);
		this.Shape32.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape16 = new ModelRenderer(this, 0, 11);
		this.Shape16.setRotationPoint(-4.0F, 0.5F, 0.5F);
		this.Shape16.addBox(0.0F, 0.0F, 0.0F, 8, 3, 3, 0.0F);
		this.Shape42 = new ModelRenderer(this, 27, 22);
		this.Shape42.setRotationPoint(37.0F, 0.0F, 0.0F);
		this.Shape42.addBox(0.0F, 0.0F, 0.0F, 2, 4, 4, 0.0F);
		this.Shape46 = new ModelRenderer(this, 113, 90);
		this.Shape46.setRotationPoint(-43.0F, -5.0F, 1.0F);
		this.Shape46.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
		this.Shape43 = new ModelRenderer(this, 42, 105);
		this.Shape43.setRotationPoint(35.0F, 1.5F, 8.0F);
		this.Shape43.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
		this.Shape20 = new ModelRenderer(this, 90, 72);
		this.Shape20.setRotationPoint(11.5F, -1.0F, -1.0F);
		this.Shape20.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape48 = new ModelRenderer(this, 23, 110);
		this.Shape48.setRotationPoint(-43.0F, -5.0F, 1.0F);
		this.Shape48.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.setRotateAngle(this.Shape48, 0.0F, -0.0F, -0.5410520434379578F);
		this.Shape13 = new ModelRenderer(this, 46, 70);
		this.Shape13.setRotationPoint(30.0F, -0.5F, -0.5F);
		this.Shape13.addBox(0.0F, 0.0F, 0.0F, 4, 5, 5, 0.0F);
		this.Shape11 = new ModelRenderer(this, 0, 90);
		this.Shape11.setRotationPoint(6.0F, -0.5F, -0.5F);
		this.Shape11.addBox(0.0F, 0.0F, 0.0F, 15, 5, 5, 0.0F);
		this.Shape36 = new ModelRenderer(this, 42, 111);
		this.Shape36.setRotationPoint(35.0F, -5.0F, 1.0F);
		this.Shape36.addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
		this.Shape51 = new ModelRenderer(this, 0, 2);
		this.Shape51.setRotationPoint(-43.0F, 1.5F, 9.0F);
		this.Shape51.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape51, 0.0F, -0.5410520434379578F, 0.0F);
		this.Shape10 = new ModelRenderer(this, 55, 3);
		this.Shape10.setRotationPoint(-1.0F, 5.0F, 1.5F);
		this.Shape10.addBox(-4.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(this.Shape10, 0.0F, -0.0F, 0.27925267815589905F);
		this.Shape41 = new ModelRenderer(this, 42, 118);
		this.Shape41.setRotationPoint(35.0F, 2.5F, -5.0F);
		this.Shape41.addBox(0.0F, -1.0F, 0.0F, 8, 2, 1, 0.0F);
		this.Shape4 = new ModelRenderer(this, 28, 13);
		this.Shape4.setRotationPoint(-1.0F, -1.0F, 1.5F);
		this.Shape4.addBox(-4.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(this.Shape4, 0.0F, -0.0F, -0.27925267815589905F);
		this.Shape37 = new ModelRenderer(this, 0, 106);
		this.Shape37.setRotationPoint(35.0F, -5.0F, 1.0F);
		this.Shape37.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(this.Shape37, 0.0F, -0.0F, 0.5061454772949219F);
		this.Shape22 = new ModelRenderer(this, 90, 108);
		this.Shape22.setRotationPoint(14.5F, -1.0F, -1.0F);
		this.Shape22.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape7 = new ModelRenderer(this, 41, 8);
		this.Shape7.setRotationPoint(1.0F, 1.5F, 5.0F);
		this.Shape7.addBox(0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(this.Shape7, 0.0F, 0.27925267815589905F, 0.0F);
		this.Shape40 = new ModelRenderer(this, 13, 104);
		this.Shape40.setRotationPoint(43.0F, 1.5F, -5.0F);
		this.Shape40.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape40, 0.0F, -0.5410520434379578F, 0.0F);
		this.Shape50 = new ModelRenderer(this, 121, 111);
		this.Shape50.setRotationPoint(-35.0F, 1.5F, 9.0F);
		this.Shape50.addBox(-2.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F);
		this.setRotateAngle(this.Shape50, 0.0F, -0.5061454772949219F, 0.0F);
		this.Shape24 = new ModelRenderer(this, 110, 37);
		this.Shape24.setRotationPoint(19.0F, -1.0F, -1.0F);
		this.Shape24.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape34 = new ModelRenderer(this, 90, 0);
		this.Shape34.setRotationPoint(-33.0F, -1.0F, -1.0F);
		this.Shape34.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape49 = new ModelRenderer(this, 114, 104);
		this.Shape49.setRotationPoint(-43.0F, 1.5F, 8.0F);
		this.Shape49.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
		this.Shape30 = new ModelRenderer(this, 70, 72);
		this.Shape30.setRotationPoint(-14.0F, -1.0F, -1.0F);
		this.Shape30.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape23 = new ModelRenderer(this, 110, 20);
		this.Shape23.setRotationPoint(17.0F, -1.0F, -1.0F);
		this.Shape23.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape55 = new ModelRenderer(this, 43, 22);
		this.Shape55.setRotationPoint(-39.0F, 0.0F, 0.0F);
		this.Shape55.addBox(0.0F, 0.0F, 0.0F, 2, 4, 4, 0.0F);
		this.Shape19 = new ModelRenderer(this, 90, 54);
		this.Shape19.setRotationPoint(9.0F, -1.0F, -1.0F);
		this.Shape19.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape25 = new ModelRenderer(this, 90, 20);
		this.Shape25.setRotationPoint(-8.0F, -1.0F, -1.0F);
		this.Shape25.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape39 = new ModelRenderer(this, 0, 117);
		this.Shape39.setRotationPoint(35.0F, 1.5F, -5.0F);
		this.Shape39.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
		this.setRotateAngle(this.Shape39, 0.0F, -0.5061454772949219F, 0.0F);
		this.Shape2 = new ModelRenderer(this, 111, 1);
		this.Shape2.setRotationPoint(-1.0F, -1.0F, -1.0F);
		this.Shape2.addBox(0.0F, 0.0F, 0.0F, 2, 6, 6, 0.0F);
		this.Shape5 = new ModelRenderer(this, 28, 3);
		this.Shape5.setRotationPoint(1.0F, 1.5F, -1.0F);
		this.Shape5.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(this.Shape5, 0.0F, -0.27925267815589905F, 0.0F);
		this.Shape44 = new ModelRenderer(this, 18, 117);
		this.Shape44.setRotationPoint(35.0F, 1.5F, 9.0F);
		this.Shape44.addBox(0.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F);
		this.setRotateAngle(this.Shape44, 0.0F, 0.5061454772949219F, 0.0F);
		this.Shape45 = new ModelRenderer(this, 13, 111);
		this.Shape45.setRotationPoint(43.0F, 1.5F, 9.0F);
		this.Shape45.addBox(0.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape45, 0.0F, 0.5410520434379578F, 0.0F);
		this.Shape52 = new ModelRenderer(this, 114, 97);
		this.Shape52.setRotationPoint(-43.0F, 1.5F, -5.0F);
		this.Shape52.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
		this.Shape6 = new ModelRenderer(this, 28, 8);
		this.Shape6.setRotationPoint(-1.0F, 1.5F, -1.0F);
		this.Shape6.addBox(-4.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(this.Shape6, 0.0F, 0.27925267815589905F, 0.0F);
		this.Shape26 = new ModelRenderer(this, 70, 108);
		this.Shape26.setRotationPoint(-10.0F, -1.0F, -1.0F);
		this.Shape26.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape8 = new ModelRenderer(this, 41, 13);
		this.Shape8.setRotationPoint(-1.0F, 1.5F, 5.0F);
		this.Shape8.addBox(-4.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(this.Shape8, 0.0F, -0.27925267815589905F, 0.0F);
		this.Shape27 = new ModelRenderer(this, 70, 20);
		this.Shape27.setRotationPoint(-20.0F, -1.0F, -1.0F);
		this.Shape27.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape31 = new ModelRenderer(this, 70, 90);
		this.Shape31.setRotationPoint(-12.5F, -1.0F, -1.0F);
		this.Shape31.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape35 = new ModelRenderer(this, 110, 53);
		this.Shape35.setRotationPoint(-37.0F, -1.0F, -1.0F);
		this.Shape35.addBox(0.0F, 0.0F, 0.0F, 3, 6, 6, 0.0F);
		this.Shape14 = new ModelRenderer(this, 46, 84);
		this.Shape14.setRotationPoint(-34.0F, -0.5F, -0.5F);
		this.Shape14.addBox(0.0F, 0.0F, 0.0F, 4, 5, 5, 0.0F);
		this.Shape12 = new ModelRenderer(this, 0, 71);
		this.Shape12.setRotationPoint(-6.0F, -0.5F, -0.5F);
		this.Shape12.addBox(-15.0F, 0.0F, 0.0F, 15, 5, 5, 0.0F);
		this.Shape18 = new ModelRenderer(this, 90, 37);
		this.Shape18.setRotationPoint(7.0F, -1.0F, -1.0F);
		this.Shape18.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape47 = new ModelRenderer(this, 108, 111);
		this.Shape47.setRotationPoint(-35.0F, -5.0F, 1.0F);
		this.Shape47.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(this.Shape47, 0.0F, -0.0F, -0.5061454772949219F);
		this.Shape3 = new ModelRenderer(this, 41, 3);
		this.Shape3.setRotationPoint(1.0F, -1.0F, 1.5F);
		this.Shape3.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(this.Shape3, 0.0F, -0.0F, 0.27925267815589905F);
		this.Shape17 = new ModelRenderer(this, 0, 37);
		this.Shape17.setRotationPoint(4.0F, 0.0F, 0.0F);
		this.Shape17.addBox(0.0F, 0.0F, 0.0F, 26, 4, 4, 0.0F);
		this.Shape15 = new ModelRenderer(this, 0, 22);
		this.Shape15.setRotationPoint(-3.0F, 0.0F, 0.0F);
		this.Shape15.addBox(0.0F, 0.0F, 0.0F, 6, 4, 4, 0.0F);
		this.Shape53 = new ModelRenderer(this, 139, 111);
		this.Shape53.setRotationPoint(-35.0F, 1.5F, -5.0F);
		this.Shape53.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
		this.setRotateAngle(this.Shape53, 0.0F, 0.5061454772949219F, 0.0F);
		this.Shape9 = new ModelRenderer(this, 55, 8);
		this.Shape9.setRotationPoint(1.0F, 5.0F, 1.5F);
		this.Shape9.addBox(0.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(this.Shape9, 0.0F, -0.0F, -0.27925267815589905F);
		this.Shape21 = new ModelRenderer(this, 90, 90);
		this.Shape21.setRotationPoint(13.0F, -1.0F, -1.0F);
		this.Shape21.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape54 = new ModelRenderer(this, 9, 2);
		this.Shape54.setRotationPoint(-43.0F, 1.5F, -5.0F);
		this.Shape54.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(this.Shape54, 0.0F, 0.5410520434379578F, 0.0F);
		this.Shape38 = new ModelRenderer(this, 22, 104);
		this.Shape38.setRotationPoint(43.0F, -5.0F, 1.0F);
		this.Shape38.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
		this.setRotateAngle(this.Shape38, 0.0F, -0.0F, 0.5410520434379578F);
		this.Shape29 = new ModelRenderer(this, 70, 54);
		this.Shape29.setRotationPoint(-15.5F, -1.0F, -1.0F);
		this.Shape29.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
		this.Shape1 = new ModelRenderer(this, 0, 54);
		this.Shape1.setRotationPoint(-4.0F, 0.0F, 0.0F);
		this.Shape1.addBox(-26.0F, 0.0F, 0.0F, 26, 4, 4, 0.0F);
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
		this.Shape28.render(f5);
		this.Shape33.render(f5);
		this.Shape32.render(f5);
		this.Shape16.render(f5);
		this.Shape42.render(f5);
		this.Shape46.render(f5);
		this.Shape43.render(f5);
		this.Shape20.render(f5);
		this.Shape48.render(f5);
		this.Shape13.render(f5);
		this.Shape11.render(f5);
		this.Shape36.render(f5);
		this.Shape51.render(f5);
		this.Shape10.render(f5);
		this.Shape41.render(f5);
		this.Shape4.render(f5);
		this.Shape37.render(f5);
		this.Shape22.render(f5);
		this.Shape7.render(f5);
		this.Shape40.render(f5);
		this.Shape50.render(f5);
		this.Shape24.render(f5);
		this.Shape34.render(f5);
		this.Shape49.render(f5);
		this.Shape30.render(f5);
		this.Shape23.render(f5);
		this.Shape55.render(f5);
		this.Shape19.render(f5);
		this.Shape25.render(f5);
		this.Shape39.render(f5);
		this.Shape2.render(f5);
		this.Shape5.render(f5);
		this.Shape44.render(f5);
		this.Shape45.render(f5);
		this.Shape52.render(f5);
		this.Shape6.render(f5);
		this.Shape26.render(f5);
		this.Shape8.render(f5);
		this.Shape27.render(f5);
		this.Shape31.render(f5);
		this.Shape35.render(f5);
		this.Shape14.render(f5);
		this.Shape12.render(f5);
		this.Shape18.render(f5);
		this.Shape47.render(f5);
		this.Shape3.render(f5);
		this.Shape17.render(f5);
		this.Shape15.render(f5);
		this.Shape53.render(f5);
		this.Shape9.render(f5);
		this.Shape21.render(f5);
		this.Shape54.render(f5);
		this.Shape38.render(f5);
		this.Shape29.render(f5);
		this.Shape1.render(f5);
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
				GL11.glTranslatef(22, -1.5f, 20);
				if (data[1] instanceof EntityPlayer)
				{
					EntityPlayer player = (EntityPlayer)data[1];
					if (player.isBlocking())
					{
						GL11.glRotatef(80, 0, 0, 1);
						GL11.glTranslatef(0, -2, 0);
					}
				}
				GL11.glRotatef(-90, 1, 0, 0);
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
						GL11.glTranslatef(10, -4, -5);
					}
				}
				GL11.glRotatef(-90, 1, 0, 0);
				this.render(null, 0, 0, 0, 0, 0, 0.625f);
				GL11.glPopMatrix();
				break;
			case INVENTORY:
				GL11.glScalef(0.035f, 0.035f, 0.035f);
				GL11.glTranslatef(-2, -3, -1);
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
