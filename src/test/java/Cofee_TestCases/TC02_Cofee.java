package Cofee_TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Cofee_PageObject.pageobjects;



public class TC02_Cofee 
{/*
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark02.html");
	
	@Test(description="First Popup for extra cup appeared after selecting 3 cup")
	public void ExtraCupPopUp() throws Exception
	{	
		driver.navigate().refresh();
		pageobjects.espresso(driver).click();
		pageobjects.Espresso_Macchiato(driver).click();
		pageobjects.Cappuccino(driver).click();
		System.out.println(pageobjects.ExtraCup(driver).getText());
		
		if(pageobjects.ExtraCup(driver).getText().equals("Yes, of course!"))
		{
			logger.info("Pass 2nd Test case || Successful Get an extra cup of Mocha");
			//test.pass("2nd test case pass");
		}else 
		{
			logger.info("Fail 2nd Test case ");
			//test.fail("2 nd test case fail");
		}	
		Thread.sleep(3000);
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
