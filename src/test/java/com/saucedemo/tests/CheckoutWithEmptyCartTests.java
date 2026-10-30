package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.components.TopHeader;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckoutWithEmptyCartTests extends BaseTest{




	@Test(priority=12)
	public void CheckoutWithEmptyCartTest() {

		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
		ProductsPage productsPage = new ProductsPage();
		TopHeader topHeader = new TopHeader();
		topHeader.openCart();
		CartPage cartPage = new CartPage();
		cartPage.clickCheckout();
		CheckoutPage checkoutPage = new CheckoutPage();
		checkoutPage.fillCheckoutForm("test","test","test");
		checkoutPage.clickContinue();
		checkoutPage.clickFinish();
		boolean actual = checkoutPage.isCheckoutComplete();
		Assert.assertTrue(actual);


	}


}
