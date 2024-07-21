package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
public RemoteWebDriver driver;

	@Parameters({"username","password","url","browser"})// key is case sensitive , but order is not prefered
	@BeforeMethod
	public void preCondition(String uname, String pwd,String url, String browser) {
		
		System.out.println("username is "+uname);
		System.out.println("password is "+pwd);
		System.out.println("url is "+url);
		
		switch(browser) {
		
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;	
		default:
			driver = new ChromeDriver();
			
		}
				
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
}
