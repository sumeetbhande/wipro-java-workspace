package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); // if needed
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");

        // ================= Task 1: Switch into iframe → type “Hello Selenium” =================
        driver.switchTo().frame("mce_0_ifr"); // iframe has id/name = mce_0_ifr
        WebElement textBox = driver.findElement(By.id("tinymce"));
        textBox.clear(); // clear default text
        textBox.sendKeys("Hello Selenium");
        System.out.println("Task 1: Entered text inside iframe.");

        Thread.sleep(1500);

        // ================= Task 2: Clear text and type full name =================
        textBox.clear();
        String fullName = "Sumeet Bhande"; // replace with your name
        textBox.sendKeys(fullName);
        System.out.println("Task 2: Entered full name inside iframe.");

        Thread.sleep(1500);

        // ================= Task 3: Switch back to default content → verify page header =================
        driver.switchTo().defaultContent();
        WebElement header = driver.findElement(By.tagName("h3"));
        if (header.isDisplayed()) {
            System.out.println("Task 3: Verified header is visible → " + header.getText());
        } else {
            System.out.println("Task 3: Header not found!");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
