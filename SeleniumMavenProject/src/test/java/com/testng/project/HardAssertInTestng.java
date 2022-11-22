package com.testng.project;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertInTestng {

	@Test
	public void hardAssert()
	{


		String s1="Oranium Tech Chrompet";
		String s2="Oranium Tech Velachery";

		String s3=null;


		//		Assert.assertEquals(s1, s2,"Is not a Equal Value");//
		//
		//		System.out.println("Assert is Fail");
		//
		//		System.out.println("Assert is not Equals");

		//		Assert.assertNotEquals(s1, s2, "Both the Strings are Not Equal");//
		//
		//		System.out.println("Both the Strings are Not Equal");
		//
		//		System.out.println("Hard Assert in TestNG");

		//		Assert.assertNotNull(s3, "Is Not a Null");//
		//		
		//		System.out.println("There is No Null in String s3");


		//		Assert.assertNull(s3, "Is contains Null Value");//validation is true
		//		
		//		System.out.println("It contains Null Value");
		//		
		//		System.out.println("It contains Null value in String 3");


		// syntax for Soft Assert

		SoftAssert s = new SoftAssert();

//		s.assertNotEquals(s1, s2,"Both the Strings are Not Equals"); // false
//
//		System.out.println("Both the Statements are not equals");
//		
	    s.assertEquals(s1, s2,"Both the Strings are Not Equals");
	    
	    System.out.println("Both the Statements are not Equal");
	    
	    System.out.println("Soft Asserts Print the Statements even the test cases fail");
	    
	    s.assertAll();







	}

}
