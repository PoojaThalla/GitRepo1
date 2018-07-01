package toolsqa_OnlineShopping_Pages;
import org.apache.commons.*;

import org.openqa.selenium.*;

public class HomePage {
	
			private static WebElement element = null;
	
			public static WebElement payService(WebDriver driver) {
				 element = driver.findElement(By.xpath("(//*[text()='PAY SERVICE'])[1]"));
					
				 return element;
			}	
			
			public static WebElement shop(WebDriver driver) {
				 element = driver.findElement(By.xpath("(//*[text()='SHOP'])[1]"));
				 
				 return element;
			}
			public static WebElement phone(WebDriver driver) {
				 element = driver.findElement(By.xpath("//img[starts-with(@alt,'Phones')]"));
				 
				 return element;
			}
				
			public static WebElement activate(WebDriver driver) {
				 element = driver.findElement(By.xpath("(//*[text()='ACTIVATE'])[1]"));
				 
				 return element;
			}
			public static WebElement help(WebDriver driver) {
				 element = driver.findElement(By.xpath("(//*[text()='HELP'])[1]"));
				 
				 return element;
			}
			

}
