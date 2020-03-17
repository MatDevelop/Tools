package com.brugier.factory;

public class Audi implements Car {

	@Override
	public void start() {
		System.out.println("Start Audi.");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate Audi.");
	}

	@Override
	public void stop() {
		System.out.println("Stop Audi.");
	}

}
