package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encapsulation27b {
	static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		Encapsulation27 e=new Encapsulation27(driver);
		e.setValue("adc");
		e.setPasword("mer");
		e.clicklogin();
		Thread.sleep(1000);
		e.setValue("admin");
		e.setPasword("manager");
		e.clicklogin();
		
}
}