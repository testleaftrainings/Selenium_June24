package week3.day1;

public class Calculator {

	//add two number
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(float a, float b) { // float and float, int and float, float and int
		System.out.println(a+b);
	}
	
	//add three number
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(5, 2);
		c.add(2.3f, 5.5f);
		c.add(1, 2.14f);
		c.add(1, 2, 3);
	}
}
