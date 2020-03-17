package com.brugier.factory.abstractfactory.productimpl;

import com.brugier.factory.abstractfactory.interfaces.Engine;

public class HybridEngine implements Engine {

	@Override
	public void produceEngine() {
		System.out.println("Producing hybrid engine.");
	}
}
