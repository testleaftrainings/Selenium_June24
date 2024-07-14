package week4.day2;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		ChromeOptions option  = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		/*
		driver.get("https://www.myntra.com/");
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		
//		men.click();
		
		
		action.moveToElement(men).perform();
		
		*/
		/*
		driver.get("https://leafground.com/button.xhtml");;
		WebElement successBtn = driver.findElement(By.xpath("//span[text()='Success']"));
		action.moveToElement(successBtn).perform();
		*/
		
		/*
		driver.get("https://leafground.com/drag.xhtml");
		WebElement dragWE = driver.findElement(By.id("form:conpnl"));
		action.dragAndDropBy(dragWE, 1000, 0).perform();
		action.dragAndDropBy(dragWE, -250, 0).perform();
		
		action.dragAndDropBy(dragWE, 500, 0).pause(5000).dragAndDropBy(dragWE, -250, 0).perform();
		
		WebElement draggableWE = driver.findElement(By.id("form:drag_content"));
		WebElement droppableWE = driver.findElement(By.id("form:drop"));
		action.dragAndDrop(draggableWE, droppableWE).perform();
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		action.clickAndHold(logo).moveByOffset(100, 0).perform();
		*/
		
		
		/*driver.get("https://leafground.com/menu.xhtml");
		WebElement ordersWE = driver.findElement(By.xpath("//span[text()='Orders']"));
		action.contextClick(ordersWE).perform();
		*/
		
		/*
		driver.get("https://www.snapdeal.com/");
		WebElement snapDealLogo = driver.findElement(By.className("notIeLogoHeader"));
//		action.contextClick(snapDealLogo).keyDown(Keys.ARROW_RIGHT).keyUp(Keys.ARROW_RIGHT).keyDown(Keys.DOWN).keyUp(Keys.DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		action.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).perform();
		
		
		
		
		WebElement paymentWE = driver.findElement(By.xpath("//p[text()='Payment']"));
		action.scrollToElement(paymentWE).perform();
		
		driver.get("https://leafground.com/button.xhtml");
		WebElement clickWE = driver.findElement(By.xpath("//span[text()='Click']"));
		action.contextClick(clickWE).pause(5000).keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
		*/
		
		
		
	}
	
}
