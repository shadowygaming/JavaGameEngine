package com.shadowygamer.objects;

import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.Grid2D;

public class Info extends GameObject{
	protected static String type = "info";
	private String descriptor;
	
	public Info(String pName, String pDescriptor, Grid2D pGrid, Coords2D pCoords) {
		super(pName, type, pGrid, pCoords);
		descriptor = pDescriptor;
	}
	
	public void setDescriptor(String x) {
		descriptor = x;
	}
	
	public String getDescriptor() {
		return descriptor;
	}
	
	
}
