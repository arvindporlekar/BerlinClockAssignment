package com.ubs.opsit.interviews;

import org.junit.Test;

import com.ubs.opsit.model.Color;

import static org.junit.Assert.assertEquals;

public class ColorTest {

	@Test
	public void testDefaultColor() {
		assertEquals("O", Color.DEFAULT.toString());
	}

	@Test
	public void testRedColor() {
		assertEquals("R", Color.RED.toString());
	}

	@Test
	public void testYellowColor() {
		assertEquals("Y", Color.YELLOW.toString());
	}
}
