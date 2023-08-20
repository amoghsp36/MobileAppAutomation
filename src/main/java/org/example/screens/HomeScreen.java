package org.example.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomeScreen {        // homeScreen->after signIn
    private AppiumDriver appiumDriver;
    private By profile=By.className("//android.widget.TextView[text@='Profile']");
    private By assignments=By.className("//android.widget.TextView[text@='Assignments']");
    private By notes=By.className("//android.widget.TextView[text@='Notes']");
    private By resources=By.className("//android.widget.TextView[text@='Resources']");

    public HomeScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public ProfileScreen navToProfile(){
        appiumDriver.findElement(profile).click();
        return new ProfileScreen(appiumDriver);
    }
    public ProfileScreen navToAssignments(){
        appiumDriver.findElement(assignments).click();
        return new ProfileScreen(appiumDriver);
    }
    public ProfileScreen navToNotes(){
        appiumDriver.findElement(notes).click();
        return new ProfileScreen(appiumDriver);
    }
    public ProfileScreen navToResources(){
        appiumDriver.findElement(resources).click();
        return new ProfileScreen(appiumDriver);
    }
}
