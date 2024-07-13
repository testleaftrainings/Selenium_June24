package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;");
		driver.manage().window().maximize();
		
		//Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//Syntax to handle Alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//Confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Gokul");
		alert.accept();
		
		
		//Non - Modal Alert(Sweet Alert)
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String sweetAlertTxt = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
		System.out.println(sweetAlertTxt);
//		alert.accept(); Not possible to handle sweet alert by using alert methods()
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		
	}
}
