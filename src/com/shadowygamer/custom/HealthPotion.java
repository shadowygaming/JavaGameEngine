package com.shadowygamer.custom;

import com.shadowygamer.Rarities;
import com.shadowygamer.items.Item;
import com.shadowygamer.objects.Player;

public class HealthPotion extends Item {
	private Player player;
	public static final String TYPE = "healthpotion";
	
	
	public HealthPotion(String pName, Rarities pRarity, Player pPlayer) {
		super(pName, TYPE, pRarity);
		player = pPlayer;
	}

	@Override
	public void consume() {
		player.setStat("health", player.getStat("health") + 3);
	}
}
