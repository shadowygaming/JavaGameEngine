package com.shadowygamer;

import java.util.HashMap;

import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.GameID;
import com.shadowygamer.components.Grid2D;
import com.shadowygamer.custom.DetonateExplosives;
import com.shadowygamer.custom.HealthPotion;
import com.shadowygamer.objects.GameObject;
import com.shadowygamer.objects.Info;
import com.shadowygamer.objects.Interactable;
import com.shadowygamer.objects.Player;

public class Main {
	
	

	public static void main(String[] args) {
		Grid2D grid = new Grid2D();
		
		String[] options = {
			"North",
			"South",
			"Feast",
			"Weast",
			"Look Around",
			"Map",
			"Interact",
			"use item",
			"Die"
		};
		
		String[] invalidOptions = new String[options.length];
		
		String dStatue = "The oxidized copper on the statue creates a spark of curiosity...";
		String dBuilding = "You bear witness to the remnants of a civilization long gone and wonder...";
		HashMap<String, Integer> playerStats = new HashMap<>();
		playerStats.put("health", 10);
		
		Info Statue = new Info("statue", grid, new Coords2D(2, 2), dStatue);
		Info Building = new Info("building1", grid, new Coords2D(), dBuilding);
		Info Building2 = new Info("building2", grid, new Coords2D(1, 3), dBuilding);
		Player player = new Player("player", grid, playerStats);
		DetonateExplosives test = new DetonateExplosives("plane", grid, new Coords2D(4, 4));
		
		Register.createRegistry(player);
		Register.createRegistry(Building);
		Register.createRegistry(Building2);
		Register.createRegistry(Statue);
		Register.createRegistry(test);
				
		gameloop:
		while(true) {
			Coords2D playerLocation = player.getLocation();
			GameObject firstInfoObjectOnSpace = Utils.getFirstMatchingType(Register.SearchByCoordinates(playerLocation), Info.TYPE);
			GameObject firstInteractableOnSpace = Utils.getFirstMatchingType(Register.SearchByCoordinates(playerLocation), Interactable.TYPE);
			System.out.println("\nLocation: " + playerLocation);
			Utils.timeDelay(300);
			
			invalidOptions[0] = (grid.isValidPointOnGrid(playerLocation.getX(), playerLocation.getY() + 1)) ? "" : options[0];
			invalidOptions[1] = (grid.isValidPointOnGrid(playerLocation.getX(), playerLocation.getY() - 1)) ? "" : options[1];
			invalidOptions[2] = (grid.isValidPointOnGrid(playerLocation.getX() + 1, playerLocation.getY())) ? "" : options[2];
			invalidOptions[3] = (grid.isValidPointOnGrid(playerLocation.getX() - 1, playerLocation.getY())) ? "" : options[3];
			invalidOptions[4] = (firstInfoObjectOnSpace != null) ? "" : options[4];
			invalidOptions[6] = (firstInteractableOnSpace != null) ? "" : options[6];
			
			System.out.println(player.getStat("health"));
			
			switch(Utils.prompt(options, invalidOptions)) {
				default:
					Utils.timeDelay(200);
				case 0:
					player.shiftY(1);
					break;
				case 1:
					player.shiftY(-1);
					break;
				case 2:
					player.shiftX(1);
					break;
				case 3:
					player.shiftX(-1);
					break;
				case 4:
					System.out.println(((Info)firstInfoObjectOnSpace).getDescriptor());
					break;
				case 5:
					for(GameObject i : Register.instances.values()) {
						Utils.timeDelay(100);
						System.out.println(i.getGameID() + " (" + i.getLocation() + ")");
					}
					Utils.timeDelay(800);
					break;
				case 6:
					test.Interact();
					player.Inventory.add(new HealthPotion("health", Rarities.COMMON, player));
					break;
				case 7:
					player.Consume(GameID.readByString("healthpotion:health"));
					break;
				case 8:
					System.out.println("Terminating");
					break gameloop;
			}
		}
	}
}