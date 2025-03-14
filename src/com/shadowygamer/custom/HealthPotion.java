package com.shadowygamer.custom;

import com.shadowygamer.items.Item;
import com.shadowygamer.items.Rarities;
import com.shadowygamer.objects.Player;

public class HealthPotion extends Item {
	private Player player;
	public static final Rarities RARITIES = Rarities.COMMON; 
	
	public HealthPotion(String pName, Rarities pRarity, Player pPlayer) {
		super(pName, "healthpotion", RARITIES);
		player = pPlayer;
		pPlayer.AddToInventory(this);
	}

	@Override
	public void consume() {
		int playerHP = player.getStat("health");
		int playerMaxHP = player.getStat("maxhealth");
		player.setStat("health", ((playerHP + 3) >= playerMaxHP) ? playerMaxHP : playerHP + 3);
	}
	
	//get validity function for browse inventory?
}
