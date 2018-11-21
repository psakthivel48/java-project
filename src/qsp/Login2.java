package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login2 {
	static{
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String expTitle = "actiTIME - Login";
		System.out.println("expectedTitle:"+expTitle);
		String acTitle = driver.getTitle(); 
		System.out.println("actualTitle:"+acTitle);
		if(acTitle.equals(expTitle)){
			System.out.println("Pass: Title is Matching");
		}
		else{
			System.out.println("Fail: Title is not Matching");
		}
		WebElement un = driver.findElement(By.id("username"));
		if(un.isDisplayed()){
			System.out.println("pass...");
		}
		else{
			System.out.println("fail...");
		}
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		String ehpTitle = "actiTIME - Enter Time-Track";
		System.out.println("expectedTitle:"+ehpTitle);
		String ahpTitle = driver.getTitle();
		System.out.println("actualTitle:"+ahpTitle);
		if(ahpTitle.equals(ehpTitle)){
			System.out.println("pass...");
		}
		else{
			System.out.println("fail....");
		}
		
		
}
}