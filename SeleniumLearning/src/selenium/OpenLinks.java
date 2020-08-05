package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\tools\\firefox\\geckodriver.exe");
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		
		
	}

}
