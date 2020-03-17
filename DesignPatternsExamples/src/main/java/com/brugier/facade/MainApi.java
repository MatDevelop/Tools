package com.brugier.facade;

import com.brugier.facade.implementations.GarageDoor;
import com.brugier.facade.implementations.HallLight;
import com.brugier.facade.implementations.LivingRoomLight;
import com.brugier.facade.implementations.MainDoor;
import com.brugier.facade.interfaces.Door;
import com.brugier.facade.interfaces.Light;

public class MainApi {

	private Light livingRoomLight = new LivingRoomLight();
	private Light hallLight = new HallLight();
	private Door mainDoor = new MainDoor();
	private Door garageDoor = new GarageDoor();

	public void lockHome() {

		System.out.println("------ LOCK HOME -----");
		livingRoomLight.off();
		hallLight.off();
		mainDoor.lock();
		garageDoor.lock();
	}

	public void unlockHome() {

		System.out.println("------ UNLOCK HOME -----");
		hallLight.on();
		mainDoor.unlock();
		garageDoor.unlock();
	}

	public void lightOff() {

		System.out.println("------ LIGHT OFF -----");
		livingRoomLight.off();
		hallLight.off();
	}

	public void lightOn() {

		System.out.println("------ LIGHT ON -----");
		livingRoomLight.on();
		hallLight.on();
	}
}