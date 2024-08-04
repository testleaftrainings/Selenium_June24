package week7.day2;

import week7.day1.LearnConstructor;

public class LearnStaticKeyword extends LearnConstructor {

	LearnStaticKeyword(){
		System.out.println("Constrctor from LearnStaticKeyword");
	}
	
	
	static int x = 1; // This is static variable
	int y = 1; //This is non-static variable
	
	public void m1() {// Normal method or non-static method
		x++;
		y++;
		System.out.println("The method m1 from super class");
	}
	
	public static void m2() {// This is static method
		x++;
//		m1();
	}
	
	public static void main(String[] args) {
		
		LearnStaticKeyword lsk1 = new LearnStaticKeyword();
		LearnStaticKeyword lsk2 = new LearnStaticKeyword();
		LearnStaticKeyword lsk3 = new LearnStaticKeyword();
		lsk1.m1();
		lsk2.m1();
		lsk3.m1();
		lsk3.m1();
		System.out.println(x);
		System.out.println(lsk3.y);
		
		
	}
	
	
	
	{
		System.out.println("This is non static block");
	}
	
	static {
		System.out.println("This is static block");
	}
	
}
