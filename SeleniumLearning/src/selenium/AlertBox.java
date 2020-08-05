package selenium;

import java.sql.Driver;

import javax.tools.Diagnostic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\tools\\firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertbutton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		alertbutton.click();
		Alert ab = driver.switchTo().alert();
		ab.accept();
		
		WebElement confirmbutton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		confirmbutton.click();
		Alert cb= driver.switchTo().alert();
		cb.dismiss();
		
		WebElement promtbox = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
		promtbox.click();
		Alert pb=driver.switchTo().alert();
		pb.sendKeys("Piai");
		pb.accept();
		
	}

}
