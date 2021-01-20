package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By search = By.xpath("//input[@type='search']");
	By textSearch = By.xpath("//h4[contains(text(),'Cucumber')]");
	By increment = By.cssSelector("a.increment");
	By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By cartBasket = By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");
	By ProceedToCheckout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public WebElement getSearch(){
		return driver.findElement(search);
	}
	
	
	public WebElement getSearchText(){
		return driver.findElement(textSearch);
	}
	
	public WebElement IncrementButton(){
		return driver.findElement(increment);
	}
	
	public WebElement AddToCartButton(){
		return driver.findElement(addToCart);
	}
	
	public WebElement cartBasketIcon(){
		return driver.findElement(cartBasket);
	}
	
	public WebElement ProceedToCheckoutButton(){
		return driver.findElement(ProceedToCheckout);
	}
}
