package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// Step 1 : Launch the Browser
		  ChromeDriver driver = new ChromeDriver();
		  
//		  EdgeDriver ed = new EdgeDriver(); 
		  // Shortcut to import --> ctrl + shift + o --> import organize --> import all the import statemnets at once and alsO remove the un used import statements FirefoxDriver fd = new FirefoxDriver();
		  
		  
//		  InternetExplorerDriver ie = new InternetExplorerDriver();
		 
	
//		SafariDriver sd = new SafariDriver();
		
		 // Step2: Load the URL --> get()
		  
		  driver.get("https://www.google.com");
		  
		  // Step 3 Maximize the window
		  driver.manage().window().maximize();
		  
		  //Steps to pause 
		  Thread.sleep(2000); // 2000 milliseconds --> 2seconds --> Thread.sleep() wait for entire timeout
		  
		  
		  //Step 4 : Close the window
		  driver.close();
		  
	}
	
}
