package com.qa.BankOfAmerica.AccountManagement.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileTest {
	
	@Test(groups= {"Smoke"})
	public void mobileEducationLoan() {
		System.out.println("mobileEducationLoan");
	}
	
	@Test
	public void mobileAutoLoan() {
		System.out.println("mobileAutoLoan(");
	}
	
	@Test(dependsOnMethods="mobileBusinessLoan")
	public void mobileHomeLoan() {
		System.out.println("mobileHomeLoan");	
	}
	
	@Test
	public void mobileBusinessLoan() {
		System.out.println("mobileBusinessLoan");
		Assert.assertTrue(false);
	}

}
