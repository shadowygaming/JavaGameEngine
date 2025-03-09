package com.shadowygamer.objects;

import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.Grid2D;

public class Info extends GameObject {
	public static final String TYPE = "info";
	private String descriptor;
	
	public Info(String pName, Grid2D pGrid, Coords2D pCoords, String pDescriptor) {
		super(pName, TYPE, pGrid, pCoords);
		descriptor = pDescriptor;
	}
	
	public void setDescriptor(String x) {
		descriptor = x;
	}
	
	public String getDescriptor() {
		return descriptor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + descriptor;
	}
	
}
