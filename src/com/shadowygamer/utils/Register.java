package com.shadowygamer.utils;

import java.util.ArrayList;
import java.util.HashMap;
import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.GameID;
import com.shadowygamer.objects.GameObject;

public class Register {
	public static HashMap<GameID, GameObject> instances = new HashMap<GameID, GameObject>();
	
	public static void createRegistry(GameObject x) {
		instances.put(x.getGameID(), x);
	}
	
	public static void defenestrateRegistry(GameID x) {
		instances.remove(x);
	}
	
	public static GameObject SearchByID(GameID x) {
		return instances.get(x);
	}
	
	public static ArrayList<GameObject> SearchByCoordinates(Coords2D pCoords2d) {
		ArrayList<GameObject> temp = new ArrayList<GameObject>();
		for(GameObject i : instances.values()) {
			if(i.getLocation().equals(pCoords2d)) {
				temp.add(i);
			}
		}
		return temp;
	}
}