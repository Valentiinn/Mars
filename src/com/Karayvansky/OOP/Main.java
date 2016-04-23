package com.Karayvansky.OOP;

public class Main {

	public static void main(String[] args) {
		Kitchen kitchen1 = new Kitchen();
		kitchen1.getFloor();
		System.out.println(kitchen1.getFloor());
		Bedroom bedroom1 = new Bedroom();
		System.out.println(bedroom1.getFloor());
	}
}