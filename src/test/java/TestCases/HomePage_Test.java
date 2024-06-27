package TestCases;


	import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Webpages.HomePage;

	public class HomePage_Test extends Driver {
		@Test
		public void Home_Method() {
			HomePage hp = new HomePage(driver);
			hp.radiobtn();
			hp.votebtn();
			test = report.startTest("HomePage_Test");
			test.log(LogStatus.PASS,"Test is Passed");
			report.endTest(test);
			report.flush();

	}
	}

