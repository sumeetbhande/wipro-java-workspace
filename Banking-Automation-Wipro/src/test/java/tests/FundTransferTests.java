package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TransferFundsPage;
import utils.ConfigReader;

public class FundTransferTests extends BaseTest {

    @Test
    public void transferFundsAndValidateSuccess() {
        LoginPage login = new LoginPage(driver);
        login.login(ConfigReader.get("valid.username"), ConfigReader.get("valid.password"));

        DashboardPage dash = new DashboardPage(driver);
        Assert.assertTrue(dash.isLoggedIn(), "Login failed");
        dash.goToTransferFunds();

        TransferFundsPage tf = new TransferFundsPage(driver);
        tf.transfer("100");
        Assert.assertTrue(tf.isSuccess(), "Transfer should be successful");
    }
}