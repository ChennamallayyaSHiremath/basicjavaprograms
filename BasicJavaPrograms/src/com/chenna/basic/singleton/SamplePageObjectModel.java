package com.chenna.basic.singleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SamplePageObjectModel {

	WebDriver driver;
	
	String url="https://google.com";
	
	private By userNameFile= By.id("field");
	private By passwordField= By.id("field");
	private By buttonField= By.id("button");
	
	public void enterUserName(String userName) {
		driver.findElement(userNameFile).sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickButton() {
		driver.findElement(buttonField).click();
	}
	
	public void loginMethod(String userName, String password) {
		enterUserName(userName);
		enterPassword(password);
		clickButton();
	}
	
	//DesiredCapabilities desiredCapabilites=DesiredCapabilities.chrome();
	
	//driver=new RemoteWebDriver(new URL(url));
}
