package com.ShoppingApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product extends BasePOMPage {
	
	
	@FindBy(id="selectProductSort")
	private WebElement sortdd;
	
	@FindBy(xpath="(//a[@title='Printed Summer Dress'])[4]")
	private WebElement dress;

	public WebElement getSortdd() {
		return sortdd;
	}

	public WebElement getDress() {
		return dress;
	}
	
	public Product(WebDriver driver)
	{
		
		super(driver);
	}
	
	public AddProductCart selectDress()
	{
		dress.click();
		return new AddProductCart(driver);
	}

}
