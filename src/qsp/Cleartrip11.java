package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cleartrip11 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		 driver.findElement(By.id("FromTag")).sendKeys("Bang");
		
		 driver.findElement(By.xpath("//a[contains(text(),'BLR')]")).click();
		 driver.findElement(By.id("ToTag")).sendKeys("Goa");
		 driver.findElement(By.xpath("//a[contains(text(),'GOI')]")).click();
		 driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
		 driver.findElement(By.id("SearchBtn")).click();
		
//		 for (WebElement price : allprice) {
//			 String text = price.getText();
//			 System.out.println(text);
//			 String formatedText = text.substring(1).replaceAll(",", "");
//			 System.out.println("formated"+formatedText);
//			int v=Integer.parseInt(formatedText);
//			System.out.println("int"+v);
//			
//		}
		 List<WebElement> allprice = driver.findElements(By.xpath("//th[@class='price']"));
		 for (int i = 1; i < allprice.size(); i++) {
			String p1 = allprice.get(i-1).getText().substring(1).replaceAll(",", "");
			String p2 = allprice.get(i).getText().substring(1).replaceAll(",", "");
			 int v1=Integer.parseInt(p1);
			 int v2=Integer.parseInt(p2);
			 System.out.println("Comparing"+v1+"with"+v2);
			 if(v1<=v2){
				 System.out.println("pass");
			 }
			 else {
				 System.out.println("fail");
			 }
		}driver.close();
		 
}
}
