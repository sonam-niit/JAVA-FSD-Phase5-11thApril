package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/register/general/");
		
		WebElement check= driver.findElement(By.id("id_privacy"));
		
		if(check.isSelected())
			System.out.println("Check is selected");
		else
			System.out.println("not Selected");
		
		check.click();
		
	}
}
