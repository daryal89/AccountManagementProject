package com.qa.BankOfAmerica.AccountManagement.TestNG;

import org.testng.annotations.Test;

public class PrivateTest {
	
	@Test(groups= {"Smoke"})
	public void privateEducationLoan() {
		System.out.println("privateEducationLoan");
	}
	
	@Test
	public void privateAutoLoan() {
		System.out.println("privateAutoLoan");
	}
	
	@Test
	public void webHomeLoan() {
		System.out.println("privateHomeLoan");	
	}
	
	@Test
	public void webBusinessLoan() {
		System.out.println("privateBusinessLoan");
	}

}
