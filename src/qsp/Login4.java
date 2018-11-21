package qsp;

import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login4 {
	static{
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
//		while(true){
//			try{
//				driver.findElement(By.id("logoutLink")).click();
//				System.out.println("LogoutLink is  Present&clicked");
//				break;
//			}
//			catch(Exception e){
//				System.out.println("LogoutLink is NOT Present");
//			}
//
//		}
		for(int i = 1;i<=100;i++){
			String title=driver.getTitle();
			if(title.contains("Enter")){
				System.out.println(title);
				break;
			}
			else{
				System.out.println("Still in login page:iteration"+i);
			}
		}
			driver.close();
		}
	}

