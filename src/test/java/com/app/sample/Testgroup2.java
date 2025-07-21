package com.app.sample;

import org.testng.annotations.Test;

public class Testgroup2 {
	
		@Test (groups= {"sanity","reg"})
		
		public void Test4()
		{
			System.out.println("test3");
		}
		
		@Test (groups= {"smoke","reg"})
		public void Test5()
		{
			System.out.println("test4");
		}
		
		@Test (groups= {"sanity","reg"})
		public void Test6()
		{
			System.out.println("test5");
		}
	}


