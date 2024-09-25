package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user opens the website")
    public void user_opens_the_website() {
        homePage.opensWebsite();
    }

    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user clicks on search icon and enters the item {string}")
    public void user_clicks_on_search_icon_and_enters_the_item(String itemKey) {
        homePage.searchItem(itemKey);
    }

    @When("click on search button")
    public void click_on_search_button() {
        homePage.clicksSearchBtn();
    }

    @And("clicks on item if it shows list")
    public void clicksOnItemIfItShowsList() {
        homePage.clicksProduct();
    }

    @When("user clicks on search icon and selects the shirts")
    public void user_clicks_on_search_icon_and_selects_the_shirts() {
        homePage.clicksShirts();
        
    }


}
