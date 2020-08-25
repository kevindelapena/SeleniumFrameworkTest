package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.GooglePage;

public class GoogleTestNG {

	static WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public static void googleSearch() {

		// launch Google Chrome and direct it to the Base URL
		driver.get("http://www.google.com");
		GooglePage.textbox_search(driver).sendKeys("sample");
		GooglePage.textbox_search(driver).sendKeys(Keys.SPACE);
		GooglePage.button_search(driver).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
