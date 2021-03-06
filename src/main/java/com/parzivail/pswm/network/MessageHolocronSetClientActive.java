package com.parzivail.pswm.network;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.force.Cron;
import com.parzivail.pswm.rendering.force.RenderSithLightning;
import com.parzivail.util.network.PMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class MessageHolocronSetClientActive extends PMessage<MessageHolocronSetClientActive>
{
	public EntityPlayer player;
	public NBTTagCompound compound;

	public MessageHolocronSetClientActive()
	{
	}

	public MessageHolocronSetClientActive(EntityPlayer player, NBTTagCompound compound)
	{
		this.player = player;
		this.compound = compound;
	}

	@Override
	public IMessage handleMessage(MessageContext context)
	{
		if (this.player == null)
			return null;

		RenderSithLightning.playerPowers.put(player.getCommandSenderName(), compound);

		if (this.player.inventory == null || Cron.getHolocron(player) == null)
			return null;
		Cron.getHolocron(player).stackTagCompound.setTag(Resources.nbtWield, compound);
		return null;
	}

}