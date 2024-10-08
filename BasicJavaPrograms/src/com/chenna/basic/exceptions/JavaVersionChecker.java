package com.chenna.basic.exceptions;

public class JavaVersionChecker {
	
	public static void javaVersionChecker(String version) throws JavaInvalidSelectorException {
		if (!version.equals("1.8") && !version.equals("11")) {
			throw new JavaInvalidSelectorException("Invalid java version " + version);
		}
	}

}
