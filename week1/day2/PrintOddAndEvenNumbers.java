package week1.day2;

public class PrintOddAndEvenNumbers {

	
	public static void main(String[] args) {
		
		// Print numbers from 1 to 10 and also print the number is odd or even
		
		for (int i = 1; i <= 10; ++i) {
			
			if(i%2==1) {
				System.out.println("The number "+i+" is odd");
			}else {
				System.out.println("The number "+i+" is even");
			}
			
		}
	}
	
}
