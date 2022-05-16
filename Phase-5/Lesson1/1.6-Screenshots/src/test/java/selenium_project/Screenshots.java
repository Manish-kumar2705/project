package selenium_project;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.jna.platform.FileUtils;

public class Screenshots {
	 public static void main(String[] args ) throws IOException
	    {
	    	
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       WebElement upload = driver.findElement(By.xpath("//*[@type='text']"));
	       upload.click();
	       TakesScreenshot ts = (TakesScreenshot)driver;
	       File scr = ts.getScreenshotAs(OutputType.FILE);
	      // FileUtils.copyFile(scr, new File("/Screenshot/test.png"));
	       
	       
	    }
}



