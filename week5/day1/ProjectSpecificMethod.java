package week5.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
public ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
}
