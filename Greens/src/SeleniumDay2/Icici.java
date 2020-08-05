package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Icici {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", 
				"F:\\tools\\eclipse-workspace\\Greens\\drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		driver.findElement(By.id("DUMMY1")).click();
		driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL")).sendKeys("Sanjay");
		driver.findElement(By.name("AuthenticationFG.ACCESS_CODE")).sendKeys("Sanjaykumar");
	}
}
