package com.brugier.test.builder.advancedbuilder;

import org.junit.jupiter.api.Test;

import com.brugier.builder.advancedbuilder.AdvancedGoal;

public class AdvancedGoalTest {
	@Test
	public void buildGoalTest() {
		AdvancedGoal goal = AdvancedGoal.builder()
										.name("Name")
										.description("Opis")
										.addLevel("Level 1")
										.addLevel("Level 2")
										.and()
										.build();
		System.out.println(goal.toString());
	}
}
