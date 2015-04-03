package com.gobaduchi.common;

/**
 * Enumerator class for type player rank (kyu, dan, pro)
 * 
 * @author Pete Martin
 */
public final class PlayerRankType {

	/** (amateur) KYU player */
	public static final PlayerRankType KYU = new PlayerRankType("kyu");

	/** (amateur) DAN player */
	public static final PlayerRankType DAN = new PlayerRankType("dan");

	/** PRO player */
	public static final PlayerRankType PRO = new PlayerRankType("pro");

	/** Label */
	private String label;

	@Override
	public String toString() {
		return label;
	}

	/**
	 * Private constructor prevents construction outside of this class.
	 */
	private PlayerRankType(String label) {
		this.label = label;
	}
}