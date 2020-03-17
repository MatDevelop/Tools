package com.brugier.factory.factormethod.cars;

import com.brugier.factory.Car;

public class AmericanFerrari implements Car {

	@Override
	public void start() {
		System.out.println("American Ferrari started.");
	}

	@Override
	public void accelerate() {
		System.out.println("American Ferrari accelerated.");
	}

	@Override
	public void stop() {
		System.out.println("American Ferrari stopped.");
	}

}
