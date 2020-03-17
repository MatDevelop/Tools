package com.brugier.factory.factormethod.cars;

import com.brugier.factory.Car;

public class EuropeanAudi implements Car {

	@Override
	public void start() {
		System.out.println("European Audi started.");
	}

	@Override
	public void accelerate() {
		System.out.println("European Audi accelerated.");
	}

	@Override
	public void stop() {
		System.out.println("European Audi stopped.");
	}

}
