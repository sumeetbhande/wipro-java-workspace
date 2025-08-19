package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

    public static void main(String[] args) throws InterruptedException {
        
        // System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); // if needed
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement columnA = driver.findElement(By.id("column-a"));
        WebElement columnB = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);

        // ================= Task 1: Drag A → B =================
        actions.dragAndDrop(columnA, columnB).build().perform();
        Thread.sleep(1500);
        String textA = columnA.findElement(By.tagName("header")).getText();
        String textB = columnB.findElement(By.tagName("header")).getText();
        System.out.println("Task 1 - After Drag A→B: Column A = " + textA + " , Column B = " + textB);

        // ================= Task 2: Reverse Drag B → A =================
        actions.dragAndDrop(columnB, columnA).build().perform();
        Thread.sleep(1500);
        textA = columnA.findElement(By.tagName("header")).getText();
        textB = columnB.findElement(By.tagName("header")).getText();
        System.out.println("Task 2 - After Drag B→A: Column A = " + textA + " , Column B = " + textB);

        // ================= Task 3: Click-Hold-Move-Release =================
        actions.clickAndHold(columnA)
               .moveToElement(columnB)
               .release()
               .build()
               .perform();
        Thread.sleep(1500);
        textA = columnA.findElement(By.tagName("header")).getText();
        textB = columnB.findElement(By.tagName("header")).getText();
        System.out.println("Task 3 - After ClickHold A→B: Column A = " + textA + " , Column B = " + textB);

        driver.quit();
    }
}
