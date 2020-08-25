import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	
		//URL of the selected website
        String baseUrl = "http://www.google.com";

        // launch Google Chrome and direct it to the Base URL
        driver.get("http://www.google.com");

    	driver.close();
		driver.quit();
	}

}
