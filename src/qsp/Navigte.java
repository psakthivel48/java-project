package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigte {
	static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
			/*driver.navigate().to("http://gmail.com");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			driver.manage().window().maximize();*/
		WebElement a = driver.switchTo().activeElement();
		a.sendKeys("psakthivel48");
	}
}
