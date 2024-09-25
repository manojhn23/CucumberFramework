package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[@class='product-details-info']//h1")
    WebElement productName;

    String colorId = "//input[@id='%s']/..";

    String productSize = "//p[text()='%s']/..";

    @FindBy(xpath = "//a[text()='Add to Cart']")
    WebElement addToCartBtn;

    @FindBy(id = "add-to-note")
    WebElement msgPopUp;

    @FindBy(xpath = "//a[@class='add-cart-icon']")
    WebElement cartIcon;

    @FindBy(xpath = "//a[@class='add-cart-icon']/span")
    WebElement cartHover;

    public boolean isProductPageDisplayed(String itemKey) {
        return ConfigReader.getProperty(itemKey).equals(productName.getText());
    }

    public void selectsTheColor(String colorKey) {
        colorId = String.format(colorId, ConfigReader.getProperty(colorKey));
        driver.findElement(By.xpath(colorId)).click();
    }

    public void selectsTheSize(String sizeKey) {
        productSize = String.format(productSize, ConfigReader.getProperty(sizeKey));
        WebElement size = driver.findElement(By.xpath(productSize));
        js.executeScript("arguments[0].click();", size);
    }

    public void clicksAddToCartBtn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", addToCartBtn);
    }

    public boolean isMsgDisplayed() {
        DriverManager.getExplicitWait().until(ExpectedConditions.visibilityOf(msgPopUp));
        return msgPopUp.isDisplayed();
    }

    public void clicksCartIcon() {
        cartIcon.click();
    }

    public boolean isProductDisplayed() {
        return addToCartBtn.isDisplayed();
   }

    public String getCartPopUp() {
        return cartHover.getText();
    }
}
