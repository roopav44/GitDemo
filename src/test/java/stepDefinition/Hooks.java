package stepDefinition;

import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	
	@After("@SeleniumTest2")
	public void afterSeleniumTest(){
		driver.close();
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Before("@WebTest")
//	public void beforeValidation(){
//		System.out.println("Before WebTest executed");
//	}
//	
//	@After("@WebTest")
//	public void afterValidation(){
//		System.out.println("After WebTest executed");
//	}
//	
//	@Before("@MobileTest")
//	public void beforeMobileValidation(){
//		System.out.println("Before MoileTest executed");
//	}
//	
//	@After("@MobileTest")
//	public void afterMobileValidation(){
//		System.out.println("After MoileTest executed");
//	}


