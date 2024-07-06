package week3.day1;

public class Browser {
	
	boolean developerMenu = false;
	
	public void refresh() {
		System.out.println("Refresh the webpage");
	}
	
	public void loadUrl() {
		System.out.println("Load the given url");
	}
	
	
	public void maximizeWindow() {
		System.out.println("Maximize the window");
	}
	
	public void navigateBack() {
		System.out.println("Navigate back to the previous webpage");
	}
	
	
	public static void main(String[] args) {
		Browser b = new Browser();
		b.loadUrl();
		b.maximizeWindow();
		b.refresh();
		b.navigateBack();
		
	}
	
}
