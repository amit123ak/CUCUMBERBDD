package IBM.CUCUMBERBBD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SoftwareTester {
	
	  @Given("^I am \"([a-zA-Z]{1,})\" software Tester$")
	    public void i_am_good_software_tester(String TesterType) {
		  System.out.println("Given >> I am " +TesterType +" "+"software Tester");
	        
	    }
	  
	  @When("^I go to work$")
	    public void i_go_to_work(){
		  System.out.println(">>When - I go to work");
	       
	    }

	    @And("^I \"([a-zA-Z]{1,})\" with it$")
	    public void i_invlove_with_it(String worktype)  {
	    	 System.out.println(">>And - i " +worktype+" "+"with it");
	     
	    }
	    

	    @Then("^My boss \"([a-zA-Z]{1,})\" me$")
	    public void my_boss_love_me(String appriciation){
	   	 System.out.println(">>Then - My " +appriciation+" "+"me");
	        
	    }

}
