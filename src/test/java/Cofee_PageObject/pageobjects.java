package Cofee_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageobjects 
{	
	public static WebElement espresso(WebDriver driver)
	{
		WebElement element=driver.findElement(By.xpath("//div[@data-test='Espresso']"));
		return element;		
	}
		
	public static WebElement CartValue(WebDriver driver)
	{
		WebElement element=driver.findElement(By.xpath("//a[@aria-label='Cart page']"));
		return element;
	}
	
	public static WebElement TotalValue(WebDriver driver)
	{
		WebElement element=driver.findElement(By.xpath("//button[@aria-label='Proceed to checkout']"));
		return element;
	}
	
	public static WebElement ExtraCup(WebDriver driver)
	{
		WebElement element=driver.findElement(By.xpath("//button[text()='Yes, of course!']"));
		return element;
	}
	
	
	
	//span[text()="It's your lucky day! Get an extra cup of Mocha for $4."] 
	//button[@aria-label='Proceed to checkout']
	//a[text()='cart (0)']
}
