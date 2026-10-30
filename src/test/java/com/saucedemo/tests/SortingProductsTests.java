package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SortingProductsTests extends BaseTest{


	@Test(priority=3)
	public void SortingProductsTest() {

		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
		ProductsPage productsPage = new ProductsPage();
		String firstProdcutBeforeSorting = productsPage.getProductNames().get(0);
		System.out.println("First product name: " + firstProdcutBeforeSorting);
		productsPage.sortProducts("za");
		String secondProdcutBeforeSorting = productsPage.getProductNames().get(0);
		System.out.println("First product name after sorting: " + secondProdcutBeforeSorting);
		Assert.assertNotEquals(firstProdcutBeforeSorting, secondProdcutBeforeSorting);


	}


}
