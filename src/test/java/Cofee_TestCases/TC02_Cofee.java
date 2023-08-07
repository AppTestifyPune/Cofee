package Cofee_TestCases;

import org.testng.annotations.Test;

import Cofee_PageObject.pageobjects;

public class TC02_Cofee extends BaseClass
{
	@Test(description="First Popup for extra cup appeared after selecting 3 cup")
	public void ExtraCupPopUp()
	{
		driver.navigate().refresh();
		pageobjects.espresso(driver).click();
		pageobjects.Espresso_Macchiato(driver).click();
		pageobjects.Cappuccino(driver).click();
		System.out.println(pageobjects.ExtraCup(driver).getText());
		if(pageobjects.ExtraCup(driver).getText().equals("Yes, of course!"))
		{
			logger.info("Pass 2nd Test case || Successful Get an extra cup of Mocha");
		}else 
		{
			logger.info("Fail 2nd Test case ");
		}	
	}	
}
