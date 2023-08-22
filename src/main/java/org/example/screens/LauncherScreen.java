package org.example.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LauncherScreen extends MobileScreen{
    private By createClientAccount=By.xpath("//android.widget.TextView[@text='CREATE CLIENT ACCOUNT']");
    private By clientLogin=By.xpath("//android.widget.TextView[@text='ALREADY HAVE AN ACCOUNT?']");
    public LauncherScreen(AppiumDriver appiumDriver){
        //this.appiumDriver=appiumDriver;
        super(appiumDriver);
    }

    public SignInScreen navToClientSignIn(){
        screenWaits.waitForElementToBeVisible(createClientAccount).click();
        return new SignInScreen(appiumDriver);
    }
    public SignInScreen navToLogin(){
        screenWaits.waitForElementToBeVisible(clientLogin).click();
        return new SignInScreen(appiumDriver);
    }
}
