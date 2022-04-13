package com.simplilearn.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Test1 {
  @Test
  public void test() {
	  System.out.println("Test Method");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println(">>>>>>>Before Class>>>>>>>");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println(">>>>>>After Class>>>>>>");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(">>>>Before Method>>>>>");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(">>>>>After Method>>>>>>>");
  }

}
