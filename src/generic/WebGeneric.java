package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebGeneric {
	public static void waitforvisibilityAndClick(WebDriver driver,long time, WebElement element){

		WebDriverWait wait=new WebDriverWait(driver, time);
		try {
			wait .until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is visible",true);
		} catch (Exception e) {
			Reporter.log("Element is Not visible",true);	
			Assert.fail();
		}

		element.click();
	}
	public static void verfiyURL(WebDriver driver,long time, String partialURL){

		WebDriverWait wait=new WebDriverWait(driver, time);
		try {
			wait .until(ExpectedConditions.urlContains(partialURL));
			Reporter.log("Req page is displayed",true);
		} catch (Exception e) {
			Reporter.log("Req page is Not displayed",true);	
			Assert.fail();
		}

	}
}