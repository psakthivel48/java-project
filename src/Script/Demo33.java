package Script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Page.Dashoardpage;
import Page.LoginPage33;
import generic.BaseTest33;
import generic.Result33;
import generic.Utility33;
import generic.WebGeneric;
@Listeners(Result33.class)
public class Demo33 extends BaseTest33  {

	@Test
	public void testA() throws InterruptedException{
		//take the input from excel file
		String pw = Utility33.getXLData(DATA_PATH, "Sheet1", 1, 1);
		String un = Utility33.getXLData(DATA_PATH,  "Sheet1", 1, 0);
		String homepageURL = Utility33.getXLData(DATA_PATH,  "Sheet1", 1, 2);
		String loginpageURL= Utility33.getXLData(DATA_PATH, "Sheet1", 1, 3);
		//enter valid usename & password
		LoginPage33 l=new LoginPage33(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		Thread.sleep(1000);
		//verify that Dashboard page is Displayed
		WebGeneric.verfiyURL(driver, lngETO, homepageURL);
		//click log out
				Dashoardpage d=new Dashoardpage(driver);
				d.clickwelcome();
				d.clicklogout(lngETO);
				WebGeneric.verfiyURL(driver, lngETO, loginpageURL);
	}
}


