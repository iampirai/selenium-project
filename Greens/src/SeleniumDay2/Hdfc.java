package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hdfc {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", 
				"F:\\tools\\eclipse-workspace\\Greens\\drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("123456789");
	}
}
