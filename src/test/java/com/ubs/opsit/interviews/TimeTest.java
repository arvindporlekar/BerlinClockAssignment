package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.model.Time;

public class TimeTest {
	
	@Test
	public void testValidTime() {
		Time time = new Time(22, 59, 59); 
		Assert.assertEquals(String.valueOf("22"), time.getHours().toString());
		Assert.assertEquals(String.valueOf("59"), time.getMinutes().toString());
		Assert.assertEquals(String.valueOf("59"), time.getSeconds().toString());
	}
}
