package com.shadowygamer.items;

import com.shadowygamer.components.GameID;
import com.shadowygamer.objects.Player;

abstract public class Item {
	public static final String TYPE = "item";
	private GameID itemID;
	private final Rarities RARITY;
	protected final Player player;
	
	public Item(String pName, String pType, Rarities pRarity, Player pPlayer) {
		itemID = new GameID(pType, pName);
		RARITY = pRarity;
		player = pPlayer;
		pPlayer.AddToInventory(this);
	}
	
	public Item(String pName, String pType, Player pPlayer) {
		itemID = new GameID(pType, pName);
		RARITY = Rarities.COMMON;
		player = pPlayer;
		pPlayer.AddToInventory(this);
	}
	
	public boolean removeItem() {
		return player.getInventory().remove(this);
	}
	
	public GameID getGameID() {
		return itemID;
	}
	
	public String toString() {
		return itemID.toString();
	}
	
	public Rarities getRarity() {
		return RARITY;
	}
}