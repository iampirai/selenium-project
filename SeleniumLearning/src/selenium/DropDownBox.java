package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\tools\\firefox\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		
		Select obj=new Select(dropdown1);
		obj.selectByIndex(1);
		obj.selectByValue("3");
		obj.selectByVisibleText("Loadrunner");
		
		List<WebElement> options = obj.getOptions();
		int size = options.size();
		System.out.println(size);

		WebElement multiselect = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
		
		Select obj1=new Select(multiselect);
		obj1.selectByIndex(1);
		obj1.selectByIndex(2);
		obj1.selectByIndex(3);
		
		
		
		
	}

}
