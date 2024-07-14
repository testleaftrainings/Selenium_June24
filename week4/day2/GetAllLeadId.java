package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLeadId {

	
	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		
		//Locate the WebElement for username field.
		WebElement usernameField = driver.findElement(By.id("username"));
		//Enter the username into the field as demosalesmanager , use a method sendKeys()
		usernameField.sendKeys("Demosalesmanager");
		
		//Locate the password field
//		driver.findElement(By.className("inputLogin")).sendKeys("crmsfa"); // Class with duplicate
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
	
		//Locate and click on the CRMSFA link
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Locate and click on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		int size = driver.findElements(By.xpath("//span[text()='Lead List']/following::div[@class='x-grid3-viewport']//table")).size();
		for (int i = 2; i <=size; i++) {
			String leadId = driver.findElement(By.xpath("(//span[text()='Lead List']/following::div[@class='x-grid3-viewport']//table)["+i+"]/tbody/tr[1]/td[1]")).getText();
			System.out.println(leadId);
		}
		driver.close();
	}
	
	
	
}
