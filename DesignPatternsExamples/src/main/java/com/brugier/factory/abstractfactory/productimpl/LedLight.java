package com.brugier.factory.abstractfactory.productimpl;

import com.brugier.factory.abstractfactory.interfaces.Light;

public class LedLight implements Light {

	@Override
	public void produceLight() {
		System.out.println("Producing led light.");
	}
}
