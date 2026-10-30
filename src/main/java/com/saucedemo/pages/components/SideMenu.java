package com.saucedemo.pages.components;

import org.openqa.selenium.By;

import com.saucedemo.base.BasePage2;

public class SideMenu extends BasePage2 {

	// Elements


	private By logoutButton = By.id("logout_sidebar_link");

	private By resetAppStateButton =
			By.id("reset_sidebar_link");

	private By closeMenuButton =
			By.id("react-burger-cross-btn");

	// Actions


	public void clicklogout() {
		click(logoutButton);
	}

	public void closeMenu() {
		click(closeMenuButton);
	}

	public void resetAppState() {
		click(resetAppStateButton);
	}

	// Validation
	public boolean isLogoutDisplayed() {
		return isElementVisible(logoutButton);
	}
}

