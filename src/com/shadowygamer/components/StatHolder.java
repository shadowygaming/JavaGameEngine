package com.shadowygamer.components;

import java.util.ArrayList;

//this is literally just a custom implementation of map?
//Too Bad!
public class StatHolder {
	public ArrayList<Stat> statList = new ArrayList<Stat>();

	public StatHolder(Stat... pStats) {
		for(Stat i : pStats) {
			statList.add(i);
		}
	}

	public int getIndexOfStat(String pName) {
		for(int i = 0; i < statList.size(); i++) {
			if(statList.get(i).getName().equals(pName)) {
				return i;
			}
		}
		return 0;
	}

	public String toString() {
		String temp = "{\n";
		for(Stat i : statList) {
			temp += "\t[\"" + i.getName() + "\", " + i.getValue() + "]\n";
		}
		temp += "}";
		return temp;
	}
}
