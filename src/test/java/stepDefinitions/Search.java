package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {
	WebDriver driver;
	@Given("user navigates and logins to the application")
	public void user_navigates_and_logins_to_the_application() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/user-signin");
		}

//	@Given("search the prodcut")
//	public void search_the_prodcut() throws InterruptedException {
//	    driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("mobiles");
//	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("//*[local-name()='svg'][@id=\"searchBtn\"]")).click();
	//}

	@When("valid details is entered")
	public void valid_details_is_entered() {
	   driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("dullashirisha97@gmail.com");
	   //driver.findElement(By.xpath(By.xpath("//input[@name=\"Password\"]"))).sendKeys("Shirisha446@");
	   driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("Shirisha446@");
	}

	@When("hits on the login")
	public void hits_on_the_login() {
	    driver.findElement(By.xpath("//button[@name=\"Login\"]")).click();
	}

	@Then("products is displays")
	public void products_is_displays() {
		WebElement a=driver.findElement(By.xpath("//a[@class=\"active\"]"));
		if(a.isDisplayed()) 
			System.out.println("is passed");
		
			else 
				System.out.println("is not passed");
			
			
		
	    
	}

}
