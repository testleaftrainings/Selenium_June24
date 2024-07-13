package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml;");
		driver.manage().window().maximize();
		
		// To handle a frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		// To comeout from frame to webpage --> defaultContent
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("//h5[text()=' How many frames in this page?']")).getText();
		System.out.println(text);
		
		WebElement secondFrame = driver.findElement(By.xpath("//h5[text()=' How many frames in this page?']/following-sibling::iframe"));
		driver.switchTo().frame(secondFrame);
		String text2 = driver.findElement(By.id("Click")).getText();
		System.out.println(text2);
		
		driver.switchTo().defaultContent();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("TestLeaf");
		
	}
	
	
}
