package Utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtendedManager {
 private static ExtentReports extent;
  public static ExtentReports getInstance() {
	  if (extent == null) {
		  extent = new ExtentReports(System.getProperty("user.dir")+"\\test-output\\extent.html",true,DisplayOrder.OLDEST_FIRST);
	 extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\extentconfig\\config.xml"));
	  }
	  return extent;
  }
}
