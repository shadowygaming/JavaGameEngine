package com.shadowygamer.components;

public class GameID {
	private String type;
	private String name;

	public GameID(String pType, String pName) {
		type = pType;
		name = pName;
	}

	public String toString() {
		return (type + ":" + name);
	}
}
