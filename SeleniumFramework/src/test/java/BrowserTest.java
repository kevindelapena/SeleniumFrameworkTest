import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		
		//URL of the selected website
        String baseUrl = "http://www.google.com";

        // launch Google Chrome and direct it to the Base URL
        driver.get("http://www.google.com");

	}

}
