
package com.saucedemo.pages;

import org.openqa.selenium.By;

import com.saucedemo.base.BasePage2;

public class LoginPage extends BasePage2 {

    // Locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.className("error-message-container");

    private By logo = By.className("login_logo");
    private By acceptedUsernames = By.id("login_credentials");
    private By passwordInfo = By.id("login-password");


    // Actions

    public void enterUsername(String username) {
        set(usernameField, username);
    }

    public void enterPassword(String password) {
        set(passwordField, password);
    }

    public void clickLogin() {
        click(loginButton);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }


    // Getters

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

    public String getLogoText() {
        return find(logo).getText();
    }

    public String getAcceptedUsernames() {
        return find(acceptedUsernames).getText();
    }

    public String getPasswordInfo() {
        return find(passwordInfo).getText();
    }


    // Element Visibility

    public boolean isUsernameFieldDisplayed() {
        return isElementVisible(usernameField);
    }

    public boolean isPasswordFieldDisplayed() {
        return isElementVisible(passwordField);
    }

    public boolean isLoginButtonDisplayed() {
        return isElementVisible(loginButton);
    }

    public boolean isLogoDisplayed() {
        return isElementVisible(logo);
    }

    public boolean isErrorMessageDisplayed() {
        return isElementVisible(errorMessage);
    }


    // Clear Fields

    public void clearUsername() {
        find(usernameField).clear();
    }

    public void clearPassword() {
        find(passwordField).clear();
    }
}
