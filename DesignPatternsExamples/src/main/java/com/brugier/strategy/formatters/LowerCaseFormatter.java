package com.brugier.strategy.formatters;

import com.brugier.strategy.TextFormatterStrategy;

public class LowerCaseFormatter implements TextFormatterStrategy {

	@Override
	public String format(String text) {
		return text.toLowerCase();
	}

}
