package com.qa.BankOfAmerica.AccountManagement.Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
	WebDriver driver;
	String url = "https://www.facebook.com/";

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\creat\\eclipse-workspace\\TestProject\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
	}

	@Test
	public void logIn() {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("dhruba123@gmail.com);");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		System.out.println("login completed");
	}

	@Test
	public void register() {
		driver.findElement(By.name("firstname")).sendKeys("shyam");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.name("reg_email__")).sendKeys("shyammohan123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shyammohan123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc123");

		Select s1 = new Select(driver.findElement(By.name("birthday_month")));
		s1.selectByIndex(3);

		Select s2 = new Select(driver.findElement(By.name("birthday_day")));
		s2.selectByValue("5");

		Select s3 = new Select(driver.findElement(By.name("birthday_year")));
		s3.selectByVisibleText("1992");

		driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();

		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

		System.out.println("registration passed");

	}

	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
