package week1.day1;

public class LearnOperation {

	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println(a%b); // 1/2.0  0.5
		System.out.println("A value before preIncrement");
		System.out.println(a);
		//postincrement ++
		System.out.println(a++);  // a= 1, a= a+1 , It will change the value in next line/step
		System.out.println(a);
		// preIncrement
		System.out.println(++a);  // a =2, a = a+1, it will change the value in same line/step
		
		//Comparision operators --> returns boolean -> true or false
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a>=b); // greater or greater than equal
		System.out.println(a<b);
		System.out.println(a<=b); // lesser or lesser than equal
		
		
		
	}
	
	
}
