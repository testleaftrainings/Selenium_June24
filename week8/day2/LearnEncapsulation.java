package week8.day2;

public class LearnEncapsulation {

	private int acBal;

	public int getAcBal() {
		return acBal;
	}

	public void setAcBal(int acBal) {
		this.acBal = acBal;
	}
	
	
	public void deposit(int depositAmt) {
		acBal = acBal + depositAmt;
	}
	
	public void withdrawal(int withdrawal) {
		acBal = acBal - withdrawal;
	}
	
	
}
