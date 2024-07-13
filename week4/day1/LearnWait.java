package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWait {

	
	public static void main(String[] args) throws InterruptedException {
		// To handle  browser notification
		
		//Step1: Create an object for ChromeOptions
		ChromeOptions option = new ChromeOptions();
		//Step2: Addargumet to handle notifications
		option.addArguments("--disable-notifications");
		//Step3: Pass ChromeOptions object inside the ChromeDriver constructor
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$123");
		driver.findElement(By.id("Login")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
	}
	
}
