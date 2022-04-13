package com.simplilearn.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GroupTest {

  WebDriver driver;
  @Test(groups = "chrome")
  public void lauchChrome() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Sonam Data\\Java-Phase5-11thApril\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
  @Test(groups = "chrome",dependsOnMethods = {"lauchChrome"})
  public void login() {
	  driver.findElement(By.id("email")).sendKeys("sonam@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Sonam@123");
	  driver.findElement(By.name("login")).submit();
  }
  
  
  @Test(groups = "firefox")
  public void lauchFirefox() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonam\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	  driver= new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
  }
  @Test(groups = "firefox",dependsOnMethods = {"lauchFirefox"}, alwaysRun = true)
  public void loginFB() {
	  driver.findElement(By.id("email")).sendKeys("sonam@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Sonam@123");
	  driver.findElement(By.name("login")).submit();
  }
}
