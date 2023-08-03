package Cofee_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Cofee_PageObject.pageobjects;

public class TC01_Cofee extends BaseClass
{
	
	//User able to select cup and add into cart
	@Test()
	public void Add_Cup_intocart() throws Exception
	{
		driver.manage().window().maximize();
		pageobjects.espresso(driver).click();
		String CartCount = pageobjects.CartValue(driver).getText();
		String TotalCount=pageobjects.TotalValue(driver).getText();
		if(CartCount.equals("cart (0)"))
		{
			Assert.assertTrue(false);
			logger.info("TC01 fail");
			
		}else if(TotalCount.equals("Total: $0.00"))
		{
			Assert.assertTrue(false);
			logger.info("TC01 fail");
		}else 
		{
			Assert.assertTrue(true);
			logger.info("TC01 pass");		
		}
		logger.info("User Is able to add a cup into Cart");
		Thread.sleep(3000);
	}
	
}
