package com.javacodegeeks.testng.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgMavenSecondClass {

	@Test
	public void oneMoreTest() {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankit shivane\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://edureka.co");

		System.out.println("This is a TestNG-Maven based test");
	}
}
