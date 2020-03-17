package com.brugier.factory.factormethod.cars;

import com.brugier.factory.Car;

public class AmericanAudi implements Car {

	@Override
	public void start() {
		System.out.println("American Audi started.");
	}

	@Override
	public void accelerate() {
		System.out.println("American Audi accelerated.");
	}

	@Override
	public void stop() {
		System.out.println("American Audi stopped.");
	}

}
