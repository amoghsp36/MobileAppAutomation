package org.example.drivers;

import org.openqa.selenium.remote.DesiredCapabilities;

public interface DriverManager<Driver> {
   Driver create(DesiredCapabilities desiredCapabilities);
}
