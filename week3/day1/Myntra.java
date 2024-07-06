package week3.day1;

public class Myntra {

	
	public void search(String product) {
		System.out.println("I'm looking for "+product);
	}
	
	
	
	public void filter(String gender) {
		System.out.println("The product will display for "+gender);
	}
	
	public void filter(String gender, String categories) {
		System.out.println("The product will display for "+gender+" and the categories is "+ categories);
	}
	
	public void filter(String gender, String brands, String color) {
		System.out.println("The product will display for "+gender+" and the brand is "+ brands+" and the color is "+color);
	}
	
	public void filter(String brands , int price) {
		System.out.println("The product with the brands "+ brands+" and the price range is "+ price );
	}
	
	public static void main(String[] args) {
		Myntra my = new Myntra();
		my.filter("Indian Terrian",5000);
		my.filter("Men","Shirt" );
	}
	
}
