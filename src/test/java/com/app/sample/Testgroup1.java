package com.app.sample;

import org.testng.annotations.Test;

public class Testgroup1 {
	@Test (groups= {"smoke","reg"})
	
	public void Test1()
	{
		System.out.println("test1");
	}
	
	@Test (groups= {"smoke","reg"})
	public void Test2()
	{
		System.out.println("test2");
	}
	
	@Test (groups= {"sanity","reg"})
	public void Test3()
	{
		System.out.println("test3");
	}
}
