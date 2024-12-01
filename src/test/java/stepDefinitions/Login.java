package stepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	@Given("Navigate to the Skillrary application")
	public void navigate_to_the_skillrary_application() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	}

	@When("i enter valid data")
	public void i_enter_valid_data() {
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		
		
	    
	}

	@And("click on the login")
	public void click_on_the_login() {
		driver.findElement(By.xpath("//button[@class=\"login_Btn\"]")).click();

	}

	@Then("Home Page is displays")
	public void home_page_is_displays() {
WebElement login=driver.findElement(By.xpath("//span[text()=\"SkillRary Admin\"]"));
if(login.isDisplayed())
	System.out.println("test is passed");
else
	System.out.println("test is failed");
driver.quit();
	    
	}


}
