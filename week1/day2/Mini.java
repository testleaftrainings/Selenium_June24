package week1.day2;

public class Mini {
	// global variable or instance variable
	String color = "White";
    int noOfWheels = 4;
    boolean isWorking = true;
    int noOfSeats = 4;
    float safetyRating = 4.3f;
    float milage = 18.5f;
    
    public static void main(String args[]) {// inside the static method --> it is not possible to call non static methods or variables
		int noOfSeats = 4; // Local variable
		// object for class
				// syntax : className objectName = new className(); () ---> represent as constructor
		Mini cooper = new Mini();
		// to call members of the class by using class object
				// objectName.member
		
		System.out.println("By using cooper "+cooper.isWorking);
    	System.out.println(cooper.safetyRating);
    	cooper.openSunroof();
    	
    	Mini countryMan = new Mini();
    	System.out.println("By using countryMan"+countryMan.color);
    	System.out.println(countryMan.milage);
    	countryMan.applyBrake();
    	
	}
    
    
    //accessmodifier returnType methodName (input arguments){}
    
    public void openSunroof() {
    	String color = "Green";
    	System.out.println("Sunroof is opened");
    	System.out.println(isWorking);
    	System.out.println(noOfWheels);
    	System.out.println(color);
    	
    }
    
    // shortcut to create a method
    	// approach 1: type the methodName and press a key ctrl + spacebar and press enter and change the accessmodifier
    	public void driveCar() {
			System.out.println("Drive the car");
		}
    
    	// approach 2: type as public and press a key ctrl + spacebar and press enter and change a methodname
    	public void applyBrake() {
			System.out.println("Apply the car brake");
		}
    	
    	
    	
    
	
	
	
}
