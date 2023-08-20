package org.example.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class iOSManager implements DriverManager{
    @Override
    public AppiumDriver create(DesiredCapabilities desiredCapabilities){
        return new IOSDriver(desiredCapabilities);
    }
}
