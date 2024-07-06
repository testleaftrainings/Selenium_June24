package week3.day1;

public class Flipkart extends PaymentGateway {

	public void addToCart(String productName) {
		System.out.println("Add the product "+productName+" to the cart");
	}
	
	public void pay() {
		System.out.println("Make the payment through UPI");
	}
	
	public void pay(String paymentOption) {
		System.out.println("Make the payment through "+paymentOption);
	}
	
	public static void main(String[] args) {
		Flipkart flip = new Flipkart();
		flip.addToCart("Iphone 15 ");
		flip.pay();
		
	}
	
	
	
}
