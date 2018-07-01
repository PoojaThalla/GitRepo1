package toolsqa_OnlineShopping_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WalmartFamilyPage {

	private static WebElement element = null;
	
	public static WebElement account(WebDriver driver) {
		 element = driver.findElement(By.xpath("//span[@class=\"elc-icon elc-icon-user-nav BubbleButton-icon\"]"));
			
		 return element;
	}	
	public static WebElement createAccount(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[text()=\"Create Account\"]"));
			
		 return element;
	}	
	public static WebElement firstName(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
			
		 return element;
	}	
	public static WebElement lastName(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
			
		 return element;
	}	
	public static WebElement email(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@name=\"email\"]"));
			
		 return element;
	}	
	public static WebElement password(WebDriver driver) {
		 element = driver.findElement(By.xpath("(//input[@name=\"password\"])[1]"));
			
		 return element;
	}	
}
