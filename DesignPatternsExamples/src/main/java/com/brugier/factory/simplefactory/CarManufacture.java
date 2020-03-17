package com.brugier.factory.simplefactory;

import com.brugier.factory.Audi;
import com.brugier.factory.Car;
import com.brugier.factory.Ferrari;
import com.brugier.factory.Volvo;

public class CarManufacture {
	public void manufactureCar(String type) {
		Car car;
		if (type.equals("Audi")) {
			car = new Audi();
		} else if (type.equals("Volvo")) {
			car = new Volvo();
		} else if (type.equals("Ferrari")) {
			car = new Ferrari();
		} else {
			throw new IllegalArgumentException("Unknown car." + type);
		}

		car.start();
		car.accelerate();
		car.stop();
	}
}
