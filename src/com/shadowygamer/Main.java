package com.shadowygamer;

import java.util.ArrayList;

import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.GameID;
import com.shadowygamer.components.Grid2D;
import com.shadowygamer.components.Stat;
import com.shadowygamer.components.StatBuilder;
import com.shadowygamer.objects.GameObject;
import com.shadowygamer.objects.Info;
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
			"Die",
			"9/11"
		};
		
		String dStatue = "The oxidized copper on the statue creates a spark of curiosity...";
		String dBuilding = "You bear witness to the remnants of a civilization long gone and wonder...";
		
		Info Statue = new Info("statue", grid, new Coords2D(2, 2), dStatue);
		Info Building = new Info("building", grid, new Coords2D(), dBuilding);
		Info Building2 = new Info("building2", grid, new Coords2D(1, 3), dBuilding);
		Player player = new Player("player", grid, new StatBuilder());
		
		Register.instantRegister(player);
		Register.instantRegister(Building);
		Register.instantRegister(Building2);
		Register.instantRegister(Statue);
				
		gameloop:
		while(true) {
			Utils.timeDelay(150);
			System.out.println("\nLocation: " + player.getLocation());
			Utils.timeDelay(300);
			switch(Utils.prompt(options)) {
				case 0:
					player.shiftY(1);
					continue;
				case 1:
					player.shiftY(-1);
					continue;
				case 2:
					player.shiftX(1);
					continue;
				case 3:
					player.shiftX(-1);
					continue;
				case 4:
					GameObject firstInfoObjectOnSpace = Utils.getFirstMatchingType(Register.SearchByCoordinates(player.getLocation()), Info.type);
					if(firstInfoObjectOnSpace == null) break;
					Utils.timeDelay(400);
					System.out.println(((Info)firstInfoObjectOnSpace).getDescriptor());
					continue;
				case 5:
					for(GameObject i : Register.instances.values()) {
						Utils.timeDelay(100);
						System.out.println(i.getGameID() + " (" + i.getLocation() + ")");
					}
					Utils.timeDelay(800);
					continue;
				case 6:
					System.out.println("Terminating");
					break gameloop;
				case 7:
					System.out.println("Its time to 9 my 11");
					Register.defenestrateRegister(GameID.readByString("info:building"));
					Register.defenestrateRegister(GameID.readByString("info:building2"));
					continue;
			}
			System.out.println("Invalid Choice");
		}
	}
}