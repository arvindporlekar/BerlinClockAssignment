package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.model.Color;
import com.ubs.opsit.model.Lamp;

public class LampTest {

	@Test
	public void testLampDefaultColor() {
		Lamp lamp = new Lamp();
		Assert.assertEquals(lamp.getLampColor(), Color.DEFAULT);
	}

	@Test
	public void testLampWithRedColor() {
		Lamp lamp = new Lamp();
		lamp.setLampColor(Color.RED);
		Assert.assertEquals(lamp.getLampColor(), Color.RED);
	}

	@Test
	public void testLampWithYellowColor() {
		Lamp lamp = new Lamp();
		lamp.setLampColor(Color.YELLOW);
		Assert.assertEquals(lamp.getLampColor(), Color.YELLOW);
	}
}
