package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportListener implements ITestListener, ISuiteListener {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onStart(ISuite suite) {
        String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String reportPath = "reports/ExtentReport_" + time + ".html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        // try to load config if exists
        File config = new File("extent-config.xml");
        if (config.exists()) {
            try {
				spark.loadXMLConfig(config);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            spark.config().setReportName("Banking Automation Report");
            spark.config().setDocumentTitle("Capstone Project 2 - Parabank");
            spark.config().setTheme(Theme.STANDARD);
        }
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @Override
    public void onFinish(ISuite suite) {
        if (extent != null) extent.flush();
    }

    @Override public void onTestStart(ITestResult result) { test.set(extent.createTest(result.getMethod().getMethodName())); }
    @Override public void onTestSuccess(ITestResult result) { test.get().pass("Passed"); }
    @Override public void onTestSkipped(ITestResult result) { test.get().skip(result.getThrowable()); }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().fail(result.getThrowable());
        Object obj = result.getTestContext().getAttribute("driver");
        if (obj instanceof WebDriver) {
            WebDriver driver = (WebDriver) obj;
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                Path dest = Paths.get("reports", "screenshot_" + result.getMethod().getMethodName() + ".png");
                Files.createDirectories(dest.getParent());
                Files.copy(src.toPath(), dest);
                test.get().addScreenCaptureFromPath(dest.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    @Override public void onStart(ITestContext context) {}
    @Override public void onFinish(ITestContext context) {}
}