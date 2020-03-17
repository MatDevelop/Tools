package com.brugier.factory.factormethod;

import com.brugier.factory.Car;
import com.brugier.factory.factormethod.cars.EuropeanAudi;
import com.brugier.factory.factormethod.cars.EuropeanFerrari;
import com.brugier.factory.factormethod.cars.EuropeanVolvo;

public class EuropeanCarManufacture extends CarManufacture {

	@Override
	protected Car createCar(String type) {
		if (type.equals("Audi")) {
			return new EuropeanAudi();
		} else if (type.equals("Volvo")) {
			return new EuropeanVolvo();
		} else if (type.equals("Ferrari")) {
			return new EuropeanFerrari();
		} else {
			throw new IllegalArgumentException("Unknown car." + type);
		}
	}

}
