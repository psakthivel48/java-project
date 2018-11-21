package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static{
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sivabalasundaram/Desktop/Demo.html");
		//WebElement e = driver.findElement(By.tagName("b"));
		driver.findElement(By.tagName("a")).click();//in the browser find the element  by using tag name a and click it
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.id("a1")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.className("c1")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Go")).click();
		driver.findElement(By.cssSelector("a[id='a1']")).click();
	}
}
