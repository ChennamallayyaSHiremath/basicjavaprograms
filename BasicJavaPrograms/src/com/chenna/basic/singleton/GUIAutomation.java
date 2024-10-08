package com.chenna.basic.singleton;

import org.openqa.selenium.WebDriver;

public class GUIAutomation {
	
	public static void main(String[] args) {
		
		WebDriver driver = WebDriverSingleton.getInstance();
		
		driver.get("google.com");
		
		
		
	}

}
