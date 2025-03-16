package com.shadowygamer.custom;

import com.shadowygamer.components.Item;
import com.shadowygamer.objects.Player;

abstract public class RarityItem extends Item{
	public final Rarities rarity;
	
	public RarityItem(String pName, String pType, Player pPlayer, Rarities pRarity) {
		super(pName, pType, pPlayer);
		rarity = pRarity;
	}

	public Rarities getRarity() {
		return rarity;
	}
}
