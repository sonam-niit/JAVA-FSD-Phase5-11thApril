package com.simplilearn.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegister {

	public static void main(String[] args) {
		//step 1: set driver property
		System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
		
		//Step 2: create Instance of Chrome Driver
		WebDriver driver= new ChromeDriver();
		
		//Step 3: load the base URL which you want to test
		driver.get("https://www.facebook.com/register/");
		
	   List<WebElement> list	=driver.findElements(By.tagName("input"));
	   
	   for(WebElement element:list){
		   
		   System.out.println(element.getAttribute("name"));
	   }
		
		driver.close();
	}
}
