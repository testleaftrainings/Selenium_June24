package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String windowHandle = driver.getWindowHandle();
		
		
		/**
		 * 9BEE1FD2919945391D291E1B0022BF65
		 * 4FE6C1F45BDB9C90B9782A3C4BAD3519
		 */
		System.out.println(windowHandle);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobilephones"+Keys.ENTER);
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
		// To get all the windows address --> getWindowHandles()
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println(string);	
		}
		
		List<String> windows = new ArrayList<String>(windowHandles);
		System.out.println("Before handling "+driver.getTitle());
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		
		/*
		 * driver.close(); System.out.println(driver.getTitle());
		 */
		
//		driver.quit();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(windows.get(0));
		
		driver.findElement(By.xpath("(//a[@target='_blank'])[10]")).click();
		
//		driver.switchTo().window(windows.get(2));
		
		System.out.println("---------------------------------------------");
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String string : windowHandles2) {
			driver.switchTo().window(string);
			System.out.println(driver.getTitle());
		}
		
		
		
	}
	
	
}
