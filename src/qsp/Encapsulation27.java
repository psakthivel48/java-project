package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.Page;

public class Encapsulation27 {
	@FindBy(id="username")
private WebElement unTB;
	@FindBy(name="pwd")
private WebElement pwTB;
	@FindBy(xpath="//div[text()='Login ']")
private WebElement loginBTN;
public Encapsulation27(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void setValue(String un){
	unTB.sendKeys(un);
}
public void setPasword(String pw){
	pwTB.sendKeys(pw);
	
}
public void clicklogin(){
	loginBTN.click();
}

}
