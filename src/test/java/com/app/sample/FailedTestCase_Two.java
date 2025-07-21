package com.app.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCase_Two {
	@Test
	public void test2()
	{
		String s="Aiite";
		Assert.assertEquals("Aiit", s);
		System.out.println("Testing hard assert");
		
	}
	@Test
	public void test3()
	{
		String s="Aiite";
		Assert.assertEquals("Aiit", s);
		System.out.println("Testing hard assert");
		
	}
	@Test
	public void test4()
	{
		String s="Aiite";
		Assert.assertEquals("Aiit", s);
		System.out.println("Testing hard assert");
		
	}
	
}
