package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchChrome {
    public static void main(String[] args) throws InterruptedException {

        // 1. Launch Chrome (Selenium Manager will handle driver automatically)
        WebDriver driver = new ChromeDriver();

        try {
            // 2. Open Google
            driver.get("https://google.com");
            driver.manage().window().maximize();

            // 3. Search for "Selenium WebDriver"
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver");
            searchBox.sendKeys(Keys.RETURN);

            // 4. Wait for results to load
            Thread.sleep(2000);

            // 5. Get the number of search results
            WebElement resultsStats = driver.findElement(By.id("result-stats"));
            String resultText = resultsStats.getText();

            System.out.println("Search Results Info: " + resultText);

        } finally {
            // 6. Close browser
            driver.quit();
        }
    }
}
