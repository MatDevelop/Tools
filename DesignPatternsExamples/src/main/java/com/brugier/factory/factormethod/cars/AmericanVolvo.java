package com.brugier.factory.factormethod.cars;

import com.brugier.factory.Car;

public class AmericanVolvo implements Car {

	@Override
	public void start() {
		System.out.println("American Volvo started.");
	}

	@Override
	public void accelerate() {
		System.out.println("American Volvo accelerated.");
	}

	@Override
	public void stop() {
		System.out.println("American Volvo stopped.");
	}

}
