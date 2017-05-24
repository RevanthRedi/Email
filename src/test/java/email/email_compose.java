package email;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class email_compose extends Signin {
	String subject ="Test email using Selenium";
	public void compose_email() throws InterruptedException
	{
		Thread.sleep(5000);
		String inboxPage = driver.getTitle();
		logger.info("Title of the Inox page is : " +inboxPage);
		driver.findElement(By.xpath("//*[contains(text(), 'COMPOSE')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td//img[2]")).click();
		
		//Email Compose
		driver.findElement(By.className("vO")).sendKeys("revanthkng@gmail.com");
		driver.findElement(By.className("aoT")).sendKeys(subject);
		Thread.sleep(5000);
		WebElement msgbody = driver.findElement(By.xpath(".//div[@id=':ot']"));
		msgbody.click();
		msgbody.sendKeys("Hello There, this is a test email sent using Selenium to automate Gmail");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[contains(text(),'Send')]")).click();
		logger.info("Email Sent");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[contains(text(),'Sent Mail')]")).click();
		Thread.sleep(3000);

	}
	
}
