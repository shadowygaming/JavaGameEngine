package com.shadowygamer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Thread;

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
	
	public static int prompt(String[] options, String[] invalid) {
		for(int i = 0; i < options.length; i++) {
			if(options[i].equals(invalid[i])) {
				System.out.println("[~] " + options[i]);
			} else {
				System.out.println("[" + i + "] " + options[i]);
			}
		}
		while(true) {
			try {
				System.out.print(">> ");
				int z = sc.nextInt();
				if(z < options.length) {
					if(options[z].equals(invalid[z])) {
						System.out.println(">> Invalid Choice");
						continue;
					}
					return z;
				} else {
					System.out.println(">> Invalid Range");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println(">> Invalid Input");
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
	
	public static void timeDelay(int ms) {
	    try {Thread.sleep(ms);}
	    catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	}
	
	public static void cinematicPrint(String printedString, int delayMillesecond) {
		for(char i : printedString.toCharArray()) {
			System.out.print(i);
			timeDelay(delayMillesecond);
		}
		System.out.println();
	}
	
	public static void cinematicPrint(String printedString) {
		cinematicPrint(printedString, 20);
	}

}
