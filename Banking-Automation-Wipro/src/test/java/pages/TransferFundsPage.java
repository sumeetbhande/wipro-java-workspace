package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage {
    private WebDriver driver;
    private By amount = By.id("amount");
    private By fromAccount = By.id("fromAccountId");
    private By toAccount = By.id("toAccountId");
    private By transferBtn = By.cssSelector("input[value='Transfer']");

    public TransferFundsPage(WebDriver driver) { this.driver = driver; }

    public void transfer(String amt) {
        driver.findElement(amount).clear();
        driver.findElement(amount).sendKeys(amt);
        Select fromDrop = new Select(driver.findElement(fromAccount));
        Select toDrop = new Select(driver.findElement(toAccount));
        fromDrop.selectByIndex(0);
        if (toDrop.getOptions().size() > 1) {
            toDrop.selectByIndex(1);
        } else {
            toDrop.selectByIndex(0);
        }
        driver.findElement(transferBtn).click();
        base.BaseTest.demoPause();
    }

    public boolean isSuccess() {
        return driver.getPageSource().contains("Transfer Complete!");
    }
}