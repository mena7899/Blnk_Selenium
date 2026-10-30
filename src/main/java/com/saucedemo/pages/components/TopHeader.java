package com.saucedemo.pages.components;

import com.saucedemo.base.BasePage2;
import org.openqa.selenium.By;

public class TopHeader extends BasePage2 {



    private By menuButton = By.id("react-burger-menu-btn");


    private By cartIcon = By.className("shopping_cart_link");
    private By cartBadge = By.className("shopping_cart_badge");

    public void clickOpenMenu() {
        click(menuButton);
    }



    // Cart
    public void openCart() {
        click(cartIcon);
    }

    public String getCartBadgeCount() {
        return find(cartBadge).getText();
    }

    public boolean isCartBadgeDisplayed() {
        return isElementVisible(cartBadge);
    }
}
