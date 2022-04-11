package com.simplilearn.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) {
		//step 1: set driver property
		System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
		
		//Step 2: create Instance of Chrome Driver
		WebDriver driver= new ChromeDriver();
		
		//Step 3: load the base URL which you want to test
		driver.get("https://www.facebook.com/");
		
		//System.out.println("Google Title: "+ driver.getTitle());
		String expected="Facebook – log in or sign up";
		String actual=driver.getTitle();
		
		if(expected.equals(actual))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		driver.close();
	}
}
