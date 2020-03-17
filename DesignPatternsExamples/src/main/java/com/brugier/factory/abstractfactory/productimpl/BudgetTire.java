package com.brugier.factory.abstractfactory.productimpl;

import com.brugier.factory.abstractfactory.interfaces.Tire;

public class BudgetTire implements Tire {

	@Override
	public void produceTire() {
		System.out.println("Producing budget tire.");
	}
}
