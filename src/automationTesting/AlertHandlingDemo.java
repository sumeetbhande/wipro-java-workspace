package automationTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo {

    public static void main(String[] args) throws InterruptedException {
        
        // Set ChromeDriver path (only if needed, otherwise comment this out)
        // System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        // Initialize driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the test page
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // ================= Task 1: Handle JS Alert =================
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println("Task 1 - Alert Text: " + alert1.getText()); // print alert text
        alert1.accept(); // Accept the alert

        // ================= Task 2: Handle JS Confirm =================
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss(); // Dismiss the alert
        String resultText2 = driver.findElement(By.id("result")).getText();
        System.out.println("Task 2 - Result Text: " + resultText2);

        // ================= Task 3: Handle JS Prompt =================
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert3 = driver.switchTo().alert();
        String name = "Sumeet"; // you can change this
        alert3.sendKeys(name); // Enter text into the prompt
        alert3.accept(); // Accept
        String resultText3 = driver.findElement(By.id("result")).getText();
        System.out.println("Task 3 - Result Text: " + resultText3);

        // Close browser
        Thread.sleep(2000);
        driver.quit();
    }
}
