package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.components.TopHeader;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InvalidFillCheckoutFormTests extends BaseTest{




	@Test(priority=11)
	public void InvalidFillCheckoutFormTest() {

		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
		ProductsPage productsPage = new ProductsPage();
		String firstProdcutName = productsPage.getProductNames().get(0);
		System.out.println("First product name: " + firstProdcutName);
		productsPage.addProductToCart(firstProdcutName);
		String secondProdcutName = productsPage.getProductNames().get(1);
		System.out.println("Second product name: " + secondProdcutName);
		productsPage.addProductToCart(secondProdcutName);
		TopHeader topHeader = new TopHeader();
		topHeader.openCart();
		CartPage cartPage = new CartPage();
		cartPage.clickCheckout();
		CheckoutPage checkoutPage = new CheckoutPage();
		checkoutPage.clickContinue();
		boolean actual = checkoutPage.isErrorDisplayed();
		Assert.assertTrue(actual);


	}


}
