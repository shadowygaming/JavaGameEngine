package com.shadowygamer.objects;

import com.shadowygamer.Grid2D;
import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.GameID;

public class GameObject {
	public static String type = "gameobject";
	private Coords2D local;
	private GameID objectID;
	private Grid2D home;


	public GameObject(String pName, String pType, Grid2D pGrad) {
		objectID = new GameID(pType, pName);
		local = new Coords2D();
		home = pGrad;
	}

	//TODO: add error handling for invalid points (3)
	public void setLocation(int pX, int pY) {
		if(!home.isValidPointOnGrid(pX, pY)) {
			return;
		}
		local = new Coords2D(pX, pY);
	}

	public void shiftX(int pX) {
		if(!home.isValidPointOnGrid(pX, local.getY())) {
			return;
		}
		local = new Coords2D(local.getX()+pX, local.getY());
	}

	public void shiftY(int pY) {
		if(!home.isValidPointOnGrid(local.getX(), pY)) {
			return;
		}
		local = new Coords2D(local.getX(), local.getY()+pY);
	}

	public String getGameID() {
		return objectID.toString();
	}

	public String getLocation() {
		return local.toString();
	}
}
