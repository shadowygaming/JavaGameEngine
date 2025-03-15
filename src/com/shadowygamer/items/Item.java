package com.shadowygamer.items;

import com.shadowygamer.components.GameID;

abstract public class Item {
	public static final String TYPE = "item";
	private GameID itemID;
	private Rarities rarity;
	
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
		return rarity;
	}
	
	protected void setRarity(Rarities pRarity) {
		rarity = pRarity;
	}
	
	abstract public void consume();
}