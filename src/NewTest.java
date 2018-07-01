import org.testng.annotations.Test;

import toolsqa_OnlineShopping_Tests.RegisterActionTest;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		RegisterActionTest.myAccount(driver);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/100702/Downloads/chromedriver_win32/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myfamilymobile.com/");
  }

  @AfterMethod
  public void afterMethod() {
	 
  }

}
