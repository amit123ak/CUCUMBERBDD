package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	
	@Before
	public void OpenBrower()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	  @Given("^I navigate to application login page$")
	    public void i_navigate_to_application_login_page()  {
	       driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	    }

	    @When("^I entered the email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	    public void i_entered_the_email_as_something_and_password_as_something(String strArg1, String strArg2) {
	      driver.findElement(By.id("input-email")).sendKeys(strArg1);
	      driver.findElement(By.id("input-password")).sendKeys(strArg2);
	    }
	    @And("^I click on the login button$")
	    public void i_click_on_the_login_button()  {
	    	driver.findElement(By.xpath("//*[@value='Login']")).click();
	    	
	   
	    }
	    
	    @Then("^User should able to login$")
	    public void user_should_able_to_login()  {
	    	
	    	WebElement account=null;
	    	try {
	    	account= driver.findElement(By.xpath("//ul[@class='breadcrumb']//li[1]"));
	    	}catch(Exception e)
	    	
	    	{
	    	 System.out.println("login failed");	
	    	}
	        
	    	Assert.assertNotNull("login has been failed ", account);
	    }
	    
	    @After("@ninja")
	    public void teardown()
	    {
	    	driver.close();
	    }
	    
	  

}
