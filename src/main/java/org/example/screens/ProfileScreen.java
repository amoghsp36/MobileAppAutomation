package org.example.screens;

import io.appium.java_client.AppiumDriver;
import org.example.models.User;
import org.openqa.selenium.By;

public class ProfileScreen extends MobileScreen{
    private final By userName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup");
    private final By email=By.xpath("//android.widget.TextView[@text='testuser03@gmail.com']");
    private final By memberStartDate=By.xpath("//android.widget.TextView[@text='8/17/2023']");
    //private final By logOutButton=By.xpath("//android.widget.TextView[@text='LOG OUT']");


    public ProfileScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    public User getProfileDetails(){
        User user = new User();
        user.setFullName(screenWaits.waitForElementToBeVisible(userName).getText());
        user.setEmail(screenWaits.waitForElementToBeVisible(email).getText());
        user.setMembershipStartDate(screenWaits.waitForElementToBeVisible(memberStartDate).getText());
        return user;
    }
}
