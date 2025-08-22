package com.example.alerts;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormDemo
{
	public static void main(String[] args) {
	        //WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

	        driver.get("https://www.selenium.dev/selenium/web/login.html");
	        driver.findElement(By.xpath("//*[@id=\"username-field\"]")).sendKeys("admin");
	        driver.findElement(By.xpath("//*[@id=\"password-field\"]")).sendKeys("admin123");
	        driver.findElement(By.xpath("//*[@id=\"login-form-submit\"]")).click();

	       // driver.quit();
	    }
	}