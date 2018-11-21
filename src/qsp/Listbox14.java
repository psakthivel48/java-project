package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox14 {
	static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select=new Select(listBox);
		List<WebElement> alloptions = select.getOptions();
//		for(int i=1;i<alloptions.size();i++){
//			WebElement option = alloptions.get(i);
//			 String text = option.getText();
//			 System.out.println(text);
//			 
//			
//		}
		for (WebElement option : alloptions) {
			System.out.println(option.getText());
			
		}
			
		}
}
	
