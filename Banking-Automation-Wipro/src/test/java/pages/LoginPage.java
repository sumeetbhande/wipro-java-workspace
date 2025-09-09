package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By username = By.name("username");
    private By password = By.name("password");
    private By loginBtn = By.cssSelector("input[value='Log In']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
        base.BaseTest.demoPause();
    }
    
    public boolean isErrorMessageDisplayed() {
        try {
            
            if (!driver.findElements(By.cssSelector(".error")).isEmpty()) return true;
            if (!driver.findElements(By.cssSelector(".alert-danger")).isEmpty()) return true;
            if (!driver.findElements(By.cssSelector(".alert")).isEmpty()) {
                
                String alertText = driver.findElement(By.cssSelector(".alert")).getText().toLowerCase();
                if (alertText.contains("error") || alertText.contains("invalid") || alertText.contains("failed")) return true;
            }

           
            String src = driver.getPageSource().toLowerCase();
            if (src.contains("error") || src.contains("invalid") || src.contains("failed") || src.contains("incorrect")) {
                return true;
            }
        } catch (Exception ignored) {
            
        }
        return false;
    }

} 