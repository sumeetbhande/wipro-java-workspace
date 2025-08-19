package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindowsDemo {

    public static void main(String[] args) throws InterruptedException {
        
        // System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); // if needed
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to test page
        driver.get("https://the-internet.herokuapp.com/windows");

        // Store parent window handle
        String parentWindow = driver.getWindowHandle();

        // ================= Task 1: Click on “Click Here” → switch to new tab → print title =================
        driver.findElement(By.linkText("Click Here")).click();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        for (String win : allWindows) {
            if (!win.equals(parentWindow)) {
                driver.switchTo().window(win); // switch to child window
                System.out.println("Task 1 - Child Window Title: " + driver.getTitle());
            }
        }

        // ================= Task 2: Close child window → switch back to parent =================
        driver.close(); // closes child window
        driver.switchTo().window(parentWindow);
        System.out.println("Task 2 - Back to Parent Title: " + driver.getTitle());

        // ================= Task 3: Verify parent page text is still visible =================
        String pageText = driver.findElement(By.tagName("h3")).getText();
        if (pageText.contains("Opening a new window")) {
            System.out.println("Task 3 - Parent Page Text Verified: " + pageText);
        } else {
            System.out.println("Task 3 - Verification Failed!");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
