package com.qa.BankOfAmerica.AccountManagement.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTest {

	@Test(groups = { "Smoke" })
	public void paraEducationLoan() {
		System.out.println("paraEducationLoan");
	}

	@Parameters({ "url", "username", "password" })
	@Test()
	public void paraAutoLoan(@Optional("default") String URL, @Optional("default") String un,
			@Optional("default") String pw) {
		System.out.println("apiAutoLoan(");
		System.out.println("From Parameter: " + URL);
		System.out.println("From Parameter: " + un);
		System.out.println("From Parameter: " + pw);

	}

	@Parameters({ "url" })
	@Test
	public void paraHomeLoan(@Optional("default") String urlname) {
		System.out.println("paraHomeLoan");
		System.out.println("From testng file: " + urlname);
	}

	@Test
	public void paraBusinessLoan() {
		System.out.println("paraBusinessLoan");
	}

}
