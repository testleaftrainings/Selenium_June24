package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapshot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		1. Take a screenshot
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		
//		2. Set path for screenshot
		File desc = new File("./snap/img2.png");
//		3. Store Screenshot to the file path
		FileUtils.copyFile(screenshotAs, desc);
		
		
		WebElement loginForm = driver.findElement(By.xpath("//form[@id='login']"));
		
		File screenshotAs2 = loginForm.getScreenshotAs(OutputType.FILE);
		File desc2 = new File("./snap/img3.jpg");
		FileUtils.copyFile(screenshotAs2, desc2);
		
		
		
		
	}
	
}
