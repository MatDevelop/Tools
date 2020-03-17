package com.brugier.tests.factory.abstractfactory;

import org.junit.jupiter.api.Test;

import com.brugier.factory.abstractfactory.ComfortCarEquipmentFactory;
import com.brugier.factory.abstractfactory.EconomyCarEquipmentFactory;
import com.brugier.factory.abstractfactory.interfaces.CarEquipmentFactory;
import com.brugier.factory.abstractfactory.interfaces.Engine;
import com.brugier.factory.abstractfactory.interfaces.Light;
import com.brugier.factory.abstractfactory.interfaces.Tire;

public class AbstractFactoryTest {
	@Test
	public void createCarTest() {
		createEquipment(new EconomyCarEquipmentFactory());
		createEquipment(new ComfortCarEquipmentFactory());
	}

	private static void createEquipment(CarEquipmentFactory carEquipmentFactory) {
		Engine engine = carEquipmentFactory.createEngine();
		engine.produceEngine();

		Light light = carEquipmentFactory.createLight();
		light.produceLight();

		Tire tire = carEquipmentFactory.createTire();
		tire.produceTire();
	}
}
