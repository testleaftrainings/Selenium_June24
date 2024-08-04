package week7.day2;

public class LearnJavaKeywords extends LearnStaticKeyword {

	
	LearnJavaKeywords(){
//		super();
		System.out.println("Constructor from LearnJavaKeywords");
		m1();
		super.m3();
	}
	
	static {
		
		System.out.println("Static block from sub class");
	}
	
	{
		
		System.out.println("non static block from sub class");
	}
	
	
	public void m1() {
		
		System.out.println("The method m1 is overrided");
	}
	
	public  void m() {
		
		this.m1();
		super.m1();
	}
	
	public static void main(String[] args) {
			LearnJavaKeywords ljk  = new LearnJavaKeywords();
//			ljk.m();
//			ljk.m1();
	}
	
}
