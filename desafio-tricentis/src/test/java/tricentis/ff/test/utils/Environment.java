package tricentis.ff.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Environment {

	private WebDriver webDriver;
	private String tricentisURL = "http://sampleapp.tricentis.com/101/app.php";

	public WebDriver browse() {
		System.setProperty("webdriver.chrome.driver", "dependencies/chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		return webDriver;
	}

	public void navigateToTricentis(WebDriver driver) {
		this.webDriver = driver;
		webDriver.get(tricentisURL);
	}

	public void exitTricentis(WebDriver driver) {
		this.webDriver = driver;
		//webDriver.quit();
	}
}
