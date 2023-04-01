package model;

public enum Difficulty {

	EASY(Config.easyTime), MEDIUM(Config.mediumTime), HARD(Config.hardTime);

	private final int maxTime;

	Difficulty(int time) {
		this.maxTime = time;
	}

	public int getMaxTime() {
		return maxTime;
	}
}
