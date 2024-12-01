package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopperLOgin {
	WebDriver driver;
	@Given("Navigate To The Application With application website")
	public void navigate_to_the_application_with_application_website() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		}
	@When("valid data is entered")
	public void valid_data_is_entered_and_clicks_on_login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("dullashirisha97@gmail.com");
		//driver.findElement(By.id("Email")).sendKeys("dullashirisha97@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Shirisha446@");	    
	}

	@And("clicks on login")
	public void clicks_on_login() {
		driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();
	}
	
	@Then("Home Page displays")
	public void home_page_displays() throws InterruptedException {
		Thread.sleep(2000);
		
		 WebElement a=driver.findElement(By.xpath("//a[text()='Home']"));
		 if(a.isDisplayed())
			 System.out.println("home page is displayed:"+"and the testcase is passed");
		 else
			 System.out.println("home page is not displayed"+"and the testcase is not passed");
	   
	}
	}
