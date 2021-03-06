package com.brugier.tests.proxy;

import org.junit.jupiter.api.Test;

import com.brugier.proxy.Image;
import com.brugier.proxy.ImageInterface;
import com.brugier.proxy.ProxyImage;

public class ProxyTest {
	@Test
	public void getImageTest() {
		ImageInterface image = new Image();
		System.out.println("Obiekt bez pełnomocnika...");
		System.out.println("Pierwsze wywołanie: " + image.getImage());
		System.out.println("Drugie wywołanie: " + image.getImage());

		image = new ProxyImage();
		System.out.println("Obiekt z pełnomocnikiem...");
		System.out.println("Pierwsze wywołanie: " + image.getImage());
		System.out.println("Drugie wywołanie: " + image.getImage());
	}
}
