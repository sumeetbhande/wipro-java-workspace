package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiTests extends BaseTest {

    private double calculateEmi(double principal, double annualRate, int months) {
        double monthlyRate = annualRate / (12 * 100);
        double numerator = principal * monthlyRate * Math.pow(1 + monthlyRate, months);
        double denominator = Math.pow(1 + monthlyRate, months) - 1;
        return Math.round((numerator / denominator) * 100.0) / 100.0;
    }

    @Test
    public void validateEmiFor12Months() {
        double emi = calculateEmi(12000, 12, 12);
        Assert.assertEquals(emi, 1066.67, 0.5, "EMI should match expected for 12 months");
    }
}