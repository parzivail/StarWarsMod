package com.parzivail.util.world;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityChest;

public class ItemUtils
{
	/**
	 * Initializes a stack's NBT tags, if needed.
	 *
	 * @param stack The stack to init
	 * @return Returns true if the stack didn't have an NBT tag, and one was
	 * created, false in any other case
	 */
	public static boolean initNBT(ItemStack stack)
	{
		if (stack == null)
			return false;
		if (stack.stackTagCompound == null)
		{
			stack.stackTagCompound = new NBTTagCompound();
			return true;
		}
		return false;
	}

	public static boolean is(ItemStack stack, Item item)
	{
		return is(stack, item, 0);
	}

	public static boolean is(ItemStack stack, Item item, int meta)
	{
		return stack != null && stack.getItem() == item && stack.getItemDamage() == meta;
	}

	public static boolean are(ItemStack[] stacks, Item item)
	{
		return are(stacks, item, 0);
	}

	public static boolean are(ItemStack[] stacks, Item item, int meta)
	{
		boolean flag = true;
		for (ItemStack stack : stacks)
			flag = flag && is(stack, item, meta);
		return flag;
	}

	public static boolean deinc(ItemStack stack, int amount)
	{
		if (!canDeinc(stack, amount))
			return false;

		stack.stackSize -= amount;
		return true;
	}

	public static boolean canDeinc(ItemStack stack, int amount)
	{
		return !(stack == null || stack.stackSize < amount);
	}

	public static boolean inc(ItemStack stack, int amount)
	{
		if (!canInc(stack, amount))
			return false;

		stack.stackSize += amount;
		return true;
	}

	public static boolean canInc(ItemStack stack, int amount)
	{
		return !(stack == null || stack.stackSize + amount > 64);
	}

	public static boolean hasItems(EntityPlayer player, ItemStack... itemStacks)
	{
		for (ItemStack stack : itemStacks)
			if (!hasItemStackExact(player, stack))
				return false;
		return true;
	}

	public static boolean hasItemStackExact(EntityPlayer player, ItemStack stack)
	{
		for (int i = 0; i < player.inventory.mainInventory.length; ++i)
			if (player.inventory.mainInventory[i] != null && player.inventory.mainInventory[i].isItemEqual(stack) && player.inventory.mainInventory[i].stackSize >= stack.stackSize)
				return true;
		return false;
	}

	public static void removePlayerItem(EntityPlayer player, ItemStack stack)
	{
		for (int i = 0; i < player.inventory.mainInventory.length; ++i)
			if (player.inventory.mainInventory[i] != null && player.inventory.mainInventory[i].isItemEqual(stack))
			{
				player.inventory.mainInventory[i].stackSize -= stack.stackSize;
				if (player.inventory.mainInventory[i].stackSize <= 0)
					player.inventory.mainInventory[i] = null;
			}
	}

	public static int getAmount(EntityPlayer player, ItemStack itemStack)
	{
		int r = 0;
		for (int i = 0; i < player.inventory.mainInventory.length; ++i)
			if (player.inventory.mainInventory[i] != null && player.inventory.mainInventory[i].isItemEqual(itemStack))
				r += player.inventory.mainInventory[i].stackSize;
		return r;
	}

	public static boolean hasAnyOfType(EntityPlayer player, Class<? extends Item> itemClass)
	{
		for (int i = 0; i < player.inventory.mainInventory.length; ++i)
			if (player.inventory.mainInventory[i] != null && itemClass.isInstance(player.inventory.mainInventory[i].getItem()))
				return true;
		return false;
	}

	public static boolean isChestEmpty(TileEntityChest t)
	{
		if (t == null)
			return true;
		for (int i = 0; i < t.getSizeInventory(); i++)
			if (t.getStackInSlot(i) != null)
				return false;
		return true;
	}
}
