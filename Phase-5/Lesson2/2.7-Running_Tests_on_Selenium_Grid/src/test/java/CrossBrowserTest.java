

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	WebDriver driver;
	
	@Parameters({"browserName"})
	@BeforeClass
	public void openBrowser(String browserName)
	{
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
	
	@Parameters({"searchInput"})
	@Test(priority='1')
	public void method2(String searchInput) throws InterruptedException
	{
   
		driver.navigate().to("https://www.google.com");
		
		// enter data in the search input box
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(searchInput);
		Thread.sleep(1500);
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
