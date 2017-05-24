package email;

import org.testng.Assert;
import org.testng.annotations.*;

public class Email_main extends email_compose
{
	@BeforeTest
	public void openBrowser()
	{
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
		
		if(title.equalsIgnoreCase("Gmail"))
		{
			signin();
			logger.info("Entered Signin Loop and executed");
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
	}
}
