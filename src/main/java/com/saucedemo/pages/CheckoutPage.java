
package com.saucedemo.pages;

import org.openqa.selenium.By;

import com.saucedemo.base.BasePage2;

public class CheckoutPage extends BasePage2 {

	// Checkout Information Elements
	private By firstNameField = By.id("first-name");
	private By lastNameField = By.id("last-name");
	private By postalCodeField = By.id("postal-code");

	private By continueButton = By.id("continue");
	private By cancelButton = By.id("cancel");

	private By errorMessage =
			By.cssSelector("[data-test='error']");

	// Checkout Overview Elements
	private By finishButton = By.id("finish");

	private By itemTotal = By.className("summary_subtotal_label");
	private By tax = By.className("summary_tax_label");
	private By total = By.className("summary_total_label");

	// Checkout Complete Elements
	private By completeHeader =
			By.className("complete-header");

	private By backHomeButton = By.id("back-to-products");

	private By pageTitle = By.className("title");

	// Fill Checkout Form
	public void enterFirstName(String firstName) {
		set(firstNameField, firstName);
	}

	public void enterLastName(String lastName) {
		set(lastNameField, lastName);
	}

	public void enterPostalCode(String postalCode) {
		set(postalCodeField, postalCode);
	}

	public void fillCheckoutForm(
			String firstName,
			String lastName,
			String postalCode) {

		enterFirstName(firstName);
		enterLastName(lastName);
		enterPostalCode(postalCode);
	}

	// Buttons
	public void clickContinue() {
		click(continueButton);
	}

	public void clickCancel() {
		click(cancelButton);
	}

	public void clickFinish() {
		click(finishButton);
	}

	public void clickBackHome() {
		click(backHomeButton);
	}

	// Error Message
	public String getErrorMessage() {
		return find(errorMessage).getText();
	}

	public boolean isErrorDisplayed() {
		return isElementVisible(errorMessage);
	}

	// Overview
	public String getItemTotal() {
		return find(itemTotal).getText();
	}

	public String getTax() {
		return find(tax).getText();
	}

	public String getTotal() {
		return find(total).getText();
	}

	// Complete Order
	public String getCompleteHeader() {
		return find(completeHeader).getText();
	}

	// Validation
	public boolean isContinueButtonDisplayed() {
		return isElementVisible(continueButton);
	}

	public boolean isFinishButtonDisplayed() {
		return isElementVisible(finishButton);
	}

	public boolean isCheckoutComplete() {
		return isElementVisible(completeHeader);
	}
}
