package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup5 {
	static{
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sakthi");
//		driver.findElement(By.xpath("(//button)[2]")).click();
//		driver.get("https://retail.starhealth.in/renewal");
//		driver.findElement(By.id("nqame2")).sendKeys("46384638");
//		driver.findElement(By.id("cust-dob")).click();
//		driver.findElement(By.linkText("15")).click();
//		driver.findElement(By.id("proceed")).click();
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		driver.findElement(By.id("loginbutton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss();
	}
}
