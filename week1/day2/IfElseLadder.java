package week1.day2;

public class IfElseLadder {

	public static void main(String[] args) {
		// marks> 90 --> play station, marks>80 --> bicycle,
			//marks> 70 -->watch, marks>50 --> ice cream, less or equal 50 -> nothing
		int marks =90;
		if(marks>90) {
			System.out.println("Play station");
		}else if(marks>80) {
			System.out.println("Bicycle");
		}else if(marks>70) {
			System.out.println("Watch");
		}else if(marks>50) {
			System.out.println("Ice cream");
		}else if(marks<=50) {
			System.out.println("Nothing");
		}
	}
	
}
