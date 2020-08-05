package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\tools\\eclipse-workspace\\Greens\\drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("example@icloud.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		
		driver.findElement(By.id("loginbutton")).click();
		
		
		
	}

}
