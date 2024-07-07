package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		
		String  password  = "Leaf$123";
		String substring = password.substring(4);
		System.out.println(substring);
		String substring2 = password.substring(0, 4);
		System.out.println(substring2);
		
		String replace = password.replace("Leaf", "LEAF");
		System.out.println(replace);
		
		String searchEngine = "Googleooooooooo";
		String replace2 = searchEngine.replace("oo", "0");
		System.out.println(replace2);
		
		String replaceFirst = searchEngine.replaceFirst("o", "0");
		System.out.println(replaceFirst);
		
		// Regular Expression
			// [0-9] --> replace the numbers/numeric values
		String replaceAll = password.replaceAll("[0-9]", "");
		System.out.println(replaceAll);
		
		//[a-z] --> replace lowercase characters
		String replaceAll2 = password.replaceAll("[a-z]", "");
		System.out.println(replaceAll2);
		
		//[A-Z] --> replace uppercase characters
		String replaceAll3 = password.replaceAll("[A-Z]", "");
		System.out.println(replaceAll3);
		//[a-zA-Z] --> replace all the characters
		String replaceAll4 = password.replaceAll("[a-zA-Z]", "");
		System.out.println(replaceAll4);
		
		// [^0-9] --> replace other than numbers/numerics
		String replaceAll5 = password.replaceAll("[^0-9]", "");
		System.out.println(replaceAll5);
	
		// [^a-zA-Z] --> Other than characters it will replace all the inputs
		String replaceAll6 = password.replaceAll("[^a-zA-Z]", "");
		System.out.println(replaceAll6);
		
		int int1 = Integer.parseInt(replaceAll5);
		System.out.println(int1);
		
		String companyName = "Testleaf"; // check for the occurance of t
		int count =0;
		for (int i = 0; i <companyName.length(); i++) {
			if(companyName.charAt(i)=='t') {
				count++;
			}
		}
		System.out.println("The occurance of t is "+ count);
		
		// convert to char[]
		count =0;
		char[] charArray = companyName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='t') {
				count++;
			}
		}
		System.out.println("The occurance of t is "+ count);
		
		
		String[] split = companyName.split("");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
	}

}
