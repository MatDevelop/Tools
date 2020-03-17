package com.brugier.factory.simplefactory;

import com.brugier.factory.Car;

public class CarManufacture {
	public SimpleFactory factory;

	public CarManufacture(SimpleFactory factory) {
		this.factory = factory;
	}

	public void manufactureCar(String type) {
		Car car = factory.createCar(type);
		car.start();
		car.accelerate();
		car.stop();
	}
}
