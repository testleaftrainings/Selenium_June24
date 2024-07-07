package week3.day2;

public abstract  class AxisBank implements RBI,AxisBankRules{// abstract class --> partial abstract from 0 - 100 %

	String name;
	String panNO;
	String aadharNo;
	
	
	public void kyc() {
		System.out.println("Customer name is "+name);
		System.out.println("Customer pan number is"+panNO);
		System.out.println("Customer Aadhar number is "+aadharNo);
	}
	
	
	public void withdrawlLimit() {
		System.out.println("Each person will withdrawl the maximam amount of rupees 50,000 per day");
	}
	
	public static void main(String[] args) {
//		AxisBank ab = new AxisBank();
	}
	
}
