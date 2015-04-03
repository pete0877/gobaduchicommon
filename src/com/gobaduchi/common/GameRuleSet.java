package com.gobaduchi.common;

/**
 * Enumerator class for type of rules used (Japanese, Chinese, AGA, Other, etc)
 * 
 * @author Pete Martin
 */
public final class GameRuleSet {

	/** American Go Association rules */
	public static final GameRuleSet AGA = new GameRuleSet("AGA");

	/** British Go Association rules */
	public static final GameRuleSet BGA = new GameRuleSet("BGA");

	/** Chinese rules */
	public static final GameRuleSet CHINESE = new GameRuleSet("Chinese");

	/** Japanese rules */
	public static final GameRuleSet JAPANESE = new GameRuleSet("Japanese");

	/** Computer Olympiad rules */
	public static final GameRuleSet COMPUTER_OLYMPIAD = new GameRuleSet(
			"Computer Olympiad");

	/** European Go Foundation rules */
	public static final GameRuleSet EGF = new GameRuleSet("EGF");

	/** French rules */
	public static final GameRuleSet FRENCH = new GameRuleSet("French");

	/** Ing rules */
	public static final GameRuleSet ING = new GameRuleSet("ING");

	/** Korean rules */
	public static final GameRuleSet KOREAN = new GameRuleSet("Korean");

	/** New Zeland rules */
	public static final GameRuleSet NEW_ZELAND = new GameRuleSet("New Zeland");

	/** World Mind Sports Games */
	public static final GameRuleSet WMSG = new GameRuleSet("WMSG");

	/** Label */
	private String label;

	@Override
	public String toString() {
		return label;
	}

	/**
	 * Private constructor prevents construction outside of this class.
	 */
	private GameRuleSet(String label) {
		this.label = label;
	}
}