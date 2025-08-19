package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicObjectsDemo {

    public static void main(String[] args) {

        // System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); // if needed
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        try {
            // ================= Task 1: Click Start → wait until text appears → print it =================
            WebElement startButton = driver.findElement(By.xpath("//div[@id='start']/button"));
            startButton.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement helloText = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4"))
            );
            System.out.println("Task 1 - Text appeared: " + helloText.getText());

            // ================= Task 2: Use XPath with contains() =================
            WebElement startBtnContains = driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
            if (startBtnContains.isDisplayed()) {
                System.out.println("Task 2 - Located Start button using contains()");
            }

            // ================= Task 3: Handle NoSuchElementException gracefully =================
            try {
                WebElement fakeElement = driver.findElement(By.xpath("//div[@id='nonexistent']"));
                System.out.println("Task 3 - Found element: " + fakeElement.getText());
            } catch (org.openqa.selenium.NoSuchElementException e) {
                System.out.println("Task 3 - NoSuchElementException handled gracefully: Element not found.");
            }

        } finally {
            driver.quit();
        }
    }
}
