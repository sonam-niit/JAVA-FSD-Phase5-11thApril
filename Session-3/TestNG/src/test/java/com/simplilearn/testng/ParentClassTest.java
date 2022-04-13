package com.simplilearn.testng;

import org.testng.annotations.Test;

public class ParentClassTest {
	
  @Test(dependsOnMethods = {"two"} )
  public void one() {
	  System.out.println("Parent Method 1");
  }
  @Test
  public void two() {
	  System.out.println("Parent Method 2");
  }
  
}
