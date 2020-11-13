package com.ShoppingApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductCart extends BasePOMPage {
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusBtn;
	
	@FindBy(id="group_1")
	private WebElement sizedd;
	
	@FindBy(name="Orange")
	private WebElement color;
	
	
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement addtocart;


	public WebElement getSizedd() {
		return sizedd;
	}


	public WebElement getPlusBtn() {
		return plusBtn;
	}


	public WebElement getColor() {
		return color;
	}


	public WebElement getAddtocart() {
		return addtocart;
	}
	
	public AddProductCart(WebDriver driver) {
		super(driver);
	}
	
	public void addingCart() {
		color.click();
		addtocart.click();
	}
	

}
