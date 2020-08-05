package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swiggy {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", 
				"F:\\tools\\eclipse-workspace\\Greens\\drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.swiggy.com/");
		
		driver.findElement(By.id("location")).sendKeys("Kumbakonam");
	}
}
