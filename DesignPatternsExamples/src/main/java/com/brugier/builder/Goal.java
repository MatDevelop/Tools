package com.brugier.builder;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Goal {
	private String name;
	private String description;
	private List<String> levels;
	private List<Integer> checklist;
	private LocalDate deadline;
	private boolean achieved;

	private Goal() {
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private String name;
		private String description;
		private List<String> levels = new LinkedList<>();
		private List<Integer> checklist;
		private LocalDate deadline;
		private boolean achieved = false;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder addLevel(String level) {
			this.levels.add(level);
			return this;
		}

		public Builder checklist(List<Integer> checklist) {
			this.checklist = checklist;
			return this;
		}

		public Builder deadline(LocalDate deadline) {
			this.deadline = deadline;
			return this;
		}

		public Builder achieved(Boolean achieved) {
			this.achieved = true;
			return this;
		}

		public Goal build() {
			if (name.isEmpty()) {
				throw new IllegalStateException("Name cannot be empty");
			}
			if (levels.isEmpty()) {
				throw new IllegalStateException("Levels cannot be empty");
			}

			Goal goal = new Goal();
			goal.deadline = this.deadline;
			goal.name = this.name;
			goal.checklist = this.checklist;
			goal.levels = this.levels;
			goal.description = this.description;
			goal.achieved = this.achieved;
			return goal;
		}
	}

	@Override
	public String toString() {
		return "Goal [name=" + name + ", description=" + description + ", levels=" + levels + ", checklist=" + checklist
				+ ", deadline=" + deadline + ", achieved=" + achieved + "]";
	}

}
