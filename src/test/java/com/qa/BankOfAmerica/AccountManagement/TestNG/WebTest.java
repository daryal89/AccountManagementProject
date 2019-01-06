package com.qa.BankOfAmerica.AccountManagement.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest{
	
	@Test(groups= {"Smoke"})
	public void webEducationLoan() {
		System.out.println("webEducationLoan");
	}
	
	@Test
	public void webAutoLoan() {
		System.out.println("webAutoLoan(");
	}
	
	@Test(dependsOnMethods= {"webBusinessLoan"})
	public void webHomeLoan() {
		System.out.println("webHomeLoan");	
	}
	
	@Test
	public void webBusinessLoan() {
		System.out.println("webBusinessLoan");
		Assert.assertTrue(false);
	}

}
