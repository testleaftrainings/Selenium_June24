package week7.day2;

public class LearnThisKeyword {

	String companyName;
	
	public final void m1(String companyName) {
		System.out.println(companyName);
		System.out.println(this.companyName);
	}
	public void m2() {
		this.m1("Qeagle");
		System.out.println(this.companyName);
	}
	
	public static void main(String[] args) {
		LearnThisKeyword ltk = new LearnThisKeyword();
		ltk.m1("TestLeaf");
		System.out.println(ltk.companyName);
		
	}
	
	
}
