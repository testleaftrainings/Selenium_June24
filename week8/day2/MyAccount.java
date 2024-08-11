package week8.day2;

public class MyAccount extends LearnEncapsulation {

	
	public static void main(String[] args) {
		LearnEncapsulation le = new LearnEncapsulation();
//		int bal = le.getAcBal();
		le.setAcBal(7625386);
		int acBal = le.getAcBal();
		System.out.println(acBal);
		le.withdrawal(1200);
		le.withdrawal(5000);
		le.deposit(500);
		System.out.println(le.getAcBal());
	}
	
}
