package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actime18 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");	
	WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
	Actions action=new Actions(driver);
	action.contextClick(link).perform();
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_T);//t->new tab window
}
}
