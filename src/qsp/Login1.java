package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {
	static{
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//enter the url
		//driver.get();
		String expectedTitle="actiTIME - Login";
		
		System.out.println("Expected:"+expectedTitle);
		String actualTitle=driver.getTitle();
		System.out.println("Actual:"+actualTitle);
		if(actualTitle.equals(expectedTitle)){
			System.out.println("pass;title is mtching");
		}
		else {
			System.out.println("fail;title is not mtching");
			
		}
		
		
		WebElement username = driver.findElement(By.id("username"));
		if(username.isDisplayed()){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
		
}
}
