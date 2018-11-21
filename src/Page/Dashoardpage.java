package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebGeneric;

public class Dashoardpage {
	private WebDriver driver;
@FindBy(id="welcome")
private WebElement welcome;
@FindBy(xpath="//a[text()='Logout']")
private WebElement logout;
public Dashoardpage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void clickwelcome(){
	welcome.click();
}
public void clicklogout(long time){
	WebGeneric.waitforvisibilityAndClick(driver, time, logout);
}
}
