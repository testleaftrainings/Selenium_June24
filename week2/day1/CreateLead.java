package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		
		//Locate and click on the Create lead from shortcut menu
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Locate the company field and enter as TestLeaf
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Locate and enter first name as Gokul
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		
		
		//Locate the Source WebElement (Dropdown)
		//step 1: Locate the dropdown WebElement
		WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Step 2: Create a object for Select class and pass WebElement inside the Constrctor
		Select sourceDD = new Select(sourceWE);
		//step 3: Select the value
		sourceDD.selectByIndex(4); //Index starts from zero
		
		
		//Locate the Industry and choose computer software
		WebElement industryWE = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDD = new Select(industryWE);
		industryDD.selectByVisibleText("Computer Software");
		
		//Locate the ownership 
		WebElement ownershipWE = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDD = new Select(ownershipWE);
		ownershipDD.selectByValue("OWN_PARTNERSHIP");
		
		
		
		
		//Loctae and enter the last name as Sekar
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		
		//Locate and click on the create lead button.
		driver.findElement(By.className("smallSubmit")).click();
		
		//Get the Lead ID
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Lead Id "+leadId);
		
		System.out.println(driver.getTitle());
		
		//close the window
		driver.close();
	}
	
}
