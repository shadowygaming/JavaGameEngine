package com.shadowygamer.components;

public class Coords2D {
	private int x;
	private int y;

	public Coords2D() {
		this(0, 0);
	}

	public Coords2D(int pX, int pY) {
		x = pX;
		y = pY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return x + ", " + y;
	}
	
	public boolean equals(Coords2D x) {
		if(x.getX() == this.x && x.getY() == this.y) {
			return true;
		} else {
			return false;
		}
	}

	
}
