package com.parzi.starwarsmod.rendering.models.vehicles;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelJakkuSpeeder extends ModelBase
{
	// fields
	ModelRenderer Main_Body;
	ModelRenderer Panel_1;
	ModelRenderer Panel_2;
	ModelRenderer Panel_3;
	ModelRenderer Panel_4;
	ModelRenderer Panel_5;
	ModelRenderer Turbine_Base_1;
	ModelRenderer Turbine_Base_2;
	ModelRenderer Turbine_1;
	ModelRenderer Turbine_2;
	ModelRenderer Panel_6;
	ModelRenderer Skid_Plate;
	ModelRenderer Turbine_Connector;
	ModelRenderer Turbine_Connector_2;
	ModelRenderer Windshield;
	ModelRenderer Turbine_Panel_1;
	ModelRenderer Turbine_Panel_2;
	ModelRenderer Turbine_Connector_3;
	ModelRenderer Seat;
	ModelRenderer Foot_Hold;

	public ModelJakkuSpeeder()
	{
		textureWidth = 256;
		textureHeight = 256;

		Main_Body = new ModelRenderer(this, 0, 0);
		Main_Body.addBox(-2F, -10F, -22F, 4, 10, 18);
		Main_Body.setRotationPoint(0F, 20F, 0F);
		Main_Body.setTextureSize(256, 256);
		Main_Body.mirror = true;
		setRotation(Main_Body, 0F, 0F, 0F);
		Panel_1 = new ModelRenderer(this, 0, 31);
		Panel_1.addBox(-3F, -11F, -22F, 6, 3, 18);
		Panel_1.setRotationPoint(0F, 20F, 0F);
		Panel_1.setTextureSize(256, 256);
		Panel_1.mirror = true;
		setRotation(Panel_1, 0F, 0F, 0F);
		Panel_2 = new ModelRenderer(this, 0, 56);
		Panel_2.addBox(-3F, -2F, -22F, 6, 3, 18);
		Panel_2.setRotationPoint(0F, 20F, 0F);
		Panel_2.setTextureSize(256, 256);
		Panel_2.mirror = true;
		setRotation(Panel_2, 0F, 0F, 0F);
		Panel_3 = new ModelRenderer(this, 0, 80);
		Panel_3.addBox(-3F, -11F, -22F, 6, 12, 3);
		Panel_3.setRotationPoint(0F, 20F, 0F);
		Panel_3.setTextureSize(256, 256);
		Panel_3.mirror = true;
		setRotation(Panel_3, 0F, 0F, 0F);
		Panel_4 = new ModelRenderer(this, 21, 80);
		Panel_4.addBox(-2.5F, -10.5F, -22.5F, 5, 11, 3);
		Panel_4.setRotationPoint(0F, 20F, 0F);
		Panel_4.setTextureSize(256, 256);
		Panel_4.mirror = true;
		setRotation(Panel_4, 0F, 0F, 0F);
		Panel_5 = new ModelRenderer(this, 0, 98);
		Panel_5.addBox(-2.5F, -11.5F, -21.5F, 5, 3, 17);
		Panel_5.setRotationPoint(0F, 20F, 0F);
		Panel_5.setTextureSize(256, 256);
		Panel_5.mirror = true;
		setRotation(Panel_5, 0F, 0F, 0F);
		Turbine_Base_1 = new ModelRenderer(this, 0, 122);
		Turbine_Base_1.addBox(-1F, -7F, -5F, 2, 2, 14);
		Turbine_Base_1.setRotationPoint(0F, 20F, 0F);
		Turbine_Base_1.setTextureSize(256, 256);
		Turbine_Base_1.mirror = true;
		setRotation(Turbine_Base_1, 0F, 0F, 0F);
		Turbine_Base_2 = new ModelRenderer(this, 0, 142);
		Turbine_Base_2.addBox(-1F, -3F, -5F, 2, 2, 14);
		Turbine_Base_2.setRotationPoint(0F, 20F, 0F);
		Turbine_Base_2.setTextureSize(256, 256);
		Turbine_Base_2.mirror = true;
		setRotation(Turbine_Base_2, 0F, 0F, 0F);
		Turbine_1 = new ModelRenderer(this, 0, 161);
		Turbine_1.addBox(-1.5F, -7.5F, 2F, 3, 3, 6);
		Turbine_1.setRotationPoint(0F, 20F, 0F);
		Turbine_1.setTextureSize(256, 256);
		Turbine_1.mirror = true;
		setRotation(Turbine_1, 0F, 0F, 0F);
		Turbine_2 = new ModelRenderer(this, 21, 161);
		Turbine_2.addBox(-1.5F, -3.5F, 2F, 3, 3, 6);
		Turbine_2.setRotationPoint(0F, 20F, 0F);
		Turbine_2.setTextureSize(256, 256);
		Turbine_2.mirror = true;
		setRotation(Turbine_2, 0F, 0F, 0F);
		Panel_6 = new ModelRenderer(this, 0, 174);
		Panel_6.addBox(-1.5F, -7.5F, -5F, 3, 7, 2);
		Panel_6.setRotationPoint(0F, 20F, 0F);
		Panel_6.setTextureSize(256, 256);
		Panel_6.mirror = true;
		setRotation(Panel_6, 0F, 0F, 0F);
		Skid_Plate = new ModelRenderer(this, 14, 174);
		Skid_Plate.addBox(-1.5F, 0F, -11F, 3, 2, 6);
		Skid_Plate.setRotationPoint(0F, 20F, 0F);
		Skid_Plate.setTextureSize(256, 256);
		Skid_Plate.mirror = true;
		setRotation(Skid_Plate, 0F, 0F, 0F);
		Turbine_Connector = new ModelRenderer(this, 0, 187);
		Turbine_Connector.addBox(-1F, -5F, 3F, 2, 2, 4);
		Turbine_Connector.setRotationPoint(0F, 20F, 0F);
		Turbine_Connector.setTextureSize(256, 256);
		Turbine_Connector.mirror = true;
		setRotation(Turbine_Connector, 0F, 0F, 0F);
		Turbine_Connector_2 = new ModelRenderer(this, 16, 187);
		Turbine_Connector_2.addBox(-3.5F, -7F, 4F, 7, 2, 2);
		Turbine_Connector_2.setRotationPoint(0F, 20F, 0F);
		Turbine_Connector_2.setTextureSize(256, 256);
		Turbine_Connector_2.mirror = true;
		setRotation(Turbine_Connector_2, 0F, 0F, 0F);
		Windshield = new ModelRenderer(this, 0, 196);
		Windshield.addBox(-2F, -12F, -6F, 4, 3, 3);
		Windshield.setRotationPoint(0F, 20F, 0F);
		Windshield.setTextureSize(256, 256);
		Windshield.mirror = true;
		setRotation(Windshield, 0F, 0F, 0F);
		Turbine_Panel_1 = new ModelRenderer(this, 0, 206);
		Turbine_Panel_1.addBox(3F, -8.5F, 3F, 1, 9, 4);
		Turbine_Panel_1.setRotationPoint(0F, 20F, 0F);
		Turbine_Panel_1.setTextureSize(256, 256);
		Turbine_Panel_1.mirror = true;
		setRotation(Turbine_Panel_1, 0F, 0F, 0F);
		Turbine_Panel_2 = new ModelRenderer(this, 13, 206);
		Turbine_Panel_2.addBox(-4F, -8.5F, 3F, 1, 9, 4);
		Turbine_Panel_2.setRotationPoint(0F, 20F, 0F);
		Turbine_Panel_2.setTextureSize(256, 256);
		Turbine_Panel_2.mirror = true;
		setRotation(Turbine_Panel_2, 0F, 0F, 0F);
		Turbine_Connector_3 = new ModelRenderer(this, 38, 187);
		Turbine_Connector_3.addBox(-3.5F, -3F, 4F, 7, 2, 2);
		Turbine_Connector_3.setRotationPoint(0F, 20F, 0F);
		Turbine_Connector_3.setTextureSize(256, 256);
		Turbine_Connector_3.mirror = true;
		setRotation(Turbine_Connector_3, 0F, 0F, 0F);
		Seat = new ModelRenderer(this, 0, 223);
		Seat.addBox(-1.5F, -8F, -1F, 3, 2, 5);
		Seat.setRotationPoint(0F, 20F, 0F);
		Seat.setTextureSize(256, 256);
		Seat.mirror = true;
		setRotation(Seat, 0F, 0F, 0F);
		Foot_Hold = new ModelRenderer(this, 0, 234);
		Foot_Hold.addBox(-2.5F, -2.5F, -0.5F, 5, 1, 1);
		Foot_Hold.setRotationPoint(0F, 20F, 0F);
		Foot_Hold.setTextureSize(256, 256);
		Foot_Hold.mirror = true;
		setRotation(Foot_Hold, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Main_Body.render(f5);
		Panel_1.render(f5);
		Panel_2.render(f5);
		Panel_3.render(f5);
		Panel_4.render(f5);
		Panel_5.render(f5);
		Turbine_Base_1.render(f5);
		Turbine_Base_2.render(f5);
		Turbine_1.render(f5);
		Turbine_2.render(f5);
		Panel_6.render(f5);
		Skid_Plate.render(f5);
		Turbine_Connector.render(f5);
		Turbine_Connector_2.render(f5);
		Windshield.render(f5);
		Turbine_Panel_1.render(f5);
		Turbine_Panel_2.render(f5);
		Turbine_Connector_3.render(f5);
		Seat.render(f5);
		Foot_Hold.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}