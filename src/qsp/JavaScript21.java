package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript21 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.actitime.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//String msg = "happy festivel";
		//j.executeScript("alert('"+msg+"')");
		for (int i = 1; i<=10; i++) {
			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			
		}
		for (int i = 1; i<=10; i++) {
			j.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
			
		}
	}
}