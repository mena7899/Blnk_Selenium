package com.saucedemo.tests;

import org.testng.annotations.Test;


import org.testng.Assert;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ConfirmationPage;
import com.saucedemo.pages.DetailsPage;

import com.saucedemo.pages.windows.DateRangeWindow;


public class TestCases extends BaseTest{


	@Test(dataProvider = "searchData", dataProviderClass = com.saucedemo.utilities.ExcelDataProvider.class
			,    retryAnalyzer = com.saucedemo.utilities.RetryAnalyzer.class)
	public void CheckinAndCheckoutDate(String location,String checkin,String checkout) throws InterruptedException {
		homePage.setLocation(location);
		DateRangeWindow dateRangeWindow=homePage.openDatesWindow();
		dateRangeWindow.clickNextMonthButton();
		dateRangeWindow.clickCheckinDate(checkin);
		dateRangeWindow.clickCheckoutDate(checkout);
		homePage.clickSearchButton();
		DetailsPage detailsPage=homePage.clickTolipSeeAvailabilityButton();
		Assert.assertTrue(detailsPage.getCheckinDate().contains("Oct 1"));
		Assert.assertTrue(detailsPage.getCheckoutDate().contains("Oct 14"));
	}
	
	
	@Test
	public void boxHotleName()  {
		DetailsPage detailsPage= new DetailsPage();
		detailsPage.clickQueenBedButton();
		detailsPage.selectAmountByOrder(1);
		ConfirmationPage confirmationPage=detailsPage.clickReseveButton();
		Assert.assertEquals(confirmationPage.getBoxHotleName(),"Tolip Hotel Alexandria");
	}
	
}
