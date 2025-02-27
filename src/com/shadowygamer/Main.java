package com.shadowygamer;

import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.GameID;
import com.shadowygamer.components.Stat;
import com.shadowygamer.objects.GameObject;
import com.shadowygamer.objects.Player;

public class Main {
	

	public static void main(String[] args) {

		//debug
		// Grid2D luigi = new Grid2D();
		// Player ahh = new Player("barry", luigi);
		// System.out.println(ahh.getGameID());
		// System.out.println(ahh.getLocation());
		// ahh.shiftX(3);
		// System.out.println(ahh.getLocation());
		// ahh.setLocation(3, 3);
		// System.out.println(ahh.getLocation());
		// ahh.setLocation(4, 13);
		// System.out.println(ahh.getLocation());
		// //luigi.printValidSpaces();
		// System.out.println(luigi.isValidPointOnGrid(2, 2));
		// System.out.println(luigi.isValidPointOnGrid(2, 10));


		//example
		Stat health = new Stat("Health", 10);
		Stat maxHealth = new Stat("Max Health", 10);
		Stat damage = new Stat("Damage", 1);

		StatBuilder defaultPlayerStats = new StatBuilder(maxHealth, health, damage);
		Grid2D ExampleGrid = new Grid2D();
		Player defaultPlayer = new Player("name", ExampleGrid, defaultPlayerStats);
		GameObject imposterGameObject = new GameObject("sussy", "gameobject", ExampleGrid);
		Register.instantRegister(defaultPlayer);
		Register.instantRegister(imposterGameObject);
		
		System.out.println(Register.SearchByID(GameID.readByString("player:name")).getLocation());
		System.out.println(Register.SearchByCoordinates(new Coords2D(0, 0)));
		defaultPlayer.shiftX(2);
		System.out.println(Register.SearchByID(GameID.readByString("player:name")).getLocation());
		System.out.println(Register.SearchByCoordinates(new Coords2D(2, 0)));

//		System.out.println(defaultPlayer.getStatBuilder());
//		defaultPlayer.setStat("Health", 5);
//		defaultPlayer.setStat("defense", 11);
//		System.out.println(defaultPlayer.getStatBuilder());
	}
}