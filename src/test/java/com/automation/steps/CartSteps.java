package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @Then("verify user is on cart page")
    public void verify_user_is_on_cart_page() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }

    @Then("verify the {string} is present on cart")
    public void verify_the_is_present_on_cart(String itemKey) {
        Assert.assertEquals(cartPage.isItemPresentInCart(), ConfigReader.getProperty(itemKey));
    }
}
