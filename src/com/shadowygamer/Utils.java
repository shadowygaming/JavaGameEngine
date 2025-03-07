package com.shadowygamer;

import java.lang.reflect.Array;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Thread;

import com.shadowygamer.components.Coords2D;
import com.shadowygamer.components.GameID;
import com.shadowygamer.objects.GameObject;

public class Utils {
	public static Scanner sc = new Scanner(System.in);
	
	
	public static String getIDsfromList(ArrayList<GameObject> x) {
		String temp = "";
		for (GameObject i : x) {
			temp += i.getGameID() + "\n";
		}
		return temp;
	}
	public static String getCoordsfromList(ArrayList<GameObject> x) {
		String temp = "";
		for (GameObject i : x) {
			temp += i.getLocation() + "\n";
		}
		return temp;
	}
	
	public static int prompt(String... x) {
		int y = 0;
		for(String i : x) {
			System.out.println("[" + y + "] " + i);
			y++;
		}
		while(true) {
			try {
				int z = sc.nextInt();
				if(z < x.length) {
					return z;
				} else {
					System.out.println("Invalid Range");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input");
				sc.next();
				continue;
			}
		}
	}
	
	public static GameObject getFirstMatchingType(ArrayList<GameObject> x, String y) {
		for (GameObject i : x) {
			if(i.getGameID().getType().equals(y)) {
				return i;
			}
		}
		return null;
	}
	
	public static void timeDelay(int ms)
	{
	    try {Thread.sleep(ms);}
	    catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	}

}
