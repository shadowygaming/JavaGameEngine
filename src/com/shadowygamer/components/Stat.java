package com.shadowygamer.components;

abstract public class Stat {
	protected int value;
	private final String name;
	
	public Stat(int pValue, String pName) {
		value = pValue;
		name = pName;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	abstract public void setValue(int newValue);
	abstract public void addValue(int amount);
}