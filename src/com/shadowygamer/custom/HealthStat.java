package com.shadowygamer.custom;

import com.shadowygamer.components.Stat;

public class HealthStat extends Stat {
	int maxValue;
	int minValue;

	public HealthStat(int pValue, String pName, int pMaxValue, int pMinValue) {
		super(pValue, pName);
		maxValue = pMaxValue;
		minValue = pMinValue;
	}
	public HealthStat(int pValue, String pName) {
		this(pValue, pName, pValue, 0);
	}

	@Override
	public void setValue(int newValue) {
		newValue = (newValue < minValue) ? minValue : newValue;
		newValue = (newValue > maxValue) ? maxValue : newValue;
		value = newValue;
	}
	
	@Override
	public void addValue(int amount) {
		amount += value;
		amount = (amount < minValue) ? minValue : amount;
		amount = (amount > maxValue) ? maxValue : amount;
		value = amount;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int pMaxValue) {
		maxValue = pMaxValue;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int pMinValue) {
		minValue = pMinValue;
	}
}
