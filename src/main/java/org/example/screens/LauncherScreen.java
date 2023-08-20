package org.example.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LauncherScreen {
    private AppiumDriver appiumDriver;
    private By createClientAccount=By.className("//android.widget.TextView[text@='CREATE CLIENT ACCOUNT']");
    private By clientLogin=By.className("//android.widget.TextView[@text='ALREADY HAVE AN ACCOUNT?']");
    public LauncherScreen(AppiumDriver appiumDriver){
        this.appiumDriver=appiumDriver;
    }

    public SignInScreen navToClientSignIn(){
        appiumDriver.findElement(createClientAccount).click();
        return new SignInScreen(appiumDriver);
    }
    public SignInScreen navToLogin(){
        appiumDriver.findElement(clientLogin).click();
        return new SignInScreen(appiumDriver);
    }
}
