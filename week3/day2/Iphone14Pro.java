package week3.day2;

public class Iphone14Pro extends Iphone{ // In concrete class --> implement the unimplement logics and new Features

	@Override
	public void batteryCapacity() {
		System.out.println("Battery capacity is 3000MAH");
	}

	@Override
	public void screenSize() {
		System.out.println("Screen size is 5.5 inch");	
	}
	
	public static void main(String[] args) {
		Iphone14Pro ip14 = new Iphone14Pro();
		ip14.chargingPort();
		ip14.batteryCapacity();
		ip14.backCamera();
		ip14.frontCamera();
		ip14.eSim();
	}

}
