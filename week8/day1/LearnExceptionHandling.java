package week8.day1;

public class LearnExceptionHandling {

	
	public static void main(String[] args) {
		
		
		try {
			String x = "123$@";
			try {
				int int1 = Integer.parseInt(x);
				System.out.println(int1);
			} catch (StringIndexOutOfBoundsException e) {
				int int1 = Integer.parseInt(x.replaceAll("[^0-9]", ""));
				System.out.println(int1);
			}
			
			System.out.println(1/0);
			System.out.println(1/2);
		} catch(ArithmeticException e) {
			System.out.println("Arthimetic Exception occurs check the value");
		}catch (Exception e) {
			System.out.println("Welcome");
		}
	
		System.out.println("-------------");
		
		
		try {
			System.out.println("Start the DB");
			
			throw new RuntimeException();
		}catch(Exception e) {
			System.out.println("Run time exception occurs");
		}finally {
			System.out.println("Close the DB");
		}
		
	}
	
	
}
