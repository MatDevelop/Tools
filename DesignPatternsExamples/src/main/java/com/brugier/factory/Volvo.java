package com.brugier.factory;

public class Volvo implements Car {

	@Override
	public void start() {
		System.out.println("Start Volvo.");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate Volvo.");
	}

	@Override
	public void stop() {
		System.out.println("Stop Volvo.");
	}

}
