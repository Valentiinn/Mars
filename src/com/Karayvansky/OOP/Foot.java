package com.Karayvansky.OOP;

public final class Foot {
	private long vodaLitters = 1000000000;
	private int fruitsKg = 10000000;
	private int vegetablesKg = 10000000;
	private int potatosKg = 10000000;

	public long getVoda() {
		return vodaLitters;
	}

	public int getFruits() {
		return fruitsKg;
	}

	public int getVegetables() {
		return vegetablesKg;
	}

	public int getPotatos() {
		return potatosKg;
	}

	public void spendTime(int years) {
		vodaLitters /= Math.pow(2, years / 2);
		vodaLitters = vodaLitters < 0 ? 0 : vodaLitters;
		fruitsKg /= Math.pow(2, years / 10);
		fruitsKg = fruitsKg < 0 ? 0 : fruitsKg;
		vegetablesKg /= Math.pow(2, years / 30);
		vegetablesKg = vegetablesKg < 0 ? 0 : vegetablesKg;
		potatosKg /= Math.pow(2, years / 10);
		potatosKg = potatosKg < 0 ? 0 : potatosKg;
		System.out.println("*** " + years + " years Later***");
	}

}
