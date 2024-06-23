package week1.day2;

public class LearnJumpStatements {

	
	public static void main(String[] args) {
		
		// break --> used to stop/ternimate/kill the iteration/loop
		
		// continue --> used to skip the current iteration
		
		
		// print number from 1 to 20, print only odd numbers and the number is divisble by 3 i dont want to print
			/// 1, 5, 7, 11,13,17,19
		
		//Iterate from 1 to 20
		for (int i = 1; i <=20; i++) {
			
			//Stop the execution if the number is 7
			if(i==7) {
				break;
			}
			
			//condition to check the number is odd
			if(i%2==1) {
				if(i%3==0) { // condition to check the number is multiple of 3
					continue; // continue --> skip the current iteration
				}
				System.out.println(i);
			}
			
		}
		
	}
	
}
