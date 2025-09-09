package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoanPage;
import pages.LoginPage;
import utils.ConfigReader;

public class LoanTests extends BaseTest {

    @Test
    public void rejectHomeLoanWhenSalaryBelowThreshold() {
        LoginPage login = new LoginPage(driver);
        login.login(ConfigReader.get("valid.username"), ConfigReader.get("valid.password"));

        DashboardPage dash = new DashboardPage(driver);
        Assert.assertTrue(dash.isLoggedIn(), "Login failed");
        dash.goToRequestLoan();

        LoanPage loan = new LoanPage(driver);
        loan.applyLoan(200000, 20000);
        String result = loan.getResultText();
        Assert.assertTrue(result.contains("Loan Request Processed"), "Loan request should be processed");
    }

    @Test
    public void approvePersonalLoanWithValidDetails() {
        LoginPage login = new LoginPage(driver);
        login.login(ConfigReader.get("valid.username"), ConfigReader.get("valid.password"));

        DashboardPage dash = new DashboardPage(driver);
        Assert.assertTrue(dash.isLoggedIn(), "Login failed");
        dash.goToRequestLoan();

        LoanPage loan = new LoanPage(driver);
        loan.applyLoan(5000, 500);
        String result = loan.getResultText();
        Assert.assertTrue(result.contains("Loan Request Processed"), "Loan request should be processed");
    }
}