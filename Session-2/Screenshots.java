package com.simplilearn;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class Screenshots {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement query= driver.findElement(By.name("q"));
		query.sendKeys("What is Selenium");
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		//String src= screenshot.getScreenshotAs(OutputType.BASE64);
		//byte array[]=screenshot.getScreenshotAs(OutputType.BYTES);
		
		try {
			FileHandler.copy(src, new File("D:\\screenshot\\output.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		driver.close();
	}
	
	
}
