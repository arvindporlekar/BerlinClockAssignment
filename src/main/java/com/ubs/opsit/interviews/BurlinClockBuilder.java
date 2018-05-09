package com.ubs.opsit.interviews;

import org.apache.commons.lang.StringUtils;

import com.ubs.opsit.model.BerlinClock;
import com.ubs.opsit.model.Time;
import com.ubs.opsit.utils.BerlinClockUtils;

/**
 * Berlin Clock Builder, will build Clock time and turn lamp depend on hour,
 * minute and minute.
 * 
 * @author OWNER
 *
 */
public abstract class BurlinClockBuilder {
	private BurlinClockBuilder() {

	}

	public static BerlinClock buildBerlinClock(String timeString) {
		if (StringUtils.isEmpty(timeString)) {
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
