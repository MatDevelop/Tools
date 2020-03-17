package com.brugier.factory;

public class Ferrari implements Car {

	@Override
	public void start() {
		System.out.println("Start Ferrari.");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate Ferrari.");
	}

	@Override
	public void stop() {
		System.out.println("Stop Ferrari.");
	}

}
