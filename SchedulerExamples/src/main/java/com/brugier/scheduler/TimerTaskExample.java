package com.brugier.scheduler;

import java.util.Timer;

public class TimerTaskExample {

	public static void main(String[] args) {
		TimerExample te1 = new TimerExample("Task1");

		Timer t = new Timer();
		t.scheduleAtFixedRate(te1, 0, 5 * 1000);

	}

}
