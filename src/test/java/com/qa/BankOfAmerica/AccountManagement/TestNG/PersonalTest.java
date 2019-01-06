package com.qa.BankOfAmerica.AccountManagement.TestNG;

import org.testng.annotations.Test;

public class PersonalTest {
	
	@Test(groups= {"Smoke"})
	public void personalEducationLoan() {
		System.out.println("personalEducationLoan");
	}
	
	@Test
	public void personalAutoLoan() {
		System.out.println("personalAutoLoan");
	}
	
	@Test
	public void personalHomeLoan() {
		System.out.println("personalHomeLoan");	
	}
	
	@Test
	public void personalBusinessLoan() {
		System.out.println("personalBusinessLoan");
	}

}
