package stepDefinition;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	WebDriver driver;
	HomePage home;
	
	@Given("^User is in the GreenKart landing page$")
    public void user_is_in_the_greenkart_landing_page() throws Throwable {
		driver=Base.getDriver();
		System.out.println("Browser is invoked");
		System.out.println("Browser is invoked");
		System.out.println("Browser is invoked");
		System.out.println("Browser is invoked");
        Thread.sleep(3000);
    }

    @When("^User searched for \"([^\"]*)\" vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
        home = new HomePage(driver);
        home.getSearch().sendKeys(strArg1);
        Thread.sleep(3000);
    }

    @When("^User searched for (.+) vegetables$")
    public void user_searched_for_vegetables(String name) throws Throwable {
    	home = new HomePage(driver);
        home.getSearch().sendKeys(name);
        Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	Assert.assertTrue(home.getSearchText().getText().contains(strArg1));
    }
    
    @Then("^(.+) vegetable result is displayed$")
    public void results_are_displayed(String name) throws Throwable {  	
    	Assert.assertTrue(home.getSearch().getText().contains(name));
    	System.out.println(name);
    }
    
//    @Then("^verify selected \"([^\"]*)\" items are displayed in the checkout page$")
//    public void verify_selected_something_items_are_displayed_in_the_checkout_page(String strArg1) throws Throwable {
//       Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
//    }

    @And("^Added items to the cart$")
    public void added_items_to_the_cart() throws Throwable {
    	home.IncrementButton().click();
    	Thread.sleep(3000);
        home.AddToCartButton().click();
        Thread.sleep(3000);
    }

    @And("^Proceed to checkout page for purchase$")
    public void proceed_to_checkout_page_for_purchase() throws Throwable {
    	home.cartBasketIcon().click();
        home.ProceedToCheckoutButton().click();
    }

}
