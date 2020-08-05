package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenEdit {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\tools\\firefox\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("iampirai@gmail.com");
		
		WebElement append= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
		append.sendKeys("appending testing");
		
		WebElement  gettifText= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input"));
		String text = gettifText.getAttribute("value");
		System.out.println(text);
		
		WebElement clear= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		clear.clear();
		
		WebElement disabled =driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		Boolean cleardisplay =disabled.isEnabled();
		System.out.println(cleardisplay);
	
	}

}
