package com.day7.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Maninder");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Singh");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("abc@abc.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("12345678");
		driver.findElement(By.cssSelector("label.radio-inline:nth-child(1) > input")).click();
		//driver.findElement(By.cssSelector("inputagree")).click();
		
		
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		
		
	}

}
