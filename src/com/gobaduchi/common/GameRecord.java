package com.gobaduchi.common;

import java.util.ArrayList;
import java.util.Date;

/**
 * Record of actual game taking place. Contains only facts (any form of comments
 * or branches are stripped out)
 * 
 * @author Pete Martin
 */
public final class GameRecord {

	/** Name of the black player ('PB' in SGF) */
	protected String blackPlayerName;

	/** Rank of the black player ('BR' in SGF) */
	protected PlayerRank blackPlayerRank;

	/** Name of the black team ('BT' in SGF) */
	protected String blackTeamName;

	/** Name of the white player ('PW' in SGF) */
	protected String whitePlayerName;

	/** Rank of the white player ('WR' in SGF) */
	protected PlayerRank whitePlayerRank;

	/** Name of the white team ('WT' in SGF) */
	protected String whiteTeamName;

	/** Board size (e.g. 19 stands for 19x19) ('SZ' in SGF) */
	protected Integer boardSize;

	/** Rule set ('RU' in SGF) */
	protected GameRuleSet ruleSet;

	/** Main time limit in seconds ('TM' in SGF) */
	protected Integer timeLimitSeconds;

	/** Overtime rules ('OT' in SGF) */
	protected String overtime;

	/** Handicap ('HA' in SGF) */
	protected Integer handicap;

	/** Komi ('KM' in SGF) */
	protected Double komi;

	/** Name of the person that made the annotations ('AN' in SGF) */
	protected String annotator;

	/**
	 * Name of the application used to create the game-tree ('AP' in SGF)
	 */
	protected String applicationName;

	/**
	 * Version of the application used to create the game-tree ('AP' in SGF)
	 */
	protected String applicationVersion;

	/** Name of the source (journal, book, etc) ('SO' in SGF) */
	protected String source;

	/** All copyright information ('CP' in SGF) */
	protected String copyright;

	/** When the game was played ('DT' in SGF) */
	protected ArrayList<Date> datesPlayed;

	/** Name of the match event ('EV' in SGF) */
	protected String eventName;

	/** Name of the game ('GN' in SGF) */
	protected String gameName;

	/** Round info or number ('RO' in SGF) */
	protected String round;

	/** Match location ('PC' in SGF) */
	protected String location;

	/** Game result ('RE' in SGF) */
	protected GameResult gameResult;

	/** Game comment ('GC' in SGF) */
	protected String gameComment;

}
