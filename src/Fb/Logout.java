package Fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(id="logoutMenu")
	private WebElement drop;
	@FindBy(xpath="//span[text()='Log Out']/../..")
	private WebElement logout;
	public Logout(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void dropbox(){
		drop.click();
	}
		public void clicklogout(){
			
			logout.click();
		}
	}

