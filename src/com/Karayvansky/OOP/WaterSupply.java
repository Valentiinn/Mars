package com.Karayvansky.OOP;

public class WaterSupply {
	private static WaterSupply instance;

	public static WaterSupply getInstance() {
		if (instance == null)
			instance = new WaterSupply();
		return instance;
	}
}
