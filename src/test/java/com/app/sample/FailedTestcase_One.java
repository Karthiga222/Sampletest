package com.app.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestcase_One {
	@Test
	public void test1()
	{
		String s="Aiite";
		Assert.assertEquals("Aiit", s);
		System.out.println("Testing hard assert");
		
	}

}
