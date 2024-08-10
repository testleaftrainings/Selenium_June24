package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		
		//Step1 : Create object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		// Step2 : Write an expected Condition
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[2]"))).click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//span[text()='I am about to hide'])")));
		
		driver.findElement(By.xpath("(//span[text()='Click First Button'])")).click();
		
		WebElement toastorMsg = driver.findElement(By.xpath("//div[@class='ui-growl ui-widget']"));
		wait.until(ExpectedConditions.invisibilityOf(toastorMsg));
		
		driver.findElement(By.xpath("//span[text()='Click Second']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']"))).click();
		
		
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		
		
//		driver.findElement(By.xpath("//span[text()='I am here']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
		
		driver.findElement(By.id("frame2"));
		
		
		driver.quit();
	}
	
}
