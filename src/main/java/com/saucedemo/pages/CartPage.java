
package com.saucedemo.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.saucedemo.base.BasePage2;

public class CartPage extends BasePage2 {

	// Elements
	private By pageTitle = By.className("title");

	private By cartItems =
			By.className("cart_item");

	private By productNames =
			By.className("inventory_item_name");

	private By productPrices =
			By.className("inventory_item_price");

	private By removeButtons =
			By.xpath("//button[contains(@id,'remove')]");

	private By continueShoppingButton =
			By.id("continue-shopping");


	private By checkoutButton =
			By.id("checkout");


	// Remove product by name
	public void removeProduct(String productName) {

		By removeButton = By.xpath(
				"//div[text()='" + productName +
						"']/ancestor::div[@class='cart_item']//button"
		);

		click(removeButton);
	}

	// Get cart products
	public List<String> getCartProductNames() {

		List<String> names = new ArrayList<>();

		for (WebElement element : findList(productNames)) {
			names.add(element.getText());
		}

		return names;
	}

	public List<String> getCartProductPrices() {

		List<String> prices = new ArrayList<>();

		for (WebElement element : findList(productPrices)) {
			prices.add(element.getText());
		}

		return prices;
	}

	public int getCartItemsCount() {
		return findList(cartItems).size();
	}

	// Navigation
	public void clickContinueShopping() {
		click(continueShoppingButton);
	}



	// Validation
	public boolean isCartPageDisplayed() {
		return isElementVisible(pageTitle);
	}

	public String getPageTitle() {
		return find(pageTitle).getText();
	}

	public boolean isCartEmpty() {

		//findList(cartItems).isEmpty();
		return driver.findElements(cartItems).isEmpty();
	}

	public void clickCheckout() {
		click(checkoutButton);
	}
}
