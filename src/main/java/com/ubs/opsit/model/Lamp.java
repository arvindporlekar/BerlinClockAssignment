package com.ubs.opsit.model;

/**
 * represent Lamp for each clock row. lamp is having default color code "O"
 * @author OWNER
 *
 */
public class Lamp {

	private Color lampColor;

	public Lamp() {
		lampColor = Color.DEFAULT;
	}

	public Color getLampColor() {
		return lampColor;
	}

	public void setLampColor(Color lampColor) {
		this.lampColor = lampColor;
	}

	@Override
	public String toString() {
		return lampColor.toString();
	}
}
