package com.parzivail.pswm.models.vehicles;

import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.handlers.ClientEventHandler;
import com.parzivail.pswm.mobs.MobDroidAstromech;
import com.parzivail.pswm.mobs.MobDroidAstromech2;
import com.parzivail.pswm.vehicles.VehicT85;
import com.parzivail.util.ui.P3D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * T-85 - Weaston
 * Created using P-Tabula 4.1.1
 */
public class ModelT85 extends ModelBase {
    public ModelRenderer MainParent;
    public ModelRenderer dontparent_68;
    public ModelRenderer dontparent_69;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape7;
    public ModelRenderer shape8;
    public ModelRenderer shape9;
    public ModelRenderer shape10;
    public ModelRenderer shape11;
    public ModelRenderer shape12;
    public ModelRenderer shape13;
    public ModelRenderer shape14;
    public ModelRenderer shape15;
    public ModelRenderer shape16;
    public ModelRenderer shape17;
    public ModelRenderer shape18;
    public ModelRenderer shape19;
    public ModelRenderer shape20;
    public ModelRenderer shape21;
    public ModelRenderer shape22;
    public ModelRenderer shape23;
    public ModelRenderer shape24;
    public ModelRenderer shape25;
    public ModelRenderer shape26;
    public ModelRenderer shape27;
    public ModelRenderer shape28;
    public ModelRenderer shape29;
    public ModelRenderer shape30;
    public ModelRenderer shape31;
    public ModelRenderer shape32;
    public ModelRenderer shape33;
    public ModelRenderer shape34;
    public ModelRenderer shape35;
    public ModelRenderer shape36;
    public ModelRenderer shape37;
    public ModelRenderer shape38;
    public ModelRenderer shape39;
    public ModelRenderer shape40;
    public ModelRenderer shape41;
    public ModelRenderer shape42;
    public ModelRenderer shape43;
    public ModelRenderer shape44;
    public ModelRenderer shape45;
    public ModelRenderer shape46;
    public ModelRenderer shape47;
    public ModelRenderer shape48;
    public ModelRenderer shape49;
    public ModelRenderer shape50;
    public ModelRenderer shape51;
    public ModelRenderer shape52;
    public ModelRenderer shape53;
    public ModelRenderer shape54;
    public ModelRenderer shape55;
    public ModelRenderer shape56;
    public ModelRenderer shape57;
    public ModelRenderer shape58;
    public ModelRenderer shape59;
    public ModelRenderer shape60;
    public ModelRenderer shape61;
    public ModelRenderer gear2;
    public ModelRenderer gear1;
    public ModelRenderer gear4;
    public ModelRenderer gear6;
    public ModelRenderer gear3;
    public ModelRenderer gear5;

