package week5.day2;

import org.testng.annotations.Test;

public class LearnAttributes {

	
	
	  
	  @Test(priority = 1, invocationCount = 10, threadPoolSize = 3)
	  public void k() throws InterruptedException {
		  Thread.sleep(2000);
		  System.out.println("Test method 2");
	  }
	  
	  @Test(priority = 2, enabled =false)
	  public void X() {
		  System.out.println("Test method 3");
	  }
	  
	  @Test(priority = 3)
	  public void f() {
		  System.out.println("Test method");
	  }
	
	
	
}
