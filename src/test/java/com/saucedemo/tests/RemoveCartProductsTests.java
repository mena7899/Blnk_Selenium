package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.components.TopHeader;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RemoveCartProductsTests extends BaseTest{




	@Test(priority=8)
	public void removeCartProductsTest() {

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
		String firstCartProdcutName = cartPage.getCartProductNames().get(0);
		System.out.println("First cart product name: " + firstCartProdcutName);
		String secondCartProdcutName = cartPage.getCartProductNames().get(1);
		System.out.println("Second cart product name: " + secondCartProdcutName);
		cartPage.removeProduct(firstProdcutName);
		cartPage.removeProduct(secondProdcutName);
		boolean actual =cartPage.isCartEmpty();
		Assert.assertTrue(actual);


	}


}
