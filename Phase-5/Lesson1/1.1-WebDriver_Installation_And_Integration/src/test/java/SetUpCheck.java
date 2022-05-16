

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	    // Maximize the browser window
		
	     driver.manage().window().maximize();
	     
	     // delete cookies of the browser deleteAllcookies()
	     
	     driver.manage().deleteAllCookies();
	     
	     // open the URL on browser
	     
	     driver.get("https://www.wikipedia.org/");
	     
	     // closes the session
	     
	     driver.close();

	}

}
