package toolsqa_OnlineShopping_Tests;
import java.util.concurrent.TimeUnit;

import org.apache.commons.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import toolsqa_OnlineShopping_Pages.HomePage;
import toolsqa_OnlineShopping_Pages.WalmartFamilyPage;

public class RegisterActionTest {

	
	public static void myAccount(WebDriver driver) {
		WebElement element = HomePage.shop(driver);
		WebElement subElement= HomePage.phone(driver);
		System.out.println("before click");
		Actions action = new Actions(driver);
		/*action.moveToElement(element).perform();
		action.moveToElement(subElement);
		action.click();
		action.perform();*/	 
		action.moveToElement(element).moveToElement(subElement).click().build().perform();
		System.out.println("after click");
		String Currentwindow = driver.getWindowHandle();
		System.out.println("Currentwindow: "+Currentwindow);
		for(String Window : driver.getWindowHandles()) 
		{			
			if(!Currentwindow.equals(Window)) 
			{
				System.out.println("Window: " +Window);
				driver.switchTo().window(Window);
				WalmartFamilyPage.account(driver).click();
				WalmartFamilyPage.createAccount(driver).click();
				WalmartFamilyPage.firstName(driver).sendKeys("Pooja");
				WalmartFamilyPage.lastName(driver).sendKeys("Thalla");
				WalmartFamilyPage.email(driver).sendKeys("mail@gmail.com");
				WalmartFamilyPage.password(driver).sendKeys("password");
				
			}
	}
	}
}
