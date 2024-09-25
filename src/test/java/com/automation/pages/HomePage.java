package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class='search-bar']")
    WebElement searchIcon;

    @FindBy(xpath = "//div[@class='desktop-banner']")
    WebElement banner;

    @FindBy(xpath = "//button[text()='Search']/preceding-sibling::input")
    WebElement searchInput;

    @FindBy(xpath = "//button[text()='Search']")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@class='products']/a")
    WebElement item;

    @FindBy(xpath = "//a[text()='Men Shirts']")
    WebElement shirtOption;

    public void opensWebsite() {
        driver.get(ConfigReader.getProperty("base.url"));
    }

    public boolean isHomePageDisplayed() {
        return banner.isDisplayed();
    }

    public void searchItem(String itemKey) {
        searchIcon.click();
        searchInput.sendKeys(ConfigReader.getProperty(itemKey));
    }

    public void clicksSearchBtn() {
        searchBtn.click();
    }

    public void clicksProduct() {
        if(isDisplayed(item)){
            item.click();
        }
    }

    public void clicksShirts() {
        searchIcon.click();
        shirtOption.click();
    }
}
