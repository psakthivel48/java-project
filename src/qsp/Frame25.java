package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame25 {
	static{
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sivabalasundaram/Desktop/page1.html");
		//using index
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("S");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("A");
		//using addrress
		WebElement e = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("S");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("A");
	}

}
