package week3.day2;

public class Customer extends AxisBank {// Concrete class

	public static void main(String[] args) {
		Customer c = new Customer();
		c.creditCard();
		c.name = "Gokul";
		c.panNO ="adk12345sf";
		c.aadharNo = "127829751389";
		c.kyc();
		c.deposit(49999);
		c.withdrawlLimit();
	}

	@Override
	public void creditCard() {
		System.out.println("Not required");		
	}

}
