package com.shadowygamer.objects;

import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.Grid2D;

public abstract class Interactable extends GameObject {
	protected boolean used = false;
	
	public Interactable(String pName, String pType, Grid2D pGrid, Coords2D pCoords) {
		super(pName, "interactable", pGrid, pCoords);
		
	}
	
	public abstract void Interact();
}