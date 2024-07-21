package week5.day2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnTestNGAnnotations {
  @Test
  public void f() {
	  System.out.println("Test method");
  }
  
  @Test
  public void k() {
	  System.out.println("Test method 2");
  }
  
  @Test(dataProvider = "sendData")
  public void x(String cname , String name) {
	  System.out.println(cname +" and "+name);
	  System.out.println("Test method 3");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite");
  }
  
  
  @DataProvider
  public String[][] sendData() {
	  System.out.println("DataProvider Method");
	  String[][] data = new String[2][2];
	  data[0][0] ="TestLeaf";
	  data[0][1] = "Gokul";
	  data[1][0] = "Qeagle";
	  data[1][1] = "Babu";
	  
	  return data;
  }

}
