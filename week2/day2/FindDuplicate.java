package week2.day2;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		
		//Approach 1:
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		
		for (int i = 0; i < num.length; i++) { // from 0 to 7 i<8
			
			for (int j = i+1; j < num.length; j++) { // j= 8 in last iteration; 8<8
				
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
		}
		
		System.out.println("----------------------");
		
		//Approach 2:
		Arrays.sort(num); //[2,2,3,5,5,7,7,9]; --> length = 8, from 0 to 6
		
		for (int i = 0; i < num.length-1; i++) {  // for(int i =0; i<8 ; i++)
			if(num[i]==num[i+1]) { //
				System.out.println(num[i]);
			}
		}
		
	}
	
	
}
