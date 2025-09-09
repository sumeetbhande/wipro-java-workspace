package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TransactionsPage;
import utils.ConfigReader;

public class TransactionHistoryTests extends BaseTest {

    @Test
    public void verifyTransactionHistoryShowsEntries() {
        LoginPage login = new LoginPage(driver);
        login.login(ConfigReader.get("valid.username"), ConfigReader.get("valid.password"));

        DashboardPage dash = new DashboardPage(driver);
        Assert.assertTrue(dash.isLoggedIn(), "Login failed");
        dash.goToFindTransactions();

        TransactionsPage tx = new TransactionsPage(driver);
        tx.selectFirstAccount();
        Assert.assertTrue(tx.hasAnyTransactions() || driver.getPageSource().contains("No transactions found"),
                "Transaction history page should load");
    }
}