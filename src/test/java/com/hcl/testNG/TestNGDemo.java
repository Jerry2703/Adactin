package com.hcl.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeSuite
	private void browsersetup() {
		System.out.println("browser initiated");
	}

	@BeforeTest
	private void browserlaunch() {
		System.out.println("browser lanched");
	}

	@BeforeClass
	private void navigate() {
		System.out.println("navigate to url");
	}

	@BeforeMethod
	private void login() {
		System.out.println("login");
	}

	@Test(priority = 2)
	private void demo() {
		System.out.println("Hello world");
	}

	@Test(priority = 1)
	private void demo2() {
		System.out.println("How are you?");
	}

	@AfterMethod
	private void Logout() {
		System.out.println("logout");
	}

	@AfterClass
	private void browserClose() {
		System.out.println("browser closed");

	}

	@AfterTest
	private void verification() {
		System.out.println("verified");
	}

	@AfterSuite
	private void cookies() {
		System.out.println("cookies cleared");
	}
}
