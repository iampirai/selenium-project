package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Adactin {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", 
				"F:\\tools\\eclipse-workspace\\Greens\\drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://adactinhotelapp.com/");
	
		driver.findElement(By.id("username")).sendKeys("SanjayDopeGuy");
		driver.findElement(By.id("password")).sendKeys("123456789");
		
	}
}
