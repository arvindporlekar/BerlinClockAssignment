package com.ubs.opsit.utils;

import com.ubs.opsit.model.BerlinClock;
import com.ubs.opsit.model.Color;
import com.ubs.opsit.model.Time;

/**
 * Utility for berlin clock.
 * @author OWNER
 *
 */
public abstract class BerlinClockUtils {
	private BerlinClockUtils() {}

	/**
	 * get the Time object depending on input time string.
	 * @param timeString
	 * @return Time
	 */
	public static Time getTime(String timeString) {
		Time24HoursValidator time24HoursValidator = new Time24HoursValidator();
		Boolean isValidtime = time24HoursValidator.validate(timeString);
		if (!isValidtime) {
			throw new IllegalArgumentException("invalid time string.");
		}
		String[] parts = timeString.split(":");
		int hour = Integer.valueOf(parts[0]);
		int minutes = Integer.valueOf(parts[1]);
		int seconds = Integer.valueOf(parts[2]);
		return new Time(hour, minutes, seconds);
	}

	/**
	 * turn on clock seconds lamp.
	 * 
	 * @param berlinClock
	 */
	public static void turnOnSecondsLamp(BerlinClock berlinClock) {
		if (berlinClock.getBerlinTime().getSeconds() % 2 == 0) {
			berlinClock.getSecondsLamp().setLampColor(Color.YELLOW);
		}
	}

	/**
	 * Turn on five hour and one hour lamps of clock
	 * 
	 * @param berlinClock
	 */
	public static void turnOnHoursLamp(BerlinClock berlinClock) {
		Integer fiveHoursLampCount = berlinClock.getBerlinTime().getHours() / 5;
		Integer oneHoursLampCount = berlinClock.getBerlinTime().getHours() % 5;

		for (int i = 0; i < fiveHoursLampCount; i++) {
			berlinClock.getFiveHoursRow().getLamps().get(i).setLampColor(Color.RED);
		}
		for (int i = 0; i < oneHoursLampCount; i++) {
			berlinClock.getOneHourRow().getLamps().get(i).setLampColor(Color.RED);
		}
	}

	/**
	 * Turn on five minutes and one minutes lamps of clock
	 * 
	 * @param berlinClock
	 */
	public static void turnOnMinutesLamp(BerlinClock berlinClock) {
		Integer fiveMinutesLampCount = berlinClock.getBerlinTime().getMinutes() / 5;
		Integer oneMinutesLampCount = berlinClock.getBerlinTime().getMinutes() % 5;

		for (int i = 0; i < fiveMinutesLampCount; i++) {
			if (i == BerlinClockConstant.FIRST_QUATER_VALUE || i == BerlinClockConstant.HALF_QUATER_VALUE
					|| i == BerlinClockConstant.LAST_QUATER_VALUE) {
				berlinClock.getFiveMinutesRow().getLamps().get(i).setLampColor(Color.RED);
			} else {
				berlinClock.getFiveMinutesRow().getLamps().get(i).setLampColor(Color.YELLOW);
			}
		}
		for (int i = 0; i < oneMinutesLampCount; i++) {
			berlinClock.getOneMinuteRow().getLamps().get(i).setLampColor(Color.YELLOW);
		}
	}
}
