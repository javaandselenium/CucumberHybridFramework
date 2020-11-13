package com.ShoppingApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BasePOMPage{
	
	@FindBy(id="search_query_top")
	private WebElement serachTb;
	
    @FindBy(name="submit_search")
	private WebElement serachBtn;
    
    public Login(WebDriver driver)
    {
    	super(driver);
    }
    
    public Product serachingProduct(String product) {
    	serachTb.sendKeys(product);
    	serachBtn.click();
    	return new Product(driver);
    }

	public WebElement getSerachTb() {
		return serachTb;
	}

	public WebElement getSerachBtn() {
		return serachBtn;
	}

}
