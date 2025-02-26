package com.shadowygamer.components;

public class Stat {
	private int value;
	private String name;

	public Stat(String pName, int pValue) {
		value = pValue;
		name = pName;
	}

	public int getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	public void setValue(int pValue) {
		value = pValue;
	}
}
