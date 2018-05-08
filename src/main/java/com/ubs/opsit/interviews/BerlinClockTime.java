/**
 * 
 */
package com.ubs.opsit.interviews;

import com.ubs.opsit.model.BerlinClock;

/**
 * @author OWNER
 *
 */
public class BerlinClockTime implements TimeConverter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.TimeConverter#convertTime(java.lang.String)
	 */
	@Override
	public String convertTime(String aTime) {
		BerlinClock berlinClock = BurlinClockBuilder.buildBerlinClock(aTime);
		return berlinClock.toString();
	}

	public static void main(String[] args) {
		BerlinClockTime berlinClockTime = new BerlinClockTime();
		System.out.println(berlinClockTime.convertTime("5:5:5"));
	}
}
