package com.Saucedemo.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice1 
{
	@Test(priority=2)                 //1
	public void loginTest()
	{
		System.out.println("Login test1");
		
		Assert.assertTrue(true);        //used for failing purpose
		
	}
	
	@Test(dependsOnMethods= {"loginTest"}, priority=1)       //2
	public void sigleProductTest()
	{
		System.out.println("Single product test1");
	}
	@Test(invocationCount=4)
	public void method()
	{
		System.out.println("method1");
	}
}



