package com.shadowygamer.objects;

import java.util.ArrayList;
import java.util.HashMap;

import com.shadowygamer.components.GameID;
import com.shadowygamer.components.Grid2D;
import com.shadowygamer.items_components.Item;

public class Player extends GameObject {
	private HashMap<String, Integer> Stats = new HashMap<>();
	private ArrayList<Item> Inventory = new ArrayList<Item>();


	public Player(String pName, Grid2D pGrid, HashMap<String, Integer> pStats) {
		super(pName, "player", pGrid);
		Stats = pStats;
	}
	
	public Player(String pName, Grid2D pGrid) {
		super(pName, TYPE, pGrid);
	}

	public HashMap<String, Integer> getStatList() {
		return Stats;
	}

	
	public void setStat(String pKey, int pValue) {
		Stats.replace(pKey, pValue);
	}
	
	public int getStat(String pKey) {
		return Stats.get(pKey);
	}
	
	public Item SearchByID(GameID x) {
		for(Item i : Inventory) {
			if(i.getGameID().equals(x)) {
				return i;
				
			}
		}
		return null;
	}
	
	public boolean AddToInventory(Item x) {
		if (!Inventory.contains(x)) {
			Inventory.add(x);
			return true;
		}
		return false;
	}
	
	public ArrayList<Item> getInventory() {
		return Inventory;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	

}