package com.ShoppingApp.Genericlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilies {
	
	public static void dropdown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	
	}

}
