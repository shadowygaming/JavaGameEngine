package com.shadowygamer;

import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.Grid2D;
import com.shadowygamer.custom.HealthPotion;
import com.shadowygamer.custom.HealthStat;
import com.shadowygamer.objects.GameObject;
import com.shadowygamer.objects.Info;
import com.shadowygamer.objects.Player;

public class Game {
	
	public static void main(String[] args) {
		Grid2D grid = new Grid2D();
		
		String[] options = {
			"North",
			"South",
			"East",
			"West",
			"Inspect",
			"Check Map",
			"Self Harm",
			"Use Item",
			"Quit"
		};
		
		String[] invalidOptions = new String[options.length];
		
		//create descriptors for info objects
		String buildingDescriptor = "You bear witness to the remnants of a civilization long gone and wonder...";
		
		//create objects for game
		Info Building = new Info("building1", grid, new Coords2D(), buildingDescriptor);
		Info Building2 = new Info("building2", grid, new Coords2D(1, 3), buildingDescriptor);
		Player player = new Player("player", grid, new HealthStat(10, "health"));
		
		new HealthPotion("health_potion", player);
		new HealthPotion("health_potion", player);
		
		while(true) {
			Coords2D playerLocation = player.getLocation();
			HealthStat playerStatHealth = (HealthStat) player.getStatsAsHashMap().get("health");
			int playerHealth = playerStatHealth.getValue();
			int playerMaxHealth = playerStatHealth.getMaxValue();
			GameObject firstInfoObjectOnSpace = Utils.getFirstMatchingType(Register.SearchByCoordinates(playerLocation), Info.TYPE);			
			
			System.out.println("\nLocation: " + playerLocation);
			Utils.timeDelay(300);
			
			invalidOptions[0] = (grid.isValidPointOnGrid(playerLocation.getX(), playerLocation.getY() + 1)) ? "" : options[0];
			invalidOptions[1] = (grid.isValidPointOnGrid(playerLocation.getX(), playerLocation.getY() - 1)) ? "" : options[1];
			invalidOptions[2] = (grid.isValidPointOnGrid(playerLocation.getX() + 1, playerLocation.getY())) ? "" : options[2];
			invalidOptions[3] = (grid.isValidPointOnGrid(playerLocation.getX() - 1, playerLocation.getY())) ? "" : options[3];
			invalidOptions[4] = (firstInfoObjectOnSpace != null) ? "" : options[4];
			invalidOptions[7] = (!player.getInventory().isEmpty()) ? "" : options[7];
			
			if (playerHealth == playerStatHealth.getMinValue()) {System.out.println("You Died...");return;}
			
			System.out.println("HP " + playerHealth + "/" + playerMaxHealth);
			
			switch(Utils.prompt(options, invalidOptions)) {
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
					Utils.cinematicPrint(((Info)firstInfoObjectOnSpace).getDescriptor(), 25);
					break;
				case 5:
					for(GameObject i : Register.instances.values()) {
						Utils.timeDelay(100);
						System.out.println(i.getGameID() + " (" + i.getLocation() + ")");
					}
					Utils.timeDelay(800);
					break;
				case 6:
					playerStatHealth.addValue(-3);
					break;
				case 7:
					Utils.browseForConsumables(player);
					break;
				case 8:
					System.out.println("Closing Game...");
					return;
			}
		}
	}
}