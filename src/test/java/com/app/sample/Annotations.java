package com.app.sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	//Test changes
	public  void beforesuit()
	{
		System.out.println("Before suite");
		}
	@AfterSuite
	public  void aftersuit()
	{
		System.out.println("After suite");
		}
	@BeforeTest
	public  void beforetest()
	{
		System.out.println("Before test");
		}
	@AfterTest
	public  void Aftertest()
	{
		System.out.println("After test");
		}
	@Test
	public  void test1()
	{
		System.out.println("test1");
		}
	@BeforeClass
	public  void beforeClass()
	{
		System.out.println("Before class");
		}
	@AfterClass
	public  void AfterClass()
	{
		System.out.println("After class");
		}
	@BeforeMethod
	public  void beforemethod()
	{
		System.out.println("After method");
		}
	@AfterMethod
	public  void Aftermethod()
	{
		System.out.println("After method");
		}

}
