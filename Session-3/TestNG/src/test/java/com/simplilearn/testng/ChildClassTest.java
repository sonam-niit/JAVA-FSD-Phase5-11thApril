package com.simplilearn.testng;

import org.testng.annotations.Test;

public class ChildClassTest extends ParentClassTest{

	 @Test(dependsOnMethods = "one")
	  public void three() {
		  System.out.println("Child Method 3");
	  }
	  @Test
	  public void four() {
		  System.out.println("Chile Method 4");
	  }
}
