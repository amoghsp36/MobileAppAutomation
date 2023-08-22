package org.example.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomeScreen extends MobileScreen{        // homeScreen->after signIn
    private By profile=By.xpath("//android.widget.TextView[@text='Profile']");
    private By assignments=By.xpath("//android.widget.TextView[@text='Assignments']");
    private By notes=By.xpath("//android.widget.TextView[@text='Notes']");
    private By resources=By.xpath("//android.widget.TextView[@text='Resources']");

    public HomeScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    public ProfileScreen navToProfile(){
        screenWaits.waitForElementToBeVisible(profile).click();
        return new ProfileScreen(appiumDriver);
    }
    public ProfileScreen navToAssignments(){
        screenWaits.waitForElementToBeVisible(assignments).click();
        return new ProfileScreen(appiumDriver);
    }
    public ProfileScreen navToNotes(){
        screenWaits.waitForElementToBeVisible(notes).click();
        return new ProfileScreen(appiumDriver);
    }
    public ProfileScreen navToResources(){
        screenWaits.waitForElementToBeVisible(resources).click();
        return new ProfileScreen(appiumDriver);
    }
}
