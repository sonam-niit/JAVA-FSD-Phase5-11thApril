package com.simplilearn.test;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		
		WebElement start= driver.findElement(By.xpath("//*[@id=\"start\"]/button"));
		start.click();
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement ele=wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				WebElement finish= driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
				if(finish.getText().equals("Hello World!")) {
					System.out.println("Test Passed");
					return finish;
				}
				else {
					System.out.println("Test Failed");
					return null;
				}
					
			}
		});
		
		
		
		
	}
}
