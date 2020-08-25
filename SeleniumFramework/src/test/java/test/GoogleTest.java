package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.GooglePage;

public class GoogleTest {

	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}

	public static void googleSearch() {
		// WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		driver = new ChromeDriver();

		// URL of the selected website
		//String baseUrl = "http://www.google.com";

		// launch Google Chrome and direct it to the Base URL
		driver.get("http://www.google.com");
		//GooglePage google = new GooglePage(driver);
		GooglePage.textbox_search(driver).sendKeys("sample");
		GooglePage.button_search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	}
}
