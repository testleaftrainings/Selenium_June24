package week2.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		String[] mentors = {"Aravind","Ragu","Vinoth","Vineeth","Subraja","Ranjini","Dilip","Saranya","Gokul"}; // Literal declaration
		System.out.println(mentors);//@1eb44e46, @1eb44e46, @1eb44e46
		//How to get particular name ? by using index, And the index will starts from 0.
		System.out.println(mentors[0]);
		int length = mentors.length;
		System.out.println("Length of the Array is "+length);
		
		for (int i = 0; i < mentors.length; i++) {
			System.out.println(mentors[i]);
		}
		
		//Sort an Array
		Arrays.sort(mentors);
		
		System.out.println("------------After sort------------");
		
		for (int i = 0; i < mentors.length; i++) {
			System.out.println(mentors[i]);
		}
		// Print Arrays in deseceding
		for(int i=mentors.length-1; i>=0; i--) {
			System.out.println(mentors[i]);
		}
		
		System.out.println(mentors[2]);
		
		int num = 5;
		System.out.println(num);
		num = 7;
		System.out.println(num);
		
		mentors[2] = "Arun";
		System.out.println(mentors[2]);
		
		
		int[] number  = {2,5,1,3,7,8,10,4};
		Arrays.sort(number); //{1,2,3,4,7,8,10}
		//Iterate an Array
		for (int i = 0; i < number.length; i++) {
			// check the number 7
			if(number[i]==7) {
				System.out.println("The index of number 7 is "+i);
			}
		}
		
		
		System.out.println(number[8]);
	}
	
	
	

}
