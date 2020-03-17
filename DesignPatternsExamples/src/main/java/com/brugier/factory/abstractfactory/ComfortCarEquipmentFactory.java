package com.brugier.factory.abstractfactory;

import com.brugier.factory.abstractfactory.interfaces.CarEquipmentFactory;
import com.brugier.factory.abstractfactory.interfaces.Engine;
import com.brugier.factory.abstractfactory.interfaces.Light;
import com.brugier.factory.abstractfactory.interfaces.Tire;
import com.brugier.factory.abstractfactory.productimpl.HybridEngine;
import com.brugier.factory.abstractfactory.productimpl.LedLight;
import com.brugier.factory.abstractfactory.productimpl.PremiumTire;

public class ComfortCarEquipmentFactory implements CarEquipmentFactory {

	@Override
	public Engine createEngine() {
		return new HybridEngine();
	}

	@Override
	public Light createLight() {
		return new LedLight();
	}

	@Override
	public Tire createTire() {
		return new PremiumTire();
	}

}
