package com.brugier.test.builder;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.brugier.builder.Goal;

public class BuilderTest {
	@Test
	public void buildGoalTest() {
		Goal goal = Goal.builder()
						.name("Name")
						.description("Opis")
						.addLevel("Level 1")
					    .addLevel("Level 2")
					    .addLevel("Level 3")
					    .checklist(new ArrayList<Integer>())
					    .achieved(true)
					    .build();
		System.out.println(goal.toString());
	}
}
