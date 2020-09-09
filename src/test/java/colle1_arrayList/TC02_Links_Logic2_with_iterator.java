package colle1_arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02_Links_Logic2_with_iterator extends Base {

	// received url from base class and chrome driver is used
	@BeforeMethod
	public void initalize()
	{
	
		driver=Invokebrowser();
	}
	
	@Test
	public void link_validation_iterator()
	{
		// footer container element is stored in webelement 
		WebElement footer_element = driver.findElement(By.className("footerBottom"));
		
		// all the a tag links are stored in List
		List<WebElement> footer_links = footer_element.findElements(By.tagName("a"));
		
		// received the size of total links in footer and printed the size
		int footer_links_count = footer_links.size();
		System.out.println(footer_links_count);
		
		// Initialized ArrayList to hold all the links from List
		ArrayList<WebElement> links = new ArrayList<WebElement>();
		links.addAll(footer_links);
		
		// Traversed using Iterator to all links and printed the links and text of links
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext())
		{
			WebElement final_links = it.next();
			System.out.println(final_links.getAttribute("href"));
			System.out.println(final_links.getText());
		}
		
		
		
	}
	
	
	@Test
	public void link_validation_foreachloop()
	{
		// footer container element is stored in webelement 
		WebElement footer_element = driver.findElement(By.className("footerBottom"));
		
		// all the a tag links are stored in List
		List<WebElement> footer_links = footer_element.findElements(By.tagName("a"));
		
		// received the size of total links in footer and printed the size
		int footer_links_count = footer_links.size();
		System.out.println(footer_links_count);
		
		// Initialized ArrayList to hold all the links from List
		ArrayList<WebElement> links = new ArrayList<WebElement>();
		links.addAll(footer_links);
		
		// traverse through links using for each loop
	for(WebElement display_links:links)
		
	{
		System.out.println(display_links.getAttribute("href"));
		System.out.println(display_links.getText());
	}
		
		
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
