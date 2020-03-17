package com.brugier.tests.factory.simplefactory;

import org.junit.jupiter.api.Test;

import com.brugier.factory.simplefactory.CarManufacture;
import com.brugier.factory.simplefactory.SimpleFactory;

public class CarManufactureTest {
	@Test
	public void createCarTest() {
		CarManufacture carManufacture = new CarManufacture(new SimpleFactory());
		carManufacture.manufactureCar("Audi");
	}
}
