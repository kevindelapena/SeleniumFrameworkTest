package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePageObject {
	
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	By textbox_button = By.name("btnK");
	
	
	public GooglePageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public void type(String text) {
		// TODO Auto-generated method stub
		driver.findElement(textbox_search).sendKeys(text);
		driver.findElement(textbox_search).sendKeys(Keys.SPACE);

	}
	
	public void search() {
		// TODO Auto-generated method stub
		driver.findElement(textbox_button).sendKeys(Keys.RETURN);

	}

}
