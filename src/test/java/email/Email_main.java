package email;

import org.testng.Assert;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Email_main extends email_compose
{
	ExtentReports report;
	ExtentTest log;
	
	@BeforeTest
	public void openBrowser()
	{
		report = new ExtentReports("D:\\extentReport.html");
		log= report.startTest("Email functionality");
		
		logger.info("Calling method to open Browser");
		//Calling method openBrowser to open Browser
		OpenBrowser();
		logger.info("Opened Browser");
	}
	
	@Test
	public void openWebsite() throws InterruptedException
	{
		logger.info("Opening WebPage");
		driver.get("http://www.gmail.com");
		String title = driver.getTitle();
		logger.info("\nTitle is: \n***\n****** "+title+ " ****\n**** ");
		System.out.println("Success");
		logger.info("Web Page Opened");
		Assert.assertEquals(title, "Gmail");		
		log.log(LogStatus.PASS, "Title verified");
		if(title.equalsIgnoreCase("Gmail"))
		{
			signin();
			logger.info("Entered Signin Loop and executed");
			log.log(LogStatus.INFO, "Entered Loop");
		}
		else
		{
			logger.info("*****************************\nEntered Else Loop\n**************************************");
		}
		
		compose_email();
		
	}
	@AfterTest
	public void Teardown()
	{
		
		
		logger.info("Calling method to Close Browser");
		closeBrowser();
		logger.info("Browser Closed");
		report.endTest(log);
		report.flush();
	}
	
}
