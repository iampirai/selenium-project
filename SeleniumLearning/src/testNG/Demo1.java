package testNG;

import org.testng.annotations.Test;

public class Demo1 {


	@Test(priority=2)
	private void demoMethod() {
		System.out.println("this is an TestNG Demo");
	}

	@Test(dependsOnMethods="demoMethod")
	private void demoMethod2() {
		System.out.println("10/0");
	}
}
