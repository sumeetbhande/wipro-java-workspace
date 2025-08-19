package automationTesting;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class SelfPractise2 { 
    public static void main(String[] args) { 
    	
			// Set driver path 
			//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); 
    	
			// Initialize WebDriver 
            WebDriver driver = new ChromeDriver(); 
            // Open Google 
            driver.get("https://www.google.com"); 
			// Find Search Box and enter text 
			WebElement searchBox = driver.findElement(By.name("q")); 
			searchBox.sendKeys("Selenium WebDriver"); 
			searchBox.submit(); 
			// Print page title 
			System.out.println("Page Title: " + driver.getTitle()); 
			//driver.quit(); 
} 
} 
