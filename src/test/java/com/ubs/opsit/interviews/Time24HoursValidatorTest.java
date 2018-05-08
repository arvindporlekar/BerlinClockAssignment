package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.utils.Time24HoursValidator;

public class Time24HoursValidatorTest {
	private Time24HoursValidator time24HoursValidator = new Time24HoursValidator();
	private String[] inputValidData;
	private String[] inputInValidData;

	@Before
	public void initData() {
		inputValidData = new String[] { "01:00:15", "02:00:30", "13:00:45", "1:00:50", "2:00:01", "13:01:10",
				"23:59:39", "15:00:05", "00:00:00", "0:00:00" };
		inputInValidData = new String[] { "25:00:00", "12:60:15", "0:0", "13:1:62", "101:45" };
	}

	@Test
	public void testValidTime24Hours() {
		for (int i = 0; i < inputValidData.length; i++) {
			Assert.assertEquals(true, time24HoursValidator.validate(inputValidData[i]));
		}
	}

	@Test
	public void InValidTime24HoursTest() {
		for (int i = 0; i < inputInValidData.length; i++) {
			Assert.assertEquals(false, time24HoursValidator.validate(inputInValidData[i]));
		}
	}
}
