package com.parzivail.pswm.vehicle;

import com.parzivail.util.driven.Pilotable;
import net.minecraft.world.World;

/**
 * Created by colby on 1/1/2017.
 */
public class VehicXWing extends Pilotable
{
	public VehicXWing(World world)
	{
		super(world);
	}

	public VehicXWing(World world, double i, double j, double k)
	{
		super(world, i, j, k);
	}
}