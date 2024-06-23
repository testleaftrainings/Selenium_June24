package week1.day2;

public class JumpStatement {

	
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) { // 1,2,4,5,7,8,10
			if(i%3==0) {
				continue;
			}
			
			System.out.println(i);
			
		}
		
		
	}
	
}
