package com.parzi.starwarsmod.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import com.parzi.starwarsmod.StarWarsMod;

public class TileEntityMV extends TileEntity implements IInventory
{
	public float frame;
	public int progressTicks;
	public int totalTicks;

	public ItemStack waterDroplets;

	public TileEntityMV()
	{
		this.frame = 0;
		this.progressTicks = 0;
		this.totalTicks = 600;
		this.waterDroplets = null;
	}

	@Override
	public void updateEntity()
	{
		if (++frame > 1800) frame = 0;

		if (progressTicks < totalTicks)
		{
			progressTicks++;
		}
		else
		{
			progressTicks = 0;
			if (waterDroplets == null)
			{
				waterDroplets = new ItemStack(StarWarsMod.waterDroplet, 1);
			}
			else
			{
				if (waterDroplets.stackSize < 64)
				{
					waterDroplets.stackSize++;
				}
			}
		}
	}

	@Override
	public void readFromNBT(NBTTagCompound tag)
	{
		super.readFromNBT(tag);
		this.waterDroplets = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("droplets"));
		this.progressTicks = tag.getInteger("progress");
	}

	@Override
	public void writeToNBT(NBTTagCompound tag)
	{
		super.writeToNBT(tag);
		tag.setInteger("progress", this.progressTicks);
		if (this.waterDroplets != null)
		{
			NBTTagCompound produce = new NBTTagCompound();
			produce = this.waterDroplets.writeToNBT(produce);
			tag.setTag("droplets", produce);
		}
	}

	@Override
	public int getSizeInventory()
	{
		return 1;
	}

	@Override
	public ItemStack getStackInSlot(int p_70301_1_)
	{
		return waterDroplets;
	}

	@Override
	public ItemStack decrStackSize(int slot, int decrement)
	{
		if (waterDroplets == null)
			return null;
		else
		{
			if (decrement < waterDroplets.stackSize)
			{
				ItemStack take = waterDroplets.splitStack(decrement);
				if (waterDroplets.stackSize <= 0) waterDroplets = null;
				return take;
			}
			else
			{
				ItemStack take = waterDroplets;
				waterDroplets = null;
				return take;
			}
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int p_70304_1_)
	{
		if (waterDroplets == null) return null;
		ItemStack take = waterDroplets;
		waterDroplets = null;
		return take;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack)
	{
		waterDroplets = stack;
	}

	@Override
	public String getInventoryName()
	{
		return "Moisture Vaporator";
	}

	@Override
	public boolean hasCustomInventoryName()
	{
		return false;
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player)
	{
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this && player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openInventory()
	{
	}

	@Override
	public void closeInventory()
	{
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_)
	{
		return false;
	}
}