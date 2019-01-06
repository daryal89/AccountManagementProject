package com.qa.BankOfAmerica.AccountManagement.TestNG;

import org.testng.annotations.Test;

public class ApiTest {
	
	@Test(groups= {"Smoke"})
	public void apiEducationLoan() {
		System.out.println("apiEducationLoan");
	}
	
	@Test
	public void apiAutoLoan() {
		System.out.println("apiAutoLoan(");
	}
	
	@Test
	public void apiHomeLoan() {
		System.out.println("apiHomeLoan");	
	}
	
	@Test
	public void apiBusinessLoan() {
		System.out.println("apiBusinessLoan");
	}

}
