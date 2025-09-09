package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utils.ExcelUtils;

import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class LoginTests extends BaseTest {

    
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        String path = Paths.get("src", "test", "resources", "testdata.xlsx").toString();
        List<Map<String, String>> rows = ExcelUtils.readSheet(path, "Login");
        Object[][] data = new Object[rows.size()][3];
        for (int i = 0; i < rows.size(); i++) {
            data[i][0] = rows.get(i).get("username");
            data[i][1] = rows.get(i).get("password");
            data[i][2] = rows.get(i).get("valid");
        }
        return data;
    }

    @Test(dataProvider = "loginData", priority = 1)
    public void validateLogin(String username, String password, String valid) {
        LoginPage login = new LoginPage(driver);
        login.login(username, password);
        DashboardPage dash = new DashboardPage(driver);
        if ("Y".equalsIgnoreCase(valid)) {
            Assert.assertTrue(dash.isLoggedIn(), "Expected login to succeed");
        } else {
            Assert.assertTrue(login.isErrorMessageDisplayed(), "Expected login error message");
        }
    }
    @Test(priority = 2, description = "Login with invalid username and valid password")
    public void testInvalidUsernameValidPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalidUser", "validPass123");
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message not shown for invalid username.");
    }

    @Test(priority = 3, description = "Login with valid username and invalid password")
    public void testValidUsernameInvalidPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("validUser", "wrongPass");
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message not shown for invalid password.");
    }

    
  

    @Test(priority = 4, description = "Login with empty credentials")
    public void testEmptyCredentials() {
        LoginPage login = new LoginPage(driver);
        login.login("", "");
        Assert.assertTrue(login.isErrorMessageDisplayed(), "Error message not displayed for empty credentials");
    }

    
}
