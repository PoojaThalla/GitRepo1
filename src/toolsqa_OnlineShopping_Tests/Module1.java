package toolsqa_OnlineShopping_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Module1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/100702/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myfamilymobile.com/");
		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		RegisterActionTest.myAccount(driver);
	}

}
