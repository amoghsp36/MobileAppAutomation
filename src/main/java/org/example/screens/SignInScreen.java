package org.example.screens;

import io.appium.java_client.AppiumDriver;
import org.example.models.User;
import org.openqa.selenium.By;

public class SignInScreen {
    private AppiumDriver appiumDriver;
    By email=By.className("//android.widget.EditText[@text='id:email']");
    By password=By.className("//android.widget.EditText[@text='id:password']");
    By login=By.className("//android.widget.TextView[@text='LOGIN']");

    public SignInScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    public HomeScreen signIn(User client){
        appiumDriver.findElement(email).sendKeys(client.getEmail());
        //enterLoginInfo(email, client.getEmail());
        appiumDriver.findElement(password).sendKeys(client.getPassword());
        clickSignIn();

        return new HomeScreen(appiumDriver);
    }
    public void enterLoginInfo(By by,String str){
        appiumDriver.findElement(by).clear();
        appiumDriver.findElement(by).sendKeys(str);
    }
    public void clickSignIn(){
        appiumDriver.findElement(login).click();
    }
}
