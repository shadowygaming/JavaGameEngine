package com.shadowygamer.objects;

import com.shadowygamer.components.Grid2D;
import com.shadowygamer.components.Stat;
import com.shadowygamer.components.StatBuilder;

public class Player extends GameObject {
	public static final String type = "player";
	private StatBuilder stats;


	public Player(String pName, Grid2D pGrid, StatBuilder pStats) {
		super(pName, type, pGrid);
		stats = pStats;
	}

	public StatBuilder getStatBuilder() {
		return stats;
	}

	public void setStat(String pName, int pX) {
		Stat temp = stats.statList.get(stats.getIndexOfStat(pName));
		temp.setValue(pX);
	}
	
	@Override
	public String toString() {
		return super.toString() + stats;
	}
}
