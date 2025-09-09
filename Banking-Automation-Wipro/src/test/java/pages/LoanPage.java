package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoanPage {
    private WebDriver driver;

    private By loanAmount = By.id("amount");
    private By downPayment = By.id("downPayment");
    private By fromAccount = By.id("fromAccountId");
    private By applyBtn = By.cssSelector("input[value='Apply Now']");

    public LoanPage(WebDriver driver) { this.driver = driver; }

    public void applyLoan(double amount, double down) {
        driver.findElement(loanAmount).clear();
        driver.findElement(loanAmount).sendKeys(String.valueOf(amount));
        driver.findElement(downPayment).clear();
        driver.findElement(downPayment).sendKeys(String.valueOf(down));
        Select dropdown = new Select(driver.findElement(fromAccount));
        dropdown.selectByIndex(0);
        driver.findElement(applyBtn).click();
        base.BaseTest.demoPause();
    }

    public String getResultText() {
        return driver.getPageSource();
    }
}