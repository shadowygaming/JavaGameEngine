package com.shadowygamer.custom;

import com.shadowygamer.items.Item;
import com.shadowygamer.items.Rarities;
import com.shadowygamer.objects.Player;

public class RockItem extends Item {
	
	public RockItem(String pName, Player pPlayer) {
		super(pName, "rock", Rarities.COMMON, pPlayer);
	}
}
