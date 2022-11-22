package testngProject;

import org.testng.annotations.Test;

public class PriorityInTestNG {


	@Test(priority = 0)
	public void javaClass()
	{

		System.out.println("Java Class"); //test
	}
	@Test(priority = -1)
	public void seleniumClass()
	{

		System.out.println("Senium Class"); //testcase
	}
	@Test(priority = 2)
	public void frameworkClass()
	{

		System.out.println("Framework class");
	}
	@Test(priority = 1)
	public void demoClass()
	{

		System.out.println("Demo Class");
	}



}
