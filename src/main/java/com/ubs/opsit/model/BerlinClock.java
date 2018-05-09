package com.ubs.opsit.model;

import com.ubs.opsit.utils.BerlinClockConstant;

/**
 * this class represent berlin Clock model.
 * Each clock have rows and lamps with time format.
 * @author OWNER
 */
public class BerlinClock {
	private Lamp secondsLamp;
	private Row fiveHoursRow;
	private Row oneHourRow;
	private Row fiveMinutesRow;
	private Row oneMinuteRow;
	private final Time berlinTime;

	public BerlinClock(Time berlinTime) {
		this.berlinTime = berlinTime;
		initializeBerlinClock();
	}

	/**
	 * initialize clock with default rows and lamps.
	 */
	private void initializeBerlinClock() {
		this.secondsLamp = new Lamp();
		this.fiveHoursRow = new Row(BerlinClockConstant.FIVE_HOUR_LAMP_COUNT);
		this.oneHourRow = new Row(BerlinClockConstant.ONE_HOUR_LAMP_COUNT);
		this.fiveMinutesRow = new Row(BerlinClockConstant.FIVE_MINUTES_LAMP_COUNT);
		this.oneMinuteRow = new Row(BerlinClockConstant.ONE_MINUTES_LAMP_COUNT);
	}

	/**
	 * @return the secondsLamp
	 */
	public Lamp getSecondsLamp() {
		return secondsLamp;
	}

	/**
	 * @param secondsLamp
	 *            the secondsLamp to set
	 */
	public void setSecondsLamp(Lamp secondsLamp) {
		this.secondsLamp = secondsLamp;
	}

	/**
	 * @return the fiveHoursRow
	 */
	public Row getFiveHoursRow() {
		return fiveHoursRow;
	}

	/**
	 * @param fiveHoursRow
	 *            the fiveHoursRow to set
	 */
	public void setFiveHoursRow(Row fiveHoursRow) {
		this.fiveHoursRow = fiveHoursRow;
	}

	/**
	 * @return the oneHourRow
	 */
	public Row getOneHourRow() {
		return oneHourRow;
	}

	/**
	 * @param oneHourRow
	 *            the oneHourRow to set
	 */
	public void setOneHourRow(Row oneHourRow) {
		this.oneHourRow = oneHourRow;
	}

	/**
	 * @return the fiveMinutesRow
	 */
	public Row getFiveMinutesRow() {
		return fiveMinutesRow;
	}

	/**
	 * @param fiveMinutesRow
	 *            the fiveMinutesRow to set
	 */
	public void setFiveMinutesRow(Row fiveMinutesRow) {
		this.fiveMinutesRow = fiveMinutesRow;
	}

	/**
	 * @return the oneMinuteRow
	 */
	public Row getOneMinuteRow() {
		return oneMinuteRow;
	}

	/**
	 * @param oneMinuteRow
	 *            the oneMinuteRow to set
	 */
	public void setOneMinuteRow(Row oneMinuteRow) {
		this.oneMinuteRow = oneMinuteRow;
	}

	/**
	 * @return the berlinTime
	 */
	public Time getBerlinTime() {
		return berlinTime;
	}

	@Override
	public String toString() {
		return getSecondsLamp().toString() + "\n" + getFiveHoursRow().toString() + "\n" + getOneHourRow().toString()
				+ "\n" + getFiveMinutesRow().toString() + "\n" + getOneMinuteRow().toString();
	}
}
