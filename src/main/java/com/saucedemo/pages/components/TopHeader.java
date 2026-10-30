package com.saucedemo.pages.components;

import com.saucedemo.base.BasePage2;
import org.openqa.selenium.By;

public class TopHeader extends BasePage2 {

    private By checkoutButton =
            By.id("checkout");

    private By menuButton = By.id("react-burger-menu-btn");


    public void clickOpenMenu() {
        click(menuButton);
    }

    public void clickCheckout() {
        click(checkoutButton);
    }
}
