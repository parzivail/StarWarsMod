package com.parzivail.pswm.models.vehicles;

import com.parzivail.util.vehicle.VehicleBase;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class ModelSpeederBike extends ModelBase
{
	ModelRenderer Seat;
	ModelRenderer Body_Back_Main;
	ModelRenderer Saddlebag_L;
	ModelRenderer Body_Under;
	ModelRenderer Body_Main2;
	ModelRenderer Saddlebag_R;
	ModelRenderer Seat_2;
	ModelRenderer Engine_Filler;
	ModelRenderer Back_Filler;
	ModelRenderer Back_Filler_2;
	ModelRenderer Engine_Filler_2;
	public ModelRenderer Flap_R;
	ModelRenderer Seat_3;
	ModelRenderer Seat_4;
	ModelRenderer Body_Under_2;
	ModelRenderer Laser_Tip;
	ModelRenderer Rod_L;
	public ModelRenderer Handle_R_1;
	public ModelRenderer Handle_R_2;
	public ModelRenderer Handle_R_3;
	ModelRenderer Body_Under_3;
	ModelRenderer Panel_R_1;
	ModelRenderer Panel_R_2;
	ModelRenderer Panel_R_3;
	ModelRenderer Panel_R_4;
	ModelRenderer Panel_L_1;
	ModelRenderer Panel_L_2;
	ModelRenderer Panel_L_3;
	ModelRenderer Panel_L_4;
	ModelRenderer Rod_R;
	ModelRenderer Laser_Rod;
	ModelRenderer Foot_R_1;
	ModelRenderer Foot_Rod;
	ModelRenderer Foot_R_2;
	ModelRenderer Foot_R_3;
	ModelRenderer Foot_L_2;
	ModelRenderer Foot_L_3;
	public ModelRenderer Handle_L_1;
	public ModelRenderer Handle_L_2;
	public ModelRenderer Handle_L_3;
	public ModelRenderer Flap_L;
	ModelRenderer Foot_L_1;
	ModelRenderer Body_Main;

	public ModelSpeederBike()
	{
		this.textureWidth = 256;
		this.textureHeight = 256;

		this.Seat = new ModelRenderer(this, 0, 0);
		this.Seat.addBox(-2F, -3.5F, -2.5F, 4, 2, 6);
		this.Seat.setRotationPoint(0F, 16F, 0F);
		this.Seat.setTextureSize(64, 32);
		this.Seat.mirror = true;
		this.setRotation(this.Seat, 0F, 0F, 0F);
		this.Body_Back_Main = new ModelRenderer(this, 0, 24);
		this.Body_Back_Main.addBox(-5.5F, -2F, 6.5F, 11, 5, 5);
		this.Body_Back_Main.setRotationPoint(0F, 15F, 0F);
		this.Body_Back_Main.setTextureSize(64, 32);
		this.Body_Back_Main.mirror = true;
		this.setRotation(this.Body_Back_Main, 0F, 0F, 0F);
		this.Saddlebag_L = new ModelRenderer(this, 0, 38);
		this.Saddlebag_L.addBox(3F, -2.5F, 4.5F, 4, 4, 8);
		this.Saddlebag_L.setRotationPoint(0F, 15F, 0F);
		this.Saddlebag_L.setTextureSize(64, 32);
		this.Saddlebag_L.mirror = true;
		this.setRotation(this.Saddlebag_L, 0F, 0F, 0F);
		this.Body_Under = new ModelRenderer(this, 0, 56);
		this.Body_Under.addBox(-3.5F, 0.5F, -0.5F, 7, 2, 10);
		this.Body_Under.setRotationPoint(0F, 15F, 0F);
		this.Body_Under.setTextureSize(64, 32);
		this.Body_Under.mirror = true;
		this.setRotation(this.Body_Under, 0F, 0F, 0F);
		this.Body_Main2 = new ModelRenderer(this, 0, 73);
		this.Body_Main2.addBox(-3F, -1F, -9.5F, 6, 2, 3);
		this.Body_Main2.setRotationPoint(0F, 15F, 0F);
		this.Body_Main2.setTextureSize(64, 32);
		this.Body_Main2.mirror = true;
		this.setRotation(this.Body_Main2, 0F, 0F, 0F);
		this.Saddlebag_R = new ModelRenderer(this, 0, 82);
		this.Saddlebag_R.addBox(-7F, -2.5F, 4.5F, 4, 4, 8);
		this.Saddlebag_R.setRotationPoint(0F, 15F, 0F);
		this.Saddlebag_R.setTextureSize(64, 32);
		this.Saddlebag_R.mirror = true;
		this.setRotation(this.Saddlebag_R, 0F, 0F, 0F);
		this.Seat_2 = new ModelRenderer(this, 0, 99);
		this.Seat_2.addBox(-2F, -7.75F, 2.85F, 4, 2, 4);
		this.Seat_2.setRotationPoint(0F, 15F, 0F);
		this.Seat_2.setTextureSize(64, 32);
		this.Seat_2.mirror = true;
		this.setRotation(this.Seat_2, -0.7853982F, 0F, 0F);
		this.Engine_Filler = new ModelRenderer(this, 0, 110);
		this.Engine_Filler.addBox(-3F, 2F, 8.5F, 6, 1, 5);
		this.Engine_Filler.setRotationPoint(0F, 15F, 0F);
		this.Engine_Filler.setTextureSize(64, 32);
		this.Engine_Filler.mirror = true;
		this.setRotation(this.Engine_Filler, 0F, 0F, 0F);
		this.Back_Filler = new ModelRenderer(this, 0, 121);
		this.Back_Filler.addBox(-5.5F, -2F, 8.5F, 3, 5, 5);
		this.Back_Filler.setRotationPoint(0F, 15F, 0F);
		this.Back_Filler.setTextureSize(64, 32);
		this.Back_Filler.mirror = true;
		this.setRotation(this.Back_Filler, 0F, 0F, 0F);
		this.Back_Filler_2 = new ModelRenderer(this, 0, 136);
		this.Back_Filler_2.addBox(2.5F, -2F, 8.5F, 3, 5, 5);
		this.Back_Filler_2.setRotationPoint(0F, 15F, 0F);
		this.Back_Filler_2.setTextureSize(64, 32);
		this.Back_Filler_2.mirror = true;
		this.setRotation(this.Back_Filler_2, 0F, 0F, 0F);
		this.Engine_Filler_2 = new ModelRenderer(this, 0, 150);
		this.Engine_Filler_2.addBox(-3F, -2F, 8.5F, 6, 1, 5);
		this.Engine_Filler_2.setRotationPoint(0F, 15F, 0F);
		this.Engine_Filler_2.setTextureSize(64, 32);
		this.Engine_Filler_2.mirror = true;
		this.setRotation(this.Engine_Filler_2, 0F, 0F, 0F);
		this.Flap_R = new ModelRenderer(this, 0, 160);
		this.Flap_R.addBox(-1.5F, 0F, 0F, 3, 5, 1);
		this.Flap_R.setRotationPoint(-4F, 13F, 13.5F);
		this.Flap_R.setTextureSize(64, 32);
		this.Flap_R.mirror = true;
		this.setRotation(this.Flap_R, 0.1396263F, 0F, 0F);
		this.Seat_3 = new ModelRenderer(this, 0, 171);
		this.Seat_3.addBox(-2F, -3.5F, 3.5F, 4, 3, 4);
		this.Seat_3.setRotationPoint(0F, 15F, 0F);
		this.Seat_3.setTextureSize(64, 32);
		this.Seat_3.mirror = true;
		this.setRotation(this.Seat_3, 0F, 0F, 0F);
		this.Seat_4 = new ModelRenderer(this, 0, 182);
		this.Seat_4.addBox(-2F, -0.025F, 0.95F, 4, 2, 4);
		this.Seat_4.setRotationPoint(0F, 15F, 0F);
		this.Seat_4.setTextureSize(64, 32);
		this.Seat_4.mirror = true;
		this.setRotation(this.Seat_4, 0.7853982F, 0F, 0F);
		this.Body_Under_2 = new ModelRenderer(this, 0, 192);
		this.Body_Under_2.addBox(-1.5F, -0.4F, -6.5F, 3, 3, 5);
		this.Body_Under_2.setRotationPoint(0F, 15F, 0F);
		this.Body_Under_2.setTextureSize(64, 32);
		this.Body_Under_2.mirror = true;
		this.setRotation(this.Body_Under_2, 0F, 0F, 0F);
		this.Laser_Tip = new ModelRenderer(this, 0, 204);
		this.Laser_Tip.addBox(-0.5F, -0.5F, -24F, 1, 1, 3);
		this.Laser_Tip.setRotationPoint(0F, 15F, 0F);
		this.Laser_Tip.setTextureSize(64, 32);
		this.Laser_Tip.mirror = true;
		this.setRotation(this.Laser_Tip, 0F, 0F, 0F);
		this.Rod_L = new ModelRenderer(this, 0, 214);
		this.Rod_L.addBox(1.5F, -0.5F, -25F, 1, 1, 18);
		this.Rod_L.setRotationPoint(0F, 15F, 0F);
		this.Rod_L.setTextureSize(64, 32);
		this.Rod_L.mirror = true;
		this.setRotation(this.Rod_L, 0F, 0F, 0F);
		this.Handle_R_1 = new ModelRenderer(this, 0, 238);
		this.Handle_R_1.addBox(-1F, -3.8F, -0.425F, 1, 4, 1);
		this.Handle_R_1.setRotationPoint(-4F, 14.7F, -4.5F);
		this.Handle_R_1.setTextureSize(64, 32);
		this.Handle_R_1.mirror = true;
		this.setRotation(this.Handle_R_1, 0.2094395F, 0F, 0F);
		this.Handle_R_2 = new ModelRenderer(this, 0, 248);
		this.Handle_R_2.addBox(-1F, -7.8F, -2.55F, 1, 5, 1);
		this.Handle_R_2.setRotationPoint(-4F, 14.7F, -4.5F);
		this.Handle_R_2.setTextureSize(64, 32);
		this.Handle_R_2.mirror = true;
		this.setRotation(this.Handle_R_2, -0.418879F, 0F, 0F);
		this.Handle_R_3 = new ModelRenderer(this, 58, 0);
		this.Handle_R_3.addBox(-1F, -6.5F, -2.55F, 3, 1, 1);
		this.Handle_R_3.setRotationPoint(-4F, 14.7F, -4.5F);
		this.Handle_R_3.setTextureSize(64, 32);
		this.Handle_R_3.mirror = true;
		this.setRotation(this.Handle_R_3, -0.418879F, 0F, 0F);
		this.Body_Under_3 = new ModelRenderer(this, 72, 0);
		this.Body_Under_3.addBox(-4F, -0.5F, -7.5F, 8, 2, 3);
		this.Body_Under_3.setRotationPoint(0F, 15F, 0F);
		this.Body_Under_3.setTextureSize(64, 32);
		this.Body_Under_3.mirror = true;
		this.setRotation(this.Body_Under_3, 0F, 0F, 0F);
		this.Panel_R_1 = new ModelRenderer(this, 100, 0);
		this.Panel_R_1.addBox(-3.25F, 0F, -26.5F, 1, 2, 2);
		this.Panel_R_1.setRotationPoint(0F, 15F, 0F);
		this.Panel_R_1.setTextureSize(64, 32);
		this.Panel_R_1.mirror = true;
		this.setRotation(this.Panel_R_1, 0F, 0F, 0.2094395F);
		this.Panel_R_2 = new ModelRenderer(this, 112, 0);
		this.Panel_R_2.addBox(-2.35F, 0F, -28F, 1, 2, 5);
		this.Panel_R_2.setRotationPoint(0F, 15F, 0F);
		this.Panel_R_2.setTextureSize(64, 32);
		this.Panel_R_2.mirror = true;
		this.setRotation(this.Panel_R_2, 0F, 0F, -0.1047198F);
		this.Panel_R_3 = new ModelRenderer(this, 129, 0);
		this.Panel_R_3.addBox(-3.25F, -2F, -25F, 1, 4, 2);
		this.Panel_R_3.setRotationPoint(0F, 15F, 0F);
		this.Panel_R_3.setTextureSize(64, 32);
		this.Panel_R_3.mirror = true;
		this.setRotation(this.Panel_R_3, 0F, 0F, 0.2094395F);
		this.Panel_R_4 = new ModelRenderer(this, 142, 0);
		this.Panel_R_4.addBox(-3.25F, -2F, -25.25F, 1, 4, 1);
		this.Panel_R_4.setRotationPoint(0F, 15F, 0F);
		this.Panel_R_4.setTextureSize(64, 32);
		this.Panel_R_4.mirror = true;
		this.setRotation(this.Panel_R_4, 0F, 0F, 0.2094395F);
		this.Panel_L_1 = new ModelRenderer(this, 151, 0);
		this.Panel_L_1.addBox(2.25F, -2F, -25F, 1, 4, 2);
		this.Panel_L_1.setRotationPoint(0F, 15F, 0F);
		this.Panel_L_1.setTextureSize(64, 32);
		this.Panel_L_1.mirror = true;
		this.setRotation(this.Panel_L_1, 0F, 0F, -0.2094395F);
		this.Panel_L_2 = new ModelRenderer(this, 161, 0);
		this.Panel_L_2.addBox(2.25F, -2F, -25.25F, 1, 4, 1);
		this.Panel_L_2.setRotationPoint(0F, 15F, 0F);
		this.Panel_L_2.setTextureSize(64, 32);
		this.Panel_L_2.mirror = true;
		this.setRotation(this.Panel_L_2, 0F, 0F, -0.2094395F);
		this.Panel_L_3 = new ModelRenderer(this, 169, 0);
		this.Panel_L_3.addBox(2.25F, 0F, -26.5F, 1, 2, 2);
		this.Panel_L_3.setRotationPoint(0F, 15F, 0F);
		this.Panel_L_3.setTextureSize(64, 32);
		this.Panel_L_3.mirror = true;
		this.setRotation(this.Panel_L_3, 0F, 0F, -0.2094395F);
		this.Panel_L_4 = new ModelRenderer(this, 180, 0);
		this.Panel_L_4.addBox(1.35F, 0F, -28F, 1, 2, 5);
		this.Panel_L_4.setRotationPoint(0F, 15F, 0F);
		this.Panel_L_4.setTextureSize(64, 32);
		this.Panel_L_4.mirror = true;
		this.setRotation(this.Panel_L_4, 0F, 0F, 0.1047198F);
		this.Rod_R = new ModelRenderer(this, 198, 0);
		this.Rod_R.addBox(-2.5F, -0.5F, -25F, 1, 1, 18);
		this.Rod_R.setRotationPoint(0F, 15F, 0F);
		this.Rod_R.setTextureSize(64, 32);
		this.Rod_R.mirror = true;
		this.setRotation(this.Rod_R, 0F, 0F, 0F);
		this.Laser_Rod = new ModelRenderer(this, 41, 25);
		this.Laser_Rod.addBox(-2.5F, -0.5F, -22F, 5, 1, 1);
		this.Laser_Rod.setRotationPoint(0F, 15F, 0F);
		this.Laser_Rod.setTextureSize(64, 32);
		this.Laser_Rod.mirror = true;
		this.setRotation(this.Laser_Rod, 0F, 0F, 0F);
		this.Foot_R_1 = new ModelRenderer(this, 41, 34);
		this.Foot_R_1.addBox(-7.5F, 1.8F, -1.5F, 2, 1, 4);
		this.Foot_R_1.setRotationPoint(0F, 15F, 0F);
		this.Foot_R_1.setTextureSize(64, 32);
		this.Foot_R_1.mirror = true;
		this.setRotation(this.Foot_R_1, 0.2094395F, 0F, 0F);
		this.Foot_Rod = new ModelRenderer(this, 41, 45);
		this.Foot_Rod.addBox(-7F, 2F, 5F, 14, 1, 1);
		this.Foot_Rod.setRotationPoint(0F, 15F, 0F);
		this.Foot_Rod.setTextureSize(64, 32);
		this.Foot_Rod.mirror = true;
		this.setRotation(this.Foot_Rod, 0F, 0F, 0F);
		this.Foot_R_2 = new ModelRenderer(this, 41, 54);
		this.Foot_R_2.addBox(6F, 3F, -0.5F, 1, 1, 5);
		this.Foot_R_2.setRotationPoint(0F, 15F, 0F);
		this.Foot_R_2.setTextureSize(64, 32);
		this.Foot_R_2.mirror = true;
		this.setRotation(this.Foot_R_2, 0.2094395F, 0F, 0F);
		this.Foot_R_3 = new ModelRenderer(this, 41, 64);
		this.Foot_R_3.addBox(-7F, 2.5F, -0.5F, 1, 1, 1);
		this.Foot_R_3.setRotationPoint(0F, 15F, 0F);
		this.Foot_R_3.setTextureSize(64, 32);
		this.Foot_R_3.mirror = true;
		this.setRotation(this.Foot_R_3, 0.2094395F, 0F, 0F);
		this.Foot_L_2 = new ModelRenderer(this, 41, 74);
		this.Foot_L_2.addBox(6F, 2.5F, -0.5F, 1, 1, 1);
		this.Foot_L_2.setRotationPoint(0F, 15F, 0F);
		this.Foot_L_2.setTextureSize(64, 32);
		this.Foot_L_2.mirror = true;
		this.setRotation(this.Foot_L_2, 0.2094395F, 0F, 0F);
		this.Foot_L_3 = new ModelRenderer(this, 41, 82);
		this.Foot_L_3.addBox(5.5F, 1.8F, -1.5F, 2, 1, 4);
		this.Foot_L_3.setRotationPoint(0F, 15F, 0F);
		this.Foot_L_3.setTextureSize(64, 32);
		this.Foot_L_3.mirror = true;
		this.setRotation(this.Foot_L_3, 0.2094395F, 0F, 0F);
		this.Handle_L_1 = new ModelRenderer(this, 41, 93);
		this.Handle_L_1.addBox(0F, -3.8F, -0.425F, 1, 4, 1);
		this.Handle_L_1.setRotationPoint(4F, 14.7F, -4.5F);
		this.Handle_L_1.setTextureSize(64, 32);
		this.Handle_L_1.mirror = true;
		this.setRotation(this.Handle_L_1, 0.2094395F, 0F, 0F);
		this.Handle_L_2 = new ModelRenderer(this, 41, 102);
		this.Handle_L_2.addBox(0F, -7.8F, -2.55F, 1, 5, 1);
		this.Handle_L_2.setRotationPoint(4F, 14.7F, -4.5F);
		this.Handle_L_2.setTextureSize(64, 32);
		this.Handle_L_2.mirror = true;
		this.setRotation(this.Handle_L_2, -0.418879F, 0F, 0F);
		this.Handle_L_3 = new ModelRenderer(this, 41, 113);
		this.Handle_L_3.addBox(-2F, -6.5F, -2.55F, 3, 1, 1);
		this.Handle_L_3.setRotationPoint(4F, 14.7F, -4.5F);
		this.Handle_L_3.setTextureSize(64, 32);
		this.Handle_L_3.mirror = true;
		this.setRotation(this.Handle_L_3, -0.418879F, 0F, 0F);
		this.Flap_L = new ModelRenderer(this, 41, 122);
		this.Flap_L.addBox(-1.5F, 0F, 0F, 3, 5, 1);
		this.Flap_L.setRotationPoint(4F, 13F, 13.5F);
		this.Flap_L.setTextureSize(64, 32);
		this.Flap_L.mirror = true;
		this.setRotation(this.Flap_L, 0.1396263F, 0F, 0F);
		this.Foot_L_1 = new ModelRenderer(this, 41, 134);
		this.Foot_L_1.addBox(-7F, 3F, -0.5F, 1, 1, 5);
		this.Foot_L_1.setRotationPoint(0F, 15F, 0F);
		this.Foot_L_1.setTextureSize(64, 32);
		this.Foot_L_1.mirror = true;
		this.setRotation(this.Foot_L_1, 0.2094395F, 0F, 0F);
		this.Body_Main = new ModelRenderer(this, 41, 146);
		this.Body_Main.addBox(-4F, -1.5F, -7.5F, 8, 2, 19);
		this.Body_Main.setRotationPoint(0F, 15F, 0F);
		this.Body_Main.setTextureSize(64, 32);
		this.Body_Main.mirror = true;
		this.setRotation(this.Body_Main, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (entity instanceof VehicleBase && entity.riddenByEntity instanceof EntityPlayer)
		{
			VehicleBase vb = (VehicleBase)entity;
			float s = ((EntityPlayer)entity.riddenByEntity).moveForward / 5f;

			float rL = 0.2f * (vb.tilt / vb.tiltMax);
			float rR = -0.2f * (vb.tilt / vb.tiltMax);

			this.Handle_R_1.rotateAngleX = 0.2094395F + s + rL;
			this.Handle_R_2.rotateAngleX = -0.418879F + s + rL;
			this.Handle_R_3.rotateAngleX = -0.418879F + s + rL;
			this.Handle_L_1.rotateAngleX = 0.2094395F + rR;
			this.Handle_L_2.rotateAngleX = -0.418879F + rR;
			this.Handle_L_3.rotateAngleX = -0.418879F + rR;

			this.Flap_L.rotateAngleX = (vb.tilt > 0) ? 0.4f * (vb.tilt / vb.tiltMax) : 0;
			this.Flap_R.rotateAngleX = (vb.tilt <= 0) ? -0.4f * (vb.tilt / vb.tiltMax) : 0;
		}
		else
		{
			this.Handle_R_1.rotateAngleX = 0.2094395F;
			this.Handle_R_2.rotateAngleX = -0.418879F;
			this.Handle_R_3.rotateAngleX = -0.418879F;
			this.Handle_L_1.rotateAngleX = 0.2094395F;
			this.Handle_L_2.rotateAngleX = -0.418879F;
			this.Handle_L_3.rotateAngleX = -0.418879F;
			this.Flap_L.rotateAngleX = 0.1396263F;
			this.Flap_R.rotateAngleX = 0.1396263F;
		}

		this.Seat.render(f5);
		this.Body_Back_Main.render(f5);
		this.Saddlebag_L.render(f5);
		this.Body_Under.render(f5);
		this.Body_Main2.render(f5);
		this.Saddlebag_R.render(f5);
		this.Seat_2.render(f5);
		this.Engine_Filler.render(f5);
		this.Back_Filler.render(f5);
		this.Back_Filler_2.render(f5);
		this.Engine_Filler_2.render(f5);
		this.Flap_R.render(f5);
		this.Seat_3.render(f5);
		this.Seat_4.render(f5);
		this.Body_Under_2.render(f5);
		this.Laser_Tip.render(f5);
		this.Rod_L.render(f5);
		this.Handle_R_1.render(f5);
		this.Handle_R_2.render(f5);
		this.Handle_R_3.render(f5);
		this.Body_Under_3.render(f5);
		this.Panel_R_1.render(f5);
		this.Panel_R_2.render(f5);
		this.Panel_R_3.render(f5);
		this.Panel_R_4.render(f5);
		this.Panel_L_1.render(f5);
		this.Panel_L_2.render(f5);
		this.Panel_L_3.render(f5);
		this.Panel_L_4.render(f5);
		this.Rod_R.render(f5);
		this.Laser_Rod.render(f5);
		this.Foot_R_1.render(f5);
		this.Foot_Rod.render(f5);
		this.Foot_R_2.render(f5);
		this.Foot_R_3.render(f5);
		this.Foot_L_2.render(f5);
		this.Foot_L_3.render(f5);
		this.Handle_L_1.render(f5);
		this.Handle_L_2.render(f5);
		this.Handle_L_3.render(f5);
		this.Flap_L.render(f5);
		this.Foot_L_1.render(f5);
		this.Body_Main.render(f5);
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
