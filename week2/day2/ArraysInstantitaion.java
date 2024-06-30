package week2.day2;

public class ArraysInstantitaion {

	public static void main(String[] args) {
		// dataType[] varibaleName = new dataType[size];
		int[] num = new int[7];
		System.out.println(num[0]);
		
		num[0] = 1;
		num[1] = 2 ;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		num[5] = 6;
		num[6] = 7;
		
		int[] num1 = {2,8,10,3};
		//Itearate the num[]
		for (int i = 0; i < num.length; i++) {
			//iterate the num1[]
			for (int j = 0; j < num1.length; j++) {
				//Compare common numbers in Array
				if(num[i]==num1[j]) {
					System.out.println(num[i]);
				}
			}
		}
		
		
	}

}
