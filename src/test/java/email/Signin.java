package email;

import org.openqa.selenium.By;

public class Signin extends Teardown{

	public void signin() throws InterruptedException
	{

			Thread.sleep(5000);
			driver.findElement(By.id("identifierId")).sendKeys("gccrrr@gmail.com");
			driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
			Thread.sleep(5000);
			logger.info("Password Page");
			driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("9160501501");
//			
			driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
			
			logger.info("Signed in Successfully");
		
		
	}
}
