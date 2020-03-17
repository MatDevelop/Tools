package com.brugier.factory.simplefactory;

import com.brugier.factory.Audi;
import com.brugier.factory.Car;
import com.brugier.factory.Ferrari;
import com.brugier.factory.Volvo;

public class SimpleFactory {
	public Car createCar(String type) {
		if (type.equals("Audi")) {
			return new Audi();
		} else if (type.equals("Volvo")) {
			return new Volvo();
		} else if (type.equals("Ferrari")) {
			return new Ferrari();
		} else {
			throw new IllegalArgumentException("Unknown car." + type);
		}
	}
}
