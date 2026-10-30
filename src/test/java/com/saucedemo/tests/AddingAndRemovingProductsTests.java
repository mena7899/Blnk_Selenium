package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddingAndRemovingProductsTests extends BaseTest{


	@Test(priority=5)
	public void AddingProductTest() {

		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
		ProductsPage productsPage = new ProductsPage();
		String prodcutName = productsPage.getProductNames().get(0);
		System.out.println("First product name: " + prodcutName);
		productsPage.addProductToCart(prodcutName);
		String productStatus = productsPage.getProductButtonText(prodcutName);
		System.out.println("Product status is: " + productStatus);
		Assert.assertEquals(productStatus, "Remove");

	}

	@Test(priority=6)
	public void RemovingProductTest() {

		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
		ProductsPage productsPage = new ProductsPage();
		String prodcutName = productsPage.getProductNames().get(0);
		System.out.println("First product name: " + prodcutName);
		productsPage.addProductToCart(prodcutName);
		productsPage.removeProductFromProductsPage(prodcutName);
		String productStatus = productsPage.getProductButtonText(prodcutName);
		System.out.println("Product status is: " + productStatus);
		Assert.assertEquals(productStatus, "Add to cart");

	}



}
