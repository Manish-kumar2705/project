package selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageDynamicelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		// enter data in the search input box
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("appium Test");
		
		Thread.sleep(5000);
		
		
		// finding 10 list of values from webpage
		// storing the list of elements in the object li
		// type of object li is List
		// it is storing multiple webelements
		
	List<WebElement> li = driver.findElements(By.xpath("(//*[@role='listbox'])[2]/child::*"));
	

	System.out.println(li.size()); //10
		
	
	// print all the values of the dynamic drop down list on console
	
	for(int i =0; i<li.size(); i++)
	{
		String text = li.get(i).getText();
		
		System.out.println(text);
		
		if(text.contains("tutorial"))
		{
			li.get(i).click();
			break;
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
