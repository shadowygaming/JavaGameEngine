package com.shadowygamer.objects;

import com.shadowygamer.Register;
import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.GameID;
import com.shadowygamer.components.Grid2D;

public class GameObject {
	public static final String TYPE = "gameobject";
	private Coords2D local;
	private GameID objectID;
	private Grid2D home;


	public GameObject(String pName, String pType, Grid2D pGrid, Coords2D pCoords) {
		objectID = new GameID(pType, pName);
		local = pCoords;
		home = pGrid;
		Register.createRegistry(this);
	}
	
	public GameObject(String pName, String pType, Grid2D pGrid) {
		this(pName, pType, pGrid, new Coords2D());
	}

	//TODO: add error handling for invalid points (3)
	public void setLocation(int pX, int pY) {
		if(!home.isValidPointOnGrid(pX, pY)) {
			return;
		}
		local = new Coords2D(pX, pY);
	}

	public void shiftX(int pX) {
		if(!home.isValidPointOnGrid(local.getX() + pX, local.getY())) {
			return;
		}
		local = new Coords2D(local.getX()+pX, local.getY());
	}

	public void shiftY(int pY) {
		if(!home.isValidPointOnGrid(local.getX(), local.getY() + pY)) {
			return;
		}
		local = new Coords2D(local.getX(), local.getY()+pY);
	}

	public GameID getGameID() {
		return objectID;
	}

	public Coords2D getLocation() {
		return local;
	}
	
	public Grid2D getGrid() {
		return home;
	}
	
	public String toString() {
		return objectID + ", " + local;
	}
}
