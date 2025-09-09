# BankingAutomationProject_Slow

Automation test suite for Capstone Project 2 - Banking Loan & Financial Transaction using Selenium + TestNG + ExtentReports against Parabank.

## How to import & run (Eclipse)
1. File > Import > Maven > Existing Maven Projects and select this folder.
2. Ensure Java 11+.
3. No need to download drivers manually (WebDriverManager included).
4. Right click RunAllTests.xml > Run As > TestNG Suite.

## Demo mode
This project has a fixed 2-second demo pause executed after major actions to make the flow visible.
You can change demo settings in `src/test/resources/config.properties`.

## Reports
- TestNG: test-output/
- Extent: reports/ExtentReport_<timestamp>.html