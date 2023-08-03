package Cofee_TestCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Cofee_Utilities.Constants;

public class BaseClass 
{
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass()
	public void OpenURL() throws Exception
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(Constants.URL);
		Wait();		
		logger = Logger.getLogger("Cofee");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("The URL Launch");
		Thread.sleep(5000);
	}
	
	public static void Wait()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@data-test='Espresso']"))));	
	}
	
	@AfterClass()
	public void CloseUrl()
	{
		driver.quit();
		
	}
	
}
