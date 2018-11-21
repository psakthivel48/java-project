package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acitime17 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");	
	WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
	Actions action=new Actions(driver);
	//TRL+click(its an example for compostion action ->multiple Action at atime)
	action.sendKeys(Keys.CONTROL).click(link).perform();
	//in the example getwindowhandle of all the TaBs
	Set<String> allWHS= driver.getWindowHandles();
	System.out.println(allWHS.size());//TO count the TBS
	for (String wh : allWHS) {
		driver.switchTo().window(wh);//swith to TAB
		System.out.println(driver.getTitle());
		
		}
	driver.close();//close only Current TAB
	driver.quit();
	}
}
