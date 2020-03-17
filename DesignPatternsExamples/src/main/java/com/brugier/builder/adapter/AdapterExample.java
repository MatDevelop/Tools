package com.brugier.builder.adapter;

public class AdapterExample implements OldInterface {

	@Override
	public void method() {
		NewClass newClass = new NewClass();
		newClass.newMethod();
	}
}
