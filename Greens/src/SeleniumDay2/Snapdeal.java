package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Snapdeal {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", 
				"F:\\tools\\eclipse-workspace\\Greens\\drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.snapdeal.com/login");
		
		driver.findElement(By.id("userName")).sendKeys("SanjayDope");
	}
}
