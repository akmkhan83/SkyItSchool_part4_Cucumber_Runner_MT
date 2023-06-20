package step_Definitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		System.out.println("Before Test");

	}
//	@After
//	public  void tearDown() {
//		driver.close();
//		driver.quit();
//		System.out.println("After Test");
//	}
	@After
	public void tearDown(Scenario scenario) {
//		try {
//			String screenshotName= scenario.getName();
//			scenario.log(scenario.getName());
//			if(scenario.isFailed()) {
//				scenario.log("this is my failure message");
//				
//				TakesScreenshot ts = (TakesScreenshot)driver;
//				byte[]screenshot = ts.getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshot, "image/png", screenshotName);
//			}
			if (scenario.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot)driver;
				byte[] src = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(src, "image/png", "screenshot");
				scenario.log("this is my failed test case screenshot");
				scenario.log("Scenario: " + scenario.getName() );
			}
		
		
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		driver.quit();
		System.out.println("After Test");
	}
}
