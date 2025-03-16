package com.shadowygamer.custom;

import com.shadowygamer.item_components.Item;
import com.shadowygamer.item_components.Rarities;
import com.shadowygamer.objects.Player;

public class RockItem extends Item {
	
	public RockItem(String pName, Player pPlayer) {
		super(pName, "rock", Rarities.COMMON, pPlayer);
	}
}
