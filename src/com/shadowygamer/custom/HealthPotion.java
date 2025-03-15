package com.shadowygamer.custom;

import com.shadowygamer.items_components.Consumable;
import com.shadowygamer.items_components.Item;
import com.shadowygamer.items_components.Rarities;
import com.shadowygamer.objects.Player;

public class HealthPotion extends Item implements Consumable {
	
	public HealthPotion(String pName, Player pPlayer) {
		super(pName, "healthpotion", Rarities.COMMON, pPlayer);
	}

	@Override
	public void consume() {
		int playerHP = player.getStat("health");
		int playerMaxHP = player.getStat("maxhealth");
		player.setStat("health", ((playerHP + 3) >= playerMaxHP) ? playerMaxHP : playerHP + 3);
		removeItem();
	}
	
	//get validity function for browse inventory?
}
