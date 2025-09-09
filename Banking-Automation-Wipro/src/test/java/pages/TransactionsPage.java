package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TransactionsPage {
    private WebDriver driver;

    private By accountSelect = By.id("accountId");

    public TransactionsPage(WebDriver driver) { this.driver = driver; }

    public void selectFirstAccount() {
        new Select(driver.findElement(accountSelect)).selectByIndex(0);
        base.BaseTest.demoPause();
    }

    public boolean hasAnyTransactions() {
        return driver.getPageSource().toLowerCase().contains("transaction");
    }
}