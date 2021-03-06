package com.parzivail.pswm.items.weapons;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.util.ui.LangUtils;
import com.parzivail.util.ui.TextUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

import java.util.List;

public class ItemGaffiStick extends ItemSword
{
	public String name = "gaffiStick";

	public ItemGaffiStick()
	{
		super(StarWarsMod.materialGaffi);
		this.setUnlocalizedName(Resources.MODID + "." + this.name);
		this.setTextureName(Resources.MODID + ":" + this.name);
		this.setCreativeTab(StarWarsMod.StarWarsTab);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add(TextUtils.makeItalic(LangUtils.translate("gaffi.tooltip")));
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
	{
		entityPlayer.playSound(Resources.MODID + ":" + "item.gaffi.rightclick", 1.0F, 1.0F);
		return itemStack;
	}
}
