package com.qa.BankOfAmerica.AccountManagement.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DataDriven {

	WebDriver driver;
	public Properties prop;
	public Properties loc;
	public FileInputStream fis;

	@BeforeMethod
	public void setUp() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\creat\\eclipse-workspace\\AccountManagement\\resources\\config.properties");
		prop.load(fis);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\creat\\eclipse-workspace\\AccountManagement\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\creat\\eclipse-workspace\\AccountManagement\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\creat\\eclipse-workspace\\TestProject\\InternetExplorerDriver.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}

	@Test(priority = 0)
	public void registration() throws IOException {
		loc = new Properties();
		FileInputStream fis1 = new FileInputStream(
				"C:\\Users\\creat\\eclipse-workspace\\AccountManagement\\resources\\locator.properties");
		loc.load(fis1);
		driver.findElement(By.name("firstname")).sendKeys(loc.getProperty("firstname"));
		driver.findElement(By.name("lastname")).sendKeys(loc.getProperty("lastname"));
		driver.findElement(By.name("reg_email__")).sendKeys(loc.getProperty("regemail"));
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(loc.getProperty("regemail"));
		driver.findElement(By.name("reg_passwd__")).sendKeys(loc.getProperty("regpassword"));

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

	@Test(priority = 1)
	public void logIn() {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("login completed");
	}

	@Test(priority = 2)
	public void checkDataExtraction() throws IOException {
		// getting data from properties file
		System.out.println("Executied last: This is for extracting the values from the properties file");

		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));

		System.out.println("----------------------");
		System.out.println(loc.getProperty("firstname"));
		System.out.println(loc.getProperty("lastname"));
		System.out.println(loc.getProperty("regemail"));
		System.out.println(loc.getProperty("regpassword"));
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
