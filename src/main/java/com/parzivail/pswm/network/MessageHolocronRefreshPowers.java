package com.parzivail.pswm.network;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.force.Cron;
import com.parzivail.util.network.PMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class MessageHolocronRefreshPowers extends PMessage<MessageHolocronRefreshPowers>
{
	public EntityPlayer player;
	public NBTTagCompound compound;

	public MessageHolocronRefreshPowers()
	{
	}

	public MessageHolocronRefreshPowers(EntityPlayer player, NBTTagCompound compound)
	{
		this.player = player;
		this.compound = compound;
	}

	@Override
	public IMessage handleMessage(MessageContext context)
	{
		if (this.player == null || this.player.inventory == null || Cron.getHolocron(player) == null || Cron.getHolocron(player).stackTagCompound == null)
			return null;
		Cron.getHolocron(player).stackTagCompound.setTag(Resources.nbtPowers, compound);
		StarWarsMod.network.sendToAll(new MessageHolocronRefreshClientPowers(this.player, this.compound));
		return null;
	}

}