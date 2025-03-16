package com.shadowygamer.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.shadowygamer.Stat;
import com.shadowygamer.components.GameID;
import com.shadowygamer.components.Grid2D;
import com.shadowygamer.item_components.Item;

public class Player extends GameObject {
	private ArrayList<Stat> Stats;
	private ArrayList<Item> Inventory = new ArrayList<Item>();


	public Player(String pName, Grid2D pGrid, Stat... pStats) {
		super(pName, "player", pGrid);
		Stats = new ArrayList<>(Arrays.asList(pStats));
	}
	
	public Player(String pName, Grid2D pGrid) {
		super(pName, TYPE, pGrid);
	}
	
	public ArrayList<Stat> getPlayerStats() {
		return Stats;
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
	
	public HashMap<String, Stat> getStatsAsHashMap() {
		HashMap<String, Stat> statsHashMap = new HashMap<String, Stat>();
		for(Stat i : Stats) {
			statsHashMap.put(i.getName(), i);
		}
		return statsHashMap;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	

}