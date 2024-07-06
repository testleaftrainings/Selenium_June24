package week3.day1;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String name = "Gokul"; // lukoG
		String output ="";
		// Step 1 --> convert String into character
		char[] charArray = name.toCharArray();
		
		for (int i =charArray.length-1 ; i>=0; i--) {
//			System.out.println(charArray[i]);
			output = output + charArray[i]; // ""+l = "l", "l"+u ="lu", "lu"+k="luk", "luk"+o="luko", "luko"+G="lukoG"
		}
		System.out.println(output);
		
	}
	
}
