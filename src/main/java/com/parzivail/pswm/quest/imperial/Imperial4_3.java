package com.parzivail.pswm.quest.imperial;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsItems;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.armor.ArmorSandtrooper;
import com.parzivail.pswm.network.MessageSetPlayerHolding;
import com.parzivail.pswm.quest.DialogTree;
import com.parzivail.pswm.quest.Quest;
import com.parzivail.pswm.quest.QuestUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import static com.parzivail.pswm.items.ItemQuestLog.isQuestDone;
import static com.parzivail.pswm.items.ItemQuestLog.setQuestDone;
import static com.parzivail.pswm.quest.QuestBank.imperial4_2;

/**
 * Created by Colby on 5/8/2016.
 */
public class Imperial4_3 extends Quest
{
	public Imperial4_3()
	{
		this.tree = new DialogTree();
		this.tree.npcHeader = "Now that you've got your armor it's time to brief you on your mission Trooper.";
		this.tree.response1 = "Isn't this armor a bit dirty Sir?";
		this.tree.response1DT = new DialogTree();
		this.tree.response1DT.npcHeader = "Quit complaining and listen up Trooper. There are 2 escaped droids somewhere on this planet and we need to capture them. They should be near a downed escape pod. You're looking for a gold Protocol Droid and a blue Astromech. Bring them to me. Take a Dewback if you wish, you'll have to tame it first though, and the Quartermaster has saddles.";
		this.tree.response1DT.response1 = "Sir Yes Sir!";
		this.tree.response1DT.response1DT = new DialogTree();
		this.tree.response2 = "It feels good to finally be off Endor.";
		this.tree.response2DT = new DialogTree();
		this.tree.response2DT.npcHeader = "You're not on vacation Trooper, now shut it and listen. There are 2 escaped droids somewhere on this planet near a downed escape pod. You're looking for a gold Protocol Droid and a blue Astromech. Bring them to me. Take a Dewback if you wish, you'll have to tame it first though, and the Quartermaster has saddles.";
		this.tree.response2DT.response1 = "Sir Yes Sir!";
		this.tree.response2DT.response1DT = new DialogTree();
		this.tree.response3 = "Anything for the Empire Sir!";
		this.tree.response3DT = new DialogTree();
		this.tree.response3DT.npcHeader = "Good to hear Trooper. I need you to find and bring back 2 escaped droids. You'll be looking for a gold Protocol Droid and a blue Astromech. Bring them to me unharmed, we need information that they carry about the Rebels. Take a Dewback if you wish, you'll have to tame it first though, and the Quartermaster has saddles.";
		this.tree.response3DT.response1 = "Sir Yes Sir!";
		this.tree.response3DT.response1DT = new DialogTree();
	}

	@Override
	public String getQuestgiverName()
	{
		return "Furgan";
	}

	@Override
	public boolean canBeGivenQuest(EntityPlayer player)
	{
		return !isQuestDone(player, this) && imperial4_2.isQuestComplete(player) && QuestUtils.hasOnArmor(player, ArmorSandtrooper.class);
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
		player.playSound(Resources.MODID + ":" + "quest.complete", 1, 1);
		StarWarsMod.network.sendToServer(new MessageSetPlayerHolding(player, new ItemStack(StarWarsItems.silverImperialCredit, 4), true));
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
		return "  Sandy Troopers  ";
	}
}
