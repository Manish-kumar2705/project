package Selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdlocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://en.m.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
	     driver.findElement(By.id("wpName1")).sendKeys("admin");
	     driver.findElement(By.id("wpPassword1")).sendKeys("admin123");
	}

}
