package com.shadowygamer;

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
		
		
		String dStatue = "The oxidized copper on the statue creates a spark of curiosity...";
		String dBuilding = "You bear witness to the remnants of a civilization long gone and wonder...";
		
		Info Statue = new Info("statue", grid, new Coords2D(2, 2), dStatue);
		Info Building = new Info("building", grid, new Coords2D(), dBuilding);
		Player player = new Player("player", grid, new StatBuilder());
		
		Register.instantRegister(player);
		Register.instantRegister(Building);
		Register.instantRegister(Statue);
		
		System.out.println(Register.SearchByID(Register.SearchByCoordinates(player.getLocation()).get(1).getGameID()));
	}
}