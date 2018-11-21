package qsp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart12 {
	static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("iphonex");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[3][@class='_1va75j']")).click();
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		//System.out.println(allprice +"q");
		System.out.println(allprice.size());
		////	ArrayList<Integer> lst = new ArrayList<Integer>(); 
		//	for (int i = 1; i <=allprice.size(); i++) {
		//		String p1 = allprice.get(i-1).getText().substring(1).replaceAll(",", "");
		//		int a = Integer.parseInt(p1);
		//		lst.add(a);
		//	}
		//  Collections.sort(lst);
		//  System.out.println(lst);
		//  System.out.println("lowesst"+lst.get(0));
		//  System.out.println("highest"+lst.get(lst.size()-1));
		TreeSet<Integer>t= new TreeSet<Integer>();
		for (WebElement p : allprice) {
			String p1 = p.getText().substring(1).replaceAll(",", "");
			//System.out.println(p1);
			int v = Integer.parseInt(p1);
			t.add(v);
		}
		System.out.println(t.first());
		System.out.println(t.last());
		driver.close();
	}

}

