package selenium_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		 Thread.sleep(2000);
		
		
		// Only Actions that can be performed on an Alert Box are:
			// Click on OKAY  --- accept()
		// , click on cancel ---> dismiss()
			// enter input value ---> sendKeys()
			// fetch the text message from alert box ---> getText()

		
		// webdriver to switch to the alert
		// to perform any action on alert create an Alert object
		
	Alert a = driver.switchTo().alert();
	
	 System.out.println( a.getText());
	 
	 a.accept();
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.id("login1")).sendKeys("admin");
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
