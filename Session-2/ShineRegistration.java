package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShineRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		
        driver.get("https://www.shine.com/registration/");
        
        WebElement name = driver.findElement(By.id("id_name"));
        name.sendKeys("sonam soni");
        
        WebElement email = driver.findElement(By.id("id_email"));
        email.sendKeys("testets@gmail.com");
        
        WebElement phone= driver.findElement(By.id("id_cell_phone"));
        phone.sendKeys("9234567890");
        
        WebElement pass= driver.findElement(By.id("id_password"));
        pass.sendKeys("Sonam@1234");
        
        WebElement submit= driver.findElement(By.id("registerButton"));
        submit.click();
        	
	}
}
