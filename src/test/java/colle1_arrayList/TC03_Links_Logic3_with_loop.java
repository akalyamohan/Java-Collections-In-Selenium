package colle1_arrayList;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class TC03_Links_Logic3_with_loop extends Base{
		
		@BeforeMethod
		public void initalize()
		{
		
			driver=Invokebrowser();
		}

		@Test
		public void links_validation()
		{
			WebElement footer_element = driver.findElement(By.className("footerBottom"));
			int footer_links_count = footer_element.findElements(By.tagName("a")).size();
			System.out.println(footer_links_count);
			
			for(int i=0; i<footer_links_count; i++)
			{
				String link_value_names = footer_element.findElements(By.tagName("a")).get(i).getText();
				System.out.println(link_value_names);
				
				
				String link_href = footer_element.findElements(By.tagName("a")).get(i).getAttribute("href");
				System.out.println(link_href);
				
				System.out.println("************************************");
			}
		}
		
		@AfterClass
		public void teardown()
		{
			driver.quit();
		}
	


}
