package model;

import java.util.Map;

public class Exercise {
	private String question;
	private Map<String, Integer> answers;
	private Category category;
	private Difficulty difficulty;

	public Exercise(String question, Map<String, Integer> answers, Category category, Difficulty difficulty) {
		this.question = question;
		this.answers = answers;
		this.category = category;
		this.difficulty = difficulty;
	}

	public String getQuestion() {
		return question;
	}

	public Map<String, Integer> getAnswers() {
		return answers;
	}

	public Category getCategory() {
		return category;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

}
