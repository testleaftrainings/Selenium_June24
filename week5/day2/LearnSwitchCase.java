package week5.day2;

public class LearnSwitchCase {

	
	public static void main(String[] args) {
		
		String browser = "chrome";
		
		switch(browser) {
		
		case "chrome":
			System.out.println("Launch chrome browser");
			break;
		case "edge":
			System.out.println("Launch Edge browser");
			break;
		case "ie":
			System.out.println("Launch Internet Explorer browser");
			break;
		case "safari": 
			System.out.println("Launch Safari Browser");
			break;
		default :
			System.out.println("Check the browser input ");
		
		
		
		
		}
		
		int num = 1;
		switch (num) {
		case 1:
			System.out.println("The number is one");
			break;

		default:
			break;
		}
		
	}
	
}
