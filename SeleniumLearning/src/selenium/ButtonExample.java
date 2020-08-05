package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\tools\\firefox\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement position = driver.findElement(By.id("position"));
		Point location = position.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("Position of X:"+x +"   Position of y:"+y);
		
		WebElement color = driver.findElement(By.id("color"));
		String cssValue = color.getCssValue("background-color");
		System.out.println(cssValue);
		
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("Height of the button is:"+height+ "  Width of the button is :"+width);
		
		WebElement home = driver.findElement(By.id("home"));
		home.click();
				
	}

}
