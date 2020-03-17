package com.brugier.facade.implementations;

import com.brugier.facade.interfaces.Door;

public class GarageDoor implements Door {

	@Override
	public void open() {

		System.out.println("Garage door open.");
	}

	@Override
	public void close() {

		System.out.println("Garage door close.");
	}

	@Override
	public void lock() {

		System.out.println("Garage door lock.");
	}

	@Override
	public void unlock() {

		System.out.println("Garage door unlock.");
	}
}