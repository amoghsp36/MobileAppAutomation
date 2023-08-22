package org.example.drivers;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public interface DriverManager<Driver> {
   Driver create(DesiredCapabilities desiredCapabilities) throws MalformedURLException;
}
