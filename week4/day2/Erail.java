package week4.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS"+Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU"+Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		int rowCount = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr")).size();
		
		Set<String> trainNames = new LinkedHashSet<String>();
		for (int i = 2; i <=rowCount ; i++) {
			String trainName = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr["+i+"]/td[2]")).getText();
			trainNames.add(trainName);
		}
		System.out.println(trainNames);
		if((rowCount-1)==trainNames.size()) {
			System.out.println("There is no duplicate train");
		}else {
			System.out.println("There is duplicate train");
		}
		driver.close();
	}
	
}
