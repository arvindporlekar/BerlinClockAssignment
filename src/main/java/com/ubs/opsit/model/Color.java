package com.ubs.opsit.model;

/**
 * represents Color code for lamp.
 * @author OWNER
 *
 */
public enum Color {
	DEFAULT("O"), RED("R"), YELLOW("Y");

	private String colorCode;

	Color(String colorCode) {
		this.colorCode = colorCode;
	}

	@Override
	public String toString() {
		return colorCode;
	}
}
