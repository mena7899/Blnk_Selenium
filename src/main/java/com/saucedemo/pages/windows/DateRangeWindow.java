package com.saucedemo.pages.windows;

import com.saucedemo.base.BasePage2;
import org.openqa.selenium.By;

import com.saucedemo.base.BasePage;
import com.saucedemo.utilities.JavaScriptUtility;

public class DateRangeWindow extends BasePage2 {
	
	private By next_month_button = By.cssSelector("button[aria-label='Next month']");
	
	
	public void clickNextMonthButton() {
		JavaScriptUtility.clickJS(next_month_button);
		
	}
	
	public void clickCheckinDate(String date){
		String xpathExpression = String.format("span[data-date='%s']", date);
		JavaScriptUtility.clickJS(By.cssSelector(xpathExpression));
	}
	
	public void clickCheckoutDate(String date){
		String xpathExpression = String.format("span[data-date='%s']", date);
		JavaScriptUtility.clickJS(By.cssSelector(xpathExpression));
	}

}
