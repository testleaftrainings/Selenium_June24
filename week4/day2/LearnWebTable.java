package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[1]/thead/tr/th"));
		/*for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
		}*/
		
		
		for(int i=1;i<=elements.size();i++ ) {
		String text = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[1]/thead[1]/tr[1]/th["+i+"]")).getText();
		System.out.println(text);
		}
		
		String firstRepName = driver.findElement(By.xpath("(//table)[6]/tbody/tr[1]/td[3]")).getText();
		System.out.println(firstRepName);
		
		
		int rowCount = driver.findElements(By.xpath("(//table)[6]/tbody/tr")).size();
		for(int i=1; i<=rowCount; i++) {
			String text = driver.findElement(By.xpath("(//table)[6]/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println(text);
		}
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=1; j<=elements.size(); j++) {
				String text = driver.findElement(By.xpath("(//table)[6]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("index "+i+" , "+j+" is "+text);
				
			}
		}
		
		
	}
	
	
}
