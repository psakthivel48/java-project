package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class isqb17 {
static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.istqb.org/");
		WebElement menu = driver.findElement(By.linkText("Certification"));
		Actions action= new Actions(driver);
		action.moveToElement(menu).perform();
		driver.findElement(By.partialLinkText("Why ISTQB® Certification?                 ")).click();;
}
}
