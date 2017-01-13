package com.parzivail.pswm.models.ship;

import com.parzivail.pswm.PSWM;
import com.parzivail.pswm.vehicle.VehicXWing;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

/**
 * X-Wing - Undefined
 * Created using Tabula 4.1.1
 */
public class ModelXWingNew extends ModelBase
{
	public ModelRenderer MainParent;
	public ModelRenderer shape1;
	public ModelRenderer shape1_1;
	public ModelRenderer shape1_2;
	public ModelRenderer shape1_3;
	public ModelRenderer shape1_4;
	public ModelRenderer shape1_5;
	public ModelRenderer shape1_6;
	public ModelRenderer shape1_7;
	public ModelRenderer shape1_8;
	public ModelRenderer shape1_9;
	public ModelRenderer shape1_10;
	public ModelRenderer WingLTopParent;
	public ModelRenderer shape1_11;
	public ModelRenderer shape1_12;
	public ModelRenderer shape1_13;
	public ModelRenderer shape1_14;
	public ModelRenderer shape1_15;
	public ModelRenderer shape1_16;
	public ModelRenderer shape1_17;
	public ModelRenderer shape1_18;
	public ModelRenderer shape1_19;
	public ModelRenderer shape1_20;
	public ModelRenderer shape1_21;
	public ModelRenderer shape1_22;
	public ModelRenderer shape1_23;
	public ModelRenderer shape1_24;
	public ModelRenderer shape1_25;
	public ModelRenderer shape1_26;
	public ModelRenderer shape1_27;
	public ModelRenderer shape1_28;
	public ModelRenderer shape1_29;
	public ModelRenderer shape1_30;
	public ModelRenderer shape1_31;
	public ModelRenderer shape1_32;
	public ModelRenderer shape1_33;
	public ModelRenderer shape1_34;
	public ModelRenderer shape1_35;
	public ModelRenderer shape1_36;
	public ModelRenderer shape1_37;
	public ModelRenderer shape1_38;
	public ModelRenderer shape1_39;
	public ModelRenderer shape1_40;
	public ModelRenderer shape1_41;
	public ModelRenderer shape1_42;
	public ModelRenderer shape1_43;
	public ModelRenderer shape1_44;
	public ModelRenderer shape1_45;
	public ModelRenderer shape1_46;
	public ModelRenderer shape1_47;
	public ModelRenderer shape1_48;
	public ModelRenderer shape1_49;
	public ModelRenderer shape1_50;
	public ModelRenderer shape1_51;
	public ModelRenderer shape1_52;
	public ModelRenderer shape1_53;
	public ModelRenderer shape1_54;
	public ModelRenderer shape1_55;
	public ModelRenderer shape1_56;
	public ModelRenderer shape1_57;
	public ModelRenderer WingLBottomParent;
	public ModelRenderer WingRTopParent;
	public ModelRenderer WingRBottomParent;
	public ModelRenderer Gear1;
	public ModelRenderer Gear2;
	public ModelRenderer Gear3;
	public ModelRenderer Gear4;
	public ModelRenderer Gear5;
	public ModelRenderer Gear6;
	public ModelRenderer shape1_58;
	public ModelRenderer shape1_59;
	public ModelRenderer shape1_60;
	public ModelRenderer shape1_61;
	public ModelRenderer shape1_62;
	public ModelRenderer shape1_63;
	public ModelRenderer shape1_64;
	public ModelRenderer shape1_65;
	public ModelRenderer shape1_66;
	public ModelRenderer shape1_67;
	public ModelRenderer shape1_68;
	public ModelRenderer shape1_69;
	public ModelRenderer shape1_70;
	public ModelRenderer shape1_71;
	public ModelRenderer shape1_72;
	public ModelRenderer shape1_73;
	public ModelRenderer shape1_74;
	public ModelRenderer shape1_75;
	public ModelRenderer shape1_76;
	public ModelRenderer shape1_77;
	public ModelRenderer shape1_78;
	public ModelRenderer shape1_79;
	public ModelRenderer shape1_80;
	public ModelRenderer shape1_81;
	public ModelRenderer shape1_82;
	public ModelRenderer shape1_83;
	public ModelRenderer shape1_84;
	public ModelRenderer shape1_85;
	public ModelRenderer shape1_86;
	public ModelRenderer shape1_87;
	public ModelRenderer shape1_88;
	public ModelRenderer shape1_89;
	public ModelRenderer shape1_90;
	public ModelRenderer shape1_91;
	public ModelRenderer shape1_92;
	public ModelRenderer shape1_93;
	public ModelRenderer shape1_94;
	public ModelRenderer shape1_95;
	public ModelRenderer shape1_96;
	public ModelRenderer shape1_97;
	public ModelRenderer shape1_98;
	public ModelRenderer shape1_99;
	public ModelRenderer shape1_100;
	public ModelRenderer shape1_101;
	public ModelRenderer shape1_102;
	public ModelRenderer shape1_103;
	public ModelRenderer shape1_104;
	public ModelRenderer shape1_105;
	public ModelRenderer shape1_106;
	public ModelRenderer shape1_107;
	public ModelRenderer shape1_108;
	public ModelRenderer shape1_109;
	public ModelRenderer shape1_110;
	public ModelRenderer shape1_111;
	public ModelRenderer shape1_112;
	public ModelRenderer shape1_113;
	public ModelRenderer shape1_114;

