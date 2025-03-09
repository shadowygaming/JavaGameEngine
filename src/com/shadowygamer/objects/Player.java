package com.shadowygamer.objects;

import com.shadowygamer.components.Grid2D;
import com.shadowygamer.components.Stat;
import com.shadowygamer.components.StatHolder;

public class Player extends GameObject {
	public static final String TYPE = "player";
	private StatHolder playerStats;


	public Player(String pName, Grid2D pGrid, StatHolder pStats) {
		super(pName, TYPE, pGrid);
		playerStats = pStats;
	}

	public StatHolder getStatHolder() {
		return playerStats;
	}

	public void setStat(String pName, int pX) {
		Stat temp = playerStats.statList.get(playerStats.getIndexOfStat(pName));
		temp.setValue(pX);
	}
	
	@Override
	public String toString() {
		return super.toString() + playerStats;
	}
}
