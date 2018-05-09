package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.model.Row;

public class RowTest {

	@Test
	public void testLampCountForAnyRow() {
		Row row = new Row(4);
		Assert.assertEquals(4, row.getLamps().size());
	}
	
	@Test
	public void testLampCountForZeroRow() {
		Row row = new Row(0);
		Assert.assertEquals(0, row.getLamps().size());
	}

	@Test(expected=IllegalArgumentException.class)
	public void testInvalidLampCount() {
		Row row = new Row(-1);
		Assert.assertEquals(-1, row.getLamps().size());
	}
}
