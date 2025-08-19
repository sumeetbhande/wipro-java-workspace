package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class SynchronizationDemo {

    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); // if needed
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        // ================= Task 1: Thread.sleep() =================
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        Thread.sleep(5000); // static wait
        WebElement msg1 = driver.findElement(By.id("message"));
        System.out.println("Task 1 - Message after Remove: " + msg1.getText());

        // ================= Task 2: Implicit Wait =================
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        WebElement inputBox = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
        System.out.println("Task 2 - Input Box Enabled? " + inputBox.isEnabled());

        // ================= Task 3: Explicit Wait =================
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement enableBtn = explicitWait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enable']"))
        );
        System.out.println("Task 3 - Button is clickable now: " + enableBtn.getText());

        // ================= Task 4: Fluent Wait with Polling =================
        driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click(); // remove again
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement message = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement msg = driver.findElement(By.id("message"));
                if (msg.isDisplayed()) {
                    return msg;
                } else {
                    return null;
                }
            }
        });

        System.out.println("Task 4 - Fluent Wait Message: " + message.getText());

        driver.quit();
    }
}
