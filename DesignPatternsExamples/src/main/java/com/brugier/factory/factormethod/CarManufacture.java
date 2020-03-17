package com.brugier.factory.factormethod;

import com.brugier.factory.Car;

public abstract class CarManufacture {
	public void manufactureCar(String type) {
		Car car = createCar(type);
		car.start();
		car.accelerate();
		car.stop();
	}

	protected abstract Car createCar(String type);
}
