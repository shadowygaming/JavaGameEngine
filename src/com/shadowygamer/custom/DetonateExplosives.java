package com.shadowygamer.custom;

import com.shadowygamer.Register;
import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.GameID;
import com.shadowygamer.components.Grid2D;
import com.shadowygamer.objects.Interactable;

public class DetonateExplosives extends Interactable {
	
	public DetonateExplosives(String pName, Grid2D pGrid, Coords2D pCoords) {
		super(pName, TYPE, pGrid, pCoords);
	}

	@Override
	public void Interact() {
		System.out.println("Its time to 9 my 11");
		Register.defenestrateRegistry(GameID.readByString("info:building1"));
		Register.defenestrateRegistry(GameID.readByString("info:building2"));
		Register.defenestrateRegistry(this.getGameID());
	}
}