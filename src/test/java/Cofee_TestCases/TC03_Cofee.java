package Cofee_TestCases;

import org.testng.annotations.Test;

import Cofee_PageObject.pageobjects;

public class TC03_Cofee extends BaseClass
{
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
		}
		else 
		{
			logger.info(" Failed 3rd test case");
		}
		
	}
}
