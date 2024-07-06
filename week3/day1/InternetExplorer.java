package week3.day1;

public class InternetExplorer extends Browser{

	public void defaultBrowser() {
		System.out.println("Default browser for windows 7/ xp");
	} 
	
	public static void main(String[] args) {
		
		InternetExplorer ie = new InternetExplorer();
		ie.defaultBrowser();
		ie.refresh();
		ie.navigateBack();
		ie.loadUrl();
		ie.maximizeWindow();
//		ie.developerMenu = true;
		System.out.println(ie.developerMenu);
		
	}
	
}
