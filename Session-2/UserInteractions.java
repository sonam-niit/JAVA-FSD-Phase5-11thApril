package com.simplilearn;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class UserInteractions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement element= driver.findElement(By.name("q"));
		Actions builder= new Actions(driver);
		
		Action myAction= builder.moveToElement(element)
				.click()
				.keyDown(element,Keys.SHIFT)
				.sendKeys(element,"s")
				.keyUp(element,Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		myAction.perform();
		
		driver.close();
	}
	
	
}
