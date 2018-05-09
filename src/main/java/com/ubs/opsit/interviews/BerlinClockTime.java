package com.ubs.opsit.interviews;

import com.ubs.opsit.model.BerlinClock;

/**
 * this class for get Berlin Clock time depend on user time input.
 */
public class BerlinClockTime implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		BerlinClock berlinClock = BurlinClockBuilder.buildBerlinClock(aTime);
		return berlinClock.toString();
	}

	/*public static void main(String[] args) {
		BerlinClockTime berlinClockTime = new BerlinClockTime();
		System.out.println(berlinClockTime.convertTime("5:5:5"));
	}*/
}
