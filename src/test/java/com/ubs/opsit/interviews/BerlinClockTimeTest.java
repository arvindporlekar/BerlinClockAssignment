package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * 
 */
public class BerlinClockTimeTest {

	@Test
	public void testMidNight() {
		TimeConverter TimeConverter = new BerlinClockTime();
		Assert.assertEquals("Y\nOOOO\nOOOO\nOOOOOOOOOOO\nOOOO", TimeConverter.convertTime("00:00:00"));
	}

	@Test
	public void testMiddleOfAfternoon() {
		TimeConverter TimeConverter = new BerlinClockTime();
		Assert.assertEquals("O\nRROO\nRRRO\nYYROOOOOOOO\nYYOO", TimeConverter.convertTime("13:17:01"));
	}

	@Test
	public void testJustBeforeMidnight() {
		TimeConverter TimeConverter = new BerlinClockTime();
		Assert.assertEquals("O\nRRRR\nRRRO\nYYRYYRYYRYY\nYYYY", TimeConverter.convertTime("23:59:59"));
	}

	@Test
	public void testMidNightWith24Hour() {
		TimeConverter TimeConverter = new BerlinClockTime();
		Assert.assertEquals("Y\nRRRR\nRRRR\nOOOOOOOOOOO\nOOOO", TimeConverter.convertTime("24:00:00"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidTimeWithNull() {
		TimeConverter TimeConverter = new BerlinClockTime();
		TimeConverter.convertTime(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidTimeWithEmptyString() {
		TimeConverter TimeConverter = new BerlinClockTime();
		TimeConverter.convertTime("");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidTimeWithWrongFormat() {
		TimeConverter TimeConverter = new BerlinClockTime();
		TimeConverter.convertTime("dummyTime");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidHours() {
		TimeConverter TimeConverter = new BerlinClockTime();
		TimeConverter.convertTime("32:00:00");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidMinutes() {
		TimeConverter TimeConverter = new BerlinClockTime();
		TimeConverter.convertTime("23:62:00");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidSeconds() {
		TimeConverter TimeConverter = new BerlinClockTime();
		TimeConverter.convertTime("23:45:62");
	}
}
