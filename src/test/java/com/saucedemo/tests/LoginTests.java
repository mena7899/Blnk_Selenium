package com.saucedemo.tests;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.components.SideMenu;
import com.saucedemo.pages.components.TopHeader;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.saucedemo.base.BaseTest;


public class LoginTests extends BaseTest{


	@Test(priority=2)
	public void validLoginTest() {

		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
		ProductsPage productsPage = new ProductsPage();
		boolean actual= productsPage.isProductsPageDisplayed();
		Assert.assertTrue(actual);

	}

	@Test(priority=1)
	public void invalidLoginTest() {

		loginPage.enterUsername("locked_out_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
		loginPage.isErrorMessageDisplayed();
		boolean actual= loginPage.isErrorMessageDisplayed();
		Assert.assertTrue(actual);

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
