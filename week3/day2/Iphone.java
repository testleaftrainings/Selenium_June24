package week3.day2;

public abstract  class Iphone implements IphoneDesign{// In Abstract class --> will implement the design and add some features or enchanments

	@Override
	public void chargingPort() {
		System.out.println("Lightning port");
	}

	@Override
	public void wirelessCharging() {
		System.out.println("Wireless charging supports");
	}

	@Override
	public void backCamera() {
		System.out.println("Back camera 12MP");
	}

	@Override
	public void frontCamera() {
		System.out.println("Front Camera 8MP");
	}

	@Override
	public void eSim() {
		System.out.println("eSim will support ");		
	}

	@Override
	public void bluetooth() {
		System.out.println("Bluetooth version 5.0");
	}
	
	
	public abstract void batteryCapacity();
	
	public abstract void screenSize();
}
