package com.brugier.builder.advancedbuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.naming.LimitExceededException;

public class AdvancedGoal {
	private String name;
	private String description;
	private List<String> levels;
	private List<Integer> checklist;
	private LocalDate deadline;
	private boolean achieved;

	public static NeedName builder() {
		return new Builder();
	}

	public static class Builder implements NeedName, NeedDescription, NeedLevels, CanBeBuild {
		private String name;
		private String description;
		private List<String> levels;
		private List<Integer> checklist;
		private LocalDate deadline;
		private boolean achieved = false;

		@Override
		public Builder name(String name) {
			this.name = name;
			return this;
		}

		@Override
		public Builder description(String description) {
			this.description = description;
			return this;
		}

		@Override
		public Builder checklist(List<Integer> checklist) {
			this.checklist = checklist;
			return this;
		}

		@Override
		public Builder deadline(LocalDate deadline) {
			this.deadline = deadline;
			return this;
		}

		@Override
		public Builder achieved() {
			this.achieved = true;
			return this;
		}

		@Override
		public Builder addLevel(String level) {
			if (levels == null) {
				levels = new LinkedList<>();
			}
			levels.add(level);
			return this;
		}

		@Override
		public Builder and() {
			return this;
		}

		public AdvancedGoal build() {
			AdvancedGoal goal = new AdvancedGoal();
			goal.deadline = this.deadline;
			goal.name = this.name;
			goal.checklist = this.checklist;
			goal.levels = this.levels;
			goal.description = this.description;
			goal.achieved = this.achieved;
			return goal;
		}
	}

	public interface NeedName {
		public NeedDescription name(String name);
	}

	public interface NeedDescription {
		NeedLevels description(String description);
	}

	public interface NeedLevels {
		NeedLevels addLevel(String level);

		CanBeBuild and();
	}

	public interface CanBeBuild {
		CanBeBuild checklist(List<Integer> checklist);

		CanBeBuild deadline(LocalDate deadline);

		CanBeBuild achieved();

		AdvancedGoal build();
	}

	@Override
	public String toString() {
		return "AdvancedGoal [name=" + name + ", description=" + description + ", levels=" + levels + ", checklist="
				+ checklist + ", deadline=" + deadline + ", achieved=" + achieved + "]";
	}

}
