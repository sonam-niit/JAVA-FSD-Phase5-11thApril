package com.simplilearn;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("window.open('https://www.google.co.in','_blank')");

		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(list.get(1));
		Thread.sleep(5000);
		driver.switchTo().window(list.get(0));
	}
}
