package com.brugier.tests.prototype;

import org.junit.jupiter.api.Test;

import com.brugier.prototype.Car;

public class PrototypeTest {

	@Test
	public void copyCarTest() {
		Car car1 = new Car("Mercedes", "EQC", "silver metalic");
		Car copyCar1 = Car.copy(car1);

		System.out.println(copyCar1.toString());
	}
}
