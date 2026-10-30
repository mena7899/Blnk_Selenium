
package com.saucedemo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.saucedemo.base.BasePage2;

public class ProductsPage extends BasePage2 {

	// Elements
	private By pageTitle = By.className("title");
	private By sortDropdown = By.className("product_sort_container");

	private By productNames = By.className("inventory_item_name");
	private By productPrices = By.className("inventory_item_price");

	private By addToCartButtons =
			By.xpath("//button[contains(@id,'add-to-cart')]");

	private By removeButtons =
			By.xpath("//button[contains(@id,'remove')]");



	// Sorting
	// Options:
	// az, za, lohi, hilo
	public void clickSortDropdown() {
		click(sortDropdown);
	}
	public void sortProducts(String option) {
		Select select = new Select(find(sortDropdown));
		select.selectByValue(option);
	}



	// Add product by name
	public void addProductToCart(String productName) {
		By addButton = By.xpath(
				"//div[text()='" + productName +
						"']/ancestor::div[@class='inventory_item']//button"
		);

		click(addButton);
	}

	// Remove product by name
	public void removeProductFromProductsPage(String productName) {
		By removeButton = By.xpath(
				"//div[text()='" + productName +
						"']/ancestor::div[@class='inventory_item']//button"
		);

		click(removeButton);
	}

	public String getProductButtonText(String productName) {

		By productButton = By.xpath(
				"//div[text()='" + productName +
						"']/ancestor::div[@class='inventory_item']//button"
		);

		return find(productButton).getText();
	}

	// Get product names
	public List<String> getProductNames() {
		List<String> names = new java.util.ArrayList<>();

		for (WebElement element : findList(productNames)) {
			names.add(element.getText());
		}

		return names;
	}

	// Get product prices
	public List<String> getProductPrices() {
		List<String> prices = new java.util.ArrayList<>();

		for (WebElement element : findList(productPrices)) {
			prices.add(element.getText());
		}

		return prices;
	}



	// Validation
	public boolean isProductsPageDisplayed() {
		return isElementVisible(pageTitle);
	}

	public String getPageTitle() {
		return find(pageTitle).getText();
	}
}
