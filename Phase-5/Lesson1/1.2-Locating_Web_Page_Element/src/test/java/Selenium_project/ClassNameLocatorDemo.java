package Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page");
		
		driver.findElement(By.className("loginText mw-ui-input")).sendKeys("username1");
		
		driver.findElement(By.className("loginPassword mw-ui-input")).sendKeys("password@123");
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("mw-htmlform-submit mw-ui-button mw-ui-primary mw-ui-progressive")).click();

	}

}
