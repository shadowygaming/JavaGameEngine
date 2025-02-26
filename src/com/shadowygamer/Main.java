package com.shadowygamer;

import com.shadowygamer.components.Stat;
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


		//example stat builder
		Stat health = new Stat("Health", 10);
		Stat maxHealth = new Stat("Max Health", 10);
		Stat damage = new Stat("Damage", 1);

		StatBuilder defaultPlayerStats = new StatBuilder(maxHealth, health, damage);
		Grid2D ExampleGrid = new Grid2D();
		Player defaultPlayer = new Player("name", ExampleGrid, defaultPlayerStats);

		System.out.println(defaultPlayer.getStatBuilder());
		defaultPlayer.setStat("Health", 5);
		defaultPlayer.setStat("defense", 11);
		System.out.println(defaultPlayer.getStatBuilder());
	}

}
