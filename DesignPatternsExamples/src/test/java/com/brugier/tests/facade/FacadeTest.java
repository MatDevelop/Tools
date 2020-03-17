package com.brugier.tests.facade;

import org.junit.jupiter.api.Test;

import com.brugier.facade.MainApi;

public class FacadeTest {
	@Test
	public void facadeTest() {
		MainApi mainApi = new MainApi();
		mainApi.lockHome();
		mainApi.unlockHome();
		mainApi.lightOn();
		mainApi.lightOff();
	}
}
