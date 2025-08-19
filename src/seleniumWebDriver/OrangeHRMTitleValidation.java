package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTitleValidation {
    public static void main(String[] args) throws InterruptedException {

        // 1. Launch Chrome (Selenium Manager auto-handles ChromeDriver)
        WebDriver driver = new ChromeDriver();

        try {
            // 2. Open OrangeHRM login page
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.manage().window().maximize();

            // 3. Enter username
            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("Admin");

            // 4. Enter password
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("admin123");

            // 5. Click login button
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();

            // 6. Wait for page to load
            Thread.sleep(2000);

            // 7. Validate title
            String actualTitle = driver.getTitle();
            System.out.println("Actual Title: " + actualTitle);

            if (actualTitle.equals("OrangeHRM")) {
                System.out.println("✅ Test Passed: Title matched.");
            } else {
                System.out.println("❌ Test Failed: Title did not match.");
            }

        } finally {
            // 8. Close browser
//            driver.quit();
        }
    }
}
