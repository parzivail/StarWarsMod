package com.parzivail.pswm.armor;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.models.armor.ModelLeiaBuns;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorAddonBuns extends ItemArmor
{
	public String name = "leiasBuns";

	public ArmorAddonBuns(ItemArmor.ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.setUnlocalizedName(Resources.MODID + "." + this.name);
		this.setTextureName(Resources.MODID + ":" + this.name);
		this.setCreativeTab(null);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemstack, int armorSlot)
	{
		return new ModelLeiaBuns();
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return Resources.MODID + ":" + "textures/models/leiaBunsLayer1.png";
	}
}
