package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class WebTableDemo {

    public static void main(String[] args) {

        // System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); // if needed
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/tables");

        // ================= Task 1: Print all rows and columns of table1 =================
        System.out.println("===== Task 1: Print full Table 1 =====");
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + " | ");
            }
            System.out.println();
        }

        // ================= Task 2: Print email IDs of all users =================
        System.out.println("\n===== Task 2: Print all Email IDs =====");
        List<WebElement> emails = driver.findElements(By.xpath("//table[@id='table1']//td[3]"));
        for (WebElement email : emails) {
            System.out.println(email.getText());
        }

        // ================= Task 3: Find and print due amount of user “Smith” =================
        System.out.println("\n===== Task 3: Due Amount for user Smith =====");
        List<WebElement> lastNames = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
        for (int i = 0; i < lastNames.size(); i++) {
            if (lastNames.get(i).getText().equals("Smith")) {
                String dueAmount = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + (i+1) + "]/td[4]")).getText();
                System.out.println("Smith's Due Amount = " + dueAmount);
            }
        }

        // ================= Task 4: Sort by “Last Name” column → verify order =================
        System.out.println("\n===== Task 4: Sort by Last Name and Verify =====");
        WebElement lastNameHeader = driver.findElement(By.xpath("//table[@id='table1']//span[text()='Last Name']"));
        lastNameHeader.click(); // click to sort

        List<WebElement> sortedLastNames = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
        List<String> actualOrder = new ArrayList<>();
        for (WebElement ln : sortedLastNames) {
            actualOrder.add(ln.getText());
        }

        List<String> expectedOrder = new ArrayList<>(actualOrder);
        Collections.sort(expectedOrder);

        if (actualOrder.equals(expectedOrder)) {
            System.out.println("Table sorted correctly by Last Name: " + actualOrder);
        } else {
            System.out.println("Sorting mismatch! Actual: " + actualOrder);
        }

        driver.quit();
    }
}
