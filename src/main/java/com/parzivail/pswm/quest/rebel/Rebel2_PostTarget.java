package com.parzivail.pswm.quest.rebel;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsItems;
import com.parzivail.pswm.StarWarsMod;
import com.parzivail.pswm.items.ItemQuestLog;
import com.parzivail.pswm.network.MessageSetPlayerHolding;
import com.parzivail.pswm.quest.DialogTree;
import com.parzivail.pswm.quest.Quest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import static com.parzivail.pswm.items.ItemQuestLog.isQuestDone;
import static com.parzivail.pswm.items.ItemQuestLog.setQuestDone;
import static com.parzivail.pswm.quest.QuestBank.rebel2;

/**
 * Created by Colby on 5/8/2016.
 */
public class Rebel2_PostTarget extends Quest
{
	public Rebel2_PostTarget()
	{
		this.tree = new DialogTree();
		this.tree.npcHeader = "Well you've sure got two eyes and you can see the target, but it looks like you might have learned how to shoot from a Stormtrooper, Shiny.";
		this.tree.response1 = "Is it really that bad?";
		this.tree.response1DT = new DialogTree();
		this.tree.response1DT.npcHeader = "It looks worse than a Tauntaun smells, that's for sure.";
		this.tree.response1DT.response1 = "What's a Tauntaun?";
		this.tree.response1DT.response1DT = new DialogTree();
		this.tree.response1DT.response1DT.npcHeader = "Enough chatter Shiny, now that you've got your armor and proved you're capable of firing a blaster, it's my duty to welcome you fully into The Rebel Alliance. Take a while and get acquainted with the base and the other Rebels, and don't even think about taking a ship out seeing as how you lack the training. When you're ready for your first assignment come find me. I'll give you a hint where you'll be going, it's cold and there's Wampas.";
		this.tree.response1DT.response2 = "I eat Tauntaun for breakfast old man.";
		this.tree.response1DT.response2DT = new DialogTree();
		this.tree.response1DT.response2DT.npcHeader = "Enough chatter Shiny, now that you've got your armor and proved you're capable of firing a blaster, it's my duty to welcome you fully into The Rebel Alliance. Take a while and get acquainted with the base and the other Rebels, and don't even think about taking a ship out seeing as how you lack the training. When you're ready for your first assignment come find me. I'll give you a hint where you'll be going, it's cold and there's Wampas.";
		this.tree.response1DT.response3 = "Sorry sir but I don't understand the joke.";
		this.tree.response1DT.response3DT = new DialogTree();
		this.tree.response1DT.response3DT.npcHeader = "Enough chatter Shiny, now that you've got your armor and proved you're capable of firing a blaster, it's my duty to welcome you fully into The Rebel Alliance. Take a while and get acquainted with the base and the other Rebels, and don't even think about taking a ship out seeing as how you lack the training. When you're ready for your first assignment come find me. I'll give you a hint where you'll be going, it's cold and there's Wampas.";
		this.tree.response2 = "I bet it's better than you.";
		this.tree.response2DT = new DialogTree();
		this.tree.response2DT.npcHeader = "That's not a bet you want to take, Shiny.";
		this.tree.response2DT.response1 = "You're probably right sir.";
		this.tree.response2DT.response1DT = new DialogTree();
		this.tree.response2DT.response1DT.npcHeader = "Enough chatter Shiny, now that you've got your armor and proved you're capable of firing a blaster, it's my duty to welcome you fully into The Rebel Alliance. Take a while and get acquainted with the base and the other Rebels, and don't even think about taking a ship out seeing as how you lack the training. When you're ready for your first assignment come find me. I'll give you a hint where you'll be going, it's cold and there's Wampas.";
		this.tree.response2DT.response2 = "I'll take you on any day gramps.";
		this.tree.response2DT.response2DT = new DialogTree();
		this.tree.response2DT.response2DT.npcHeader = "Enough chatter Shiny, now that you've got your armor and proved you're capable of firing a blaster, it's my duty to welcome you fully into The Rebel Alliance. Take a while and get acquainted with the base and the other Rebels, and don't even think about taking a ship out seeing as how you lack the training. When you're ready for your first assignment come find me. I'll give you a hint where you'll be going, it's cold and there's Wampas.";
		this.tree.response2DT.response3 = "I'm sure I could hold my own sir.";
		this.tree.response2DT.response3DT = new DialogTree();
		this.tree.response2DT.response3DT.npcHeader = "Enough chatter Shiny, now that you've got your armor and proved you're capable of firing a blaster, it's my duty to welcome you fully into The Rebel Alliance. Take a while and get acquainted with the base and the other Rebels, and don't even think about taking a ship out seeing as how you lack the training. When you're ready for your first assignment come find me. I'll give you a hint where you'll be going, it's cold and there's Wampas.";
		this.tree.response3 = "Well there's always room for improvement right?";
		this.tree.response3DT = new DialogTree();
		this.tree.response3DT.npcHeader = "Not much, but Stormtroopers couldn't hit the broad side of a Sarlacc so you'll have time for a few extra shots in combat.";
		this.tree.response3DT.response1 = "Combat sir? I don't think i'm ready to see combat yet.";
		this.tree.response3DT.response1DT = new DialogTree();
		this.tree.response3DT.response1DT.npcHeader = "Enough chatter Shiny, now that you've got your armor and proved you're capable of firing a blaster, it's my duty to welcome you fully into The Rebel Alliance. Take a while and get acquainted with the base and the other Rebels, and don't even think about taking a ship out seeing as how you lack the training. When you're ready for your first assignment come find me. I'll give you a hint where you'll be going, it's cold and there's Wampas.";
		this.tree.response3DT.response2 = "I think it's them who'll be needing the extra time. It'll take a while for them to regroup after I blast em all.";
		this.tree.response3DT.response2DT = new DialogTree();
		this.tree.response3DT.response2DT.npcHeader = "Enough chatter Shiny, now that you've got your armor and proved you're capable of firing a blaster, it's my duty to welcome you fully into The Rebel Alliance. Take a while and get acquainted with the base and the other Rebels, and don't even think about taking a ship out seeing as how you lack the training. When you're ready for your first assignment come find me. I'll give you a hint where you'll be going, it's cold and there's Wampas.";
		this.tree.response3DT.response3 = "That's certainly reassuring sir, I'm sure my fellow Rebels will watch my back too.";
		this.tree.response3DT.response3DT = new DialogTree();
		this.tree.response3DT.response3DT.npcHeader = "Enough chatter Shiny, now that you've got your armor and proved you're capable of firing a blaster, it's my duty to welcome you fully into The Rebel Alliance. Take a while and get acquainted with the base and the other Rebels, and don't even think about taking a ship out seeing as how you lack the training. When you're ready for your first assignment come find me. I'll give you a hint where you'll be going, it's cold and there's Wampas.";
	}

	@Override
	public boolean canBeGivenQuest(EntityPlayer player)
	{
		return !isQuestDone(player, this) && rebel2.isQuestComplete(player) && ItemQuestLog.getTargetKills(ItemQuestLog.getQuestContainer(player)) >= 10;
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
		StarWarsMod.network.sendToServer(new MessageSetPlayerHolding(player, new ItemStack(StarWarsItems.silverImperialCredit, 2), true));
		setQuestDone(player, this);
	}

	@Override
	public DialogTree getDialog(EntityPlayer player)
	{
		return tree;
	}

	@Override
	public String getQuestgiverName()
	{
		return "Rex";
	}

	@Override
	public String getID()
	{
		return " Target Practice ";
	}
}
