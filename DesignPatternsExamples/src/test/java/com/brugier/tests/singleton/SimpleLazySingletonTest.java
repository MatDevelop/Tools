package com.brugier.tests.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.brugier.singleton.SimpleLazySingleton;

public class SimpleLazySingletonTest {

	@Test
	public void checkInstanceTest() {
		SimpleLazySingleton firstInstance = SimpleLazySingleton.getInstance();
		
		SimpleLazySingleton secondInstance = SimpleLazySingleton.getInstance();

		assertEquals(firstInstance, secondInstance);
	}
}
