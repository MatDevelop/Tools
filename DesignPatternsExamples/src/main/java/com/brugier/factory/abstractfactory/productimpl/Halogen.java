package com.brugier.factory.abstractfactory.productimpl;

import com.brugier.factory.abstractfactory.interfaces.Light;

public class Halogen implements Light {
	@Override
	public void produceLight() {
		System.out.println("Producing halogen light.");
	}
}
