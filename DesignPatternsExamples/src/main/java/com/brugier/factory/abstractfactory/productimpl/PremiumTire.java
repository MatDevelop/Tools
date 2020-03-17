package com.brugier.factory.abstractfactory.productimpl;

import com.brugier.factory.abstractfactory.interfaces.Tire;

public class PremiumTire implements Tire {

	@Override
	public void produceTire() {
		System.out.println("Producing premium tire.");
	}

}
