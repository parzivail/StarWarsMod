package com.parzivail.pswm.mobs;

import com.parzivail.util.IDebugProvider;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

public abstract class EntityDroidBase extends EntityTameable implements IDebugProvider
{
	public EntityDroidBase(World world)
	{
		super(world);
		getNavigator().setAvoidsWater(true);
	}
}
