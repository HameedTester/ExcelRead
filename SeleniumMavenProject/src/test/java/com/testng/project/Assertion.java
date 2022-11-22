package com.testng.project;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {





	//	@Test
	//	public void hardAssert()
	//	{
	//		
	//		
	//		
	//		String s1="Chrompet";
	//		String s2="Velachery";
	//		
	//		System.out.println("Hard Assert Initialization");
	//		
	//		//Assert.assertEquals(s1, s2, "Both the Strings are Not Equal"); // fail
	//		Assert.assertNotEquals(s1, s2);
	//		System.out.println("End of Hard Assert");
	//		
	//		
	//		
	//		
	//	}

	@Test
	public void softAssert()
	{


		String s1="Oranium Chrompet";
		String s2="Oranium Velachery";

		System.out.println("Initialization of Soft Assert");
		SoftAssert s = new SoftAssert();

		s.assertEquals(s1, s2,"Both the Strings are Not Equal"); // fail


		System.out.println("End of Soft Assert");
		
		s.assertAll();














	}

}
