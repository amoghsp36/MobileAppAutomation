package org.example.screens;

import io.appium.java_client.AppiumDriver;
import org.example.models.User;

public class ProfileScreen {
    private  AppiumDriver appiumDriver;

    public ProfileScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public User getProfileDetails(){
        return new User();
    }
}
