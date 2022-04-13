package com.simplilearn.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	
	WebDriver driver=null;
	SoftAssert soft=null;
	
	@BeforeMethod
	void beforeMethod(){
		soft=new SoftAssert();
	}
	@AfterMethod
	void afterMethod() {
		soft=null;
	}
	
  @Test
  public void titleTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  soft.assertEquals("Facebook – log in or sign up", driver.getTitle());
	  
  }
  @Test(dependsOnMethods = "titleTest")
  public void login() {
	  driver.findElement(By.id("email")).sendKeys("sonam@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Sonam@123");
	  driver.findElement(By.name("login")).submit();
	  
	  soft.assertAll();
  }
}
