package com.example.form;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("alex@gmail.com");
		WebElement age=driver.findElement(By.xpath("//*[@id=\"age\"]"));
		age.sendKeys("20");
//		 driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
//		 String response = driver.findElement(By.xpath("//*[@id=\"greeting\"]")).getText();
//		 System.out.println("Response : "+response);
		//check box
		driver.findElement(By.xpath("//*[@id=\"checky\"]")).click();
		//drop down
		WebElement dd=driver.findElement(By.xpath("/html/body/form[3]/select[1]"));
		Select select=new Select(dd);
		WebElement web_ele=select.getFirstSelectedOption();
		System.out.println("Default selcted:"+web_ele.getText());
		select.selectByValue("two");
		List<WebElement> selectedOption =select.getAllSelectedOptions();
		for(WebElement opt: selectedOption) {
			System.out.println("Selected Option is : "+opt.getText());
			
		}
		
		

	}

}