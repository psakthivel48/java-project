package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {
	static{
		//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/sivabalasundaram/Desktop/Demo.html");
		WebElement all = driver.findElement(By.partialLinkText(""));
		all.click();
//		List<WebElement> all = driver.findElements(By.tagName("a"));
//		int count=all.size();
//		for(int i=0;i<=count;i++){
//			WebElement link = all.get(i);
//			String text = link.getText();
//			String url = link.getAttribute("href");
//			System.out.println(text+""+url);
//		}
//		// using foreach
//		for(WebElement link:all){
//			
//			String text = link.getText();
//			String url = link.getAttribute("href");
//			System.out.println(text+""+url);
			
		}
	}

