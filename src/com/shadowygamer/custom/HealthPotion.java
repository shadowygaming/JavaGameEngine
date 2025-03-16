package com.shadowygamer.custom;

import com.shadowygamer.components.Consumable;
import com.shadowygamer.components.Stat;
import com.shadowygamer.objects.Player;

public class HealthPotion extends RarityItem implements Consumable {
	
	public HealthPotion(String pName, Player pPlayer) {
		super(pName, "healthpotion", pPlayer, Rarities.COMMON);
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
}
