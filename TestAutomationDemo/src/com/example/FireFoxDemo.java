package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		try {
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("cheese !!!");
			searchBox.submit();
			Thread.sleep(5000);
			String pageTitle = driver.getTitle();
			System.out.println("Page Title after search: " + pageTitle);
			
		}catch (InterruptedException ex) {
			ex.printStackTrace();
		}finally {
			driver.quit();
		}
	}

}
