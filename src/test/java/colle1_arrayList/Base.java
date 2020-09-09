package colle1_arrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	WebDriver driver;
	
	@BeforeMethod
	public WebDriver Invokebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32_v85//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.kgisl.com/gss/");
		return driver;
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		return;
	
	}
}
