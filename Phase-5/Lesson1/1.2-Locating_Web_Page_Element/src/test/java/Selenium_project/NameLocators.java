package Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
        // find the username element- inputbox
        
        driver.findElement(By.name("login")).sendKeys("rediff1");
        
        Thread.sleep(1500);
        
        // find the password element
        
        driver.findElement(By.name("passwd")).sendKeys("red@123");
        
        // find the sign button
        
        
        driver.findElement(By.name("proceed")).click();
	}

}
