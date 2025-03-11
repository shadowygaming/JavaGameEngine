package com.shadowygamer.items;

import com.shadowygamer.components.GameID;

abstract public class Item {
	public static final String TYPE = "item";
	private GameID itemID;
	private Rarities rarities;
	
	public Item(String pName, String pType, Rarities pRarity) {
		itemID = new GameID(pType, pName);
		setRarity(pRarity);
	}
	
	public Item(String pName, String pType) {
		itemID = new GameID(pType, pName);
		setRarity(Rarities.COMMON);
	}
	
	
	public GameID getGameID() {
		return itemID;
	}
	
	public String toString() {
		return itemID.toString();
	}
	
	public Rarities getRarity() {
		return rarities;
	}
	
	protected void setRarity(Rarities rarities) {
		this.rarities = rarities;
	}
	
	abstract public void consume();
}
