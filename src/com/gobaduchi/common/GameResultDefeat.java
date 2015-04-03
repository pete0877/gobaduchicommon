package com.gobaduchi.common;

/**
 * Enumerator class for type of defeat in games where one of the players won
 * (e.g by points or by resignation, etc)
 * 
 * @author Pete Martin
 */
public final class GameResultDefeat {

	/** Defeat by points */
	public static final GameResultDefeat BY_POINTS = new GameResultDefeat(
			"by points");

	/** Defeat by resignation */
	public static final GameResultDefeat BY_RESIGNATION = new GameResultDefeat(
			"by resignation");

	/** Defeat by time */
	public static final GameResultDefeat BY_TIME = new GameResultDefeat(
			"by time");

	/**
	 * Defeat by rules (e.g. if one of the players broke the rules and lost
	 * automatically)
	 */
	public static final GameResultDefeat BY_RULES = new GameResultDefeat(
			"by rules");

	/** Label */
	private String label;

	@Override
	public String toString() {
		return label;
	}

	/**
	 * Private constructor prevents construction outside of this class.
	 */
	private GameResultDefeat(String label) {
		this.label = label;
	}
}