package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_SoftAssert30 {
static{
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
}
@Test
public void Createuser_Assert()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com");
	String aTitle = driver.getTitle();
	String etitlr="actiTIME - Login";
	SoftAssert s= new SoftAssert();
	s.assertEquals(aTitle, etitlr);
	driver.quit();
	s.assertAll();
}

}
