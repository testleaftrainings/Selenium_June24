package week3.day1;

public class LearnString {

	
	
	public static void main(String[] args) {
		
		//Literal Way
		String name1 ="TestLeaf";
		String name2 = "TestLeaf";
		
		//By using Object
		String name3 = new String("TestLeaf");
		String name4 = new String("test leaf");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		System.out.println(name1==name2);
		System.out.println(name3==name4);
		System.out.println(name1==name3);
		
		//For comparison --> equals(), equalsIgnoreCase(), contains()
		//equals() --> It will look/check for the value with case sensitive
		System.out.println(name1.equals(name3));
		System.out.println(name1.equals(name4));
		
		//equalsIgnoreCase() --> It will check for values without case sensitive
		System.out.println(name1.equalsIgnoreCase(name4));
		//contains() --> It will check for the partial text with case sensitive
		System.out.println(name1.contains("Test"));
		System.out.println(name1.contains("test"));
		
		//Length of the String --> length()
		int length = name4.length();
		System.out.println("The length of the name4 variable values is "+length);
		
		// To convert string into CharArray ---> toCharArray()
		char[] charArray = name3.toCharArray();
		System.out.println(charArray[5]);
		
		// To get Particular Value from index --> charAt()
		char charAt = name1.charAt(7);
		System.out.println("The 7th index of name1 variable is "+charAt);
		
		System.out.println(name4.toUpperCase());
		
		System.out.println(name1.toLowerCase());
		
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
	}
	
	
}
