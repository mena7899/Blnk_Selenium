package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.components.SideMenu;
import com.saucedemo.pages.components.TopHeader;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogoutTests extends BaseTest{



	@Test(priority=3)
	public void logoutTest() {

//		loginPage.reloadPage();
//		loginPage.clickUernameField();
//		System.out.println("+++++++++++");
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
