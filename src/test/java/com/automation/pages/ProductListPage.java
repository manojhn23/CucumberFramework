package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends BasePage{

    @FindBy(xpath = "//div[@class='products-grid']//a")
    List<WebElement> firstProduct;

    public boolean isProductListPageDisplayed() {
        return firstProduct.get(0).isDisplayed();
    }

    public void clicksOnFirstProduct() {
        firstProduct.get(0).click();
    }
}
