package com.shadowygamer.custom;

import com.shadowygamer.Stat;
import com.shadowygamer.item_components.Consumable;
import com.shadowygamer.item_components.Item;
import com.shadowygamer.item_components.Rarities;
import com.shadowygamer.objects.Player;

public class HealthPotion extends Item implements Consumable {
	
	public HealthPotion(String pName, Player pPlayer) {
		super(pName, "healthpotion", Rarities.COMMON, pPlayer);
	}

	@Override
	public void consume() {
		HealthStat playerHealth;
		for(Stat i : player.getPlayerStats()) {
			if (i instanceof HealthStat) {
				playerHealth = (HealthStat) i;
				playerHealth.addValue(3);
				removeItem();
			}
		}
	}

	//get validity function for browse inventory?
}
