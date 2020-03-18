package com.brugier.tests.proxy;

import org.junit.jupiter.api.Test;

import com.brugier.proxy.Image;
import com.brugier.proxy.ImageInterface;
import com.brugier.proxy.ProxyImage;

public class ProxyTest {
	@Test
	public void getImageTest() {
		ImageInterface image = new Image();
		System.out.println("Obiekt bez pe³nomocnika...");
		System.out.println("Pierwsze wywo³anie: " + image.getImage());
		System.out.println("Drugie wywo³anie: " + image.getImage());

		image = new ProxyImage();
		System.out.println("Obiekt z pe³nomocnikiem...");
		System.out.println("Pierwsze wywo³anie: " + image.getImage());
		System.out.println("Drugie wywo³anie: " + image.getImage());
	}
}
