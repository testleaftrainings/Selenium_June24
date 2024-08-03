package stepDefinition;

import org.openqa.selenium.By;

import hooks.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod {
//public ChromeDriver driver; 
	@When("Click on crmsfa link")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When("Click on Leads tab")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When("Click on Create Lead link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	// (.*)$ - represent as object
	@Given("Enter the company name as (.*)$")
	public void enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	
	@Given("Enter the first name as (.*)$")
	public void enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);	
	}
	
	@Given("Enter the last name as (.*)$")
	public void enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	
	@Given("Enter the phno as (.*)$")
	public void enterPhno(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	}
	
	@When("Click on Create lead button")
	public void clickCreateLeadBtn() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Verify the lead is created and print the lead id")
	public void printLeadId() {
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Lead Id "+leadId);
	}
	
}
