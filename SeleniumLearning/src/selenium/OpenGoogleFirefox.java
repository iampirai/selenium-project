package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\tools\\firefox\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("chennai" +Keys.ENTER);	
		
		//driver.quit();
	}

}
