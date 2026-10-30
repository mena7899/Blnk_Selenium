package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SortingTests extends BaseTest{


	@Test(priority=4)
	public void validLoginTest() {

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





//
//	@Test(dataProvider = "searchData", dataProviderClass = com.saucedemo.utilities.ExcelDataProvider.class
//			,    retryAnalyzer = com.saucedemo.utilities.RetryAnalyzer.class)
//	public void CheckinAndCheckoutDate(String location,String checkin,String checkout) throws InterruptedException {
//		homePage.setLocation(location);
//		SideMenu dateRangeWindow=homePage.openDatesWindow();
//		dateRangeWindow.clickNextMonthButton();
//		dateRangeWindow.clickCheckinDate(checkin);
//		dateRangeWindow.clickCheckoutDate(checkout);
//		homePage.clickSearchButton();
//		CartPage detailsPage=homePage.clickTolipSeeAvailabilityButton();
//		Assert.assertTrue(detailsPage.getCheckinDate().contains("Oct 1"));
//		Assert.assertTrue(detailsPage.getCheckoutDate().contains("Oct 14"));
//	}
//
//
//	@Test
//	public void boxHotleName()  {
//		CartPage detailsPage= new CartPage();
//		detailsPage.clickQueenBedButton();
//		detailsPage.selectAmountByOrder(1);
//		CheckoutPage confirmationPage=detailsPage.clickReseveButton();
//		Assert.assertEquals(confirmationPage.getBoxHotleName(),"Tolip Hotel Alexandria");
//	}
	
}
