package com.Karayvansky.OOP;

public final class Transport {
	public final String NAMESPACESHIP = "X men 3000";
	public final short NUMBERCATERPILLAR = 2;
	private int spaceship = 10;
	private int posX = 12, posY = 2;
	private int fuel = 1000000;

	public int getSpaceship() {
		return spaceship;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getFuel() {
		return fuel;
	}

	public void Passed_km(int killometrs) {
		fuel /= Math.pow(2, killometrs / 2);
		fuel = fuel < 0 ? 0 : fuel;

		System.out.println("*** " + killometrs + " after the kilometers traveled***");
	}
}
