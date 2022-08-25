package com.flipkart.stepdefinitions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class PerfumePurchase {
	
	static long start;
	
	@BeforeClass (groups ="default")
	public static void browserLaunch() {
		System.out.println("launch Success");
	}
	
	@AfterClass (groups ="default")
	public static void browserQuit() {
		System.out.println("browser quit");
	}
	
	@BeforeMethod (groups ="default")
	public void startTime() {
		start= System.currentTimeMillis();
		System.out.println("Before time");
	}
	
	@AfterMethod (groups ="default")
	public void endTime() {
		long end = System.currentTimeMillis();
		System.out.println("After time :" + (start - end));
	}
	
	@Test(groups ="smoke",priority =1)
	public void closeLogin() {
		System.out.println("order1");
	}
	@Test(priority = 2)
	public void SearchTab() {
		System.out.println("order2");
	}
	
	@Test(groups ="smoke",priority =2)
	public void SearchContent() {
		System.out.println("order3");
	}
	
	@Test(priority = 4,enabled=false)
	public void ClickOnItem() {
		System.out.println("order4");
	}
	
	@Test(priority = 5,invocationCount=3)
	public void ScreenShot() {
		System.out.println("order5");
	}

}
