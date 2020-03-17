package com.brugier.tests.factory.simplefactory;

import org.junit.jupiter.api.Test;

import com.brugier.factory.simplefactory.CarManufacture;

public class CarManufactureTest {
	@Test
	public void createCarTest() {
		CarManufacture carManufacture = new CarManufacture();
		carManufacture.manufactureCar("Audi");
	}
}
