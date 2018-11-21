package Fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLogin {
	static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Loginpage l=new Loginpage(driver);
		l.setUserName("psakthivel8@yahoo.in");
		l.setPassword("APS2525p");
		l.clicklogin();
	Thread.sleep(1000);
		Logout lo=new Logout(driver);
		lo.dropbox();
		lo.clicklogout();
		driver.close();
	}
}