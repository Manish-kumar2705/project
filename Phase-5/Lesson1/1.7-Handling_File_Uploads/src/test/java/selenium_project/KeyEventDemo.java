package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyEventDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		WebElement e1 =driver.findElement(By.id("searchInput"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(e1).keyDown(e1,Keys.SHIFT).sendKeys("selenium automation")
		.keyUp(e1, Keys.SHIFT).pause(2).doubleClick().contextClick(e1).perform();
		
			
		
		
		
		
	}

}
