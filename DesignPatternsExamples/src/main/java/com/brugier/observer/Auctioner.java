package com.brugier.observer;

import java.util.ArrayList;
import java.util.List;

public class Auctioner implements Observable {

	private List<Observer> observerList;

	public Auctioner() {
		observerList = new ArrayList<>();
	}

	@Override
	public void attach(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observerList.stream().forEach(o -> o.update());
	}

	public void displayNewBidderPrice() {
		notifyObservers();
	}

}
