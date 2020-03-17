package com.brugier.factory.factormethod;

import com.brugier.factory.Car;
import com.brugier.factory.factormethod.cars.AmericanAudi;
import com.brugier.factory.factormethod.cars.AmericanFerrari;
import com.brugier.factory.factormethod.cars.AmericanVolvo;

public class AmericanCarManufacture extends CarManufacture {

	@Override
	protected Car createCar(String type) {
		if (type.equals("Audi")) {
			return new AmericanAudi();
		} else if (type.equals("Volvo")) {
			return new AmericanVolvo();
		} else if (type.equals("Ferrari")) {
			return new AmericanFerrari();
		} else {
			throw new IllegalArgumentException("Unknown car." + type);
		}
	}

}
