package week1.day1;

public class LearnDataTypes {

	// Shortcut to execute the program --> ctrl +fn+ fll or ctrl + f11 , for mac --> cmd + f11 or cmd + fn + f11
	
	public static void main(String[] args) {
		// To store any values --> use variable and dataTypes
		//Syntax to declare value is
				// datatypes variableName = value (based on datatype);
		// To store whole number --> byte, short , int, long
		
		byte javaMemory = 32; // camelCase 
		boolean areYouKnowJava = true; // boolean --> true or false
		short idNum = 12345;
		long phNo = 8925411174L; // if the datatype is long at the end of the value append/add l/L (lowercase or uppercase L)
		int  age = 30;
		
		// To store decimal values --> float and double
		
		double usDollarPrice = 84.89;
		float pieValue = 3.14f; // to store as float append f at the end of the value.
		
		// To store single values --> char  , and the value should with in single qoute. or can use ascii table values
		char logo = 'T';
		char upperA = 65;
		//To store seq character --> String 
		String companyName = "TestLeaf";
		
		System.out.println("The Java byte memory is "+ javaMemory); // print --> it will print the statement what we have written
		System.out.println("Company name is "+companyName); //println --> it will print the statement and create a new line.
		System.out.println("Company logo "+logo);
		
		System.out.println("The usa dollar price is "+usDollarPrice +"\nMy phone number is "+ phNo ); // to create a new line -> use \n
		System.out.println("The Ascii Value of 65 is "+ upperA );
		
	}
	
}
