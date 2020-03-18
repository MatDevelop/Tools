package com.brugier.observer;

public class Bidder implements Observer {

	private String name;
	private double bidPrice;

	public Bidder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println(name + " proponuje " + bidPrice);
		if (bidPrice > 500) {
			System.out.println("Sold!!! " + name);
		}
	}

	public void giveNewPrice(double price) {
		bidPrice = price;
	}
}
