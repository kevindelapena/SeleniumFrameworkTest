package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	static WebElement element;
	
	public static WebElement textbox_search(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.name("q"));
		return element;

	}
	
	public static WebElement button_search(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.name("btnK"));
		return element;

	}

}
