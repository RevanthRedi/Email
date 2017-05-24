package email;

public class Teardown extends openBrowser
{
	public void closeBrowser()
	{
		logger.info("Reached Teardown");
		//Add Screeenshot later
		driver.quit();
	}

}
