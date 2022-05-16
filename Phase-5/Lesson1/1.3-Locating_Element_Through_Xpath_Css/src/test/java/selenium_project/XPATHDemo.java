package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
	
		
		
		driver.findElement(By.xpath("//input[@value='red']")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("(//input[starts-with(@type,'check')])[3]")).click();
		
		
		Thread.sleep(1500);
		
		
		driver.findElement(By.xpath("(//input[contains(@type,'box')])[5]")).click();
		
		
		
		
		
		
		
		

	}

}
