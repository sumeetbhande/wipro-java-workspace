package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Starting ....");
		driver.get("https://www.calculator.net/");
		
		driver.manage().timeouts().
		implicitlyWait(Duration.ofMillis(500));
		
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		
		String res = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
		System.out.println("Result is: "+res);
		if(res.trim().equals("10")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
//		driver.quit();
		System.out.println("Closed Browser ...");

	}

}
