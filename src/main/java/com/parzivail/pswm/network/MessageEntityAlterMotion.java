package com.parzivail.pswm.network;

import com.parzivail.pswm.StarWarsMod;
import com.parzivail.util.network.PMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;

public class MessageEntityAlterMotion extends PMessage<MessageEntityAlterMotion>
{
	public Entity entity;
	public Vec3 motion;

	public MessageEntityAlterMotion()
	{
	}

	public MessageEntityAlterMotion(Entity entity, Vec3 motion)
	{
		this.entity = entity;
		this.motion = motion;
	}

	@Override
	public IMessage handleMessage(MessageContext context)
	{
		if (this.entity != null)
		{
			this.entity.motionX += this.motion.xCoord;
			this.entity.motionY += this.motion.yCoord;
			this.entity.motionZ += this.motion.zCoord;
			this.entity.isAirBorne = true;

			//Lumberjack.log(entity);

			StarWarsMod.network.sendToAll(new MessageEntityAlterClientMotion(entity, motion));
		}
		return null;
	}
}
