package com.shadowygamer;

import java.util.ArrayList;

import com.shadowygamer.components.Coords2D;

public class Grid2D {
	private ArrayList<Coords2D> grid = new ArrayList<Coords2D>();


	public Grid2D(ArrayList<Coords2D> pGrid) {
		grid = pGrid;
	}

	//TODO: add checks for cases of invalid grid sizes
	public Grid2D(int pDx, int pDy) {
		for(int i = 0; i < pDx; i++) {
			for(int k = 0; k < pDy; k++) {
				grid.add(new Coords2D(i, k));
			}
		}
	}

	public Grid2D() {
		this(5, 5);
	}

	public boolean isValidPointOnGrid(int pX, int pY) {
		for(Coords2D i : grid) {
			if(i.getX() == pX) {
				if(i.getY() == pY) {
					return true;
				}
			}
		}
		return false;
	}

	public void printValidSpaces() {
		for(int i = 0; i < grid.size(); i++) {
			System.out.println(grid.get(i));
		}
	}
}
