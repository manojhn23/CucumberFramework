package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {

    static WebDriver driver;
    static WebDriverWait wait;

    public static void createDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void initExplicitWait() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public static WebDriverWait getExplicitWait() {
        return wait;
    }

}
