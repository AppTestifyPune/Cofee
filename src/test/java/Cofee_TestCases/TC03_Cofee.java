package Cofee_TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Cofee_PageObject.pageobjects;

public class TC03_Cofee 
{/*
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark03.html");
	
	@Test(description="2nd time pop-up for Get an extra cup of Mocha")
	public void Get_Extra_Cup_Second_Popup()
	{	
		driver.navigate().refresh();
		pageobjects.espresso(driver).click();
		pageobjects.Espresso_Macchiato(driver).click();
		pageobjects.Cappuccino(driver).click();
		pageobjects.ExtraCup(driver).click();
		
		pageobjects.Mocha(driver).click();
		pageobjects.Flat_White(driver).click();
		
		if(pageobjects.ExtraCup(driver).getText().equals("Yes, of course!"))
		{
			logger.info("Pass 3rd Test case || Appeared pop up for mocha cup 2nd time after selecting 2 cups");
			//test.pass("3rd test case pass");
		}
		else 
		{
			logger.info(" Failed 3rd test case");
			//test.fail("3rd test case fail");
		}
		
	}
	@BeforeTest()
	public void beforetest()
	{
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("My Report");
		extent.attachReporter(spark);
	}
	
	@AfterTest()
	public void aftertest()
	{
		extent.flush();
	}
	*/
}
