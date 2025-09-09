package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private By accountsOverviewLink = By.linkText("Accounts Overview");
    private By transferFundsLink = By.linkText("Transfer Funds");
    private By requestLoanLink = By.linkText("Request Loan");
    private By findTransactionsLink = By.linkText("Find Transactions");

    public DashboardPage(WebDriver driver) { this.driver = driver; }

    public boolean isLoggedIn() {
        return driver.getPageSource().contains("Log Out");
    }

    public void goToAccountsOverview() { driver.findElement(accountsOverviewLink).click(); base.BaseTest.demoPause(); }
    public void goToTransferFunds() { driver.findElement(transferFundsLink).click(); base.BaseTest.demoPause(); }
    public void goToRequestLoan() { driver.findElement(requestLoanLink).click(); base.BaseTest.demoPause(); }
    public void goToFindTransactions() { driver.findElement(findTransactionsLink).click(); base.BaseTest.demoPause(); }
}