	public ModelXWingNew()
	{
		this.textureWidth = 512;
		this.textureHeight = 512;
		this.shape1_87 = new ModelRenderer(this, 202, 78);
		this.shape1_87.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_87.addBox(7.4F, -5.5F, -6.2F, 6, 6, 9, 0.0F);
		this.shape1_40 = new ModelRenderer(this, 0, 370);
		this.shape1_40.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_40.addBox(-9.05F, -7.7F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_40, 0.06632251157578452F, -0.03490658503988659F, 1.3089969389957472F);
		this.shape1_5 = new ModelRenderer(this, 442, 34);
		this.shape1_5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_5.addBox(-6.87F, 4.0F, 4.0F, 6, 1, 28, 0.0F);
		this.setRotateAngle(shape1_5, 0.0F, 0.0F, 1.2740903539558606F);
		this.shape1_26 = new ModelRenderer(this, 0, 370);
		this.shape1_26.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_26.addBox(1.0F, -10.8F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_26, 0.05235987755982988F, 0.05235987755982988F, 0.0F);
		this.shape1_20 = new ModelRenderer(this, 384, 60);
		this.shape1_20.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_20.addBox(-2.9F, -16.22F, 1.6F, 6, 5, 13, 0.0F);
		this.setRotateAngle(shape1_20, -0.3141592653589793F, 0.0F, 0.0F);
		this.shape1_51 = new ModelRenderer(this, 251, 306);
		this.shape1_51.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_51.addBox(-3.75F, -4.95F, -53.4F, 2, 1, 58, 0.0F);
		this.setRotateAngle(shape1_51, 0.06981317007977318F, 0.03490658503988659F, 1.8325957145940461F);
		this.shape1_100 = new ModelRenderer(this, 169, 149);
		this.shape1_100.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_100.addBox(32.25F, -2.0F, -4.0F, 1, 2, 8, 0.0F);
		this.shape1_89 = new ModelRenderer(this, 161, 91);
		this.shape1_89.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_89.addBox(31.3F, -4.0F, -5.0F, 3, 3, 10, 0.0F);
		this.shape1_71 = new ModelRenderer(this, 0, 198);
		this.shape1_71.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_71.addBox(-33.25F, -1.0F, -42.5F, 1, 1, 3, 0.0F);
		this.shape1_111 = new ModelRenderer(this, 288, 96);
		this.shape1_111.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_111.addBox(32.3F, 2.5F, -40.5F, 1, 3, 1, 0.0F);
		this.shape1_54 = new ModelRenderer(this, 0, 370);
		this.shape1_54.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_54.addBox(-5.5F, 3.8F, -53.4F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_54, -0.059341194567807204F, 0.0F, 1.2915436464758039F);
		this.shape1_106 = new ModelRenderer(this, 270, 98);
		this.shape1_106.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_106.addBox(31.3F, 2.5F, -8.4F, 3, 3, 2, 0.0F);
		this.shape1_61 = new ModelRenderer(this, 0, 112);
		this.shape1_61.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_61.addBox(-12.4F, -6.5F, 1.8F, 4, 4, 20, 0.0F);
		this.shape1_46 = new ModelRenderer(this, 0, 370);
		this.shape1_46.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_46.addBox(6.44F, -7.58F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_46, 0.060562925044203235F, 0.019198621771937624F, -1.3089969389957472F);
		this.shape1_88 = new ModelRenderer(this, 170, 87);
		this.shape1_88.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_88.addBox(8.4F, -6.5F, 1.8F, 4, 4, 20, 0.0F);
		this.shape1_62 = new ModelRenderer(this, 0, 138);
		this.shape1_62.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_62.addBox(-17.0F, -1.5F, -4.0F, 13, 1, 8, 0.0F);
		this.shape1_2 = new ModelRenderer(this, 220, 0);
		this.shape1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_2.addBox(-0.14F, 0.46F, 4.0F, 5, 1, 28, 0.0F);
		this.setRotateAngle(shape1_2, 0.0F, 0.0F, -0.17453292519943295F);
		this.shape1_58 = new ModelRenderer(this, 0, 75);
		this.shape1_58.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_58.addBox(-14.0F, -0.5F, -2.25F, 2, 1, 10, 0.0F);
		this.shape1_81 = new ModelRenderer(this, 90, 142);
		this.shape1_81.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_81.addBox(-33.25F, 1.9F, -42.5F, 1, 1, 3, 0.0F);
		this.shape1_41 = new ModelRenderer(this, 0, 370);
		this.shape1_41.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_41.addBox(8.14F, -7.58F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_41, 0.060562925044203235F, 0.03665191429188092F, -1.3089969389957472F);
		this.shape1_9 = new ModelRenderer(this, 122, 451);
		this.shape1_9.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_9.addBox(7.26F, -0.13F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_9, -0.05235987755982988F, 0.05235987755982988F, -0.7853981633974483F);
		this.shape1_80 = new ModelRenderer(this, 78, 138);
		this.shape1_80.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_80.addBox(-33.25F, 3.9F, -45.0F, 1, 1, 29, 0.0F);
		this.shape1_34 = new ModelRenderer(this, 127, 306);
		this.shape1_34.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_34.addBox(-6.35F, -7.7F, -53.4F, 2, 1, 58, 0.0F);
		this.setRotateAngle(shape1_34, 0.06632251157578452F, 0.0F, 1.3089969389957472F);
		this.shape1_36 = new ModelRenderer(this, 0, 370);
		this.shape1_36.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_36.addBox(-4.75F, -7.7F, -53.4F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_36, 0.06632251157578452F, 0.017453292519943295F, 1.3089969389957472F);
		this.shape1_47 = new ModelRenderer(this, 0, 370);
		this.shape1_47.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_47.addBox(3.34F, -7.58F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_47, 0.060562925044203235F, -0.015707963267948967F, -1.3089969389957472F);
		this.shape1_91 = new ModelRenderer(this, 216, 96);
		this.shape1_91.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_91.addBox(31.3F, -4.0F, -8.4F, 3, 3, 2, 0.0F);
		this.Gear6 = new ModelRenderer(this, 35, 40);
		this.Gear6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Gear6.addBox(-13.8F, 7.0F, 13.5F, 9, 2, 6, 0.0F);
		this.shape1_29 = new ModelRenderer(this, 0, 370);
		this.shape1_29.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_29.addBox(-2.0F, -10.8F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_29, 0.05235987755982988F, -0.05235987755982988F, 0.0F);
		this.shape1_68 = new ModelRenderer(this, 0, 210);
		this.shape1_68.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_68.addBox(-33.25F, -3.0F, -45.0F, 1, 1, 29, 0.0F);
		this.shape1_21 = new ModelRenderer(this, 0, 495);
		this.shape1_21.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_21.addBox(-3.4F, -12.1F, -54.4F, 7, 7, 3, 0.0F);
		this.setRotateAngle(shape1_21, 0.06981317007977318F, 0.0F, 0.0F);
		this.shape1_16 = new ModelRenderer(this, 460, 205);
		this.shape1_16.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_16.addBox(-3.04F, -9.54F, 29.0F, 6, 7, 2, 0.0F);
		this.shape1_28 = new ModelRenderer(this, 0, 370);
		this.shape1_28.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_28.addBox(-3.0F, -10.8F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_28, 0.05235987755982988F, -0.05235987755982988F, 0.0F);
		this.shape1_64 = new ModelRenderer(this, 0, 162);
		this.shape1_64.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_64.addBox(-34.25F, -4.0F, -5.0F, 3, 3, 10, 0.0F);
		this.shape1_79 = new ModelRenderer(this, 80, 117);
		this.shape1_79.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_79.addBox(-33.25F, 2.0F, -4.0F, 1, 2, 8, 0.0F);
		this.shape1_13 = new ModelRenderer(this, 456, 134);
		this.shape1_13.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_13.addBox(-5.74F, -8.84F, 4.0F, 1, 7, 26, 0.0F);
		this.shape1_104 = new ModelRenderer(this, 286, 94);
		this.shape1_104.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_104.addBox(31.3F, 2.5F, -5.0F, 3, 3, 10, 0.0F);
		this.shape1_3 = new ModelRenderer(this, 150, 0);
		this.shape1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_3.addBox(-4.64F, 0.43F, 4.0F, 5, 1, 28, 0.0F);
		this.setRotateAngle(shape1_3, 0.0F, 0.0F, 0.17453292519943295F);
		this.shape1_25 = new ModelRenderer(this, 0, 370);
		this.shape1_25.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_25.addBox(2.0F, -10.8F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_25, 0.05235987755982988F, 0.05235987755982988F, 0.0F);
		this.Gear5 = new ModelRenderer(this, 35, 20);
		this.Gear5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Gear5.addBox(4.7F, 7.0F, 13.5F, 9, 2, 6, 0.0F);
		this.shape1_63 = new ModelRenderer(this, 0, 150);
		this.shape1_63.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_63.addBox(-33.25F, -1.5F, -4.0F, 1, 2, 8, 0.0F);
		this.shape1_24 = new ModelRenderer(this, 0, 370);
		this.shape1_24.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_24.addBox(3.0F, -10.8F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_24, 0.05235987755982988F, 0.05235987755982988F, 0.0F);
		this.shape1_31 = new ModelRenderer(this, 0, 306);
		this.shape1_31.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_31.addBox(-2.0F, -0.8F, -53.1F, 4, 1, 58, 0.0F);
		this.setRotateAngle(shape1_31, -0.05235987755982988F, 0.0F, 0.0F);
		this.shape1_32 = new ModelRenderer(this, 0, 244);
		this.shape1_32.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_32.addBox(-4.3F, -0.74F, -53.1F, 3, 1, 58, 0.0F);
		this.setRotateAngle(shape1_32, -0.05235987755982988F, -0.05235987755982988F, 0.0F);
		this.shape1_112 = new ModelRenderer(this, 280, 180);
		this.shape1_112.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_112.addBox(12.8F, 1.1F, 6.66F, 20, 1, 3, 0.0F);
		this.setRotateAngle(shape1_112, 0.0F, 0.13788101090755206F, 0.0F);
		this.shape1_74 = new ModelRenderer(this, 120, 77);
		this.shape1_74.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_74.addBox(-12.4F, 4.4F, 1.8F, 4, 4, 15, 0.0F);
		this.shape1_97 = new ModelRenderer(this, 176, 125);
		this.shape1_97.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_97.addBox(32.3F, -4.0F, -40.5F, 1, 3, 1, 0.0F);
		this.MainParent = new ModelRenderer(this, 434, 0);
		this.MainParent.setRotationPoint(0.0F, 15.0F, 0.0F);
		this.MainParent.addBox(-5.0F, -11.0F, 4.0F, 10, 1, 28, 0.0F);
		this.Gear4 = new ModelRenderer(this, 35, 0);
		this.Gear4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Gear4.addBox(-17.5F, -4.0F, -13.0F, 2, 2, 12, 0.0F);
		this.setRotateAngle(Gear4, 0.9250245035569946F, -4.71238898038469F, 0.0F);
		this.shape1_15 = new ModelRenderer(this, 456, 202);
		this.shape1_15.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_15.addBox(4.16F, -10.54F, 4.0F, 1, 10, 26, 0.0F);
		this.shape1_103 = new ModelRenderer(this, 240, 92);
		this.shape1_103.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_103.addBox(8.4F, 4.0F, 1.8F, 4, 4, 15, 0.0F);
		this.shape1_12 = new ModelRenderer(this, 440, 103);
		this.shape1_12.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_12.addBox(-4.54F, -3.54F, 4.0F, 9, 4, 26, 0.0F);
		this.shape1_69 = new ModelRenderer(this, 13, 180);
		this.shape1_69.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_69.addBox(-33.25F, -5.0F, -40.5F, 1, 5, 1, 0.0F);
		this.shape1_10 = new ModelRenderer(this, 242, 451);
		this.shape1_10.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_10.addBox(-4.83F, -1.9F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_10, -0.03665191429188092F, -0.059341194567807204F, -0.2617993877991494F);
		this.shape1_57 = new ModelRenderer(this, 390, 306);
		this.shape1_57.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_57.addBox(4.55F, -7.61F, -53.4F, 2, 1, 58, 0.0F);
		this.setRotateAngle(shape1_57, 0.060562925044203235F, 0.0F, -1.3089969389957472F);
		this.shape1_113 = new ModelRenderer(this, 270, 118);
		this.shape1_113.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_113.addBox(12.0F, 1.1F, -2.2F, 2, 1, 10, 0.0F);
		this.shape1_19 = new ModelRenderer(this, 384, 32);
		this.shape1_19.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_19.addBox(-2.9F, -12.9F, -10.0F, 6, 5, 20, 0.0F);
		this.setRotateAngle(shape1_19, 0.24434609527920614F, 0.0F, 0.0F);
		this.Gear3 = new ModelRenderer(this, 0, 34);
		this.Gear3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Gear3.addBox(15.5F, -4.0F, -13.0F, 2, 2, 12, 0.0F);
		this.setRotateAngle(Gear3, 0.9250245035569946F, -1.5707963267948966F, 0.0F);
		this.shape1_55 = new ModelRenderer(this, 251, 306);
		this.shape1_55.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_55.addBox(-6.9F, 3.8F, -53.4F, 2, 1, 58, 0.0F);
		this.setRotateAngle(shape1_55, -0.059341194567807204F, -0.017453292519943295F, 1.2915436464758039F);
		this.shape1_70 = new ModelRenderer(this, 13, 188);
		this.shape1_70.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_70.addBox(-33.25F, -5.0F, -42.5F, 1, 1, 3, 0.0F);
		this.shape1_56 = new ModelRenderer(this, 389, 241);
		this.shape1_56.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_56.addBox(-6.35F, -7.72F, -53.4F, 2, 1, 58, 0.0F);
		this.setRotateAngle(shape1_56, 0.06632251157578452F, 0.0F, 1.3089969389957472F);
		this.shape1_66 = new ModelRenderer(this, 0, 180);
		this.shape1_66.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_66.addBox(-34.25F, -4.0F, 5.7F, 3, 3, 2, 0.0F);
		this.shape1_107 = new ModelRenderer(this, 270, 112);
		this.shape1_107.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_107.addBox(31.8F, 3.0F, -20.0F, 2, 2, 26, 0.0F);
		this.WingRBottomParent = new ModelRenderer(this, 236, 62);
		this.WingRBottomParent.setRotationPoint(0.0F, -6.0F, 18.0F);
		this.WingRBottomParent.addBox(5.79F, 1.1F, -5.0F, 28, 1, 10, 0.0F);
		this.shape1_102 = new ModelRenderer(this, 290, 76);
		this.shape1_102.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_102.addBox(7.4F, 1.1F, -6.2F, 6, 6, 9, 0.0F);
		this.shape1_23 = new ModelRenderer(this, 0, 478);
		this.shape1_23.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_23.addBox(-3.4F, -8.0F, -54.4F, 7, 3, 8, 0.0F);
		this.setRotateAngle(shape1_23, 0.06981317007977318F, 0.0F, 0.0F);
		this.shape1_8 = new ModelRenderer(this, 1, 451);
		this.shape1_8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_8.addBox(-0.89F, -8.18F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_8, 0.05235987755982988F, -0.05235987755982988F, -0.7853981633974483F);
		this.shape1_78 = new ModelRenderer(this, 76, 106);
		this.shape1_78.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_78.addBox(-33.75F, 3.4F, -20.0F, 2, 2, 26, 0.0F);
		this.shape1_108 = new ModelRenderer(this, 270, 145);
		this.shape1_108.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_108.addBox(32.3F, 3.5F, -45.0F, 1, 1, 29, 0.0F);
		this.shape1_114 = new ModelRenderer(this, 169, 182);
		this.shape1_114.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_114.addBox(32.25F, 2.0F, -4.0F, 1, 2, 8, 0.0F);
		this.shape1_59 = new ModelRenderer(this, 0, 89);
		this.shape1_59.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_59.addBox(-32.7F, -0.5F, 6.6F, 20, 1, 3, 0.0F);
		this.setRotateAngle(shape1_59, 0.0F, -0.13788101090755206F, 0.0F);
		this.shape1_110 = new ModelRenderer(this, 246, 100);
		this.shape1_110.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_110.addBox(32.3F, 5.5F, -42.5F, 1, 1, 3, 0.0F);
		this.shape1_6 = new ModelRenderer(this, 391, 451);
		this.shape1_6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_6.addBox(-4.9F, -10.8F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_6, 0.05235987755982988F, -0.05235987755982988F, 0.0F);
		this.shape1_93 = new ModelRenderer(this, 162, 114);
		this.shape1_93.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_93.addBox(31.8F, -3.5F, -20.0F, 2, 2, 26, 0.0F);
		this.shape1_73 = new ModelRenderer(this, 84, 88);
		this.shape1_73.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_73.addBox(-13.4F, 1.5F, -6.2F, 6, 6, 9, 0.0F);
		this.shape1_27 = new ModelRenderer(this, 0, 370);
		this.shape1_27.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_27.addBox(-4.0F, -10.8F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_27, 0.05235987755982988F, -0.05235987755982988F, 0.0F);
		this.shape1_35 = new ModelRenderer(this, 0, 370);
		this.shape1_35.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_35.addBox(-4.35F, -7.7F, -53.4F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_35, 0.06632251157578452F, 0.017453292519943295F, 1.3089969389957472F);
		this.shape1_72 = new ModelRenderer(this, 82, 76);
		this.shape1_72.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_72.addBox(-17.0F, 2.5F, -4.0F, 13, 1, 8, 0.0F);
		this.shape1_92 = new ModelRenderer(this, 196, 104);
		this.shape1_92.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_92.addBox(31.8F, -3.5F, -20.0F, 2, 2, 26, 0.0F);
		this.shape1_105 = new ModelRenderer(this, 270, 90);
		this.shape1_105.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_105.addBox(31.3F, 2.5F, 5.7F, 3, 3, 2, 0.0F);
		this.WingLTopParent = new ModelRenderer(this, 0, 62);
		this.WingLTopParent.setRotationPoint(0.0F, -6.0F, 18.0F);
		this.WingLTopParent.addBox(-33.79F, -0.5F, -5.0F, 28, 1, 10, 0.0F);
		this.shape1_76 = new ModelRenderer(this, 88, 106);
		this.shape1_76.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_76.addBox(-34.25F, 2.9F, 5.7F, 3, 3, 2, 0.0F);
		this.shape1_95 = new ModelRenderer(this, 200, 117);
		this.shape1_95.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_95.addBox(32.3F, -5.0F, -42.5F, 1, 1, 3, 0.0F);
		this.shape1_42 = new ModelRenderer(this, 0, 370);
		this.shape1_42.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_42.addBox(7.14F, -7.58F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_42, 0.060562925044203235F, 0.03665191429188092F, -1.3089969389957472F);
		this.shape1_77 = new ModelRenderer(this, 136, 100);
		this.shape1_77.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_77.addBox(-34.25F, 2.9F, -8.4F, 3, 3, 2, 0.0F);
		this.shape1_7 = new ModelRenderer(this, 391, 388);
		this.shape1_7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_7.addBox(4.0F, -10.8F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_7, 0.05235987755982988F, 0.05235987755982988F, 0.0F);
		this.shape1_1 = new ModelRenderer(this, 290, 0);
		this.shape1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_1.addBox(0.73F, 4.22F, 4.0F, 6, 1, 28, 0.0F);
		this.setRotateAngle(shape1_1, 0.0F, 0.0F, -1.3089969389957472F);
		this.shape1_45 = new ModelRenderer(this, 0, 370);
		this.shape1_45.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_45.addBox(5.94F, -7.58F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_45, 0.060562925044203235F, 0.019198621771937624F, -1.3089969389957472F);
		this.shape1_85 = new ModelRenderer(this, 82, 172);
		this.shape1_85.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_85.addBox(-32.7F, 1.5F, 6.65F, 20, 1, 3, 0.0F);
		this.setRotateAngle(shape1_85, 0.0F, -0.13788101090755206F, 0.0F);
		this.shape1_39 = new ModelRenderer(this, 0, 370);
		this.shape1_39.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_39.addBox(-8.75F, -7.7F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_39, 0.06632251157578452F, -0.03490658503988659F, 1.3089969389957472F);
		this.shape1_101 = new ModelRenderer(this, 240, 78);
		this.shape1_101.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_101.addBox(4.0F, 2.1F, -4.0F, 13, 1, 8, 0.0F);
		this.shape1_90 = new ModelRenderer(this, 202, 96);
		this.shape1_90.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_90.addBox(31.3F, -4.0F, 5.7F, 3, 3, 2, 0.0F);
		this.shape1_65 = new ModelRenderer(this, 0, 179);
		this.shape1_65.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_65.addBox(-33.75F, -3.5F, -20.0F, 2, 2, 26, 0.0F);
		this.shape1_52 = new ModelRenderer(this, 251, 306);
		this.shape1_52.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_52.addBox(-3.9F, 3.8F, -53.4F, 2, 1, 58, 0.0F);
		this.setRotateAngle(shape1_52, -0.059341194567807204F, 0.03490658503988659F, 1.2915436464758039F);
		this.WingLBottomParent = new ModelRenderer(this, 78, 62);
		this.WingLBottomParent.setRotationPoint(0.0F, -6.4F, 18.0F);
		this.WingLBottomParent.addBox(-33.79F, 1.5F, -5.0F, 28, 1, 10, 0.0F);
		this.shape1_86 = new ModelRenderer(this, 164, 76);
		this.shape1_86.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_86.addBox(4.0F, -1.5F, -4.0F, 13, 1, 8, 0.0F);
		this.shape1_37 = new ModelRenderer(this, 0, 370);
		this.shape1_37.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_37.addBox(-7.75F, -7.7F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_37, 0.06632251157578452F, -0.03490658503988659F, 1.3089969389957472F);
		this.shape1_38 = new ModelRenderer(this, 0, 370);
		this.shape1_38.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_38.addBox(-6.85F, -7.7F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_38, 0.06632251157578452F, -0.03490658503988659F, 1.3089969389957472F);
		this.Gear2 = new ModelRenderer(this, 0, 18);
		this.Gear2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Gear2.addBox(-3.5F, 7.0F, -31.0F, 6, 2, 9, 0.0F);
		this.shape1_4 = new ModelRenderer(this, 80, 0);
		this.shape1_4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_4.addBox(3.3F, -7.89F, 4.0F, 6, 1, 28, 0.0F);
		this.setRotateAngle(shape1_4, 0.0F, 0.0F, -1.3089969389957472F);
		this.shape1_43 = new ModelRenderer(this, 0, 370);
		this.shape1_43.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_43.addBox(4.14F, -7.58F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_43, 0.060562925044203235F, 0.0017453292519943296F, -1.3089969389957472F);
		this.shape1_75 = new ModelRenderer(this, 110, 99);
		this.shape1_75.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_75.addBox(-34.25F, 2.9F, -5.0F, 3, 3, 10, 0.0F);
		this.shape1_50 = new ModelRenderer(this, 251, 306);
		this.shape1_50.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_50.addBox(-6.65F, -4.95F, -53.4F, 2, 1, 58, 0.0F);
		this.setRotateAngle(shape1_50, 0.06981317007977318F, -0.017453292519943295F, 1.8325957145940461F);
		this.shape1_83 = new ModelRenderer(this, 88, 159);
		this.shape1_83.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_83.addBox(-33.25F, 2.9F, -40.5F, 1, 3, 1, 0.0F);
		this.shape1_14 = new ModelRenderer(this, 456, 169);
		this.shape1_14.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_14.addBox(4.76F, -7.54F, 4.0F, 1, 5, 26, 0.0F);
		this.WingRTopParent = new ModelRenderer(this, 158, 62);
		this.WingRTopParent.setRotationPoint(0.0F, -6.0F, 18.0F);
		this.WingRTopParent.addBox(5.79F, -0.5F, -5.0F, 28, 1, 10, 0.0F);
		this.shape1_53 = new ModelRenderer(this, 251, 306);
		this.shape1_53.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_53.addBox(-4.9F, 3.8F, -53.4F, 2, 1, 58, 0.0F);
		this.setRotateAngle(shape1_53, -0.059341194567807204F, 0.017453292519943295F, 1.2915436464758039F);
		this.shape1_11 = new ModelRenderer(this, 440, 65);
		this.shape1_11.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_11.addBox(-4.84F, -10.54F, 4.0F, 9, 10, 26, 0.0F);
		this.shape1_60 = new ModelRenderer(this, 0, 95);
		this.shape1_60.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_60.addBox(-13.4F, -5.5F, -6.2F, 6, 6, 9, 0.0F);
		this.shape1_84 = new ModelRenderer(this, 112, 116);
		this.shape1_84.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_84.addBox(-14.0F, 1.5F, -2.2F, 2, 1, 10, 0.0F);
		this.shape1_96 = new ModelRenderer(this, 176, 116);
		this.shape1_96.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_96.addBox(32.3F, -1.0F, -42.5F, 1, 1, 3, 0.0F);
		this.shape1_18 = new ModelRenderer(this, 488, 207);
		this.shape1_18.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_18.addBox(-3.04F, -1.84F, 29.8F, 6, 1, 2, 0.0F);
		this.shape1_94 = new ModelRenderer(this, 194, 136);
		this.shape1_94.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_94.addBox(32.3F, -3.0F, -45.0F, 1, 1, 29, 0.0F);
		this.shape1_30 = new ModelRenderer(this, 0, 306);
		this.shape1_30.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_30.addBox(-2.0F, -10.8F, -53.1F, 4, 1, 58, 0.0F);
		this.setRotateAngle(shape1_30, 0.05235987755982988F, 0.0F, 0.0F);
		this.shape1_82 = new ModelRenderer(this, 87, 151);
		this.shape1_82.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_82.addBox(-33.25F, 5.9F, -42.5F, 1, 1, 3, 0.0F);
		this.shape1_44 = new ModelRenderer(this, 0, 370);
		this.shape1_44.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_44.addBox(5.14F, -7.58F, -53.2F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_44, 0.060562925044203235F, 0.0017453292519943296F, -1.3089969389957472F);
		this.shape1_109 = new ModelRenderer(this, 247, 90);
		this.shape1_109.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_109.addBox(32.3F, 1.5F, -42.5F, 1, 1, 3, 0.0F);
		this.shape1_17 = new ModelRenderer(this, 458, 219);
		this.shape1_17.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_17.addBox(-2.04F, -8.54F, 29.8F, 4, 4, 2, 0.0F);
		this.shape1_22 = new ModelRenderer(this, 270, 388);
		this.shape1_22.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.shape1_22.addBox(0.0F, 4.2F, -53.1F, 1, 1, 58, 0.0F);
		this.setRotateAngle(shape1_22, -0.06981317007977318F, -0.03490658503988659F, -1.3089969389957472F);
		this.shape1_33 = new ModelRenderer(this, 0, 244);
		this.shape1_33.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_33.addBox(1.0F, -0.8F, -53.1F, 3, 1, 58, 0.0F);
		this.setRotateAngle(shape1_33, -0.05061454830783556F, 0.05235987755982988F, 0.0F);
		this.shape1_98 = new ModelRenderer(this, 194, 147);
		this.shape1_98.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_98.addBox(12.0F, -0.5F, -2.2F, 2, 1, 10, 0.0F);
		this.shape1_48 = new ModelRenderer(this, 251, 306);
		this.shape1_48.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_48.addBox(-4.05F, -4.95F, -53.4F, 2, 1, 58, 0.0F);
		this.setRotateAngle(shape1_48, 0.06981317007977318F, 0.017453292519943295F, 1.8325957145940461F);
		this.shape1_99 = new ModelRenderer(this, 180, 172);
		this.shape1_99.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_99.addBox(12.8F, -0.5F, 6.66F, 20, 1, 3, 0.0F);
		this.setRotateAngle(shape1_99, 0.0F, 0.13788101090755206F, 0.0F);
		this.Gear1 = new ModelRenderer(this, 0, 0);
		this.Gear1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Gear1.addBox(-1.5F, -18.0F, -23.0F, 2, 2, 12, 0.0F);
		this.setRotateAngle(Gear1, 0.9250245035569946F, 0.0F, 0.0F);
		this.shape1_67 = new ModelRenderer(this, 0, 190);
		this.shape1_67.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_67.addBox(-34.25F, -4.0F, -8.4F, 3, 3, 2, 0.0F);
		this.shape1_49 = new ModelRenderer(this, 251, 306);
		this.shape1_49.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1_49.addBox(-5.05F, -4.95F, -53.4F, 2, 1, 58, 0.0F);
		this.setRotateAngle(shape1_49, 0.06981317007977318F, 0.0F, 1.8325957145940461F);
		this.shape1 = new ModelRenderer(this, 362, 0);
		this.shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape1.addBox(-9.3F, -7.9F, 4.0F, 6, 1, 28, 0.0F);
		this.setRotateAngle(shape1, 0.0F, 0.0F, 1.3089969389957472F);
		this.WingRTopParent.addChild(this.shape1_87);
		this.MainParent.addChild(this.shape1_40);
		this.MainParent.addChild(this.shape1_5);
		this.MainParent.addChild(this.shape1_26);
		this.MainParent.addChild(this.shape1_20);
		this.MainParent.addChild(this.shape1_51);
		this.WingRTopParent.addChild(this.shape1_100);
		this.WingRTopParent.addChild(this.shape1_89);
		this.WingLTopParent.addChild(this.shape1_71);
		this.WingRBottomParent.addChild(this.shape1_111);
		this.MainParent.addChild(this.shape1_54);
		this.WingRBottomParent.addChild(this.shape1_106);
		this.WingLTopParent.addChild(this.shape1_61);
		this.MainParent.addChild(this.shape1_46);
		this.WingRTopParent.addChild(this.shape1_88);
		this.WingLTopParent.addChild(this.shape1_62);
		this.MainParent.addChild(this.shape1_2);
		this.WingLTopParent.addChild(this.shape1_58);
		this.WingLBottomParent.addChild(this.shape1_81);
		this.MainParent.addChild(this.shape1_41);
		this.MainParent.addChild(this.shape1_9);
		this.WingLBottomParent.addChild(this.shape1_80);
		this.MainParent.addChild(this.shape1_34);
		this.MainParent.addChild(this.shape1_36);
		this.MainParent.addChild(this.shape1_47);
		this.WingRTopParent.addChild(this.shape1_91);
		this.MainParent.addChild(this.Gear6);
		this.MainParent.addChild(this.shape1_29);
		this.WingLTopParent.addChild(this.shape1_68);
		this.MainParent.addChild(this.shape1_21);
		this.MainParent.addChild(this.shape1_16);
		this.MainParent.addChild(this.shape1_28);
		this.WingLTopParent.addChild(this.shape1_64);
		this.WingLBottomParent.addChild(this.shape1_79);
		this.MainParent.addChild(this.shape1_13);
		this.WingRBottomParent.addChild(this.shape1_104);
		this.MainParent.addChild(this.shape1_3);
		this.MainParent.addChild(this.shape1_25);
		this.MainParent.addChild(this.Gear5);
		this.WingLTopParent.addChild(this.shape1_63);
		this.MainParent.addChild(this.shape1_24);
		this.MainParent.addChild(this.shape1_31);
		this.MainParent.addChild(this.shape1_32);
		this.WingRBottomParent.addChild(this.shape1_112);
		this.WingLBottomParent.addChild(this.shape1_74);
		this.WingRTopParent.addChild(this.shape1_97);
		this.MainParent.addChild(this.Gear4);
		this.MainParent.addChild(this.shape1_15);
		this.WingRBottomParent.addChild(this.shape1_103);
		this.MainParent.addChild(this.shape1_12);
		this.WingLTopParent.addChild(this.shape1_69);
		this.MainParent.addChild(this.shape1_10);
		this.MainParent.addChild(this.shape1_57);
		this.WingRBottomParent.addChild(this.shape1_113);
		this.MainParent.addChild(this.shape1_19);
		this.MainParent.addChild(this.Gear3);
		this.MainParent.addChild(this.shape1_55);
		this.WingLTopParent.addChild(this.shape1_70);
		this.MainParent.addChild(this.shape1_56);
		this.WingLTopParent.addChild(this.shape1_66);
		this.WingRBottomParent.addChild(this.shape1_107);
		this.MainParent.addChild(this.WingRBottomParent);
		this.WingRBottomParent.addChild(this.shape1_102);
		this.MainParent.addChild(this.shape1_23);
		this.MainParent.addChild(this.shape1_8);
		this.WingLBottomParent.addChild(this.shape1_78);
		this.WingRBottomParent.addChild(this.shape1_108);
		this.WingRBottomParent.addChild(this.shape1_114);
		this.WingLTopParent.addChild(this.shape1_59);
		this.WingRBottomParent.addChild(this.shape1_110);
		this.MainParent.addChild(this.shape1_6);
		this.WingRTopParent.addChild(this.shape1_93);
		this.WingLBottomParent.addChild(this.shape1_73);
		this.MainParent.addChild(this.shape1_27);
		this.MainParent.addChild(this.shape1_35);
		this.WingLBottomParent.addChild(this.shape1_72);
		this.WingRTopParent.addChild(this.shape1_92);
		this.WingRBottomParent.addChild(this.shape1_105);
		this.MainParent.addChild(this.WingLTopParent);
		this.WingLBottomParent.addChild(this.shape1_76);
		this.WingRTopParent.addChild(this.shape1_95);
		this.MainParent.addChild(this.shape1_42);
		this.WingLBottomParent.addChild(this.shape1_77);
		this.MainParent.addChild(this.shape1_7);
		this.MainParent.addChild(this.shape1_1);
		this.MainParent.addChild(this.shape1_45);
		this.WingLBottomParent.addChild(this.shape1_85);
		this.MainParent.addChild(this.shape1_39);
		this.WingRBottomParent.addChild(this.shape1_101);
		this.WingRTopParent.addChild(this.shape1_90);
		this.WingLTopParent.addChild(this.shape1_65);
		this.MainParent.addChild(this.shape1_52);
		this.MainParent.addChild(this.WingLBottomParent);
		this.WingRTopParent.addChild(this.shape1_86);
		this.MainParent.addChild(this.shape1_37);
		this.MainParent.addChild(this.shape1_38);
		this.MainParent.addChild(this.Gear2);
		this.MainParent.addChild(this.shape1_4);
		this.MainParent.addChild(this.shape1_43);
		this.WingLBottomParent.addChild(this.shape1_75);
		this.MainParent.addChild(this.shape1_50);
		this.WingLBottomParent.addChild(this.shape1_83);
		this.MainParent.addChild(this.shape1_14);
		this.MainParent.addChild(this.WingRTopParent);
		this.MainParent.addChild(this.shape1_53);
		this.MainParent.addChild(this.shape1_11);
		this.WingLTopParent.addChild(this.shape1_60);
		this.WingLBottomParent.addChild(this.shape1_84);
		this.WingRTopParent.addChild(this.shape1_96);
		this.MainParent.addChild(this.shape1_18);
		this.WingRTopParent.addChild(this.shape1_94);
		this.MainParent.addChild(this.shape1_30);
		this.WingLBottomParent.addChild(this.shape1_82);
		this.MainParent.addChild(this.shape1_44);
		this.WingRBottomParent.addChild(this.shape1_109);
		this.MainParent.addChild(this.shape1_17);
		this.MainParent.addChild(this.shape1_22);
		this.MainParent.addChild(this.shape1_33);
		this.WingRTopParent.addChild(this.shape1_98);
		this.MainParent.addChild(this.shape1_48);
		this.WingRTopParent.addChild(this.shape1_99);
		this.MainParent.addChild(this.Gear1);
		this.WingLTopParent.addChild(this.shape1_67);
		this.MainParent.addChild(this.shape1_49);
		this.MainParent.addChild(this.shape1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float pt, float f5)
	{
		GL11.glPushMatrix();
		if (entity instanceof VehicXWing)
		{
			VehicXWing xwing = (VehicXWing)entity;

			/*GL11.glTranslatef(this.MainParent.offsetX, this.MainParent.offsetY, this.MainParent.offsetZ);
			GL11.glTranslatef(this.MainParent.rotationPointX * f5, this.MainParent.rotationPointY * f5, this.MainParent.rotationPointZ * f5);
			GL11.glScaled(3.0D, 3.0D, 3.0D);
			GL11.glTranslatef(-this.MainParent.offsetX, -this.MainParent.offsetY, -this.MainParent.offsetZ);
			GL11.glTranslatef(-this.MainParent.rotationPointX * f5, -this.MainParent.rotationPointY * f5, -this.MainParent.rotationPointZ * f5);*/

			this.WingLTopParent.rotateAngleZ = xwing.getsFoilAngle(pt);
			this.WingLBottomParent.rotateAngleZ = -xwing.getsFoilAngle(pt);
			this.WingRTopParent.rotateAngleZ = -xwing.getsFoilAngle(pt);
			this.WingRBottomParent.rotateAngleZ = xwing.getsFoilAngle(pt);

			boolean flag = this.Gear1.isHidden = entity.world.isAirBlock(new BlockPos((int)entity.posX, (int)entity.posY - 1, (int)entity.posZ));
			this.Gear1.isHidden = flag;
			this.Gear2.isHidden = flag;
			this.Gear3.isHidden = flag;
			this.Gear4.isHidden = flag;
			this.Gear5.isHidden = flag;
			this.Gear6.isHidden = flag;

			flag = PSWM.mc.gameSettings.thirdPersonView == 0 && entity.getPassengers().contains(PSWM.mc.player);
			this.shape1_19.isHidden = flag;
			this.shape1_20.isHidden = flag;

			if (flag)
			{
				GL11.glTranslatef(0, 0.57f, -0.3f);
			}
		}
		else
		{
			boolean flag = true;
			this.Gear1.isHidden = flag;
			this.Gear2.isHidden = flag;
			this.Gear3.isHidden = flag;
			this.Gear4.isHidden = flag;
			this.Gear5.isHidden = flag;
			this.Gear6.isHidden = flag;
		}
		this.MainParent.render(f5);
		// TODO
		//		if (entity instanceof VehicXWing)
		//		{
		//			VehicXWing xwing = (VehicXWing)entity;
		//			if (xwing.getHasAstro())
		//			{
		//				Entity astro = xwing.getAstroType() == 0 ? new MobDroidAstromech(xwing.worldObj) : new MobDroidAstromech2(xwing.worldObj);
		//				GL11.glPushMatrix();
		//				GL11.glRotatef(180, 0, 1, 0);
		//				GL11.glRotatef(-9, 1, 0, 0);
		//				GL11.glScalef(1, -1, 1);
		//				P3D.glScalef(0.6f);
		//				GL11.glTranslatef(0, -2f, -2.4f);
		//				Render render = RenderManager.instance.getEntityRenderObject(astro);
		//				astro.setEntityId(1337);
		//				render.doRender(astro, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
		//				GL11.glPopMatrix();
		//			}
		//		}
		GL11.glPopMatrix();
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
}
