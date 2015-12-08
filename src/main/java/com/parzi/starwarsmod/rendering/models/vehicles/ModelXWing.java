package com.parzi.starwarsmod.rendering.models.vehicles;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelXWing extends ModelBase
{
	// fields
	public ModelRenderer Boby_Bottom;
	public ModelRenderer Body_Top;
	public ModelRenderer Main_Body;
	public ModelRenderer Nose_Cone_Lower;
	public ModelRenderer Nose_Cone_Upper;
	public ModelRenderer Body_Fill;
	public ModelRenderer Booster_L_Top;
	public ModelRenderer Booster_L_Bottom;
	public ModelRenderer Booster_R_Top;
	public ModelRenderer Booster_R_Bottom;
	public ModelRenderer Wing_L_Top;
	public ModelRenderer Wing_L_Bottom;
	public ModelRenderer Wing_R_Top;
	public ModelRenderer Wing_R_Bottom;
	public ModelRenderer Wing_Extra_L_Top;
	public ModelRenderer Wing_Extra_L_Bottom;
	public ModelRenderer Wing_Extra_R_Top;
	public ModelRenderer Wing_Extra_R_Bottom;
	public ModelRenderer Body_Wing_Filler_L;
	public ModelRenderer Body_Wing_Filler_R;
	public ModelRenderer Engine_L_Top;
	public ModelRenderer Engine_L_Bottom;
	public ModelRenderer Engine_R_Top;
	public ModelRenderer Engine_R_Bottom;
	public ModelRenderer Cockpit_1;
	public ModelRenderer Cockpit_2;
	public ModelRenderer Main_Body_Extra_Top;
	public ModelRenderer Laser_Base_L_Top;
	public ModelRenderer Laser_Base_2_L_Top;
	public ModelRenderer Laser_L_Top;
	public ModelRenderer Laser_Prong_1_L_Top;
	public ModelRenderer Laser_Prong_2_L_Top;
	public ModelRenderer Laser_Prong_3_L_Top;
	public ModelRenderer Main_Body_Extra_Bottom;
	public ModelRenderer Laser_Base_R_Bottom;
	public ModelRenderer Laser_Base_2_R_Bottom;
	public ModelRenderer Laser_R_Bottom;
	public ModelRenderer Laser_Prong_1_R_Bottom;
	public ModelRenderer Laser_Prong_2_R_Bottom;
	public ModelRenderer Laser_Prong_3_R_Bottom;
	public ModelRenderer Laser_Base_L_Bottom;
	public ModelRenderer Laser_Base_2_L_Bottom;
	public ModelRenderer Laser_L_Bottom;
	public ModelRenderer Laser_Prong_1_L_Bottom;
	public ModelRenderer Laser_Prong_2_L_Bottom;
	public ModelRenderer Laser_Prong_3_L_Bottom;
	public ModelRenderer Laser_Base_R_Top;
	public ModelRenderer Laser_Base_2_R_Top;
	public ModelRenderer Laser_R_Top;
	public ModelRenderer Laser_Prong_1_R_Top;
	public ModelRenderer Laser_Prong_2_R_Top;
	public ModelRenderer Laser_Prong_3_R_Top;
	public ModelRenderer Landing_Gear_1;
	public ModelRenderer Landing_Gear_2;
	public ModelRenderer Landing_Gear_3;
	public ModelRenderer Landing_Gear_4;
	public ModelRenderer Landing_Gear_5;
	public ModelRenderer Landing_Gear_6;

	public ModelXWing()
	{
		this.textureWidth = 512;
		this.textureHeight = 512;

		this.Boby_Bottom = new ModelRenderer(this, 0, 0);
		this.Boby_Bottom.addBox(-3F, -7F, -36F, 6, 3, 40);
		this.Boby_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Boby_Bottom.setTextureSize(64, 32);
		this.Boby_Bottom.mirror = true;
		this.setRotation(this.Boby_Bottom, 0F, 0F, 0F);
		this.Body_Top = new ModelRenderer(this, 0, 51);
		this.Body_Top.addBox(-3F, -11.65F, -34.8F, 6, 3, 40);
		this.Body_Top.setRotationPoint(0F, 18F, 0F);
		this.Body_Top.setTextureSize(64, 32);
		this.Body_Top.mirror = true;
		this.setRotation(this.Body_Top, 0.0872665F, 0F, 0F);
		this.Main_Body = new ModelRenderer(this, 0, 103);
		this.Main_Body.addBox(-3F, -11F, 4F, 6, 7, 28);
		this.Main_Body.setRotationPoint(0F, 18F, 0F);
		this.Main_Body.setTextureSize(64, 32);
		this.Main_Body.mirror = true;
		this.setRotation(this.Main_Body, 0F, 0F, 0F);
		this.Nose_Cone_Lower = new ModelRenderer(this, 0, 144);
		this.Nose_Cone_Lower.addBox(-3.5F, -6.5F, -36.5F, 7, 3, 10);
		this.Nose_Cone_Lower.setRotationPoint(0F, 18F, 0F);
		this.Nose_Cone_Lower.setTextureSize(64, 32);
		this.Nose_Cone_Lower.mirror = true;
		this.setRotation(this.Nose_Cone_Lower, 0F, 0F, 0F);
		this.Nose_Cone_Upper = new ModelRenderer(this, 0, 163);
		this.Nose_Cone_Upper.addBox(-3.5F, -10.5F, -36.3F, 7, 3, 8);
		this.Nose_Cone_Upper.setRotationPoint(0F, 18F, 0F);
		this.Nose_Cone_Upper.setTextureSize(64, 32);
		this.Nose_Cone_Upper.mirror = true;
		this.setRotation(this.Nose_Cone_Upper, 0.0349066F, 0F, 0F);
		this.Body_Fill = new ModelRenderer(this, 38, 167);
		this.Body_Fill.addBox(-3F, -9.5F, -20F, 6, 3, 25);
		this.Body_Fill.setRotationPoint(0F, 18F, 0F);
		this.Body_Fill.setTextureSize(64, 32);
		this.Body_Fill.mirror = true;
		this.setRotation(this.Body_Fill, 0F, 0F, 0F);
		this.Booster_L_Top = new ModelRenderer(this, 0, 201);
		this.Booster_L_Top.addBox(3F, -13.25F, 11F, 4, 4, 15);
		this.Booster_L_Top.setRotationPoint(0F, 18F, 0F);
		this.Booster_L_Top.setTextureSize(64, 32);
		this.Booster_L_Top.mirror = true;
		this.setRotation(this.Booster_L_Top, 0F, 0F, 0F);
		this.Booster_L_Bottom = new ModelRenderer(this, 42, 201);
		this.Booster_L_Bottom.addBox(3F, -5.5F, 11F, 4, 4, 15);
		this.Booster_L_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Booster_L_Bottom.setTextureSize(64, 32);
		this.Booster_L_Bottom.mirror = true;
		this.setRotation(this.Booster_L_Bottom, 0F, 0F, 0F);
		this.Booster_R_Top = new ModelRenderer(this, 84, 201);
		this.Booster_R_Top.addBox(-7F, -13.3F, 11F, 4, 4, 15);
		this.Booster_R_Top.setRotationPoint(0F, 18F, 0F);
		this.Booster_R_Top.setTextureSize(64, 32);
		this.Booster_R_Top.mirror = true;
		this.setRotation(this.Booster_R_Top, 0F, 0F, 0F);
		this.Booster_R_Bottom = new ModelRenderer(this, 126, 201);
		this.Booster_R_Bottom.addBox(-7F, -5.5F, 11F, 4, 4, 15);
		this.Booster_R_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Booster_R_Bottom.setTextureSize(64, 32);
		this.Booster_R_Bottom.mirror = true;
		this.setRotation(this.Booster_R_Bottom, 0F, 0F, 0F);
		this.Wing_L_Top = new ModelRenderer(this, 0, 225);
		this.Wing_L_Top.addBox(4F, -8.5F, 12F, 26, 1, 13);
		this.Wing_L_Top.setRotationPoint(0F, 18F, 0F);
		this.Wing_L_Top.setTextureSize(64, 32);
		this.Wing_L_Top.mirror = true;
		this.setRotation(this.Wing_L_Top, 0F, 0F, -0.3141593F);
		this.Wing_L_Bottom = new ModelRenderer(this, 82, 225);
		this.Wing_L_Bottom.addBox(-1F, -6.5F, 12F, 26, 1, 13);
		this.Wing_L_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Wing_L_Bottom.setTextureSize(64, 32);
		this.Wing_L_Bottom.mirror = true;
		this.setRotation(this.Wing_L_Bottom, 0F, 0F, 0.3141593F);
		this.Wing_R_Top = new ModelRenderer(this, 165, 225);
		this.Wing_R_Top.addBox(-30F, -8.5F, 12F, 26, 1, 13);
		this.Wing_R_Top.setRotationPoint(0F, 18F, 0F);
		this.Wing_R_Top.setTextureSize(64, 32);
		this.Wing_R_Top.mirror = true;
		this.setRotation(this.Wing_R_Top, 0F, 0F, 0.3141593F);
		this.Wing_R_Bottom = new ModelRenderer(this, 247, 225);
		this.Wing_R_Bottom.addBox(-25F, -6.5F, 12F, 26, 1, 13);
		this.Wing_R_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Wing_R_Bottom.setTextureSize(64, 32);
		this.Wing_R_Bottom.mirror = true;
		this.setRotation(this.Wing_R_Bottom, 0F, 0F, -0.3141593F);
		this.Wing_Extra_L_Top = new ModelRenderer(this, 0, 244);
		this.Wing_Extra_L_Top.addBox(8F, -9.5F, 13.5F, 10, 1, 10);
		this.Wing_Extra_L_Top.setRotationPoint(0F, 18F, 0F);
		this.Wing_Extra_L_Top.setTextureSize(64, 32);
		this.Wing_Extra_L_Top.mirror = true;
		this.setRotation(this.Wing_Extra_L_Top, 0F, 0F, -0.3141593F);
		this.Wing_Extra_L_Bottom = new ModelRenderer(this, 44, 244);
		this.Wing_Extra_L_Bottom.addBox(3F, -5.5F, 13.5F, 10, 1, 10);
		this.Wing_Extra_L_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Wing_Extra_L_Bottom.setTextureSize(64, 32);
		this.Wing_Extra_L_Bottom.mirror = true;
		this.setRotation(this.Wing_Extra_L_Bottom, 0F, 0F, 0.3141593F);
		this.Wing_Extra_R_Top = new ModelRenderer(this, 89, 244);
		this.Wing_Extra_R_Top.addBox(-18F, -9.5F, 13.5F, 10, 1, 10);
		this.Wing_Extra_R_Top.setRotationPoint(0F, 18F, 0F);
		this.Wing_Extra_R_Top.setTextureSize(64, 32);
		this.Wing_Extra_R_Top.mirror = true;
		this.setRotation(this.Wing_Extra_R_Top, 0F, 0F, 0.3141593F);
		this.Wing_Extra_R_Bottom = new ModelRenderer(this, 134, 244);
		this.Wing_Extra_R_Bottom.addBox(-13F, -5.5F, 13.5F, 10, 1, 10);
		this.Wing_Extra_R_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Wing_Extra_R_Bottom.setTextureSize(64, 32);
		this.Wing_Extra_R_Bottom.mirror = true;
		this.setRotation(this.Wing_Extra_R_Bottom, 0F, 0F, -0.3141593F);
		this.Body_Wing_Filler_L = new ModelRenderer(this, 0, 260);
		this.Body_Wing_Filler_L.addBox(2F, -9.5F, 12F, 3, 4, 13);
		this.Body_Wing_Filler_L.setRotationPoint(0F, 18F, 0F);
		this.Body_Wing_Filler_L.setTextureSize(64, 32);
		this.Body_Wing_Filler_L.mirror = true;
		this.setRotation(this.Body_Wing_Filler_L, 0F, 0F, 0F);
		this.Body_Wing_Filler_R = new ModelRenderer(this, 36, 260);
		this.Body_Wing_Filler_R.addBox(-5F, -9.5F, 12F, 3, 4, 13);
		this.Body_Wing_Filler_R.setRotationPoint(0F, 18F, 0F);
		this.Body_Wing_Filler_R.setTextureSize(64, 32);
		this.Body_Wing_Filler_R.mirror = true;
		this.setRotation(this.Body_Wing_Filler_R, 0F, 0F, 0F);
		this.Engine_L_Top = new ModelRenderer(this, 0, 281);
		this.Engine_L_Top.addBox(3.5F, -12.75F, 25F, 3, 3, 10);
		this.Engine_L_Top.setRotationPoint(0F, 18F, 0F);
		this.Engine_L_Top.setTextureSize(64, 32);
		this.Engine_L_Top.mirror = true;
		this.setRotation(this.Engine_L_Top, 0F, 0F, 0F);
		this.Engine_L_Bottom = new ModelRenderer(this, 31, 281);
		this.Engine_L_Bottom.addBox(3.5F, -5F, 25F, 3, 3, 10);
		this.Engine_L_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Engine_L_Bottom.setTextureSize(64, 32);
		this.Engine_L_Bottom.mirror = true;
		this.setRotation(this.Engine_L_Bottom, 0F, 0F, 0F);
		this.Engine_R_Top = new ModelRenderer(this, 62, 281);
		this.Engine_R_Top.addBox(-6.5F, -12.75F, 25F, 3, 3, 10);
		this.Engine_R_Top.setRotationPoint(0F, 18F, 0F);
		this.Engine_R_Top.setTextureSize(64, 32);
		this.Engine_R_Top.mirror = true;
		this.setRotation(this.Engine_R_Top, 0F, 0F, 0F);
		this.Engine_R_Bottom = new ModelRenderer(this, 94, 281);
		this.Engine_R_Bottom.addBox(-6.5F, -5F, 25F, 3, 3, 10);
		this.Engine_R_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Engine_R_Bottom.setTextureSize(64, 32);
		this.Engine_R_Bottom.mirror = true;
		this.setRotation(this.Engine_R_Bottom, 0F, 0F, 0F);
		this.Cockpit_1 = new ModelRenderer(this, 0, 299);
		this.Cockpit_1.addBox(-2.5F, -13.5F, -4F, 5, 3, 10);
		this.Cockpit_1.setRotationPoint(0F, 18F, 0F);
		this.Cockpit_1.setTextureSize(64, 32);
		this.Cockpit_1.mirror = true;
		this.setRotation(this.Cockpit_1, 0.0872665F, 0F, 0F);
		this.Cockpit_2 = new ModelRenderer(this, 34, 299);
		this.Cockpit_2.addBox(-2.5F, -13.9F, -2.9F, 5, 2, 5);
		this.Cockpit_2.setRotationPoint(0F, 18F, 0F);
		this.Cockpit_2.setTextureSize(64, 32);
		this.Cockpit_2.mirror = true;
		this.setRotation(this.Cockpit_2, 0.5235988F, 0F, 0F);
		this.Main_Body_Extra_Top = new ModelRenderer(this, 0, 318);
		this.Main_Body_Extra_Top.addBox(-2.5F, -13F, 4F, 5, 2, 26);
		this.Main_Body_Extra_Top.setRotationPoint(0F, 18F, 0F);
		this.Main_Body_Extra_Top.setTextureSize(64, 32);
		this.Main_Body_Extra_Top.mirror = true;
		this.setRotation(this.Main_Body_Extra_Top, 0F, 0F, 0F);
		this.Laser_Base_L_Top = new ModelRenderer(this, 0, 349);
		this.Laser_Base_L_Top.addBox(28F, -11F, 10.5F, 2, 2, 16);
		this.Laser_Base_L_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_Base_L_Top.setTextureSize(64, 32);
		this.Laser_Base_L_Top.mirror = true;
		this.setRotation(this.Laser_Base_L_Top, 0F, 0F, -0.3141593F);
		this.Laser_Base_2_L_Top = new ModelRenderer(this, 41, 349);
		this.Laser_Base_2_L_Top.addBox(28.5F, -10F, 13.5F, 1, 2, 10);
		this.Laser_Base_2_L_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_Base_2_L_Top.setTextureSize(64, 32);
		this.Laser_Base_2_L_Top.mirror = true;
		this.setRotation(this.Laser_Base_2_L_Top, 0F, 0F, -0.3141593F);
		this.Laser_L_Top = new ModelRenderer(this, 68, 349);
		this.Laser_L_Top.addBox(28.5F, -10.5F, -16F, 1, 1, 28);
		this.Laser_L_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_L_Top.setTextureSize(64, 32);
		this.Laser_L_Top.mirror = true;
		this.setRotation(this.Laser_L_Top, 0F, 0F, -0.3141593F);
		this.Laser_Prong_1_L_Top = new ModelRenderer(this, 129, 349);
		this.Laser_Prong_1_L_Top.addBox(28.5F, -12F, -10F, 1, 4, 1);
		this.Laser_Prong_1_L_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_1_L_Top.setTextureSize(64, 32);
		this.Laser_Prong_1_L_Top.mirror = true;
		this.setRotation(this.Laser_Prong_1_L_Top, 0F, 0F, -0.3141593F);
		this.Laser_Prong_2_L_Top = new ModelRenderer(this, 137, 349);
		this.Laser_Prong_2_L_Top.addBox(28.5F, -12F, -11F, 1, 1, 2);
		this.Laser_Prong_2_L_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_2_L_Top.setTextureSize(64, 32);
		this.Laser_Prong_2_L_Top.mirror = true;
		this.setRotation(this.Laser_Prong_2_L_Top, 0F, 0F, -0.3141593F);
		this.Laser_Prong_3_L_Top = new ModelRenderer(this, 149, 349);
		this.Laser_Prong_3_L_Top.addBox(28.5F, -9F, -11F, 1, 1, 2);
		this.Laser_Prong_3_L_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_3_L_Top.setTextureSize(64, 32);
		this.Laser_Prong_3_L_Top.mirror = true;
		this.setRotation(this.Laser_Prong_3_L_Top, 0F, 0F, -0.3141593F);
		this.Main_Body_Extra_Bottom = new ModelRenderer(this, 202, 260);
		this.Main_Body_Extra_Bottom.addBox(-3F, -4F, 12F, 6, 2, 13);
		this.Main_Body_Extra_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Main_Body_Extra_Bottom.setTextureSize(64, 32);
		this.Main_Body_Extra_Bottom.mirror = true;
		this.setRotation(this.Main_Body_Extra_Bottom, 0F, 0F, 0F);
		this.Laser_Base_R_Bottom = new ModelRenderer(this, 0, 384);
		this.Laser_Base_R_Bottom.addBox(-25F, -5F, 10.5F, 2, 2, 16);
		this.Laser_Base_R_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_Base_R_Bottom.setTextureSize(64, 32);
		this.Laser_Base_R_Bottom.mirror = true;
		this.setRotation(this.Laser_Base_R_Bottom, 0F, 0F, -0.3141593F);
		this.Laser_Base_2_R_Bottom = new ModelRenderer(this, 43, 384);
		this.Laser_Base_2_R_Bottom.addBox(-24.5F, -6F, 13.5F, 1, 2, 10);
		this.Laser_Base_2_R_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_Base_2_R_Bottom.setTextureSize(64, 32);
		this.Laser_Base_2_R_Bottom.mirror = true;
		this.setRotation(this.Laser_Base_2_R_Bottom, 0F, 0F, -0.3141593F);
		this.Laser_R_Bottom = new ModelRenderer(this, 69, 384);
		this.Laser_R_Bottom.addBox(-24.5F, -4.5F, -16F, 1, 1, 28);
		this.Laser_R_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_R_Bottom.setTextureSize(64, 32);
		this.Laser_R_Bottom.mirror = true;
		this.setRotation(this.Laser_R_Bottom, 0F, 0F, -0.3141593F);
		this.Laser_Prong_1_R_Bottom = new ModelRenderer(this, 131, 384);
		this.Laser_Prong_1_R_Bottom.addBox(-24.5F, -6F, -10F, 1, 4, 1);
		this.Laser_Prong_1_R_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_1_R_Bottom.setTextureSize(64, 32);
		this.Laser_Prong_1_R_Bottom.mirror = true;
		this.setRotation(this.Laser_Prong_1_R_Bottom, 0F, 0F, -0.3141593F);
		this.Laser_Prong_2_R_Bottom = new ModelRenderer(this, 139, 384);
		this.Laser_Prong_2_R_Bottom.addBox(-24.5F, -6F, -11F, 1, 1, 2);
		this.Laser_Prong_2_R_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_2_R_Bottom.setTextureSize(64, 32);
		this.Laser_Prong_2_R_Bottom.mirror = true;
		this.setRotation(this.Laser_Prong_2_R_Bottom, 0F, 0F, -0.3141593F);
		this.Laser_Prong_3_R_Bottom = new ModelRenderer(this, 149, 384);
		this.Laser_Prong_3_R_Bottom.addBox(-24.5F, -3F, -11F, 1, 1, 2);
		this.Laser_Prong_3_R_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_3_R_Bottom.setTextureSize(64, 32);
		this.Laser_Prong_3_R_Bottom.mirror = true;
		this.setRotation(this.Laser_Prong_3_R_Bottom, 0F, 0F, -0.3141593F);
		this.Laser_Base_L_Bottom = new ModelRenderer(this, 0, 420);
		this.Laser_Base_L_Bottom.addBox(23F, -5F, 10.5F, 2, 2, 16);
		this.Laser_Base_L_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_Base_L_Bottom.setTextureSize(64, 32);
		this.Laser_Base_L_Bottom.mirror = true;
		this.setRotation(this.Laser_Base_L_Bottom, 0F, 0F, 0.3141593F);
		this.Laser_Base_2_L_Bottom = new ModelRenderer(this, 42, 420);
		this.Laser_Base_2_L_Bottom.addBox(23.5F, -6F, 13.5F, 1, 2, 10);
		this.Laser_Base_2_L_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_Base_2_L_Bottom.setTextureSize(64, 32);
		this.Laser_Base_2_L_Bottom.mirror = true;
		this.setRotation(this.Laser_Base_2_L_Bottom, 0F, 0F, 0.3141593F);
		this.Laser_L_Bottom = new ModelRenderer(this, 68, 420);
		this.Laser_L_Bottom.addBox(23.5F, -4.5F, -16F, 1, 1, 28);
		this.Laser_L_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_L_Bottom.setTextureSize(64, 32);
		this.Laser_L_Bottom.mirror = true;
		this.setRotation(this.Laser_L_Bottom, 0F, 0F, 0.3141593F);
		this.Laser_Prong_1_L_Bottom = new ModelRenderer(this, 130, 420);
		this.Laser_Prong_1_L_Bottom.addBox(23.5F, -6F, -10F, 1, 4, 1);
		this.Laser_Prong_1_L_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_1_L_Bottom.setTextureSize(64, 32);
		this.Laser_Prong_1_L_Bottom.mirror = true;
		this.setRotation(this.Laser_Prong_1_L_Bottom, 0F, 0F, 0.3141593F);
		this.Laser_Prong_2_L_Bottom = new ModelRenderer(this, 138, 420);
		this.Laser_Prong_2_L_Bottom.addBox(23.5F, -6F, -11F, 1, 1, 2);
		this.Laser_Prong_2_L_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_2_L_Bottom.setTextureSize(64, 32);
		this.Laser_Prong_2_L_Bottom.mirror = true;
		this.setRotation(this.Laser_Prong_2_L_Bottom, 0F, 0F, 0.3141593F);
		this.Laser_Prong_3_L_Bottom = new ModelRenderer(this, 149, 420);
		this.Laser_Prong_3_L_Bottom.addBox(23.5F, -3F, -11F, 1, 1, 2);
		this.Laser_Prong_3_L_Bottom.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_3_L_Bottom.setTextureSize(64, 32);
		this.Laser_Prong_3_L_Bottom.mirror = true;
		this.setRotation(this.Laser_Prong_3_L_Bottom, 0F, 0F, 0.3141593F);
		this.Laser_Base_R_Top = new ModelRenderer(this, 0, 456);
		this.Laser_Base_R_Top.addBox(-30F, -11F, 10.5F, 2, 2, 16);
		this.Laser_Base_R_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_Base_R_Top.setTextureSize(64, 32);
		this.Laser_Base_R_Top.mirror = true;
		this.setRotation(this.Laser_Base_R_Top, 0F, 0F, 0.3141593F);
		this.Laser_Base_2_R_Top = new ModelRenderer(this, 40, 456);
		this.Laser_Base_2_R_Top.addBox(-29.5F, -10F, 13.5F, 1, 2, 10);
		this.Laser_Base_2_R_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_Base_2_R_Top.setTextureSize(64, 32);
		this.Laser_Base_2_R_Top.mirror = true;
		this.setRotation(this.Laser_Base_2_R_Top, 0F, 0F, 0.3141593F);
		this.Laser_R_Top = new ModelRenderer(this, 67, 456);
		this.Laser_R_Top.addBox(-29.5F, -10.5F, -16F, 1, 1, 28);
		this.Laser_R_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_R_Top.setTextureSize(64, 32);
		this.Laser_R_Top.mirror = true;
		this.setRotation(this.Laser_R_Top, 0F, 0F, 0.3141593F);
		this.Laser_Prong_1_R_Top = new ModelRenderer(this, 129, 456);
		this.Laser_Prong_1_R_Top.addBox(-29.5F, -12F, -10F, 1, 4, 1);
		this.Laser_Prong_1_R_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_1_R_Top.setTextureSize(64, 32);
		this.Laser_Prong_1_R_Top.mirror = true;
		this.setRotation(this.Laser_Prong_1_R_Top, 0F, 0F, 0.3141593F);
		this.Laser_Prong_2_R_Top = new ModelRenderer(this, 137, 456);
		this.Laser_Prong_2_R_Top.addBox(-29.5F, -12F, -11F, 1, 1, 2);
		this.Laser_Prong_2_R_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_2_R_Top.setTextureSize(64, 32);
		this.Laser_Prong_2_R_Top.mirror = true;
		this.setRotation(this.Laser_Prong_2_R_Top, 0F, 0F, 0.3141593F);
		this.Laser_Prong_3_R_Top = new ModelRenderer(this, 149, 456);
		this.Laser_Prong_3_R_Top.addBox(-29.5F, -9F, -11F, 1, 1, 2);
		this.Laser_Prong_3_R_Top.setRotationPoint(0F, 18F, 0F);
		this.Laser_Prong_3_R_Top.setTextureSize(64, 32);
		this.Laser_Prong_3_R_Top.mirror = true;
		this.setRotation(this.Laser_Prong_3_R_Top, 0F, 0F, 0.3141593F);
		this.Landing_Gear_1 = new ModelRenderer(this, 100, 0);
		this.Landing_Gear_1.addBox(-1F, 0.5F, -18F, 2, 11, 2);
		this.Landing_Gear_1.setRotationPoint(0F, 18F, 0F);
		this.Landing_Gear_1.setTextureSize(64, 32);
		this.Landing_Gear_1.mirror = true;
		this.setRotation(this.Landing_Gear_1, -0.3141593F, 0F, 0F);
		this.Landing_Gear_2 = new ModelRenderer(this, 120, 0);
		this.Landing_Gear_2.addBox(-2F, 5F, -22.5F, 4, 1, 6);
		this.Landing_Gear_2.setRotationPoint(0F, 18F, 0F);
		this.Landing_Gear_2.setTextureSize(64, 32);
		this.Landing_Gear_2.mirror = true;
		this.setRotation(this.Landing_Gear_2, 0F, 0F, 0F);
		this.Landing_Gear_3 = new ModelRenderer(this, 148, 0);
		this.Landing_Gear_3.addBox(4.5F, -3.3F, 17F, 2, 11, 2);
		this.Landing_Gear_3.setRotationPoint(0F, 18F, 0F);
		this.Landing_Gear_3.setTextureSize(64, 32);
		this.Landing_Gear_3.mirror = true;
		this.setRotation(this.Landing_Gear_3, 0F, 0F, -0.3141593F);
		this.Landing_Gear_4 = new ModelRenderer(this, 170, 0);
		this.Landing_Gear_4.addBox(-6F, -3.5F, 17F, 2, 11, 2);
		this.Landing_Gear_4.setRotationPoint(0F, 18F, 0F);
		this.Landing_Gear_4.setTextureSize(64, 32);
		this.Landing_Gear_4.mirror = true;
		this.setRotation(this.Landing_Gear_4, 0F, 0F, 0.3141593F);
		this.Landing_Gear_5 = new ModelRenderer(this, 189, 0);
		this.Landing_Gear_5.addBox(4.3F, 5F, 16F, 6, 1, 4);
		this.Landing_Gear_5.setRotationPoint(0F, 18F, 0F);
		this.Landing_Gear_5.setTextureSize(64, 32);
		this.Landing_Gear_5.mirror = true;
		this.setRotation(this.Landing_Gear_5, 0F, 0F, 0F);
		this.Landing_Gear_6 = new ModelRenderer(this, 218, 0);
		this.Landing_Gear_6.addBox(-10F, 5F, 16F, 6, 1, 4);
		this.Landing_Gear_6.setRotationPoint(0F, 18F, 0F);
		this.Landing_Gear_6.setTextureSize(64, 32);
		this.Landing_Gear_6.mirror = true;
		this.setRotation(this.Landing_Gear_6, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.Boby_Bottom.render(f5);
		this.Body_Top.render(f5);
		this.Main_Body.render(f5);
		this.Nose_Cone_Lower.render(f5);
		this.Nose_Cone_Upper.render(f5);
		this.Body_Fill.render(f5);
		this.Booster_L_Top.render(f5);
		this.Booster_L_Bottom.render(f5);
		this.Booster_R_Top.render(f5);
		this.Booster_R_Bottom.render(f5);
		this.Wing_L_Top.render(f5);
		this.Wing_L_Bottom.render(f5);
		this.Wing_R_Top.render(f5);
		this.Wing_R_Bottom.render(f5);
		this.Wing_Extra_L_Top.render(f5);
		this.Wing_Extra_L_Bottom.render(f5);
		this.Wing_Extra_R_Top.render(f5);
		this.Wing_Extra_R_Bottom.render(f5);
		this.Body_Wing_Filler_L.render(f5);
		this.Body_Wing_Filler_R.render(f5);
		this.Engine_L_Top.render(f5);
		this.Engine_L_Bottom.render(f5);
		this.Engine_R_Top.render(f5);
		this.Engine_R_Bottom.render(f5);
		this.Cockpit_1.render(f5);
		this.Cockpit_2.render(f5);
		this.Main_Body_Extra_Top.render(f5);
		this.Laser_Base_L_Top.render(f5);
		this.Laser_Base_2_L_Top.render(f5);
		this.Laser_L_Top.render(f5);
		this.Laser_Prong_1_L_Top.render(f5);
		this.Laser_Prong_2_L_Top.render(f5);
		this.Laser_Prong_3_L_Top.render(f5);
		this.Main_Body_Extra_Bottom.render(f5);
		this.Laser_Base_R_Bottom.render(f5);
		this.Laser_Base_2_R_Bottom.render(f5);
		this.Laser_R_Bottom.render(f5);
		this.Laser_Prong_1_R_Bottom.render(f5);
		this.Laser_Prong_2_R_Bottom.render(f5);
		this.Laser_Prong_3_R_Bottom.render(f5);
		this.Laser_Base_L_Bottom.render(f5);
		this.Laser_Base_2_L_Bottom.render(f5);
		this.Laser_L_Bottom.render(f5);
		this.Laser_Prong_1_L_Bottom.render(f5);
		this.Laser_Prong_2_L_Bottom.render(f5);
		this.Laser_Prong_3_L_Bottom.render(f5);
		this.Laser_Base_R_Top.render(f5);
		this.Laser_Base_2_R_Top.render(f5);
		this.Laser_R_Top.render(f5);
		this.Laser_Prong_1_R_Top.render(f5);
		this.Laser_Prong_2_R_Top.render(f5);
		this.Laser_Prong_3_R_Top.render(f5);
		if (!entity.worldObj.isAirBlock((int)entity.posX, (int)entity.posY - 1, (int)entity.posZ))
		{
			this.Landing_Gear_1.render(f5);
			this.Landing_Gear_2.render(f5);
			this.Landing_Gear_3.render(f5);
			this.Landing_Gear_4.render(f5);
			this.Landing_Gear_5.render(f5);
			this.Landing_Gear_6.render(f5);
		}
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}