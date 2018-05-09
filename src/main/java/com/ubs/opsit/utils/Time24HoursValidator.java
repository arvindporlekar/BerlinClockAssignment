package com.ubs.opsit.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

/**
 * Validator to validate 24 Hour time format.
 * 
 * @author OWNER
 *
 */
public class Time24HoursValidator {
	private static final String TIME24HOURS_PATTERN = "([01]?[0-9]|2[0-4]):[0-5][0-9]:[0-5][0-9]";
	private Pattern pattern;
	private Matcher matcher;

	public Time24HoursValidator() {
		pattern = Pattern.compile(TIME24HOURS_PATTERN);
	}

	/**
	 * Validate time in 24 hours format with regular expression
	 * 
	 * @param time
	 *            String for validation
	 * @return true valid time format, false invalid time format
	 */
	public boolean validate(final String time) {
		if (StringUtils.isEmpty(time)) {
			return false;
		}
		matcher = pattern.matcher(time);
		return matcher.matches();
	}
}
