package com.brugier.factory.abstractfactory.interfaces;

public interface CarEquipmentFactory {
	Engine createEngine();

	Light createLight();

	Tire createTire();
}
