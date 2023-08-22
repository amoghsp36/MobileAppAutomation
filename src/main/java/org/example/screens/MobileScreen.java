package org.example.screens;

import io.appium.java_client.AppiumDriver;

public abstract class MobileScreen {
//    protected AppiumDriver appiumDriver;
//    protected ScreenWaits screenWaits;
//    protected ScreenActions screenActions;
//    protected HomeScreen homeScreen;
//
//    public MobileScreen(AppiumDriver appiumDriver) {
//        this.appiumDriver = appiumDriver;
//        this.screenWaits = new ScreenWaits(appiumDriver);
//        this.screenActions = new ScreenActions(appiumDriver);
//        this.homeScreen = new HomeScreen(appiumDriver);
//    }
protected AppiumDriver appiumDriver;
    protected ScreenWaits screenWaits;
    protected ScreenActions actions;

    public MobileScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.screenWaits = new ScreenWaits(appiumDriver);
        this.actions = new ScreenActions(appiumDriver);
    }
}
