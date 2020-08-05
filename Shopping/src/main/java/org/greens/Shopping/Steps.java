package org.greens.Shopping;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	@Before
	public void browser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

	}
	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg2) throws Throwable {
		driver.findElement(By.id("passwd")).sendKeys(arg2);
	}

	@Then("^User click on SignIn button$")
	public void user_click_on_SignIn_button() throws Throwable {
		driver.findElement(By.xpath("//span[text()[normalize-space()='Sign in']]")).click();

		String mainWindow = driver.getWindowHandle();

		Set<String> allwindow = driver.getWindowHandles();

		for (String newWindow : allwindow) {
			if (!newWindow.equals(mainWindow)) {
				driver.switchTo().window(newWindow);
				driver.close();
			}}
		driver.switchTo().window(mainWindow);
	}

	@Then("^Verify user account page is displayed$")
	public void verify_user_account_page_is_displayed() throws Throwable {
		String pagetitle = driver.getTitle();

		Thread.sleep(5000);
		if (pagetitle.equalsIgnoreCase("My account - My Store")) {
			System.out.println("the signin details are working");
		}else {
			System.out.println("the signin is not working");
		}
		driver.quit();
	}

	@Then("^type in search$")
	public void typpe_in_search() throws Throwable {
		driver.findElement(By.id("search_query_top")).sendKeys("dresses");
		driver.findElement(By.name("submit_search")).click();

		String mainWindow = driver.getWindowHandle();

		Set<String> allwindow = driver.getWindowHandles();

		for (String newWindow : allwindow) {
			if (!newWindow.equals(mainWindow)) {
				driver.switchTo().window(newWindow);
				driver.close();
			}}
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);

		Actions actions = new Actions(driver);
		actions.moveToElement(By.class(), xOffset, yOffset)
		
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();

		String main2Window = driver.getWindowHandle();

		Set<String> all2window = driver.getWindowHandles();

		for (String new2Window : all2window) {
			if (!new2Window.equals(main2Window)) {
				driver.switchTo().window(new2Window);
				driver.close();
			}}
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()[normalize-space()='Proceed to checkout']]")).click();

	}

}
