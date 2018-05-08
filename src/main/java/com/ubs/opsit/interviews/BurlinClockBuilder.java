package com.ubs.opsit.interviews;

import org.apache.commons.lang.StringUtils;

import com.ubs.opsit.model.BerlinClock;
import com.ubs.opsit.model.Time;
import com.ubs.opsit.utils.BerlinClockUtils;

public abstract class BurlinClockBuilder {

	public static BerlinClock buildBerlinClock(String timeString) {
		if(StringUtils.isEmpty(timeString)) {
			throw new IllegalArgumentException("Invalid time input.");
		}
		Time time = BerlinClockUtils.getTime(timeString);
		BerlinClock berlinClock = new BerlinClock(time);
		BerlinClockUtils.turnOnSecondsLamp(berlinClock);
		BerlinClockUtils.turnOnHoursLamp(berlinClock);
		BerlinClockUtils.turnOnMinutesLamp(berlinClock);
		return berlinClock;
	}
}
