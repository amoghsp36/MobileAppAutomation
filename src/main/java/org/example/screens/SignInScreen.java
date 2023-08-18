package org.example.screens;

import io.appium.java_client.AppiumDriver;
import org.example.models.User;

public class SignInScreen {
    private AppiumDriver appiumDriver;

    public SignInScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public HomeScreen signIn(User client){
        return new HomeScreen(appiumDriver);
    }
}
