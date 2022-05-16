package Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		// use linkText locator to click on the link
		
		// click on link Contents
		// driver.findElement(By.linkText("text of the link"))
		// linkText locator value = text available between the start tag and end tag of the element
		
		driver.findElement(By.linkText("Contents")).click();
		
		Thread.sleep(1500);
		// it open a new page, fetch and print the title of the new page
		
		String title = driver.getTitle();
		
		System.out.println("title of first clicked link page is: " + title);
		
		// click on next link
		
		driver.findElement(By.linkText("About Wikipedia")).click();
		
		Thread.sleep(1500);
		
		// it open a new page, fetch and print the URL of the new page
		
        String title2 = driver.getTitle();
		
		System.out.println("title of second clicked link page is: " + title2);
		
		// Navigate back 
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		// navigate forward
		
		driver.navigate().forward();
	}

}
