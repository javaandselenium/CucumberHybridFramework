package com.ShoppingApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePOMPage {
	public WebDriver driver;
	
	
	public BasePOMPage(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	this.driver=driver;
	}

}
