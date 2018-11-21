package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox13 {
	static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get("C:/Users/sivabalasundaram/Desktop/idly.html");
		WebElement listBox = driver.findElement(By.id("SLV"));
		Select select= new Select(listBox);
		select.selectByIndex(0);
		select.selectByValue("v");
		select.selectByVisibleText("Dosa");
		List<WebElement> a = select.getAllSelectedOptions();
		System.out.println(a.size());
		WebElement b = select.getFirstSelectedOption();
		System.out.println(b.getText());
		List<WebElement> c = select.getOptions();
		System.out.println(c.size());
		System.out.println(c);
		if (select.isMultiple()) {
			System.out.println("yes we ca deselect");
			select.deselectByIndex(0);
			select.deselectByValue("v");
			select.deselectByVisibleText("Dosa");
			select.deselectAll();
			
		}else{
			System.out.println("Sorry cant use deselect on single select list box");
		}

}
}
