package week3.day2;

public class Iphone15 extends Iphone {

	
	public void dynamicIsland() {
		System.out.println("Access notification in Island");
	}
	
	@Override
	public void batteryCapacity() {
		System.out.println("Battery capacity is 2680MAH");
	}

	@Override
	public void screenSize() {
		System.out.println("Screen size is 4.7 inches");
	}
	
	public static void main(String[] args) {
		Iphone15 ip15 = new Iphone15();// created an object for class
		ip15.voiceAssistance();
		ip15.dynamicIsland();
		ip15.screenSize();
		ip15.backCamera();
		ip15.batteryCapacity();
		
		IphoneDesign id = new Iphone15();// created an object for interface with the help of implementation Class(Concrete class)
		id.voiceAssistance();
		id.eSim();
		id.wirelessCharging();
		
	}

}
