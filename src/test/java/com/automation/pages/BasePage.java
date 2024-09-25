package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    WebDriver driver;
    JavascriptExecutor js;

    public BasePage() {
        driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public boolean isDisplayed(WebElement item) {
        try {
           return item.isDisplayed();
        }catch (Exception e){
            System.out.println("Not present");
        }
        return false;
    }
}
