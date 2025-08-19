package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePickerDemo {

    public static void main(String[] args) throws InterruptedException {
        
        // Set driver path if required
        // System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/datepicker/");
        
        // Switch to iframe (datepicker is inside an iframe)
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // Locate datepicker input box
        WebElement dateBox = driver.findElement(By.id("datepicker"));

        // ================= Task 1: Select 15th of current month =================
        dateBox.click(); 
        driver.findElement(By.xpath("//a[text()='15']")).click();
        System.out.println("Task 1: Selected date -> " + dateBox.getAttribute("value"));

        Thread.sleep(1500);

        // ================= Task 2: Select a date 2 months ahead =================
        dateBox.clear();
        dateBox.click();
        
        // Click "Next" arrow twice
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.xpath("//span[text()='Next']")).click();

        // Pick 10th of that month (example)
        driver.findElement(By.xpath("//a[text()='10']")).click();
        System.out.println("Task 2: Selected date -> " + dateBox.getAttribute("value"));

        Thread.sleep(1500);

        // ================= Task 3: Select today’s date dynamically =================
        dateBox.clear();
        dateBox.click();

        // Get today’s date using Java LocalDate
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear();

        // Navigate to correct month/year if needed
        String displayedMonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        String currentMonthYear = today.format(formatter);

        // If displayed calendar is not today’s month/year, adjust navigation
        while (!driver.findElement(By.className("ui-datepicker-title")).getText().equals(currentMonthYear)) {
            driver.findElement(By.xpath("//span[text()='Prev']")).click(); // adjust if future/past
        }

        // Pick today’s date
        driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
        System.out.println("Task 3: Selected today -> " + dateBox.getAttribute("value"));

        Thread.sleep(2000);
        driver.quit();
    }
}
