package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {

	public static  WebDriver driver;
	
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static  void click(By byObject) {
    driver.findElement(byObject).click();
	}
    public static void sendKeys(By byObject , String sendValue) {
    driver.findElement(byObject).sendKeys(sendValue);
    }
	public static String getText(By byObject) {
		String s = driver.findElement(byObject).getText();
		return s ;
	}
	public static void clear(By byObject) {
		
		driver.findElement(byObject).clear();
	}
	
	
	
}
