package com.automation.steps;

import com.automation.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductSteps {
    ProductPage productPage = new ProductPage();

    @Then("verify user is on the product page of {string}")
    public void verify_user_is_on_the_product_page_of(String itemKey) {
        Assert.assertTrue(productPage.isProductPageDisplayed(itemKey));
    }

    @When("user selects the color of {string}")
    public void user_selects_the_color_of(String colorKey) {
        productPage.selectsTheColor(colorKey);
    }

    @When("user selects the size of {string}")
    public void user_selects_the_size_of(String sizeKey) {
        productPage.selectsTheSize(sizeKey);
    }

    @When("clicks on add to cart button")
    public void clicks_on_add_to_cart_button() {
        productPage.clicksAddToCartBtn();
    }

    @Then("verify user can get message of added")
    public void verify_user_can_get_message_of_added() {
        Assert.assertTrue(productPage.isMsgDisplayed());
    }

    @When("user clicks on cart icon")
    public void user_clicks_on_cart_icon() {
        productPage.clicksCartIcon();
    }

    @Then("verify user is on the product page")
    public void verify_user_is_on_the_product_page() {
        Assert.assertTrue(productPage.isProductDisplayed());
    }

    @When("user clicks on add to cart button")
    public void user_clicks_on_add_to_cart_button() {
        productPage.clicksAddToCartBtn();
    }

    @Then("verify cart icon has zero items")
    public void verify_cart_icon_zero_items() {
        Assert.assertEquals("0",productPage.getCartPopUp());
    }
}
