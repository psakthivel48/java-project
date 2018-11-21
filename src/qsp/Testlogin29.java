package qsp;

import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testlogin29
{
	@Parameters({"ip","browser"})
	@Test
	public void testGrid(String ip,String browser)throws Exception 
	{
		URL remoteAddress=new URL("http://"+ip+":4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
		driver.get("https://demo.actitime.com");
		for(int i=1;i<=100;i++)
		{
			WebElement un = driver.findElement(By.id("username"));
			un.sendKeys("admin");
			un.clear();
		}

	}

}

