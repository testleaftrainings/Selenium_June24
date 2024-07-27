package week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod{

	@Test(dataProvider="sendData")
	public void runCreateLead(String cname,String fname, String lname, String phNo) {// step 1 : Convert main method into normal method
		
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
//		driver.close();
}
	
	@DataProvider(indices = {1,5})
	public String[][] sendData() throws IOException {
		/*String[][] data = new String[2][3];	
		
		data[0][0] = "TestLeaf";
		data[0][1] = "Gokul";
		data[0][2] = "Sekar";
		
		data[1][0] = "Qeagle";
		data[1][1] = "Babu";
		data[1][2] = "M";
		
		return data;*/
		/*String[][] excelData = ReadExcel.readExcelData();
		return excelData;*/
		return ReadExcel.readExcelData("CreateLead");
	}
	
	
}






