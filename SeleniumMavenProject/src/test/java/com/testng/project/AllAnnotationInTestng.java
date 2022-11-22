package com.testng.project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationInTestng {
	
	@BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("Before Suite in Testng");
	}
	@BeforeTest
	
	public void beforeTest()
	{
		
		System.out.println("Before Test in Testng");
	}
	@BeforeClass
	
	public void beforeClass()
	{
		
		System.out.println("Before Class in Testng");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		
		System.out.println("Before Method in Testng");
	}
	@Test(priority = 0)
	public void testCaseOne() //alphabetical
	{
		
		
		System.out.println("First Test Case");
	}
	@Test(priority = 1)
	public void secondTestCAse()  // alph
	{
		
		System.out.println("Second Test Case");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("After Method");
	}
	@AfterClass
	
	public void afterClass()
	{
		
		System.out.println("After Class");
	}
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("After Test");
	}
	@AfterSuite
	public void afterSuite()
	{
		
		System.out.println("After suite");
	}

}
