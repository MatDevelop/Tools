package com.brugier.tests.factory.factormethod;

import org.junit.jupiter.api.Test;

import com.brugier.factory.factormethod.AmericanCarManufacture;
import com.brugier.factory.factormethod.CarManufacture;
import com.brugier.factory.factormethod.EuropeanCarManufacture;

public class CarManufactureFactoryMethodTest {
	@Test
	public void createCarTest() {
		CarManufacture manufacture = new EuropeanCarManufacture();
		manufacture.manufactureCar("Ferrari");

		manufacture = new AmericanCarManufacture();
		manufacture.manufactureCar("Ferrari");
	}
}
