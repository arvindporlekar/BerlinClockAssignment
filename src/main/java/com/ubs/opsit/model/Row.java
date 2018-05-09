package com.ubs.opsit.model;

import java.util.ArrayList;
import java.util.List;

/**
 * this class represent Row for Berlin clock.
 * Each row is populated with number of lamp depend on lamp count with default lamp color.
 * @author OWNER
 *
 */
public class Row {
	private final List<Lamp> lamps;

	public Row(Integer lampCount) {
		this.lamps = new ArrayList<>(lampCount);
		for (int i = 0; i < lampCount; i++) {
			this.lamps.add(new Lamp());
		}
	}

	/**
	 * @return the lamps
	 */
	public List<Lamp> getLamps() {
		return lamps;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Lamp lamp : lamps) {
			sb.append(lamp.toString());
		}
		return sb.toString();
	}
}
