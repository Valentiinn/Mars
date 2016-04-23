package com.Karayvansky.OOP;

public final class Mars {
	public final long DIAMETR;

	private Mars() {
		DIAMETR = 300000000;
	}

	private static Mars instance;

	public static Mars getInstance() {
		if (instance == null)
			instance = new Mars();
		return instance;
	}
	
	
}
