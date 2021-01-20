package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import Cucumber.Automation.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class StepDefinition extends Base{
	
	 @Then("^verify selected \"([^\"]*)\" items are displayed in the checkout page$")
	 public void verify_selected_something_items_are_displayed_in_the_checkout_page(String strArg1) throws Throwable {
      Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
   }
	 
	
	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Deciding the browser to open");
    }

	@When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered");
    }

    @Then("^Check if browser has started$")
    public void check_if_browser_has_started() throws Throwable {
        System.out.println("Browser is started");
    }
	
	@Given("^User is on NetBanking login page$")
	public void user_is_on_netBanking_login_page(){
		System.out.println("NetBanking login");
	}
	
	@When("^User login to application with username and password$")
	public void user_login_to_application_with_username_and_password (){
		System.out.println("Username and password entry");
	}
	
    @When("^User login to application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    List<List<String>> obj = data.asLists();
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(0).get(3));
    System.out.println(obj.get(0).get(4));
    System.out.println(obj.get(0).get(5));
    }
	
    @When("^User log in to application with (.+) and (.+)$")
    public void user_login_to_application_with_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }
    
	@Then("^Home page is populated$")
	public void home_page_is_populated(){
		System.out.println("Home page displayed");
		
	}
	
	 @And("^Cards displayed \"([^\"]*)\"$")
	    public void cards_displayed_something(String strArg1) throws Throwable {
	        System.out.println(strArg1);
	    }
	 
  

}
