package com.parzivail.pswm.quest.imperial;

import com.parzivail.pswm.quest.DialogTree;
import com.parzivail.pswm.quest.Quest;
import net.minecraft.entity.player.EntityPlayer;

import static com.parzivail.pswm.items.ItemQuestLog.isQuestDone;
import static com.parzivail.pswm.items.ItemQuestLog.setQuestDone;
import static com.parzivail.pswm.quest.QuestBank.imperial6_1;

/**
 * Created by Colby on 5/8/2016.
 */
public class Imperial6_2 extends Quest
{
	public Imperial6_2()
	{
		this.tree = new DialogTree();
		this.tree.npcHeader = "Welcome to the Snowtrooper Division, Hoth detachment, Trooper. Get out of that Sandtrooper armor and see the Quartermaster for some Snowtrooper armor and any blasters you need then report back to me.";
		this.tree.response1 = "Sir Yes Sir!";
		this.tree.response1DT = new DialogTree();
	}

	@Override
	public String getQuestgiverName()
	{
		return "Veers";
	}

	@Override
	public boolean canBeGivenQuest(EntityPlayer player)
	{
		return !isQuestDone(player, this) && imperial6_1.isQuestComplete(player);
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
		return " The Rebels Will Tremble in Fear ";
	}
}