	public ModelT85()
	{
		this.textureWidth = 512;
        this.textureHeight = 512;
        this.shape25 = new ModelRenderer(this, 34, 430);
        this.shape25.setRotationPoint(0.0F, -0.8F, -5.0F);
        this.shape25.addBox(2.5F, -7.0F, -2.2F, 1, 1, 15, 0.0F);
        this.shape12 = new ModelRenderer(this, 0, 351);
        this.shape12.setRotationPoint(0.0F, -0.83F, -5.0F);
        this.shape12.addBox(-3.0F, -6.5F, -2.2F, 6, 7, 14, 0.0F);
        this.shape27 = new ModelRenderer(this, 56, 475);
        this.shape27.setRotationPoint(0.0F, 13.17F, -8.0F);
        this.shape27.addBox(-1.0F, 0.7F, -20.2F, 2, 1, 6, 0.0F);
        this.setRotateAngle(shape27, -0.7853981633974483F, 0.0F, 0.0F);
        this.gear1 = new ModelRenderer(this, 68, 417);
        this.gear1.setRotationPoint(0.0F, -2.23F, 2.0F);
        this.gear1.addBox(-1.5F, -6.29F, -9.16F, 3, 4, 2, 0.0F);
        this.setRotateAngle(gear1, 1.5707963267948966F, 0.0F, 0.0F);
        this.shape23 = new ModelRenderer(this, 238, 138);
        this.shape23.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.shape23.addBox(-3.0F, -4.5F, -5.5F, 6, 3, 5, 0.0F);
        this.setRotateAngle(shape23, 0.41887902047863906F, 0.0F, 0.0F);
        this.shape53 = new ModelRenderer(this, 292, 143);
        this.shape53.setRotationPoint(0.0F, 13.17F, -8.0F);
        this.shape53.addBox(-1.0F, -0.3F, -18.7F, 2, 1, 4, 0.0F);
        this.setRotateAngle(shape53, -0.7853981633974483F, 0.0F, 0.0F);
        this.shape26 = new ModelRenderer(this, 178, 0);
        this.shape26.setRotationPoint(0.0F, -0.83F, -5.0F);
        this.shape26.addBox(-2.5F, -0.3F, -20.2F, 5, 2, 75, 0.0F);
        this.shape41 = new ModelRenderer(this, 40, 374);
        this.shape41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape41.addBox(-6.5F, -7.2F, 40.3F, 3, 2, 16, 0.0F);
        this.shape11 = new ModelRenderer(this, 0, 333);
        this.shape11.setRotationPoint(0.0F, -1.2F, -5.0F);
        this.shape11.addBox(-3.0F, -6.5F, -13.5F, 6, 2, 14, 0.0F);
        this.setRotateAngle(shape11, 0.41887902047863906F, 0.0F, 0.0F);
        this.shape49 = new ModelRenderer(this, 490, 58);
        this.shape49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape49.addBox(18.95F, -1.0F, 39.8F, 2, 2, 7, 0.0F);
        this.shape35 = new ModelRenderer(this, 0, 223);
        this.shape35.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.shape35.addBox(-7.01F, -1.05F, 11.8F, 6, 1, 33, 0.0F);
        this.shape43 = new ModelRenderer(this, 40, 394);
        this.shape43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape43.addBox(-7.7F, -6.0F, 40.3F, 3, 5, 16, 0.0F);
        this.gear3 = new ModelRenderer(this, 150, 144);
        this.gear3.setRotationPoint(0.0F, -2.23F, 2.0F);
        this.gear3.addBox(12.1F, 43.8F, -8.26F, 4, 3, 1, 0.0F);
        this.setRotateAngle(gear3, 1.5707963267948966F, 0.0F, 0.0F);
        this.shape14 = new ModelRenderer(this, 32, 448);
        this.shape14.setRotationPoint(0.0F, -0.83F, -5.0F);
        this.shape14.addBox(-3.0F, -6.63F, 43.93F, 6, 7, 5, 0.0F);
        this.shape19 = new ModelRenderer(this, 356, 78);
        this.shape19.setRotationPoint(0.0F, -1.57F, -5.02F);
        this.shape19.addBox(-3.5F, -6.55F, -0.29F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape19, 0.4363323129985824F, 0.0F, 0.0F);
        this.shape50 = new ModelRenderer(this, 56, 462);
        this.shape50.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape50.addBox(19.45F, -0.5F, 31.8F, 1, 1, 10, 0.0F);
        this.shape57 = new ModelRenderer(this, 482, 96);
        this.shape57.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape57.addBox(-31.02F, -2.0F, 39.26F, 1, 4, 12, 0.0F);
        this.setRotateAngle(shape57, 0.0F, 0.2792526803190927F, 0.0F);
        this.shape8 = new ModelRenderer(this, 448, 119);
        this.shape8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape8.addBox(3.0F, -6.5F, 39.8F, 4, 8, 17, 0.0F);
        this.shape36 = new ModelRenderer(this, 490, 0);
        this.shape36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape36.addBox(3.5F, -6.0F, 54.8F, 3, 3, 6, 0.0F);
        this.shape37 = new ModelRenderer(this, 490, 11);
        this.shape37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape37.addBox(3.5F, -2.0F, 54.8F, 3, 3, 6, 0.0F);
        this.shape16 = new ModelRenderer(this, 320, 118);
        this.shape16.setRotationPoint(0.0F, -0.83F, -5.0F);
        this.shape16.addBox(-3.5F, -0.9F, -15.2F, 7, 2, 28, 0.0F);
        this.shape18 = new ModelRenderer(this, 0, 448);
        this.shape18.setRotationPoint(0.0F, -1.57F, -5.02F);
        this.shape18.addBox(-3.5F, -6.55F, -13.69F, 1, 1, 14, 0.0F);
        this.setRotateAngle(shape18, 0.4363323129985824F, 0.0F, 0.0F);
        this.shape29 = new ModelRenderer(this, 150, 82);
        this.shape29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape29.addBox(-10.0F, -0.5F, 17.0F, 20, 1, 23, 0.0F);
        this.gear2 = new ModelRenderer(this, 262, 138);
        this.gear2.setRotationPoint(0.0F, -2.23F, 2.0F);
        this.gear2.addBox(-1.0F, -2.09F, -9.06F, 2, 2, 7, 0.0F);
        this.setRotateAngle(gear2, 1.186823891356144F, 0.0F, 0.0F);
        this.shape48 = new ModelRenderer(this, 292, 125);
        this.shape48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape48.addBox(29.98F, -2.0F, 39.26F, 1, 4, 12, 0.0F);
        this.setRotateAngle(shape48, 0.0F, -0.2792526803190927F, 0.0F);
        this.shape52 = new ModelRenderer(this, 174, 144);
        this.shape52.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape52.addBox(30.48F, -1.0F, 48.26F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape52, 0.0F, -0.2792526803190927F, 0.0F);
        this.shape58 = new ModelRenderer(this, 490, 69);
        this.shape58.setRotationPoint(-40.0F, 0.0F, 0.0F);
        this.shape58.addBox(18.95F, -1.0F, 39.8F, 2, 2, 7, 0.0F);
        this.shape21 = new ModelRenderer(this, 362, 78);
        this.shape21.setRotationPoint(0.0F, -1.57F, -5.02F);
        this.shape21.addBox(2.5F, -6.55F, -0.29F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape21, 0.4363323129985824F, 0.0F, 0.0F);
        this.shape28 = new ModelRenderer(this, 42, 351);
        this.shape28.setRotationPoint(0.0F, -2.23F, 0.0F);
        this.shape28.addBox(-1.0F, -2.29F, -20.26F, 2, 4, 16, 0.0F);
        this.setRotateAngle(shape28, 0.24434609527920614F, 0.0F, 0.0F);
        this.shape46 = new ModelRenderer(this, 340, 78);
        this.shape46.setRotationPoint(0.0F, -39.93F, 2.0F);
        this.shape46.addBox(-3.0F, -6.7F, 61.6F, 6, 1, 1, 0.0F);
        this.setRotateAngle(shape46, -0.7853981633974483F, 0.0F, 0.0F);
        this.gear5 = new ModelRenderer(this, 162, 144);
        this.gear5.setRotationPoint(0.0F, -2.23F, 2.0F);
        this.gear5.addBox(-16.1F, 43.8F, -8.26F, 4, 3, 1, 0.0F);
        this.setRotateAngle(gear5, 1.5707963267948966F, 0.0F, 0.0F);
        this.dontparent_68 = new ModelRenderer(this, 194, 144);
        this.dontparent_68.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.dontparent_68.addBox(16.1F, 12.0F, 27.5F, 1, 1, 3, 0.0F);
        this.shape3 = new ModelRenderer(this, 42, 333);
        this.shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape3.addBox(23.98F, -0.5F, 39.26F, 6, 1, 10, 0.0F);
        this.setRotateAngle(shape3, 0.0F, -0.2792526803190927F, 0.0F);
        this.shape2 = new ModelRenderer(this, 340, 68);
        this.shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape2.addBox(-18.0F, -0.5F, 39.0F, 36, 1, 7, 0.0F);
        this.shape9 = new ModelRenderer(this, 340, 0);
        this.shape9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape9.addBox(-0.87F, -0.5F, -23.03F, 9, 1, 65, 0.0F);
        this.setRotateAngle(shape9, 0.0F, 0.153588974175501F, 0.0F);
        this.shape55 = new ModelRenderer(this, 0, 296);
        this.shape55.setRotationPoint(0.9F, -1.23F, -5.0F);
        this.shape55.addBox(-3.0F, -6.1F, 11.8F, 5, 2, 33, 0.0F);
        this.setRotateAngle(shape55, 0.0F, 0.0F, -1.0471975511965976F);
        this.dontparent_69 = new ModelRenderer(this, 204, 144);
        this.dontparent_69.setRotationPoint(-40.0F, 3.0F, 0.0F);
        this.dontparent_69.addBox(16.1F, 12.0F, 27.5F, 1, 1, 3, 0.0F);
        this.shape13 = new ModelRenderer(this, 238, 82);
        this.shape13.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.shape13.addBox(-3.5F, -7.1F, 11.8F, 7, 8, 33, 0.0F);
        this.gear4 = new ModelRenderer(this, 32, 488);
        this.gear4.setRotationPoint(10.0F, -1.43F, 47.3F);
        this.gear4.addBox(-1.0F, -2.09F, -8.06F, 2, 2, 6, 0.0F);
        this.setRotateAngle(gear4, 1.186823891356144F, -1.5707963267948966F, 0.0F);
        this.shape34 = new ModelRenderer(this, 0, 186);
        this.shape34.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.shape34.addBox(-7.01F, -1.01F, 11.8F, 6, 2, 33, 0.0F);
        this.shape4 = new ModelRenderer(this, 428, 68);
        this.shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape4.addBox(-0.76F, -0.5F, 45.62F, 16, 1, 10, 0.0F);
        this.shape22 = new ModelRenderer(this, 0, 482);
        this.shape22.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.shape22.addBox(-3.0F, -6.5F, -9.0F, 6, 3, 9, 0.0F);
        this.setRotateAngle(shape22, 0.41887902047863906F, 0.0F, 0.0F);
        this.shape31 = new ModelRenderer(this, 402, 82);
        this.shape31.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.shape31.addBox(1.02F, -1.03F, 11.8F, 6, 2, 33, 0.0F);
        this.shape59 = new ModelRenderer(this, 32, 475);
        this.shape59.setRotationPoint(-40.0F, 0.0F, 0.0F);
        this.shape59.addBox(19.45F, -0.5F, 31.8F, 1, 1, 10, 0.0F);
        this.shape33 = new ModelRenderer(this, 320, 82);
        this.shape33.setRotationPoint(0.9F, -1.23F, -5.0F);
        this.shape33.addBox(-3.5F, -7.1F, 11.8F, 7, 1, 33, 0.0F);
        this.setRotateAngle(shape33, 0.0F, 0.0F, -1.0471975511965976F);
        this.shape30 = new ModelRenderer(this, 150, 108);
        this.shape30.setRotationPoint(-0.88F, -1.23F, -5.0F);
        this.shape30.addBox(-3.5F, -7.1F, 11.8F, 7, 1, 33, 0.0F);
        this.setRotateAngle(shape30, 0.0F, 0.0F, 1.0471975511965976F);
        this.shape7 = new ModelRenderer(this, 402, 119);
        this.shape7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape7.addBox(-7.0F, -6.5F, 39.8F, 4, 8, 18, 0.0F);
        this.shape6 = new ModelRenderer(this, 238, 125);
        this.shape6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape6.addBox(-15.24F, -0.5F, 45.62F, 16, 1, 10, 0.0F);
        this.shape61 = new ModelRenderer(this, 184, 144);
        this.shape61.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape61.addBox(-32.72F, -1.0F, 48.26F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape61, 0.0F, 0.2792526803190927F, 0.0F);
        this.shape10 = new ModelRenderer(this, 0, 82);
        this.shape10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape10.addBox(-8.12F, -0.5F, -23.03F, 9, 1, 65, 0.0F);
        this.setRotateAngle(shape10, 0.0F, -0.153588974175501F, 0.0F);
        this.shape20 = new ModelRenderer(this, 0, 465);
        this.shape20.setRotationPoint(0.0F, -1.57F, -5.02F);
        this.shape20.addBox(2.5F, -6.55F, -13.69F, 1, 1, 14, 0.0F);
        this.setRotateAngle(shape20, 0.4363323129985824F, 0.0F, 0.0F);
        this.MainParent = new ModelRenderer(this, 0, 0);
        this.MainParent.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.MainParent.addBox(-4.5F, -0.5F, -24.0F, 9, 1, 79, 0.0F);
        this.shape51 = new ModelRenderer(this, 482, 82);
        this.shape51.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape51.addBox(30.18F, -0.5F, 39.26F, 2, 1, 11, 0.0F);
        this.setRotateAngle(shape51, 0.0F, -0.2792526803190927F, 0.0F);
        this.shape39 = new ModelRenderer(this, 490, 33);
        this.shape39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape39.addBox(-6.5F, -2.0F, 54.8F, 3, 3, 6, 0.0F);
        this.shape5 = new ModelRenderer(this, 0, 417);
        this.shape5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape5.addBox(-29.99F, -0.5F, 39.26F, 6, 1, 10, 0.0F);
        this.setRotateAngle(shape5, 0.0F, 0.2792526803190927F, 0.0F);
        this.shape45 = new ModelRenderer(this, 32, 462);
        this.shape45.setRotationPoint(0.0F, -39.93F, 2.0F);
        this.shape45.addBox(2.0F, -6.7F, 52.6F, 1, 1, 10, 0.0F);
        this.setRotateAngle(shape45, -0.7853981633974483F, 0.0F, 0.0F);
        this.shape17 = new ModelRenderer(this, 492, 133);
        this.shape17.setRotationPoint(0.0F, -0.8F, -5.0F);
        this.shape17.addBox(-3.5F, -7.0F, -2.2F, 7, 7, 1, 0.0F);
        this.shape38 = new ModelRenderer(this, 490, 22);
        this.shape38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape38.addBox(-6.5F, -6.0F, 54.8F, 3, 3, 6, 0.0F);
        this.shape44 = new ModelRenderer(this, 56, 448);
        this.shape44.setRotationPoint(0.0F, -39.93F, 2.0F);
        this.shape44.addBox(-3.0F, -6.7F, 52.6F, 1, 1, 10, 0.0F);
        this.setRotateAngle(shape44, -0.7853981633974483F, 0.0F, 0.0F);
        this.shape32 = new ModelRenderer(this, 0, 150);
        this.shape32.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.shape32.addBox(1.02F, -1.06F, 11.8F, 6, 1, 33, 0.0F);
        this.shape42 = new ModelRenderer(this, 0, 394);
        this.shape42.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape42.addBox(4.7F, -6.0F, 40.3F, 3, 5, 16, 0.0F);
        this.shape60 = new ModelRenderer(this, 0, 496);
        this.shape60.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape60.addBox(-32.32F, -0.5F, 39.26F, 2, 1, 11, 0.0F);
        this.setRotateAngle(shape60, 0.0F, 0.2792526803190927F, 0.0F);
        this.gear6 = new ModelRenderer(this, 32, 498);
        this.gear6.setRotationPoint(-10.0F, -1.43F, 47.3F);
        this.gear6.addBox(-1.0F, -2.09F, -8.06F, 2, 2, 6, 0.0F);
        this.setRotateAngle(gear6, 1.186823891356144F, 1.5707963267948966F, 0.0F);
        this.shape15 = new ModelRenderer(this, 34, 417);
        this.shape15.setRotationPoint(0.0F, -39.93F, 2.0F);
        this.shape15.addBox(-3.0F, -6.5F, 52.6F, 6, 1, 10, 0.0F);
        this.setRotateAngle(shape15, -0.7853981633974483F, 0.0F, 0.0F);
        this.shape24 = new ModelRenderer(this, 0, 430);
        this.shape24.setRotationPoint(0.0F, -0.8F, -5.0F);
        this.shape24.addBox(-3.5F, -7.0F, -2.2F, 1, 1, 15, 0.0F);
        this.shape40 = new ModelRenderer(this, 0, 374);
        this.shape40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape40.addBox(3.5F, -7.2F, 40.3F, 3, 2, 16, 0.0F);
        this.shape47 = new ModelRenderer(this, 490, 44);
        this.shape47.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape47.addBox(17.95F, -2.0F, 38.3F, 1, 4, 8, 0.0F);
        this.shape56 = new ModelRenderer(this, 492, 119);
        this.shape56.setRotationPoint(-37.0F, 0.0F, 0.0F);
        this.shape56.addBox(17.95F, -2.0F, 38.3F, 1, 4, 8, 0.0F);
        this.shape54 = new ModelRenderer(this, 0, 259);
        this.shape54.setRotationPoint(-0.88F, -1.23F, -5.0F);
        this.shape54.addBox(-2.0F, -6.1F, 11.8F, 5, 2, 33, 0.0F);
        this.setRotateAngle(shape54, 0.0F, 0.0F, 1.0471975511965976F);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
	    if (entity != null && entity.riddenByEntity != StarWarsMod.mc.thePlayer)
		    GL11.glRotatef(entity.prevRotationPitch, 1, 0, 0);
	    boolean flag;
	    if (entity instanceof VehicT85)
	    {
		    flag = entity.worldObj.isAirBlock((int)entity.posX, (int)entity.posY - 1, (int)entity.posZ);

		    this.gear1.isHidden = flag;
		    this.gear2.isHidden = flag;
		    this.gear3.isHidden = flag;
		    this.gear4.isHidden = flag;
		    this.gear5.isHidden = flag;
		    this.gear6.isHidden = flag;

		    flag = ClientEventHandler.renderHelper.isFirstPerson() && entity.riddenByEntity == StarWarsMod.mc.thePlayer;
		    this.MainParent.isHidden = flag;

		    if (flag)
		    {
			    GL11.glTranslatef(0, 0.4f, -0.3f);
		    }
	    }

	    GL11.glPushMatrix();
        GL11.glTranslatef(this.dontparent_68.offsetX, this.dontparent_68.offsetY, this.dontparent_68.offsetZ);
        GL11.glTranslatef(this.dontparent_68.rotationPointX * f5, this.dontparent_68.rotationPointY * f5, this.dontparent_68.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-this.dontparent_68.offsetX, -this.dontparent_68.offsetY, -this.dontparent_68.offsetZ);
        GL11.glTranslatef(-this.dontparent_68.rotationPointX * f5, -this.dontparent_68.rotationPointY * f5, -this.dontparent_68.rotationPointZ * f5);
        this.dontparent_68.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.dontparent_69.offsetX, this.dontparent_69.offsetY, this.dontparent_69.offsetZ);
        GL11.glTranslatef(this.dontparent_69.rotationPointX * f5, this.dontparent_69.rotationPointY * f5, this.dontparent_69.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-this.dontparent_69.offsetX, -this.dontparent_69.offsetY, -this.dontparent_69.offsetZ);
        GL11.glTranslatef(-this.dontparent_69.rotationPointX * f5, -this.dontparent_69.rotationPointY * f5, -this.dontparent_69.rotationPointZ * f5);
        this.dontparent_69.render(f5);
        GL11.glPopMatrix();
        this.MainParent.render(f5);

	    if (entity instanceof VehicT85)
	    {
		    VehicT85 t85 = (VehicT85)entity;
		    if (t85.getHasAstro())
		    {
			    Entity astro = t85.getAstroType() == 0 ? new MobDroidAstromech(t85.worldObj) : new MobDroidAstromech2(t85.worldObj);
			    GL11.glPushMatrix();
			    GL11.glRotatef(180, 0, 1, 0);
			    GL11.glRotatef(-9, 1, 0, 0);
			    GL11.glScalef(1, -1, 1);
			    P3D.glScalef(0.6f);
			    GL11.glTranslatef(0, -2.43f, -1.22f);
			    Render render = RenderManager.instance.getEntityRenderObject(astro);
			    astro.setEntityId(1337);
			    render.doRender(astro, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
			    GL11.glPopMatrix();
		    }
	    }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
