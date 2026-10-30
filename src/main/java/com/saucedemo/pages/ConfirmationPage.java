package com.saucedemo.pages;

import com.saucedemo.base.BasePage2;
import org.openqa.selenium.By;

import com.saucedemo.base.BasePage;

public class ConfirmationPage extends BasePage2 {
	
	private By box_hotle_name= By.cssSelector("div[data-capla-component-boundary*='b-checkout-bp-accommodation/PropertyDetails'] h1");
	
	public String getBoxHotleName() {
		
		return find(box_hotle_name).getText();
	}

}
