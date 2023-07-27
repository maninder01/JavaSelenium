package com.Day5.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomation 
{
    public static void main( String[] args )
    {
//    	WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//        driver.get("https://tutorialsninja.com/demo/");
//        
//        driver.findElement(By.linkText("My Account")).click();
//        driver.findElement(By.linkText("Login")).click();
//        driver.findElement(By.id("input-email")).sendKeys("seleniumpanda2@gmail.com");
//        driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
//        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
//		driver.findElement(By.linkText("Logout")).click();
//		driver.findElement(By.linkText("Continue")).click();
//		
//		driver.quit();
    	
    	
    	//switchWindows();
    	classAssigment();
    }
    
    
    public static void switchWindows() {
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://tutorialsninja.com/demo/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com/");
    }
    
    public static void classAssigment() {
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://tutorialsninja.com");
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Maninder");
        driver.findElement(By.name("lastname")).sendKeys("Singh");
        driver.findElement(By.name("reg_email__")).sendKeys("abc@abc.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@abc.com");
    }
}
