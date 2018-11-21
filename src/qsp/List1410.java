package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List1410 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("C:/Users/sivabalasundaram/Desktop/Vada.html");
		WebElement a = driver.findElement(By.id("SLV"));
		Select select=new Select(a);
		List<WebElement> alloption = select.getOptions();
		System.out.println(alloption.size());
		ArrayList<String> array=new ArrayList<String>();
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		for (WebElement option : alloption) 
		{
			String key = option.getText();
			System.out.println(key);
			array.add(key);
			if (map.containsKey(key)) 
			{
				Integer value = map.get(key);
				value++;
				map.put(key, value);

			}else{
				map.put(key,1);
			}
		}

		System.out.println(map);
		String s= "Idly";
		if (map.get(s)>1)
		{
			System.out.println(s+"is duplicate");
		}

		else
		{

			System.out.println(s+"is not duplicate");
		}
		for (String key : map.keySet()) 
		{
			if (map.get(key)==1) {
				System.out.println(key);

			}

		}
		for (String key : map.keySet())
		{
			if (map.get(key)>1) {
				System.out.println(key);

			}
			Collections.sort(array);
			System.out.println(array);

			Thread.sleep(2000);
			driver.close();
		}
	}
}

