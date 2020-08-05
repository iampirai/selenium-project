package hi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	private void mode() {

		System.out.println("1st method");
	}

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://demo.automationtesting.in/Windows.html");
		//driver.findElement(By.name("q")).sendKeys("chennai");

		//List<WebElement> x1 = driver.findElements(By.xpath("//select [@name='country']"));

		//x1.click();
		//Select s= new Select(x1);
		//s.selectByIndex(20);

		//		WebElement firstSelectedOption = s.getFirstSelectedOption();
		//		System.out.println(firstSelectedOption.getText());

		//List<WebElement> all = s.getAllSelectedOptions();
		//		for (int i = 0; i < all.size(); i++) {
		//			System.out.println(all.get(i).getText());
		//		}		
		//s.selectByIndex(29);
		//s.selectByValue("3");
		//s.selectByVisibleText("INDIA");

		//				for (WebElement i : x1) {
		//					System.out.println(i.getText());
		//				}

		//		driver.quit();

		//driver.navigate().to("https://m.facebook.com");

			/*	Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				
				robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); */

		//String parent = driver.getWindowHandle();
		
		/*WebElement x = driver.findElement(By.xpath("(//button [@class='btn btn-info']) [1]"));
		
		x.click();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		List<String> l= new ArrayList<>(allwindow);

		driver.switchTo().window(l.get(1));
		
		WebElement x1 = driver.findElement(By.id("COVID19button"));
		
		x1.click();
		
		driver.close();
		
		driver.switchTo().window(l.get(0));
		
		driver.close();*/

		
		/*driver.get("http://www.leafground.com/pages/Window.html");
		
		WebElement click = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		click.click();
		
		Set<String> multiple = driver.getWindowHandles();
		List<String> li=new ArrayList<>(multiple);
		
		
		driver.switchTo().window(li.get(1));
		driver.close();
		
		driver.switchTo().window(li.get(2));
		driver.close();
		
		driver.switchTo().window(li.get(0));
		driver.close();*/
		
		/* driver.navigate().to("https://m.gsmarena.com/");
		WebElement button = driver.findElement(By.xpath("(//a[text()='News'])[3]"));
		Actions ac=new Actions(driver);
		
		ac.contextClick(button).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER); */
		
		//String windowHandle = driver.getWindowHandle();
		
		//driver.close();

	}}
