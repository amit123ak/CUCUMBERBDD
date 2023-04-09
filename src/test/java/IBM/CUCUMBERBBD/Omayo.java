package IBM.CUCUMBERBBD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class Omayo {
	WebDriver driver;
	   @Given("^I want to navigate to the login page$")
	    public void _i_want_to_navigate_to_the_login_page(){
		   WebDriverManager.chromedriver().setup();
		    driver =new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://omayo.blogspot.com/");
	        
	        
	    }
	   @When("^I  Enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	    public void _i_enter_the_username_as_and_password_as(String someuser, String somepassword){
	     driver.findElement(By.name("userid")).sendKeys(someuser);  
	     driver.findElement(By.name("pswrd")).sendKeys(somepassword);
	     
	    }
	   @And("^click on the Login button$")
	    public void _click_on_the_login_button()  {
		   driver.findElement(By.xpath("//input[@value='Login']")).click();
	        
	    }

	    @Then("^User should be able to login based on \"([^\"]*)\" login status$")
	    public void _user_should_be_able_to_login_based_on_login_status(String expected){
	    	String expectedstatus=expected;
	    	String actualstatus=null; 
	    	try {
	    		Alert alert = driver.switchTo().alert();
				String actualText = alert.getText();
	    	
			if(actualText.contains("Error Password or Username"))
	    	  {
	    	 actualstatus = "failure";
	    	  }else {
	    		 actualstatus = "success";
	    	    }
	    	 }
	    	catch(Exception e)
	    	 {
	    		 actualstatus = "success"; 
	    	 }
	    	
	    	if(actualstatus.equals(expectedstatus))
	    	{
	    		System.out.println("hello");
	    	}else 
	    	{
	    	Assert.fail("actual login status is not equal to expected login status");
	    	}
	    	driver.quit();
	    }
}
