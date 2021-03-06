package com.parzivail.pswm.quest.imperial;

import com.parzivail.pswm.items.ItemQuestLog;
import com.parzivail.pswm.quest.DialogTree;
import com.parzivail.pswm.quest.Quest;
import com.parzivail.pswm.quest.QuestStats;
import net.minecraft.entity.player.EntityPlayer;

import static com.parzivail.pswm.items.ItemQuestLog.isQuestDone;
import static com.parzivail.pswm.items.ItemQuestLog.setQuestDone;
import static com.parzivail.pswm.quest.QuestBank.imperial2;

/**
 * Created by Colby on 5/8/2016.
 */
public class Imperial3_1 extends Quest
{
	public Imperial3_1()
	{
		this.tree = new DialogTree();
		this.tree.npcHeader = "Your performance on your last mission was above satisfactory so we're moving you over to the Scout Trooper detachment. Go see the Quartermaster for your armor and your pistol then report back to me.";
		this.tree.response1 = "Yes Sir, thank you Sir!";
		this.tree.response1DT = new DialogTree();
	}

	@Override
	public String getQuestgiverName()
	{
		return "Cody";
	}

	@Override
	public boolean canBeGivenQuest(EntityPlayer player)
	{
		return !isQuestDone(player, this) && imperial2.isQuestComplete(player) && ItemQuestLog.getStat(player, QuestStats.ANTENNAS_FIXED) >= 4;
	}

	@Override
	public void begin(EntityPlayer player)
	{

	}

	@Override
	public boolean isQuestComplete(EntityPlayer player)
	{
		return isQuestDone(player, this);
	}

	@Override
	public void end(EntityPlayer player)
	{
		setQuestDone(player, this);
	}

	@Override
	public DialogTree getDialog(EntityPlayer player)
	{
		return tree;
	}

	@Override
	public String getID()
	{
		return "Recon Mission";
	}
}
