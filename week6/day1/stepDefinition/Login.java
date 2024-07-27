package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
public ChromeDriver driver;
	
	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("http://leaftaps.com/opentaps");
	}

	@Given("Enter the username")
	public void enter_the_username() {
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}

	@Given("Enter the password")
	public void enter_the_password() {
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	   driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify the login is successful")
	public void verify_the_login_is_successful() {
	    System.out.println(driver.getTitle());
	}
	
	
	
}
