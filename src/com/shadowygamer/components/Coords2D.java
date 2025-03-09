package com.shadowygamer.components;

import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coords2D other = (Coords2D) obj;
		return x == other.x && y == other.y;
	}

	
}
