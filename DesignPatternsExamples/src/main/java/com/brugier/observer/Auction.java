package com.brugier.observer;

public class Auction {

	public static void main(String[] args) {
		Auctioner auctioner = new Auctioner();

		Bidder bidder1 = new Bidder("Mateusz");
		auctioner.attach(bidder1);
		Bidder bidder2 = new Bidder("Karol");
		auctioner.attach(bidder2);
		Bidder bidder3 = new Bidder("Jan");
		auctioner.attach(bidder3);

		bidder1.giveNewPrice(250);
		bidder2.giveNewPrice(275);
		bidder3.giveNewPrice(300);

		auctioner.displayNewBidderPrice();

		bidder1.giveNewPrice(350);
		bidder2.giveNewPrice(450);
		bidder3.giveNewPrice(550);

		auctioner.displayNewBidderPrice();

	}

}
