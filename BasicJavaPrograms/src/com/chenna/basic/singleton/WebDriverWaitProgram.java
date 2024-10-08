package com.chenna.basic.singleton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitProgram {
	
	WebDriver driver=new ChromeDriver();
	
	WebElement element=driver.findElement(By.id("Chenna"));
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(element));
//
//	element.click();
}
