package com.brugier.singleton;

public class SimpleLazySingleton {

	private static SimpleLazySingleton instance;

	private SimpleLazySingleton() {
		if (instance != null) {
			throw new IllegalStateException("Cannot create new instance, please use getInstance method instead.");
		}

	}

	public static SimpleLazySingleton getInstance() {
		if (instance == null) {
			instance = new SimpleLazySingleton();
		}
		return instance;
	}
}
