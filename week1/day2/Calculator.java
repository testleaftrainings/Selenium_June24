package week1.day2;

public class Calculator {

	public int add(int a, int b ) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int i = cal.add(2, 5);
		System.out.println(i);
		String sub = cal.sub();
		System.out.println("This is from main method "+sub);
		cal.m();
	}
	
	public String sub() {
		System.out.println("This is sub method");
		
		return "Hello";
	}
	
	public void m() {
		System.out.println("Welcome");
	}
	
}
