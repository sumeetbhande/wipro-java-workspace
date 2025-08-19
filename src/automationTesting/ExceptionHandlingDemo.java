package automationTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        WebDriver driver = null;

        try {
            // ================= Open any page =================
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");

            // ================= Task 1: Handle NoSuchElementException =================
            try {
                WebElement fakeElement = driver.findElement(By.id("nonExistent"));
                System.out.println("Task 1: Found element text = " + fakeElement.getText());
            } catch (NoSuchElementException e) {
                System.out.println("Task 1: NoSuchElementException handled → Element not found!");
            }

            // ================= Task 2: Handle TimeoutException =================
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
                WebElement element = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(By.id("fakeElement"))
                );
                System.out.println("Task 2: Found element = " + element.getText());
            } catch (TimeoutException e) {
                System.out.println("Task 2: TimeoutException handled → Element did not load in time!");
            }

        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());

        } finally {
            // ================= Task 3: Always close browser =================
            if (driver != null) {
                driver.quit();
                System.out.println("Task 3: Browser closed in finally block ✅");
            }
        }
    }
}
