package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qs23 {
	static{
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/sivabalasundaram/Desktop/qsp.html");
		//driver.findElement(By.id("t1")).sendKeys("abc");
		String code="document.getElementById('t1').value='abc'";
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript(code);
	}
}