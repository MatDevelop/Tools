package com.brugier.strategy;

public class FormatterContext {
	private TextFormatterStrategy strategy;

	public void set(TextFormatterStrategy strategy) {
		this.strategy = strategy;
	}

	public void print(String text) {
		String formattedText = strategy.format(text);
		System.out.println(formattedText);
	}
}
