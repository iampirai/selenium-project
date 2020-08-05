package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", 
				"F:\\tools\\eclipse-workspace\\Greens\\drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.id("dest")).sendKeys("Kumbakonam");
		
	}

}
