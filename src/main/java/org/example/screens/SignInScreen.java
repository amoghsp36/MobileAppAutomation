package org.example.screens;

import io.appium.java_client.AppiumDriver;
import org.example.models.User;
import org.openqa.selenium.By;

public class SignInScreen extends MobileScreen{
    By email=By.xpath("//android.widget.EditText[@text='id:email']");
    By password=By.xpath("//android.widget.EditText[@text='id:password']");
    By login=By.xpath("//android.widget.TextView[@text='LOGIN']");

    public SignInScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    public HomeScreen signIn(User client){
        screenWaits.waitForElementToBeVisible(email).sendKeys(client.getEmail());
        //enterLoginInfo(email, client.getEmail());
        screenWaits.waitForElementToBeVisible(password).sendKeys(client.getPassword());
        clickSignIn();

        return new HomeScreen(appiumDriver);
    }
    public void enterLoginInfo(By by,String str){
        appiumDriver.findElement(by).clear();
        appiumDriver.findElement(by).sendKeys(str);
    }
    public void clickSignIn(){
        screenWaits.waitForElementToBeVisible(login).click();
    }
}
