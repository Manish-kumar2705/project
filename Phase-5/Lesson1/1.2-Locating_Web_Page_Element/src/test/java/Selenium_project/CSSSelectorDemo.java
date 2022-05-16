package Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://signup.heroku.com/");
		
		driver.findElement(By.cssSelector("input#first_name")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("admin@123");

	}

}
