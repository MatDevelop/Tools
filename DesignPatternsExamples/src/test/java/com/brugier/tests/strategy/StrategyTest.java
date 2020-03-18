package com.brugier.tests.strategy;

import org.junit.jupiter.api.Test;

import com.brugier.strategy.FormatterContext;
import com.brugier.strategy.formatters.CapitalizeFormatter;
import com.brugier.strategy.formatters.LowerCaseFormatter;
import com.brugier.strategy.formatters.UpperCaseFormatter;

public class StrategyTest {
	@Test
	public void checkStrategyTest() {
		String text = "Strategy Design Pattern";
		FormatterContext context = new FormatterContext();

		context.set(new CapitalizeFormatter());
		context.print(text);

		context.set(new UpperCaseFormatter());
		context.print(text);

		context.set(new LowerCaseFormatter());
		context.print(text);
	}
}
