package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//div[@class='cartdesktop']")
    WebElement cartPage;

    @FindBy(xpath = "//article/span[@class='cartpname']")
    WebElement productInCart;

    public boolean isCartPageDisplayed() {
        return cartPage.isDisplayed();
    }

    public String isItemPresentInCart() {
        return productInCart.getText();
    }
}
