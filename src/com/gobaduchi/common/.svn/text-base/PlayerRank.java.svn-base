package com.gobaduchi.common;

/**
 * Encapsulates rank / strength of a player.
 * 
 * @author Pete Martin
 */
public final class PlayerRank {

	/** System under which the player is ranked */
	protected PlayerRankSystem system;

	/** Type of rank (dan, kyu, pro) */
	protected PlayerRankType type;

	/** Numerical strength / rank (e.g. 21 if the player is 21 kuy by the type) */
	protected Integer strength;

	/**
	 * @return the system
	 */
	public PlayerRankSystem getSystem() {
		return system;
	}

	/**
	 * @param system
	 *            the system to set
	 */
	public void setSystem(PlayerRankSystem system) {
		this.system = system;
	}

	/**
	 * @return the type
	 */
	public PlayerRankType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(PlayerRankType type) {
		this.type = type;
	}

	/**
	 * @return the strength
	 */
	public Integer getStrength() {
		return strength;
	}

	/**
	 * @param strength
	 *            the strength to set
	 */
	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		if (strength == null || type == null)
			return "unknown";

		if (system == null)
			return strength + " " + type;
		else
			return strength + " " + type + " (" + system + ")";
	}

}
