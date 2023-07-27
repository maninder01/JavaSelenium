package com.automation.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class July_23rd_Assignment {
	// TutorialsNinja
	// Whole Login Page
	// Whole Register Page

	// each webelement - I want 3 cssSelectors for each

	public WebDriver driver;

	@BeforeSuite
	public void serverLevelVerifications() {
		System.out.println("Server is fine");
	}

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");

	}

	@Test(priority = 1)
	public void loginTestCSS1() {
		driver.findElement(By.cssSelector("a[title=\"My Account\"]")).click();
		driver.findElement(By.cssSelector("a[href$=\"account/login\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[type=\"submit\"][value=\"Login\"]")).click();
	}

	@Test(priority = 2)
	public void loginTestCSS2() {
		driver.findElement(By.cssSelector("a.dropdown-toggle[title=\"My Account\"]")).click();
		driver.findElement(By.cssSelector("a[href*=\"account/login\"]")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Test(priority = 3)
	public void loginTestCSS3() {
		driver.findElement(By.cssSelector("div#top-links > ul>li:nth-child(2) >a")).click();
		driver.findElement(By.cssSelector("div#top-links  li.dropdown > ul > li:nth-child(2) a")).click();
		driver.findElement(By.cssSelector("div#content form input[type=\"text\"]")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("div#content form input[type=\"password\"]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("div#content form input[type=\"submit\"]")).click();
	}

	@Test(priority = 4)
	public void registerTestCSS1() {
		driver.findElement(By.cssSelector("a[title=\"My Account\"]")).click();
		driver.findElement(By.cssSelector("a[href$=\"account/register\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("Maninder");
		driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("Singh");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"telephone\"]")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[name=\"confirm\"]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[name=\"newsletter\"][value=\"1\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"agree\"]")).click();
		driver.findElement(By.cssSelector("input[value=\"Continue\"]")).click();
	}

	@Test(priority = 5)
	public void registerTestCSS2() {
		driver.findElement(By.cssSelector("a.dropdown-toggle[title=\"My Account\"]")).click();
		driver.findElement(By.cssSelector("a[href*=\"account/register\"]")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Maninder");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Singh");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[type=\"radio\"][name=\"newsletter\"][value=\"1\"]")).click();
		driver.findElement(By.cssSelector("input[type=\"checkbox\"][value =\"1\"]")).click();
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	}

	@Test(priority = 6)
	public void registerTestCSS3() {
		driver.findElement(By.cssSelector("div#top-links > ul>li:nth-child(2) >a")).click();
		driver.findElement(By.cssSelector("div#top-links  li.dropdown > ul > li:nth-child(1) a")).click();
		driver.findElement(By.cssSelector("fieldset#account > div:nth-of-type(2) input")).sendKeys("Maninder");
		driver.findElement(By.cssSelector("fieldset#account > div:nth-of-type(3) input")).sendKeys("Singh");
		driver.findElement(By.cssSelector("fieldset#account > div:nth-of-type(4) input"))
				.sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("fieldset#account > div:nth-of-type(5) input")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("fieldset#account  + fieldset > div:nth-of-type(1) input"))
				.sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("fieldset#account  + fieldset > div:nth-of-type(2) input"))
				.sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("form.form-horizontal > fieldset:nth-of-type(3) input[value=\"1\"]")).click();
		driver.findElement(By.cssSelector("a[href*=\"agree&\"] + input[type=\"checkbox\"]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
