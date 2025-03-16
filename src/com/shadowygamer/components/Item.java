package com.shadowygamer.components;

import com.shadowygamer.objects.Player;

abstract public class Item {
	public static final String TYPE = "item";
	private GameID itemID;
	protected final Player player;
	
	public Item(String pName, String pType, Player pPlayer) {
		itemID = new GameID(pType, pName);
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
}