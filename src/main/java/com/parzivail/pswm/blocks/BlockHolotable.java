package com.parzivail.pswm.blocks;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.tileentities.TileEntityHoloTableBase;
import com.parzivail.pswm.tileentities.TileEntityHoloTableLarge;
import com.parzivail.pswm.tileentities.TileEntityHoloTableMedium;
import com.parzivail.pswm.tileentities.TileEntityHoloTableWar;
import com.parzivail.util.IDebugProvider;
import com.parzivail.util.block.PBlockContainer;
import com.parzivail.util.ui.LangUtils;
import com.parzivail.util.world.HarvestLevel;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class BlockHolotable extends PBlockContainer implements IDebugProvider
{
	@SideOnly(Side.CLIENT)
	public IIcon topIcon;

	public BlockHolotable()
	{
		super("holoTable", Material.iron);
		setCreativeTab(StarWarsMod.StarWarsTabBlocks);
		setHardness(50.0F);
		this.setHarvestLevel("pickaxe", HarvestLevel.IRON);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta)
	{
		if (meta == 1)
			return new TileEntityHoloTableMedium();
		else if (meta == 2)
			return new TileEntityHoloTableLarge();
		else if (meta == 3)
			return new TileEntityHoloTableWar();
		return new TileEntityHoloTableBase();
	}

	@Override
	public List<String> getDebugText(List<String> list, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile = world.getTileEntity(x, y, z);
		if (tile instanceof TileEntityHoloTableBase)
		{
			TileEntityHoloTableBase t = (TileEntityHoloTableBase)tile;
			list.add(LangUtils.translate("0.x.offset", String.valueOf(t.getOffsetX())));
			list.add(LangUtils.translate("0.y.offset", String.valueOf(t.getOffsetY())));
			list.add(LangUtils.translate("0.z.offset", String.valueOf(t.getOffsetZ())));
			list.add(LangUtils.translate("0.side.length", String.valueOf(t.getSideLength())));
		}

		return list;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		if (side == 1)
			return topIcon;
		return blockIcon;
	}

	@Override
	public int getRenderType()
	{
		return 0;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List metaTypes)
	{
		metaTypes.add(new ItemStack(item, 1, 0)); // small
		metaTypes.add(new ItemStack(item, 1, 1)); // medium
		metaTypes.add(new ItemStack(item, 1, 2)); // large
		metaTypes.add(new ItemStack(item, 1, 3)); // war
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_)
	{
		TileEntity tile = world.getTileEntity(x, y, z);
		if (tile instanceof TileEntityHoloTableBase)
		{
			TileEntityHoloTableBase holoTableBase = (TileEntityHoloTableBase)tile;
			holoTableBase.setRGB(0.4f, 0.4f, 1);
		}
		return p_149660_9_;
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metadata, float e, float f, float g)
	{
		if (world.isRemote)
			player.openGui(StarWarsMod.instance, Resources.GUI_HOLOTABLE, world, x, y, z);
		return true;
	}

	@Override
	public void registerBlockIcons(IIconRegister icon)
	{
		blockIcon = icon.registerIcon(Resources.MODID + ":" + "holoTable");
		topIcon = icon.registerIcon(Resources.MODID + ":" + "holoTable_Top");
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
}