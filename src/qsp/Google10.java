package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google10 {
	static{
		//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		  driver.findElement(By.id("lst-ib")).sendKeys("java");
	//	String xp = "//div[contains(text(),'java')]";	
		List<WebElement> allas = driver.findElements(By.xpath("//div[contains(text(),'java')]"));
		System.out.println(allas.size());
		for (WebElement a : allas) {
			System.out.println(a.getText());
		}
		allas.get(0).click();
			
		}
	}



