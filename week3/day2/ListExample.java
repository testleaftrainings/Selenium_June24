package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListExample {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> hyperLinks = driver.findElements(By.tagName("a"));
		System.out.println(hyperLinks.size());
		
		for (int i = 0; i <hyperLinks.size(); i++) {
			String linkText = hyperLinks.get(i).getText();
			System.out.println(linkText);
		}
	}
	
}
