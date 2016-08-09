package com.parzivail.pswm.tileentities.sensor;

import com.parzivail.pswm.mobs.trooper.*;

public class TileEntitySensorImperialHeadquarters extends TileEntitySensorPeoplePlace
{
	public TileEntitySensorImperialHeadquarters()
	{
		this.rX = 20;
		this.rY = 20;
		this.rZ = 20;
		this.entityMax = 30;
	}

	public MobTrooper getNewTrooper()
	{
		switch (this.worldObj.rand.nextInt(5))
		{
			case 0:
				return new MobScouttrooper(this.worldObj);
			case 1:
				return new MobStormtrooper(this.worldObj);
			case 2:
				return new MobTiePilot(this.worldObj);
			case 3:
				return new MobRebelTechnician(this.worldObj);
			case 4:
				return new MobAtstPilot(this.worldObj);
			case 5:
				return new MobImperialOfficer(this.worldObj);
			default:
				return null;
		}
	}
}