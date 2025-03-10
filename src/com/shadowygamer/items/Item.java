package com.shadowygamer.items;

import com.shadowygamer.Rarities;
import com.shadowygamer.components.GameID;

public class Item {
	public static final String TYPE = "item";
	private GameID itemID;
	private Rarities rarities;
	
	public Item(String pName, String pType, Rarities pRarity) {
		itemID = new GameID(pType, pName);
		setRarities(pRarity);
	}
	
	public Item(String pName, String pType) {
		itemID = new GameID(pType, pName);
		setRarities(Rarities.COMMON);
	}
	
	
	public GameID getGameID() {
		return itemID;
	}
	
	public String toString() {
		return itemID.toString();
	}
	
	public Rarities getRarities() {
		return rarities;
	}
	
	public void setRarities(Rarities rarities) {
		this.rarities = rarities;
	}
	
	public void consume() {
		
	}
}
