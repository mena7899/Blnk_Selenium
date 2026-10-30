package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.components.SideMenu;
import com.saucedemo.pages.components.TopHeader;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogoutTests extends BaseTest{



	@Test(priority=999)
	public void logoutTest() {

		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
		TopHeader topHeader = new TopHeader();
		topHeader.clickOpenMenu();
		SideMenu sideMenu = new SideMenu();
		sideMenu.clicklogout();
		boolean actual= loginPage.isLogoDisplayed();
		Assert.assertTrue(actual);

	}


	
}
