package com.gobaduchi.common;

/**
 * Enumerator class for top-level outcome of the game (was it a tie, if one
 * player won, which one, etc). No details as to by how many points or if by
 * resignation.
 * 
 * @author Pete Martin
 */
public final class GameResultOutcome {

	/** Game outcome is unknown (perhaps the game record is incomplete) */
	public static final GameResultOutcome UNKNOWN = new GameResultOutcome(
			"unknown");

	/** White won the game */
	public static final GameResultOutcome WHITE_WON = new GameResultOutcome(
			"white won");

	/** Black won the game */
	public static final GameResultOutcome BLACK_WON = new GameResultOutcome(
			"black won");

	/** Game resulted in a tie */
	public static final GameResultOutcome DRAW = new GameResultOutcome("draw");

	/** Game was adjourned */
	public static final GameResultOutcome ADJOURNED = new GameResultOutcome(
			"adjourned");

	/** Label */
	private String label;

	@Override
	public String toString() {
		return label;
	}

	/**
	 * Private constructor prevents construction outside of this class.
	 */
	private GameResultOutcome(String label) {
		this.label = label;
	}
}
