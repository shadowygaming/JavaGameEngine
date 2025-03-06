package com.shadowygamer.components;

import java.util.EmptyStackException;
import java.util.Objects;

import com.shadowygamer.objects.GameObject;

public class GameID {
	private String type;
	private String name;

	public GameID(String pType, String pName) {
		type = pType;
		name = pName;
	}
	
	public static GameID readByString(String x) {
		for(int i = 0; i < x.length(); i++) {
			if(x.toCharArray()[i] == ':') {
				return new GameID(x.substring(0, i), x.substring(i+1));
			}
		}
		return null;
	}
	

	public String toString() {
		return (type + ":" + name);
	}
	
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof GameID gameID)) return false;
		return Objects.equals(type, gameID.type) && Objects.equals(name, gameID.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(type, name);
	}
}
