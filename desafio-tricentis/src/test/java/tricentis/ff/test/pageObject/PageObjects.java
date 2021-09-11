package tricentis.ff.test.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {

	private WebDriver webDriver;

	public PageObjects(WebDriver driver) {
		this.webDriver = driver;
	}

	public WebElement findPageElement(String id) {
		return webDriver.findElement(By.id(id));
	}

	public void clickPageElement(String id) {
		findPageElement(id).click();
	}

	public void insertText(String id, String text) {
		WebElement element = findPageElement(id);
		element.sendKeys(text);
	}
}
