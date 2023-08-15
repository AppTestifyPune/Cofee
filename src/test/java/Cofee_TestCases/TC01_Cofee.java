package Cofee_TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Cofee_PageObject.pageobjects;

public class TC01_Cofee extends BaseClass
{
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Cofee.html");
	//User able to select cup and add into cart
	
	@Test(priority=01)
	public void Add_Cup_intocart() throws Exception
	{   
		ExtentTest test= extent.createTest("Verify Test case 01").assignAuthor("Sagar Magdum").assignCategory("Functional Tests").assignDevice("Windows 11");
		test.info("Test case numbers");
		
		driver.manage().window().maximize();
		pageobjects.espresso(driver).click();
		String CartCount = pageobjects.CartValue(driver).getText();
		String TotalCount=pageobjects.TotalValue(driver).getText();
		if(CartCount.equals("cart (0)"))
		{
			Assert.assertTrue(false);
			logger.info("TC01 fail");
			test.fail("Test case 1 fail");
		
		}else if(TotalCount.equals("Total: $0.00"))
		{
			Assert.assertTrue(false);
			logger.info("TC01 fail");
			test.fail("Test case 1 fail");
		}else 
		{
			Assert.assertTrue(true);
			logger.info("TC01 pass");
			test.pass("Test case 1 Pass");
		}
		logger.info("User Is able to add a cup into Cart");
		Thread.sleep(5000);	
	}
	
	@Test(priority=02,description="First Popup for extra cup appeared after selecting 3 cup")
	public void ExtraCupPopUp() throws Exception
	{	
		ExtentTest test1= extent.createTest("Verify Test case 02").assignAuthor("Sagar Magdum").assignCategory("Functional Tests").assignDevice("Windows 11");
		test1.info("Test case numbers");
		
		driver.navigate().refresh();
		pageobjects.espresso(driver).click();
		pageobjects.Espresso_Macchiato(driver).click();
		pageobjects.Cappuccino(driver).click();
		System.out.println(pageobjects.ExtraCup(driver).getText());
		
		if(pageobjects.ExtraCup(driver).getText().equals("Yes, of course!"))
		{
			logger.info("Pass 2nd Test case || Successful Get an extra cup of Mocha");
			test1.pass("2nd test case pass");
		}else 
		{
			logger.info("Fail 2nd Test case ");
			test1.fail("2 nd test case fail");
		}	
		Thread.sleep(3000);
	}
	

	@Test(priority=03,description="2nd time pop-up for Get an extra cup of Mocha")
	public void Get_Extra_Cup_Second_Popup() throws Exception
	{	
		ExtentTest test2= extent.createTest("Verify Test case 03").assignAuthor("Sagar Magdum").assignCategory("Functional Tests").assignDevice("Windows 11");
		test2.info("Test case numbers");
		
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
			test2.pass("3rd test case pass");
		}
		else 
		{
			logger.info(" Failed 3rd test case");
			test2.fail("3rd test case fail");
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
	  
}
