package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoA1 {
@BeforeClass
public void openAPP(){
	Reporter.log("open APP", true);
}@AfterClass
public void CloseAPP(){
	Reporter.log("Close APP", true);
}@BeforeMethod
public void login(){
	Reporter.log("login", true);
}@AfterMethod
public void logout(){
	Reporter.log("logout", true);
}@Test(priority=-1)
public void Createuser(){
	Reporter.log("Createuser", true);
}@Test(invocationCount=3)
public void edituser(){
	Reporter.log("edituser", true);
}@Test(priority=1,invocationCount=0)
public void deleteuser(){
	Reporter.log("deleteuser", true);
}
}