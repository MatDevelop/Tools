package com.brugier.strategy.formatters;

import com.brugier.strategy.TextFormatterStrategy;

public class UpperCaseFormatter implements TextFormatterStrategy {

	@Override
	public String format(String text) {
		return text.toUpperCase();
	}
}
