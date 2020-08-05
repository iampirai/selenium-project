package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", 
				"F:\\tools\\eclipse-workspace\\Greens\\drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		driver.findElement(By.name("username")).sendKeys("hiiiiiii");
		driver.findElement(By.name("password")).sendKeys("testPassword");
	}
}
