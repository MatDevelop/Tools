package com.brugier.factory.abstractfactory;

import com.brugier.factory.abstractfactory.interfaces.CarEquipmentFactory;
import com.brugier.factory.abstractfactory.interfaces.Engine;
import com.brugier.factory.abstractfactory.interfaces.Light;
import com.brugier.factory.abstractfactory.interfaces.Tire;
import com.brugier.factory.abstractfactory.productimpl.BudgetTire;
import com.brugier.factory.abstractfactory.productimpl.Halogen;
import com.brugier.factory.abstractfactory.productimpl.PetrolEngine;

public class EconomyCarEquipmentFactory implements CarEquipmentFactory {

	@Override
	public Engine createEngine() {
		return new PetrolEngine();
	}

	@Override
	public Light createLight() {
		return new Halogen();
	}

	@Override
	public Tire createTire() {
		return new BudgetTire();
	}

}
