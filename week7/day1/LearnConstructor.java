package week7.day1;

public class LearnConstructor {

	 public LearnConstructor(String name) {
		 m1();
		 System.out.println("Hello "+name);
		 System.out.println("This is Parameterized Constructor");
	 }
	 
	 public LearnConstructor() {
		 System.out.println("This is no argument constructor");
	 }
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		LearnConstructor lc1 = new LearnConstructor("Gokul");
		LearnConstructor lc2 = new LearnConstructor();
		LearnConstructor lc3 = new LearnConstructor();
	}
	
	
	public void m1() {
		System.out.println("This is m1 method");
	}
}
