package org.example;

import io.appium.java_client.AppiumDriver;
import org.example.drivers.AndroidDriverManager;
import org.example.drivers.iOSManager;
import org.example.models.User;
import org.example.screens.HomeScreen;
import org.example.screens.LauncherScreen;
import org.example.screens.ProfileScreen;
import org.example.screens.SignInScreen;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClientSignInTests{

    @Test
    public void ClientSignInTests() {

        //Arrange
        AppiumDriver driver1=null;
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("deviceName","Pixel 6");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("app","");
        AppiumDriver driver = new AndroidDriverManager().create(caps);   //created an AndroidManager obj and called create method which takes capabilities obj as parameter
        AppiumDriver iOSDriver = new iOSManager().create(caps);

        LauncherScreen launcherScreen=new LauncherScreen(driver);
        launcherScreen.navToClientSignIn();
        User client = new User("randomclient@gmail.com",
                "password", "Automation Client",
                "1234567890","02/2/2023");

        //Act
        SignInScreen signInScreen=new SignInScreen(driver);
        HomeScreen homeScreen = signInScreen.signIn(client);
        ProfileScreen profileScreen = new ProfileScreen(driver);
        User clientProfile = profileScreen.getProfileDetails();

        //Assert

        Assert.assertEquals(clientProfile.getEmail(),client.getEmail());
        Assert.assertEquals(clientProfile.getFullName(),client.getFullName());
        Assert.assertEquals(clientProfile.getMobile(),client.getMobile());
        Assert.assertEquals(clientProfile.getMobile(),client.getMobile());

        Assert.assertEquals(clientProfile.getMembershipStartDate(),"02/2/2023");

    }
}

