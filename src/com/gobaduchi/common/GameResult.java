package com.gobaduchi.common;

/**
 * Identifies result of a game (which player won and how)
 * 
 * @author Pete Martin
 */
public final class GameResult {

	/** Outcome of the game */
	protected GameResultOutcome outcome;

	/** Type of defeat if the game was won by one of the players */
	protected GameResultDefeat defeat;

	/** Number of points accumulated by the white player */
	protected Double whitePoints;

	/** Number of points accumulated by the black player */
	protected Double blackPoints;

	/**
	 * @return the outcome
	 */
	public GameResultOutcome getOutcome() {
		return outcome;
	}

	/**
	 * @param outcome
	 *            the outcome to set
	 */
	public void setOutcome(GameResultOutcome outcome) {
		this.outcome = outcome;
	}

	/**
	 * @return the defeat
	 */
	public GameResultDefeat getDefeat() {
		return defeat;
	}

	/**
	 * @param defeat
	 *            the defeat to set
	 */
	public void setDefeat(GameResultDefeat defeat) {
		this.defeat = defeat;
	}

	/**
	 * @return the whitePoints
	 */
	public Double getWhitePoints() {
		return whitePoints;
	}

	/**
	 * @param whitePoints
	 *            the whitePoints to set
	 */
	public void setWhitePoints(Double whitePoints) {
		this.whitePoints = whitePoints;
	}

	/**
	 * @return the blackPoints
	 */
	public Double getBlackPoints() {
		return blackPoints;
	}

	/**
	 * @param blackPoints
	 *            the blackPoints to set
	 */
	public void setBlackPoints(Double blackPoints) {
		this.blackPoints = blackPoints;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		if (outcome == null)
			return null;

		// Cases for when neither player won:
		if (outcome == GameResultOutcome.ADJOURNED
				|| outcome == GameResultOutcome.DRAW
				|| outcome == GameResultOutcome.UNKNOWN)
			return outcome.toString();

		// Else the game was won by one of the players:
		String result = outcome.toString() + " " + defeat.toString();
		if (defeat == GameResultDefeat.BY_POINTS && blackPoints != null
				&& whitePoints != null) {

			// Determine point difference:
			Double difference = whitePoints - blackPoints;
			if (difference < 0)
				difference *= -1;

			result += " (" + Constants.pointsFormat.format(difference) + ")";

		}
		return result;

	}
}
