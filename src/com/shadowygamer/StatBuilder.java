package com.shadowygamer;

import java.util.ArrayList;
import com.shadowygamer.components.Stat;

public class StatBuilder {
	public ArrayList<Stat> statList = new ArrayList<Stat>();

	public StatBuilder(Stat... pStatList) {
		for(Stat i : pStatList) {
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

	// public ArrayList<Stat> getStatList() {
	// 	return statList;
	// }
}
