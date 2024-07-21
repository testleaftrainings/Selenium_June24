package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DuplicateLead extends ProjectSpecificMethod{

	@Test(dataProvider = "sendData")
	public void runDuplicateLead(String phno, String cname) throws InterruptedException {
		
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyNameWE = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameWE.clear();
		companyNameWE.sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
//		driver.close();
}
	
	
	@DataProvider
	public String[][] sendData() {
		String[][] data = new String[3][2];
		data[0][0] = "99";
		data[0][1] = "TestLeaf";
		
		data[1][0] = "98";
		data[1][1] = "Qeagle";
		
		data[2][0] = "97";
		data[2][1] = "TestLeaf";
		
		return data;
		
	}
	
	
}






