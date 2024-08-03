package week7.day1;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {

	@Test
	public void runCreateAccount() {
		System.out.println("Create Account");
	}
	
	@Test(dependsOnMethods = {"runCreateAccount","week5.day1.CreateLead.runCreateLead"})
	public void runEditAccount() {
		System.out.println("Edit Account");
		throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = {"runEditAccount"}, alwaysRun = true)
	public void runDeleteAccount() {
		System.out.println("Delete Account");
	}
	
	
	
}
