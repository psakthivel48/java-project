package qsp;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nakri6 {
	static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
//		Set<String> v = driver.getWindowHandles();
//		for(String wh:v){
//			driver.switchTo().window(wh);
//			String title=driver.getTitle();
//			if(title.equals("Amazon")){
//				driver.close();
//			}
//		}
	driver.findElement(By.xpath("//span[text()='Later']")).click();
	File f=new File("./CV/sakthi.docx");
	String path = f.getAbsolutePath();
		driver.findElement(By.id("input_resumeParser")).sendKeys(path);
		Thread.sleep(2000);
		String msg = driver.findElement(By.className("success")).getText();
		System.out.println(msg);
	}
}
