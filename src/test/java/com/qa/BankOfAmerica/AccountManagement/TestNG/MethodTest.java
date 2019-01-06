package com.qa.BankOfAmerica.AccountManagement.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MethodTest {
	@Test(groups = { "Smoke" })
	public void demoTest2() {
		System.out.println("DemoTest2: Hello testnG test cases  method2!!!!");
	}

	@AfterMethod
	public void aMethod() {
		System.out.println("AfterMethod: This executes After each test Method in the testModule");
	}

	@BeforeMethod
	public void bMethod() {
		System.out.println("BeforeMethod: This executes before  each test method in the testModule");
	}

	@AfterClass
	public void aClass() {
		System.out.println("AfterClass: This executes After each classes in the testModule");
	}

	@BeforeClass
	public void bClass() {
		System.out.println("BeforeClass: This executes Before each class in the testModule");
	}

	@AfterTest
	public void aTest() {
		System.out.println("AfterTest: This executes Last in the testModule");
	}

	@BeforeTest
	public void bTest() {
		System.out.println("BeforeTest: This executes First in the testModule");
	}

	@BeforeSuite
	public void bSuite() {
		System.out.println("BeforeSuite: This executes First in the TestNG project");
	}

	@AfterSuite
	public void aSuite() {
		System.out.println("AfterSuite: This executes Last in the TestNG project");
	}

	@Test
	public void demoTest() {
		System.out.println("DemoTestMethod: Hello testnG test cases!!!!");
		Assert.assertTrue(true); // Assertion passed
	}

	@Test
	public void demoTest1() {
		System.out.println("DemoTest1: Hello testnG test cases  method1!!!!");
	}

	@Test
	public void demoTest3() {
		System.out.println("DemoTest3: Hello testnG test cases  method3!!!!");
	}

	@Parameters({ "url", "username" })
	@Test
	public void test(@Optional("default") String urlname, @Optional("default") String un) {
		System.out.println("test: Hello testnG test cases  testmethod!!!!");
		System.out.println("From testng xml files: " + urlname);
		System.out.println("From testng xml files: " + un);
	}
}
