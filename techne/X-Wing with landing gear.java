// Date: 11/23/2015 9:30:45 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelNew extends ModelBase
{
  //fields
    ModelRenderer Boby_Bottom;
    ModelRenderer Body_Top;
    ModelRenderer Main_Body;
    ModelRenderer Nose_Cone_Lower;
    ModelRenderer Nose_Cone_Upper;
    ModelRenderer Body_Fill;
    ModelRenderer Booster_L_Top;
    ModelRenderer Booster_L_Bottom;
    ModelRenderer Booster_R_Top;
    ModelRenderer Booster_R_Bottom;
    ModelRenderer Wing_L_Top;
    ModelRenderer Wing_L_Bottom;
    ModelRenderer Wing_R_Top;
    ModelRenderer Wing_R_Bottom;
    ModelRenderer Wing_Extra_L_Top;
    ModelRenderer Wing_Extra_L_Bottom;
    ModelRenderer Wing_Extra_R_Top;
    ModelRenderer Wing_Extra_R_Bottom;
    ModelRenderer Body_Wing_Filler_L;
    ModelRenderer Body_Wing_Filler_R;
    ModelRenderer Engine_L_Top;
    ModelRenderer Engine_L_Bottom;
    ModelRenderer Engine_R_Top;
    ModelRenderer Engine_R_Bottom;
    ModelRenderer Cockpit_1;
    ModelRenderer Cockpit_2;
    ModelRenderer Main_Body_Extra_Top;
    ModelRenderer Laser_Base_L_Top;
    ModelRenderer Laser_Base_2_L_Top;
    ModelRenderer Laser_L_Top;
    ModelRenderer Laser_Prong_1_L_Top;
    ModelRenderer Laser_Prong_2_L_Top;
    ModelRenderer Laser_Prong_3_L_Top;
    ModelRenderer Main_Body_Extra_Bottom;
    ModelRenderer Laser_Base_R_Bottom;
    ModelRenderer Laser_Base_2_R_Bottom;
    ModelRenderer Laser_R_Bottom;
    ModelRenderer Laser_Prong_1_R_Bottom;
    ModelRenderer Laser_Prong_2_R_Bottom;
    ModelRenderer Laser_Prong_3_R_Bottom;
    ModelRenderer Laser_Base_L_Bottom;
    ModelRenderer Laser_Base_2_L_Bottom;
    ModelRenderer Laser_L_Bottom;
    ModelRenderer Laser_Prong_1_L_Bottom;
    ModelRenderer Laser_Prong_2_L_Bottom;
    ModelRenderer Laser_Prong_3_L_Bottom;
    ModelRenderer Laser_Base_R_Top;
    ModelRenderer Laser_Base_2_R_Top;
    ModelRenderer Laser_R_Top;
    ModelRenderer Laser_Prong_1_R_Top;
    ModelRenderer Laser_Prong_2_R_Top;
    ModelRenderer Laser_Prong_3_R_Top;
    ModelRenderer Landing_Gear_1;
    ModelRenderer Landing_Gear_2;
    ModelRenderer Landing_Gear_3;
    ModelRenderer Landing_Gear_4;
    ModelRenderer Landing_Gear_5;
    ModelRenderer Landing_Gear_6;
  
  public ModelNew()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      Boby_Bottom = new ModelRenderer(this, 0, 0);
      Boby_Bottom.addBox(-3F, -7F, -36F, 6, 3, 40);
      Boby_Bottom.setRotationPoint(0F, 18F, 0F);
      Boby_Bottom.setTextureSize(64, 32);
      Boby_Bottom.mirror = true;
      setRotation(Boby_Bottom, 0F, 0F, 0F);
      Body_Top = new ModelRenderer(this, 0, 51);
      Body_Top.addBox(-3F, -11.65F, -34.8F, 6, 3, 40);
      Body_Top.setRotationPoint(0F, 18F, 0F);
      Body_Top.setTextureSize(64, 32);
      Body_Top.mirror = true;
      setRotation(Body_Top, 0.0872665F, 0F, 0F);
      Main_Body = new ModelRenderer(this, 0, 103);
      Main_Body.addBox(-3F, -11F, 4F, 6, 7, 28);
      Main_Body.setRotationPoint(0F, 18F, 0F);
      Main_Body.setTextureSize(64, 32);
      Main_Body.mirror = true;
      setRotation(Main_Body, 0F, 0F, 0F);
      Nose_Cone_Lower = new ModelRenderer(this, 0, 144);
      Nose_Cone_Lower.addBox(-3.5F, -6.5F, -36.5F, 7, 3, 10);
      Nose_Cone_Lower.setRotationPoint(0F, 18F, 0F);
      Nose_Cone_Lower.setTextureSize(64, 32);
      Nose_Cone_Lower.mirror = true;
      setRotation(Nose_Cone_Lower, 0F, 0F, 0F);
      Nose_Cone_Upper = new ModelRenderer(this, 0, 163);
      Nose_Cone_Upper.addBox(-3.5F, -10.5F, -36.3F, 7, 3, 8);
      Nose_Cone_Upper.setRotationPoint(0F, 18F, 0F);
      Nose_Cone_Upper.setTextureSize(64, 32);
      Nose_Cone_Upper.mirror = true;
      setRotation(Nose_Cone_Upper, 0.0349066F, 0F, 0F);
      Body_Fill = new ModelRenderer(this, 38, 167);
      Body_Fill.addBox(-3F, -9.5F, -20F, 6, 3, 25);
      Body_Fill.setRotationPoint(0F, 18F, 0F);
      Body_Fill.setTextureSize(64, 32);
      Body_Fill.mirror = true;
      setRotation(Body_Fill, 0F, 0F, 0F);
      Booster_L_Top = new ModelRenderer(this, 0, 201);
      Booster_L_Top.addBox(3F, -13.25F, 11F, 4, 4, 15);
      Booster_L_Top.setRotationPoint(0F, 18F, 0F);
      Booster_L_Top.setTextureSize(64, 32);
      Booster_L_Top.mirror = true;
      setRotation(Booster_L_Top, 0F, 0F, 0F);
      Booster_L_Bottom = new ModelRenderer(this, 42, 201);
      Booster_L_Bottom.addBox(3F, -5.5F, 11F, 4, 4, 15);
      Booster_L_Bottom.setRotationPoint(0F, 18F, 0F);
      Booster_L_Bottom.setTextureSize(64, 32);
      Booster_L_Bottom.mirror = true;
      setRotation(Booster_L_Bottom, 0F, 0F, 0F);
      Booster_R_Top = new ModelRenderer(this, 84, 201);
      Booster_R_Top.addBox(-7F, -13.3F, 11F, 4, 4, 15);
      Booster_R_Top.setRotationPoint(0F, 18F, 0F);
      Booster_R_Top.setTextureSize(64, 32);
      Booster_R_Top.mirror = true;
      setRotation(Booster_R_Top, 0F, 0F, 0F);
      Booster_R_Bottom = new ModelRenderer(this, 126, 201);
      Booster_R_Bottom.addBox(-7F, -5.5F, 11F, 4, 4, 15);
      Booster_R_Bottom.setRotationPoint(0F, 18F, 0F);
      Booster_R_Bottom.setTextureSize(64, 32);
      Booster_R_Bottom.mirror = true;
      setRotation(Booster_R_Bottom, 0F, 0F, 0F);
      Wing_L_Top = new ModelRenderer(this, 0, 225);
      Wing_L_Top.addBox(4F, -8.5F, 12F, 26, 1, 13);
      Wing_L_Top.setRotationPoint(0F, 18F, 0F);
      Wing_L_Top.setTextureSize(64, 32);
      Wing_L_Top.mirror = true;
      setRotation(Wing_L_Top, 0F, 0F, -0.3141593F);
      Wing_L_Bottom = new ModelRenderer(this, 82, 225);
      Wing_L_Bottom.addBox(-1F, -6.5F, 12F, 26, 1, 13);
      Wing_L_Bottom.setRotationPoint(0F, 18F, 0F);
      Wing_L_Bottom.setTextureSize(64, 32);
      Wing_L_Bottom.mirror = true;
      setRotation(Wing_L_Bottom, 0F, 0F, 0.3141593F);
      Wing_R_Top = new ModelRenderer(this, 165, 225);
      Wing_R_Top.addBox(-30F, -8.5F, 12F, 26, 1, 13);
      Wing_R_Top.setRotationPoint(0F, 18F, 0F);
      Wing_R_Top.setTextureSize(64, 32);
      Wing_R_Top.mirror = true;
      setRotation(Wing_R_Top, 0F, 0F, 0.3141593F);
      Wing_R_Bottom = new ModelRenderer(this, 247, 225);
      Wing_R_Bottom.addBox(-25F, -6.5F, 12F, 26, 1, 13);
      Wing_R_Bottom.setRotationPoint(0F, 18F, 0F);
      Wing_R_Bottom.setTextureSize(64, 32);
      Wing_R_Bottom.mirror = true;
      setRotation(Wing_R_Bottom, 0F, 0F, -0.3141593F);
      Wing_Extra_L_Top = new ModelRenderer(this, 0, 244);
      Wing_Extra_L_Top.addBox(8F, -9.5F, 13.5F, 10, 1, 10);
      Wing_Extra_L_Top.setRotationPoint(0F, 18F, 0F);
      Wing_Extra_L_Top.setTextureSize(64, 32);
      Wing_Extra_L_Top.mirror = true;
      setRotation(Wing_Extra_L_Top, 0F, 0F, -0.3141593F);
      Wing_Extra_L_Bottom = new ModelRenderer(this, 44, 244);
      Wing_Extra_L_Bottom.addBox(3F, -5.5F, 13.5F, 10, 1, 10);
      Wing_Extra_L_Bottom.setRotationPoint(0F, 18F, 0F);
      Wing_Extra_L_Bottom.setTextureSize(64, 32);
      Wing_Extra_L_Bottom.mirror = true;
      setRotation(Wing_Extra_L_Bottom, 0F, 0F, 0.3141593F);
      Wing_Extra_R_Top = new ModelRenderer(this, 89, 244);
      Wing_Extra_R_Top.addBox(-18F, -9.5F, 13.5F, 10, 1, 10);
      Wing_Extra_R_Top.setRotationPoint(0F, 18F, 0F);
      Wing_Extra_R_Top.setTextureSize(64, 32);
      Wing_Extra_R_Top.mirror = true;
      setRotation(Wing_Extra_R_Top, 0F, 0F, 0.3141593F);
      Wing_Extra_R_Bottom = new ModelRenderer(this, 134, 244);
      Wing_Extra_R_Bottom.addBox(-13F, -5.5F, 13.5F, 10, 1, 10);
      Wing_Extra_R_Bottom.setRotationPoint(0F, 18F, 0F);
      Wing_Extra_R_Bottom.setTextureSize(64, 32);
      Wing_Extra_R_Bottom.mirror = true;
      setRotation(Wing_Extra_R_Bottom, 0F, 0F, -0.3141593F);
      Body_Wing_Filler_L = new ModelRenderer(this, 0, 260);
      Body_Wing_Filler_L.addBox(2F, -9.5F, 12F, 3, 4, 13);
      Body_Wing_Filler_L.setRotationPoint(0F, 18F, 0F);
      Body_Wing_Filler_L.setTextureSize(64, 32);
      Body_Wing_Filler_L.mirror = true;
      setRotation(Body_Wing_Filler_L, 0F, 0F, 0F);
      Body_Wing_Filler_R = new ModelRenderer(this, 36, 260);
      Body_Wing_Filler_R.addBox(-5F, -9.5F, 12F, 3, 4, 13);
      Body_Wing_Filler_R.setRotationPoint(0F, 18F, 0F);
      Body_Wing_Filler_R.setTextureSize(64, 32);
      Body_Wing_Filler_R.mirror = true;
      setRotation(Body_Wing_Filler_R, 0F, 0F, 0F);
      Engine_L_Top = new ModelRenderer(this, 0, 281);
      Engine_L_Top.addBox(3.5F, -12.75F, 25F, 3, 3, 10);
      Engine_L_Top.setRotationPoint(0F, 18F, 0F);
      Engine_L_Top.setTextureSize(64, 32);
      Engine_L_Top.mirror = true;
      setRotation(Engine_L_Top, 0F, 0F, 0F);
      Engine_L_Bottom = new ModelRenderer(this, 31, 281);
      Engine_L_Bottom.addBox(3.5F, -5F, 25F, 3, 3, 10);
      Engine_L_Bottom.setRotationPoint(0F, 18F, 0F);
      Engine_L_Bottom.setTextureSize(64, 32);
      Engine_L_Bottom.mirror = true;
      setRotation(Engine_L_Bottom, 0F, 0F, 0F);
      Engine_R_Top = new ModelRenderer(this, 62, 281);
      Engine_R_Top.addBox(-6.5F, -12.75F, 25F, 3, 3, 10);
      Engine_R_Top.setRotationPoint(0F, 18F, 0F);
      Engine_R_Top.setTextureSize(64, 32);
      Engine_R_Top.mirror = true;
      setRotation(Engine_R_Top, 0F, 0F, 0F);
      Engine_R_Bottom = new ModelRenderer(this, 94, 281);
      Engine_R_Bottom.addBox(-6.5F, -5F, 25F, 3, 3, 10);
      Engine_R_Bottom.setRotationPoint(0F, 18F, 0F);
      Engine_R_Bottom.setTextureSize(64, 32);
      Engine_R_Bottom.mirror = true;
      setRotation(Engine_R_Bottom, 0F, 0F, 0F);
      Cockpit_1 = new ModelRenderer(this, 0, 299);
      Cockpit_1.addBox(-2.5F, -13.5F, -4F, 5, 3, 10);
      Cockpit_1.setRotationPoint(0F, 18F, 0F);
      Cockpit_1.setTextureSize(64, 32);
      Cockpit_1.mirror = true;
      setRotation(Cockpit_1, 0.0872665F, 0F, 0F);
      Cockpit_2 = new ModelRenderer(this, 34, 299);
      Cockpit_2.addBox(-2.5F, -13.9F, -2.9F, 5, 2, 5);
      Cockpit_2.setRotationPoint(0F, 18F, 0F);
      Cockpit_2.setTextureSize(64, 32);
      Cockpit_2.mirror = true;
      setRotation(Cockpit_2, 0.5235988F, 0F, 0F);
      Main_Body_Extra_Top = new ModelRenderer(this, 0, 318);
      Main_Body_Extra_Top.addBox(-2.5F, -13F, 4F, 5, 2, 26);
      Main_Body_Extra_Top.setRotationPoint(0F, 18F, 0F);
      Main_Body_Extra_Top.setTextureSize(64, 32);
      Main_Body_Extra_Top.mirror = true;
      setRotation(Main_Body_Extra_Top, 0F, 0F, 0F);
      Laser_Base_L_Top = new ModelRenderer(this, 0, 349);
      Laser_Base_L_Top.addBox(28F, -11F, 10.5F, 2, 2, 16);
      Laser_Base_L_Top.setRotationPoint(0F, 18F, 0F);
      Laser_Base_L_Top.setTextureSize(64, 32);
      Laser_Base_L_Top.mirror = true;
      setRotation(Laser_Base_L_Top, 0F, 0F, -0.3141593F);
      Laser_Base_2_L_Top = new ModelRenderer(this, 41, 349);
      Laser_Base_2_L_Top.addBox(28.5F, -10F, 13.5F, 1, 2, 10);
      Laser_Base_2_L_Top.setRotationPoint(0F, 18F, 0F);
      Laser_Base_2_L_Top.setTextureSize(64, 32);
      Laser_Base_2_L_Top.mirror = true;
      setRotation(Laser_Base_2_L_Top, 0F, 0F, -0.3141593F);
      Laser_L_Top = new ModelRenderer(this, 68, 349);
      Laser_L_Top.addBox(28.5F, -10.5F, -16F, 1, 1, 28);
      Laser_L_Top.setRotationPoint(0F, 18F, 0F);
      Laser_L_Top.setTextureSize(64, 32);
      Laser_L_Top.mirror = true;
      setRotation(Laser_L_Top, 0F, 0F, -0.3141593F);
      Laser_Prong_1_L_Top = new ModelRenderer(this, 129, 349);
      Laser_Prong_1_L_Top.addBox(28.5F, -12F, -10F, 1, 4, 1);
      Laser_Prong_1_L_Top.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_1_L_Top.setTextureSize(64, 32);
      Laser_Prong_1_L_Top.mirror = true;
      setRotation(Laser_Prong_1_L_Top, 0F, 0F, -0.3141593F);
      Laser_Prong_2_L_Top = new ModelRenderer(this, 137, 349);
      Laser_Prong_2_L_Top.addBox(28.5F, -12F, -11F, 1, 1, 2);
      Laser_Prong_2_L_Top.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_2_L_Top.setTextureSize(64, 32);
      Laser_Prong_2_L_Top.mirror = true;
      setRotation(Laser_Prong_2_L_Top, 0F, 0F, -0.3141593F);
      Laser_Prong_3_L_Top = new ModelRenderer(this, 149, 349);
      Laser_Prong_3_L_Top.addBox(28.5F, -9F, -11F, 1, 1, 2);
      Laser_Prong_3_L_Top.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_3_L_Top.setTextureSize(64, 32);
      Laser_Prong_3_L_Top.mirror = true;
      setRotation(Laser_Prong_3_L_Top, 0F, 0F, -0.3141593F);
      Main_Body_Extra_Bottom = new ModelRenderer(this, 202, 260);
      Main_Body_Extra_Bottom.addBox(-3F, -4F, 12F, 6, 2, 13);
      Main_Body_Extra_Bottom.setRotationPoint(0F, 18F, 0F);
      Main_Body_Extra_Bottom.setTextureSize(64, 32);
      Main_Body_Extra_Bottom.mirror = true;
      setRotation(Main_Body_Extra_Bottom, 0F, 0F, 0F);
      Laser_Base_R_Bottom = new ModelRenderer(this, 0, 384);
      Laser_Base_R_Bottom.addBox(-25F, -5F, 10.5F, 2, 2, 16);
      Laser_Base_R_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_Base_R_Bottom.setTextureSize(64, 32);
      Laser_Base_R_Bottom.mirror = true;
      setRotation(Laser_Base_R_Bottom, 0F, 0F, -0.3141593F);
      Laser_Base_2_R_Bottom = new ModelRenderer(this, 43, 384);
      Laser_Base_2_R_Bottom.addBox(-24.5F, -6F, 13.5F, 1, 2, 10);
      Laser_Base_2_R_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_Base_2_R_Bottom.setTextureSize(64, 32);
      Laser_Base_2_R_Bottom.mirror = true;
      setRotation(Laser_Base_2_R_Bottom, 0F, 0F, -0.3141593F);
      Laser_R_Bottom = new ModelRenderer(this, 69, 384);
      Laser_R_Bottom.addBox(-24.5F, -4.5F, -16F, 1, 1, 28);
      Laser_R_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_R_Bottom.setTextureSize(64, 32);
      Laser_R_Bottom.mirror = true;
      setRotation(Laser_R_Bottom, 0F, 0F, -0.3141593F);
      Laser_Prong_1_R_Bottom = new ModelRenderer(this, 131, 384);
      Laser_Prong_1_R_Bottom.addBox(-24.5F, -6F, -10F, 1, 4, 1);
      Laser_Prong_1_R_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_1_R_Bottom.setTextureSize(64, 32);
      Laser_Prong_1_R_Bottom.mirror = true;
      setRotation(Laser_Prong_1_R_Bottom, 0F, 0F, -0.3141593F);
      Laser_Prong_2_R_Bottom = new ModelRenderer(this, 139, 384);
      Laser_Prong_2_R_Bottom.addBox(-24.5F, -6F, -11F, 1, 1, 2);
      Laser_Prong_2_R_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_2_R_Bottom.setTextureSize(64, 32);
      Laser_Prong_2_R_Bottom.mirror = true;
      setRotation(Laser_Prong_2_R_Bottom, 0F, 0F, -0.3141593F);
      Laser_Prong_3_R_Bottom = new ModelRenderer(this, 149, 384);
      Laser_Prong_3_R_Bottom.addBox(-24.5F, -3F, -11F, 1, 1, 2);
      Laser_Prong_3_R_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_3_R_Bottom.setTextureSize(64, 32);
      Laser_Prong_3_R_Bottom.mirror = true;
      setRotation(Laser_Prong_3_R_Bottom, 0F, 0F, -0.3141593F);
      Laser_Base_L_Bottom = new ModelRenderer(this, 0, 420);
      Laser_Base_L_Bottom.addBox(23F, -5F, 10.5F, 2, 2, 16);
      Laser_Base_L_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_Base_L_Bottom.setTextureSize(64, 32);
      Laser_Base_L_Bottom.mirror = true;
      setRotation(Laser_Base_L_Bottom, 0F, 0F, 0.3141593F);
      Laser_Base_2_L_Bottom = new ModelRenderer(this, 42, 420);
      Laser_Base_2_L_Bottom.addBox(23.5F, -6F, 13.5F, 1, 2, 10);
      Laser_Base_2_L_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_Base_2_L_Bottom.setTextureSize(64, 32);
      Laser_Base_2_L_Bottom.mirror = true;
      setRotation(Laser_Base_2_L_Bottom, 0F, 0F, 0.3141593F);
      Laser_L_Bottom = new ModelRenderer(this, 68, 420);
      Laser_L_Bottom.addBox(23.5F, -4.5F, -16F, 1, 1, 28);
      Laser_L_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_L_Bottom.setTextureSize(64, 32);
      Laser_L_Bottom.mirror = true;
      setRotation(Laser_L_Bottom, 0F, 0F, 0.3141593F);
      Laser_Prong_1_L_Bottom = new ModelRenderer(this, 130, 420);
      Laser_Prong_1_L_Bottom.addBox(24F, -6F, -10F, 1, 4, 1);
      Laser_Prong_1_L_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_1_L_Bottom.setTextureSize(64, 32);
      Laser_Prong_1_L_Bottom.mirror = true;
      setRotation(Laser_Prong_1_L_Bottom, 0F, 0F, 0.3141593F);
      Laser_Prong_2_L_Bottom = new ModelRenderer(this, 138, 420);
      Laser_Prong_2_L_Bottom.addBox(24F, -6F, -11F, 1, 1, 2);
      Laser_Prong_2_L_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_2_L_Bottom.setTextureSize(64, 32);
      Laser_Prong_2_L_Bottom.mirror = true;
      setRotation(Laser_Prong_2_L_Bottom, 0F, 0F, 0.3141593F);
      Laser_Prong_3_L_Bottom = new ModelRenderer(this, 149, 420);
      Laser_Prong_3_L_Bottom.addBox(24F, -3F, -11F, 1, 1, 2);
      Laser_Prong_3_L_Bottom.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_3_L_Bottom.setTextureSize(64, 32);
      Laser_Prong_3_L_Bottom.mirror = true;
      setRotation(Laser_Prong_3_L_Bottom, 0F, 0F, 0.3141593F);
      Laser_Base_R_Top = new ModelRenderer(this, 0, 456);
      Laser_Base_R_Top.addBox(-30F, -11F, 10.5F, 2, 2, 16);
      Laser_Base_R_Top.setRotationPoint(0F, 18F, 0F);
      Laser_Base_R_Top.setTextureSize(64, 32);
      Laser_Base_R_Top.mirror = true;
      setRotation(Laser_Base_R_Top, 0F, 0F, 0.3141593F);
      Laser_Base_2_R_Top = new ModelRenderer(this, 40, 456);
      Laser_Base_2_R_Top.addBox(-29.5F, -10F, 13.5F, 1, 2, 10);
      Laser_Base_2_R_Top.setRotationPoint(0F, 18F, 0F);
      Laser_Base_2_R_Top.setTextureSize(64, 32);
      Laser_Base_2_R_Top.mirror = true;
      setRotation(Laser_Base_2_R_Top, 0F, 0F, 0.3141593F);
      Laser_R_Top = new ModelRenderer(this, 67, 456);
      Laser_R_Top.addBox(-29.5F, -10.5F, -16F, 1, 1, 28);
      Laser_R_Top.setRotationPoint(0F, 18F, 0F);
      Laser_R_Top.setTextureSize(64, 32);
      Laser_R_Top.mirror = true;
      setRotation(Laser_R_Top, 0F, 0F, 0.3141593F);
      Laser_Prong_1_R_Top = new ModelRenderer(this, 129, 456);
      Laser_Prong_1_R_Top.addBox(-29.5F, -12F, -10F, 1, 4, 1);
      Laser_Prong_1_R_Top.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_1_R_Top.setTextureSize(64, 32);
      Laser_Prong_1_R_Top.mirror = true;
      setRotation(Laser_Prong_1_R_Top, 0F, 0F, 0.3141593F);
      Laser_Prong_2_R_Top = new ModelRenderer(this, 137, 456);
      Laser_Prong_2_R_Top.addBox(-29.5F, -12F, -11F, 1, 1, 2);
      Laser_Prong_2_R_Top.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_2_R_Top.setTextureSize(64, 32);
      Laser_Prong_2_R_Top.mirror = true;
      setRotation(Laser_Prong_2_R_Top, 0F, 0F, 0.3141593F);
      Laser_Prong_3_R_Top = new ModelRenderer(this, 149, 456);
      Laser_Prong_3_R_Top.addBox(-29.5F, -9F, -11F, 1, 1, 2);
      Laser_Prong_3_R_Top.setRotationPoint(0F, 18F, 0F);
      Laser_Prong_3_R_Top.setTextureSize(64, 32);
      Laser_Prong_3_R_Top.mirror = true;
      setRotation(Laser_Prong_3_R_Top, 0F, 0F, 0.3141593F);
      Landing_Gear_1 = new ModelRenderer(this, 100, 0);
      Landing_Gear_1.addBox(-1F, 0.5F, -18F, 2, 11, 2);
      Landing_Gear_1.setRotationPoint(0F, 18F, 0F);
      Landing_Gear_1.setTextureSize(512, 512);
      Landing_Gear_1.mirror = true;
      setRotation(Landing_Gear_1, -0.3141593F, 0F, 0F);
      Landing_Gear_2 = new ModelRenderer(this, 120, 0);
      Landing_Gear_2.addBox(-2F, 5F, -22.5F, 4, 1, 6);
      Landing_Gear_2.setRotationPoint(0F, 18F, 0F);
      Landing_Gear_2.setTextureSize(512, 512);
      Landing_Gear_2.mirror = true;
      setRotation(Landing_Gear_2, 0F, 0F, 0F);
      Landing_Gear_3 = new ModelRenderer(this, 148, 0);
      Landing_Gear_3.addBox(4.5F, -3.3F, 17F, 2, 11, 2);
      Landing_Gear_3.setRotationPoint(0F, 18F, 0F);
      Landing_Gear_3.setTextureSize(512, 512);
      Landing_Gear_3.mirror = true;
      setRotation(Landing_Gear_3, 0F, 0F, -0.3141593F);
      Landing_Gear_4 = new ModelRenderer(this, 170, 0);
      Landing_Gear_4.addBox(-6F, -3.5F, 17F, 2, 11, 2);
      Landing_Gear_4.setRotationPoint(0F, 18F, 0F);
      Landing_Gear_4.setTextureSize(512, 512);
      Landing_Gear_4.mirror = true;
      setRotation(Landing_Gear_4, 0F, 0F, 0.3141593F);
      Landing_Gear_5 = new ModelRenderer(this, 189, 0);
      Landing_Gear_5.addBox(4.3F, 5F, 16F, 6, 1, 4);
      Landing_Gear_5.setRotationPoint(0F, 18F, 0F);
      Landing_Gear_5.setTextureSize(512, 512);
      Landing_Gear_5.mirror = true;
      setRotation(Landing_Gear_5, 0F, 0F, 0F);
      Landing_Gear_6 = new ModelRenderer(this, 218, 0);
      Landing_Gear_6.addBox(-10F, 5F, 16F, 6, 1, 4);
      Landing_Gear_6.setRotationPoint(0F, 18F, 0F);
      Landing_Gear_6.setTextureSize(512, 512);
      Landing_Gear_6.mirror = true;
      setRotation(Landing_Gear_6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Boby_Bottom.render(f5);
    Body_Top.render(f5);
    Main_Body.render(f5);
    Nose_Cone_Lower.render(f5);
    Nose_Cone_Upper.render(f5);
    Body_Fill.render(f5);
    Booster_L_Top.render(f5);
    Booster_L_Bottom.render(f5);
    Booster_R_Top.render(f5);
    Booster_R_Bottom.render(f5);
    Wing_L_Top.render(f5);
    Wing_L_Bottom.render(f5);
    Wing_R_Top.render(f5);
    Wing_R_Bottom.render(f5);
    Wing_Extra_L_Top.render(f5);
    Wing_Extra_L_Bottom.render(f5);
    Wing_Extra_R_Top.render(f5);
    Wing_Extra_R_Bottom.render(f5);
    Body_Wing_Filler_L.render(f5);
    Body_Wing_Filler_R.render(f5);
    Engine_L_Top.render(f5);
    Engine_L_Bottom.render(f5);
    Engine_R_Top.render(f5);
    Engine_R_Bottom.render(f5);
    Cockpit_1.render(f5);
    Cockpit_2.render(f5);
    Main_Body_Extra_Top.render(f5);
    Laser_Base_L_Top.render(f5);
    Laser_Base_2_L_Top.render(f5);
    Laser_L_Top.render(f5);
    Laser_Prong_1_L_Top.render(f5);
    Laser_Prong_2_L_Top.render(f5);
    Laser_Prong_3_L_Top.render(f5);
    Main_Body_Extra_Bottom.render(f5);
    Laser_Base_R_Bottom.render(f5);
    Laser_Base_2_R_Bottom.render(f5);
    Laser_R_Bottom.render(f5);
    Laser_Prong_1_R_Bottom.render(f5);
    Laser_Prong_2_R_Bottom.render(f5);
    Laser_Prong_3_R_Bottom.render(f5);
    Laser_Base_L_Bottom.render(f5);
    Laser_Base_2_L_Bottom.render(f5);
    Laser_L_Bottom.render(f5);
    Laser_Prong_1_L_Bottom.render(f5);
    Laser_Prong_2_L_Bottom.render(f5);
    Laser_Prong_3_L_Bottom.render(f5);
    Laser_Base_R_Top.render(f5);
    Laser_Base_2_R_Top.render(f5);
    Laser_R_Top.render(f5);
    Laser_Prong_1_R_Top.render(f5);
    Laser_Prong_2_R_Top.render(f5);
    Laser_Prong_3_R_Top.render(f5);
    Landing_Gear_1.render(f5);
    Landing_Gear_2.render(f5);
    Landing_Gear_3.render(f5);
    Landing_Gear_4.render(f5);
    Landing_Gear_5.render(f5);
    Landing_Gear_6.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}