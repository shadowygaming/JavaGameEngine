package com.shadowygamer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

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
			int z = sc.nextInt();
			if(z < x.length) {
				return z;
			}
			System.out.println("Invalid Selection");
		}
	}

}
