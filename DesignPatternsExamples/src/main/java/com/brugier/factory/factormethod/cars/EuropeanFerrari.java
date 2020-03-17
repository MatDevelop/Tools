package com.brugier.factory.factormethod.cars;

import com.brugier.factory.Car;

public class EuropeanFerrari implements Car {

	@Override
	public void start() {
		System.out.println("European Ferrari started.");
	}

	@Override
	public void accelerate() {
		System.out.println("European Ferrari accelerated.");
	}

	@Override
	public void stop() {
		System.out.println("European Ferrari stopped.");
	}

}
