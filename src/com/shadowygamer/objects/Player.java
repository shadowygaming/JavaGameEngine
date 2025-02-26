package com.shadowygamer.objects;

import com.shadowygamer.Grid2D;
import com.shadowygamer.StatBuilder;
import com.shadowygamer.components.Stat;

public class Player extends GameObject{
	public static String type = "player";
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
}
