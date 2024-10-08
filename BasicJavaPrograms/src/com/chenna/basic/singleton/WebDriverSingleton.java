package com.chenna.basic.singleton;

import org.openqa.selenium.WebDriver;

public class WebDriverSingleton {
	
	public static volatile WebDriver instance;
	
	private WebDriverSingleton() {
		
	}
	
	public static WebDriver getInstance() {
		
		if(instance == null) {
			
			synchronized (WebDriverSingleton.class) {
				System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
				instance.get("https://google.com");
			}
			
		}
		
		return instance;
		
	}

}
