package com.automation.steps;

import com.automation.pages.ProductListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductListSteps {
    ProductListPage productListPage = new ProductListPage();

    @Then("verify user is on the product list page")
    public void verify_user_is_on_the_product_list_page() {
        Assert.assertTrue(productListPage.isProductListPageDisplayed());
    }

    @When("user is clicks on first product")
    public void user_is_clicks_on_first_product() {
        productListPage.clicksOnFirstProduct();
    }



}
