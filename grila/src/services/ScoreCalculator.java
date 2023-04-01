package services;

import java.util.List;
import java.util.stream.Collectors;

import view.components.Question;

public class ScoreCalculator {
	public static int calculateScore(List<Question> questionsToBeEvaluated) {
		return questionsToBeEvaluated.stream().collect(Collectors.summingInt(question -> question.getPoints()));
	}
}
