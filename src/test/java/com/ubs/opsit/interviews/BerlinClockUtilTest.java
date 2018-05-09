package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.model.BerlinClock;
import com.ubs.opsit.model.Color;
import com.ubs.opsit.model.Time;
import com.ubs.opsit.utils.BerlinClockUtils;

public class BerlinClockUtilTest {

	@Test
	public void testValidTime() {
		Time time = new Time(23, 59, 59);
		Time expected = BerlinClockUtils.getTime("23:59:59");

		Assert.assertEquals(time.getHours().toString(), expected.getHours().toString());
		Assert.assertEquals(time.getMinutes().toString(), expected.getMinutes().toString());
		Assert.assertEquals(time.getSeconds().toString(), expected.getSeconds().toString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidTimeString() {
		BerlinClockUtils.getTime("25:62:59");
	}

	@Test
	public void testTurnOnSecondsLampDefault() {
		Time time = new Time(23, 59, 59);
		BerlinClock berlinClock = new BerlinClock(time);
		BerlinClockUtils.turnOnSecondsLamp(berlinClock);
		Assert.assertEquals(berlinClock.getSecondsLamp().getLampColor().toString(), Color.DEFAULT.toString());
	}

	@Test
	public void testTurnOnSecondsLampYellow() {
		Time time = new Time(23, 59, 58);
		BerlinClock berlinClock = new BerlinClock(time);
		BerlinClockUtils.turnOnSecondsLamp(berlinClock);
		Assert.assertEquals(berlinClock.getSecondsLamp().getLampColor().toString(), Color.YELLOW.toString());
	}

	@Test
	public void testTurnFiveHoursLamp() {
		Time time = new Time(05, 59, 59);
		BerlinClock berlinClock = new BerlinClock(time);
		BerlinClockUtils.turnOnHoursLamp(berlinClock);

		Assert.assertEquals(berlinClock.getFiveHoursRow().getLamps().get(0).getLampColor().toString(),
				Color.RED.toString());
	}

	@Test
	public void testTurnOneHoursLamp() {
		Time time = new Time(21, 59, 59);
		BerlinClock berlinClock = new BerlinClock(time);
		BerlinClockUtils.turnOnHoursLamp(berlinClock);

		Assert.assertEquals(berlinClock.getOneHourRow().getLamps().get(0).getLampColor().toString(),
				Color.RED.toString());
	}

	@Test
	public void testTurnOnMinutesLampForFirstQuater() {
		Time time = new Time(23, 20, 59);
		BerlinClock berlinClock = new BerlinClock(time);
		BerlinClockUtils.turnOnMinutesLamp(berlinClock);

		Assert.assertEquals(berlinClock.getFiveMinutesRow().getLamps().get(2).getLampColor().toString(),
				Color.RED.toString());
	}

	@Test
	public void testTurnOnMinutesLampForHalfQuater() {
		Time time = new Time(23, 35, 59);
		BerlinClock berlinClock = new BerlinClock(time);
		BerlinClockUtils.turnOnMinutesLamp(berlinClock);

		Assert.assertEquals(berlinClock.getFiveMinutesRow().getLamps().get(5).getLampColor().toString(),
				Color.RED.toString());
	}

	@Test
	public void testTurnOnMinutesLampForLastQuater() {
		Time time = new Time(23, 50, 59);
		BerlinClock berlinClock = new BerlinClock(time);
		BerlinClockUtils.turnOnMinutesLamp(berlinClock);

		Assert.assertEquals(berlinClock.getFiveMinutesRow().getLamps().get(8).getLampColor().toString(),
				Color.RED.toString());
	}
}
