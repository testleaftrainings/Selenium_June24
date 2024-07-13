package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateNumbers {

	
	public static void main(String[] args) {
		
		int[] num = {1,2,1,4,5,6,8,2,5,4,6,6};
		
		Set<Integer> uniqueNum= new TreeSet<Integer>();
		
		// for loop
//		for(int i=0; i<num.length; i++) {}
		
		
		// for each  for(datatype variableName : variable(collection/Array) want to iterate)
		for(int numValue: num) {
			uniqueNum.add(numValue);
		}
		
		System.out.println(uniqueNum);
		for (Integer integer : uniqueNum) {
			System.out.println(integer);
		}
	}
	
}
