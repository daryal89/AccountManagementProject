package com.qa.BankOfAmerica.AccountManagement.TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "getData")
	public void dataProviderEducationLoan(@Optional("default")String un, @Optional("default") String pw) {
		System.out.println("DataProviserEducationLoan");
		System.out.println("username: " + un);
		System.out.println("password: " + pw);
	}

	@Test
	public void dataProviderAutoLoan() {
		System.out.println("DataProviderAutoLoan(");
	}

	@Test
	public void dataProviderHomeLoan() {
		System.out.println("DataProviderHomeLoan");
	}

	@Test(invocationCount =5)
	public void dataProviderBusinessLoan() {
		System.out.println("DataproviderBusinessLoan");
		Assert.assertTrue(true);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "firstUserName";
		data[0][1] = "firstPassword";

		data[1][0] = "secondUserName";
		data[1][1] = "secondPassword";
		
		data[2][0] = "thireUserName";
		data[2][1] = "thirdPassword";

		return data;
	}
}
