package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll22 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.actitime.com/license-agreement");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		String xp="//h2[text()='15. Miscellaneous']";
		WebElement e = driver.findElement(By.xpath(xp));
		
		int y=e.getLocation().getY();
		int x=e.getLocation().getX();
		System.out.println(x);
		System.out.println(y);
		WebElement h=driver.findElement(By.className("header.header"));
		int height=h.getSize().getHeight();
		System.out.println(height);
		y=y-height;
		j.executeAsyncScript("window.scroll("+x+","+y+")");
}
}
