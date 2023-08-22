package org.example.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumFluentWait;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;


public class ScreenWaits {
    private AppiumDriver appiumDriver;
    private FluentWait<AppiumDriver> fluentWait;

    public ScreenWaits(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.fluentWait = initWait(appiumDriver);
    }
    public WebElement waitForElementToBeVisible(By by){
        return fluentWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public WebElement waitForElementToBeClickable(By by){
        return fluentWait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private List<WebElement> waitForAllElementToBeVisible(By by) {
        return fluentWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public FluentWait<AppiumDriver> initWait(AppiumDriver appiumDriver){
        return new FluentWait<>(appiumDriver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(4))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }

}
