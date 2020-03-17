package com.brugier.factory.factormethod.cars;

import com.brugier.factory.Car;

public class EuropeanVolvo implements Car {

	@Override
	public void start() {
		System.out.println("European Volvo started.");
	}

	@Override
	public void accelerate() {
		System.out.println("European Volvo accelerated.");
	}

	@Override
	public void stop() {
		System.out.println("European Volvo stopped.");
	}

}
