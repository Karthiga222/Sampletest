package com.app.sample;

import org.testng.annotations.Test;

public class ParallelClass2 {
	@Test
public void test4()
{
	System.out.println(Thread.currentThread().getId());
	System.out.println("test4");
	
}
	@Test
public void test5()
{
	System.out.println(Thread.currentThread().getId());
	System.out.println("test5");
	
}
	@Test
public void test6()
{
	System.out.println(Thread.currentThread().getId());
	System.out.println("test6");
	
}
}
