package com.ubs.opsit.model;

import com.ubs.opsit.utils.BerlinClockConstant;

/**
 * this class represents Time format in HH:MM:SS
 * @author OWNER
 */
public class Time {

	private final Integer hours;
	private final Integer minutes;
	private final Integer seconds;

	public Time(Integer hours, Integer minutes, Integer seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	/**
	 * @return the hours
	 */
	public Integer getHours() {
		return hours;
	}

	/**
	 * @return the minutes
	 */
	public Integer getMinutes() {
		return minutes;
	}

	/**
	 * @return the seconds
	 */
	public Integer getSeconds() {
		return seconds;
	}

	/**
	 * Represent time in hh:mm:ss format
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.valueOf(getHours()).concat(BerlinClockConstant.TIME_SEPERATOR)
				.concat(String.valueOf(getMinutes())).concat(BerlinClockConstant.TIME_SEPERATOR)
				.concat(String.valueOf(getSeconds()));
	}

}
