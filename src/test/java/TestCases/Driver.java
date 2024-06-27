package TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utilities.ExcelReader;
import Utilities.ExtendedManager;

public class Driver {

	WebDriver driver;
	public static  Logger log = Logger.getLogger("devpinoyLogger");
	public static ExtentReports report = ExtendedManager.getInstance();
	public static ExtentTest test;
	public static  ExcelReader excel = new ExcelReader("C:\\Users\\CHISRI\\eclipse-workspace\\test_for_pom\\src\\test\\resources\\Excel\\Excel _for_automation.xlsx");
@BeforeSuite
public void browserSetup() {
	
	
	driver = new EdgeDriver();
	// String actUrl ="https://demowebshop.tricentis.com/";
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\CHISRI\\eclipse-workspace\\test_for_pom\\msedgedriver 2.exe");
	log.debug("Edge browseris open");
	// System.setProperty("WebDriver.edge.driver", ("user dir")+
	// "msedgedriver.exe");

	driver.get("https://demowebshop.tricentis.com/");
	log.debug("url is open");
	driver.manage().window().maximize();
}

@AfterSuite
public void CloseBrowser() {
	if (driver != null) {
		driver.quit();
log.debug("Driver is colsed");
	}
}
}