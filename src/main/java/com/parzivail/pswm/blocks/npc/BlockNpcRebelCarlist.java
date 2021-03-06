package com.parzivail.pswm.blocks.npc;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.items.ItemQuestLog;
import com.parzivail.pswm.quest.Quest;
import com.parzivail.pswm.quest.QuestBank;
import com.parzivail.pswm.tileentities.TileEntityStaticNpc;
import net.minecraft.entity.player.EntityPlayer;

/**
 * @author Colby
 */
public class BlockNpcRebelCarlist extends BlockNpcBase
{
	public BlockNpcRebelCarlist()
	{
		super("rebelMainCarlist", Resources.armors[1], Resources.allegianceRebelFmt);
	}

	@Override
	public Quest getQuestForPlayer(TileEntityStaticNpc questGiver, EntityPlayer player)
	{
		if (ItemQuestLog.getQuestContainer(player) == null)
			return QuestBank.noQuestLog;

		if (QuestBank.rebel4.canBeGivenQuest(player))
			return QuestBank.rebel4;
		else if (QuestBank.rebel5.canBeGivenQuest(player))
			return QuestBank.rebel5;
		else if (QuestBank.rebel6.canBeGivenQuest(player))
			return QuestBank.rebel6;
		else
			return QuestBank.questNotAvailable;
	}
}
