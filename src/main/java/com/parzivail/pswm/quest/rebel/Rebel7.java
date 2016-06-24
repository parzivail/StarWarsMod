package com.parzivail.pswm.quest.rebel;

import com.parzivail.pswm.quest.DialogTree;
import com.parzivail.pswm.quest.Quest;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Colby on 5/8/2016.
 */
public class Rebel7 extends Quest
{
	public Rebel7()
	{
		this.tree = new DialogTree();
		this.tree.npcHeader = "That AT-ST you brought back is going to be a real help to us soldier, nice job. We've got more pressing matters that need attending however.";
		this.tree.response1 = "What's going on sir?";
		this.tree.response1DT = new DialogTree();
		this.tree.response1DT.npcHeader = "Well, one of our Protocol Droids has been taken by the native Ewoks. Apparently it was wandering around outside the base when they came by and snatched it. I even heard scout reports saying the Ewoks looked like they were worshipping our droid. It's a weird situation to say the least, but in any case, we need that droid back. They've taken it to their village North of here and it's up to you to locate and bring back our droid.";
		this.tree.response1DT.response1 = "What are Ewoks sir?";
		this.tree.response1DT.response1DT = new DialogTree();
		this.tree.response1DT.response1DT.npcHeader = "As far as I know they're basically little Wookiees just without the attitude. They shouldn't be anything to be scared of. Get any supplies you need from the Quartermaster, and try not to upset the locals.";
		this.tree.response1DT.response2 = "Do you mean to tell me those little bear things somehow stole an entire droid?";
		this.tree.response1DT.response2DT = new DialogTree();
		this.tree.response1DT.response2DT.npcHeader = "I honestly don't know how either, soldier. All I know is you're the one that's got to bring the thing back. Get any supplies you need from the Quartermaster, and try not to upset the locals please.";
		this.tree.response1DT.response3 = "Should I be scared of these Ewoks sir?";
		this.tree.response1DT.response3DT = new DialogTree();
		this.tree.response1DT.response3DT.npcHeader = "I heard you killed a Wampa, and on a scary scale of 1 to Wampa, I'd say Ewoks clock in at around negative lightspeed. I can't imagine any life form being scared of these things to be honest with you soldier. Get any supplies you need from the Quartermaster, and don't upset the locals.";
		this.tree.response2 = "What could possibly be more pressing than me having just stolen an AT-ST?";
		this.tree.response2DT = new DialogTree();
		this.tree.response2DT.npcHeader = "Look soldier, not every mission is going to be one for the history books, so listen up. One of our Protocol Droids has been taken by the native Ewoks. Apparently it was wandering around outside the base when they came by and snatched it. I even heard scout reports saying the Ewoks looked like they were worshipping our droid. They've taken it to their village North of here and it's up to you to locate and bring back our droid.";
		this.tree.response2DT.response1 = "Worshipping the Protocol Droid sir?";
		this.tree.response2DT.response1DT = new DialogTree();
		this.tree.response2DT.response1DT.npcHeader = "That's what the scouts said. Why any sentient creature would worship a droid is beyond me soldier. It's your job to bring the dang thing back though. Get any supplies you need from the Quartermaster, and try not to upset the locals.";
		this.tree.response2DT.response2 = "All of my missions will be in the history books, that's for sure.";
		this.tree.response2DT.response2DT = new DialogTree();
		this.tree.response2DT.response2DT.npcHeader = "Maybe for consistent inability and inefficiency. Regardless, just go get the droid back from the Ewoks. Get any supplies you need from the Quartermaster, oh and try not to upset the locals please.";
		this.tree.response2DT.response3 = "If the scouts saw the droid get taken, why didn't they try to stop it?";
		this.tree.response2DT.response3DT = new DialogTree();
		this.tree.response2DT.response3DT.npcHeader = "They thought you'd be the perfect man for the job so they saved it just for you. Think of it as a thank you gift from me to you Shiny. Now go get any supplies you need from the Quartermaster, and don't upset the locals.";
		this.tree.response3 = "I just hope it's not as intense as the last mission sir.";
		this.tree.response3DT = new DialogTree();
		this.tree.response3DT.npcHeader = "It appears you might be in luck then Shiny. One of our Protocol Droids has been taken by the native Ewoks. Apparently it was wandering around outside the base when they came by and snatched it. I even heard scout reports saying the Ewoks looked like they were worshipping our droid. They've taken it to their village North of here and it's up to you to locate and bring back our droid. Get any supplies you need from the Quartermaster, and don't upset the locals.";
		this.tree.response3DT.response1 = "After that last mission I could use a break like this.";
		this.tree.response3DT.response1DT = new DialogTree();
		this.tree.response3DT.response1DT.npcHeader = "Don't get too relaxed soldier, I've heard the Ewoks can be vicious if they need to be. Get any supplies you need from the Quartermaster, and try not to upset the locals.";
		this.tree.response3DT.response2 = "Why does everyone insist on calling me Shiny?";
		this.tree.response3DT.response2DT = new DialogTree();
		this.tree.response3DT.response2DT.npcHeader = "We like to think it deflates that ego of yours, and it reminds you who's in charge here. Now go get any supplies you need from the Quartermaster, and try not to upset the locals please.";
		this.tree.response3DT.response3 = "Should I take a blaster with me?";
		this.tree.response3DT.response3DT = new DialogTree();
		this.tree.response3DT.response3DT.npcHeader = "If you'd like to take a blaster to rescue a droid from some space teddy bears then be my guest Shiny. Don't forget to get any supplies you need from the Quartermaster, and don't upset the locals please.";
	}

	@Override
	public boolean canBeGivenQuest(EntityPlayer player)
	{
		return false;
	}

	@Override
	public void begin(EntityPlayer player)
	{

	}

	@Override
	public boolean isQuestComplete(EntityPlayer player)
	{
		return false;
	}

	@Override
	public void end(EntityPlayer player)
	{

	}

	@Override
	public DialogTree getDialog(EntityPlayer player)
	{
		return tree;
	}

	@Override
	public String getQuestgiverName()
	{
		return "Tantor";
	}

	@Override
	public String getID()
	{
		return "Meeting the Ewoks";
	}
}