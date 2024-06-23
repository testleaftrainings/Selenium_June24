package week1.day2;

public class Hotel {
	
	public int dosa(int quantiy) {
		int price = 30;
		
		System.out.println("This is dosa");
		int totalAmt = price*quantiy;
		
		return totalAmt;
	}
	
	
	public void idly(int quantiy) {
		int price =20;
		System.out.println("This is Idly");
	}
	
	public int chappathi(int quantiy) {
		int price = 35;
		System.out.println("This is Chappathi");
		int totalAmt = price * quantiy;
		return totalAmt;
	}
	
	public static void main(String[] args) {
		
		// Create object for class
		
		Hotel person1 = new Hotel();
		/*
		 * Hotel person2 = new Hotel(); Hotel person3 = new Hotel();
		 */
		
		int totalAmount1 = person1.dosa(2);// to store as local variable --> press a key ctrl +2 and relese both keys after that press a key l
		
		
		int chappathi = person1.chappathi(1);
		
		System.out.println(totalAmount1+chappathi);
		
	}

}
