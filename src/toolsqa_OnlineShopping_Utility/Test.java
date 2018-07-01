package toolsqa_OnlineShopping_Utility;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/100702/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myfamilymobile.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//mousehover dropdown 
		WebElement element = driver.findElement(By.xpath("(//*[text()='SHOP'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//img[starts-with(@alt,'Phones')]")).click();
		String Currentwindow = driver.getWindowHandle();
		System.out.println("Currentwindow"+Currentwindow);
		for(String Window : driver.getWindowHandles()) 
		{
			System.out.println("Window: " +Window);
			
			if(!Currentwindow.equals(Window)) 
			{
				driver.switchTo().window(Window);
				driver.findElement(By.xpath("//span[@class=\"elc-icon elc-icon-user-nav BubbleButton-icon\"]")).click();
				driver.findElement(By.xpath("//div[text()=\"Create Account\"]")).click();
				driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Pooja");
				driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Thalla");
				driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("pooja.thalla@gmail.com");
				driver.findElement(By.xpath("(//input[@name=\"password\"])[1]")).sendKeys("wertgyh");
				
			}
			
		}
				
	
	}

}
