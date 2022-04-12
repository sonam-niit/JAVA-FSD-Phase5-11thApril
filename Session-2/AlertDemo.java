package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        
//        WebElement name = driver.findElement(By.name("alertbox"));
//        name.click();
//        
//        System.out.println("Message: "+driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
        
//        WebElement name = driver.findElement(By.name("confirmalertbox"));
//        name.click();
//        
//        System.out.println("Message: "+driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
        
//        name.click();
//        driver.switchTo().alert().dismiss();
        
        WebElement prompt= driver.findElement(By.name("promptalertbox1234"));
        prompt.click();
        driver.switchTo().alert().sendKeys("Yes");
        System.out.println("Message: "+driver.switchTo().alert().getText());
        
        driver.switchTo().alert().accept();
        
	}
}
