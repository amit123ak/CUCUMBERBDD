package IBM.CUCUMBERBBD;

//import cucumber.api.java.en.And;
//import io.cucumber.java.en.*;
//import cucumber.api.java.en.*;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.cucumber.java.en.And.Ands;
//import io.cucumber.java.nl.Gegeven;

import io.cucumber.java.en.*;

public class Search {
	

    @Given("^i visit website as a guest user$")
    public void i_visit_website_as_a_guest_user()  {
    	System.out.println(">> Given - I visit the website as a guest user");

       
    }

  
    @When("^i select book option from drop down$")
    public void i_select_book_option_from_drop_down()  {
    	System.out.println(">>When - I select the books option from the dropdown");

       
    }

    @And("^i click on search icon$")
    public void i_click_on_search_icon() {
    	System.out.println(">>Then - I should see the books page loaded");

       
    }


    @Then("^i should see book pages is loaded$")
    public void i_should_see_book_pages_is_loaded(){
    	System.out.println(">>Then - i should see book pages is loaded");

     
    }

  


    @And("^i should see book at Amezon as heading$")
    public void i_should_see_book_at_amezon_as_heading()  {
    	System.out.println(">>And - I should see Books at Amazon as heading");

       
    }



    @But("^i should not see other product$")
    public void i_should_not_see_other_product()  {
    	System.out.println(">>But - I should not see other category products");

        
    }
   
    @Given("^I visit the website as a guest user$")
    public void i_visit_the_website_as_a_guest_user()  {
    	System.out.println(">>Given - I visit the website as a guest user");
        
    }
    @When("^I select the Baby option from the dropdown$")
    public void i_select_the_baby_option_from_the_dropdown()  {
    	System.out.println(">>When - I select the Baby option from the dropdown");
        
    }
    @And("^I click on Search icon button$")
    public void i_click_on_search_icon_button()  {
    	System.out.println(">>And -  I click on Search icon Button");
        
    }

    @Then("^I should see the Baby page loaded$")
    public void i_should_see_the_baby_page_loaded() {
    	System.out.println(">>Then -  should see the Baby page loaded");
  
    }

  

    @And("^I should see The baby store as heading$")
    public void i_should_see_the_baby_store_as_heading()  {
    	System.out.println(">>And -  I should see The baby store as heading");
        
    }

    @But("^I should not see other category products$")
    public void i_should_not_see_other_category_products() {
    	System.out.println(">>But -  I should not see other category products");
       
    }





}
