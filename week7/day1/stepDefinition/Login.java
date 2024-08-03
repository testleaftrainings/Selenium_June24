package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends ProjectSpecificMethod {
//public ChromeDriver driver;
	
	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("http://leaftaps.com/opentaps");
	}

	@Given("Enter the username as {string}")
	public void enter_the_username(String uname) {
	    driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password(String pwd) {
	    driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	   driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify the login is successful")
	public void verify_the_login_is_successful() {
//	    System.out.println(driver.getTitle());
		String text = driver.findElement(By.tagName("h2")).getText();
		if(text.contains("Leaftaps Login")) {
			System.out.println("Login is unsucessful");
		}else if(text.contains("Welcome")) {
			System.out.println("Login is sucessfull");
		}
	}
	
	@Then("Expected title is {string} and print the input as {string}")
	public void expected_title_is_and_print_the_input_as(String string, String string2) {
	   System.out.println("String is "+ string);
	   System.out.println("String2 is "+ string2);
	}

	
	
}
