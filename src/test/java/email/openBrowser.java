package email;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class openBrowser 
{
	Logger logger = Logger.getLogger("MevenTest with Log4j");
	String WebDriver = "webdriver.gecko.driver";
	String pathLocation ="D:\\Driver Browsers\\geckodriver0.14.exe";
	WebDriver driver = null;
	
	public void OpenBrowser()
	{
		PropertyConfigurator.configure("D:\\EclipseWorkspace\\Gmail\\log4j.properties");
		System.setProperty(WebDriver, pathLocation);
		logger.info("Opening FirefoxBrowser");
		driver = new FirefoxDriver();
	}

}
