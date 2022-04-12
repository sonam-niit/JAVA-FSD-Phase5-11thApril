package com.simplilearn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoI3FileUpload {

	public static void main(String[] args) throws InterruptedException,IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.shine.com/registration/");
        
        WebElement name = driver.findElement(By.id("id_name"));
        name.sendKeys("sonam soni");
        
        WebElement upload = driver.findElement(By.id("id_file"));
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", upload);
        
        Thread.sleep(5000);
        
        Runtime.getRuntime().exec("D:\\screenshot\\fileUpload.exe");
        
	}
}
