package week7.day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LearnPropertiesFile {

	
	public static void main(String[] args) throws IOException {
		
		//Step1:  Create object for FileInputStream and pass the proprties file location in constructor
		FileInputStream fis = new FileInputStream("./src/main/resources/credentials.properties");
		
		//Step2: Create object for Properties class from java
		Properties prop = new Properties();
		
		//Step3: Load the properties file
		prop.load(fis);
		
		// Step4: Get the value from properties file based on the key
		String uname = prop.getProperty("username");
		System.out.println(uname);
		String pwd = prop.getProperty("password");
		System.out.println(pwd);
		String user = prop.getProperty("UserName");
		System.out.println(user);
		
	}
	
}
