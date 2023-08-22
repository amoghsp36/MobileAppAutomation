package org.example;

import io.appium.java_client.AppiumDriver;
import org.example.drivers.AndroidDriverManager;
import org.example.drivers.ServerManager;
import org.example.drivers.iOSManager;
import org.example.models.User;
import org.example.screens.HomeScreen;
import org.example.screens.LauncherScreen;
import org.example.screens.ProfileScreen;
import org.example.screens.SignInScreen;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ClientSignInTests{

    @Test
    public void ClientSignInTests() throws MalformedURLException {

        //Arrange
        AppiumDriver driver1=null;
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("platformVersion","14");
        caps.setCapability("deviceName","Pixel 6");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("udid","emulator-5554");
        caps.setCapability("app","/Users/testvagrant/Downloads/ul-coach.apk");
        caps.setCapability("appPackage","com.ultralesson.coach");
        caps.setCapability("appActivity","com.ultralesson.coach.MainActivity");
        caps.setCapability("noReset",true);
        //ServerManager serverManager=new ServerManager();
        AppiumDriver driver = new AndroidDriverManager().create(caps);   //created an AndroidManager obj and called create method which takes capabilities obj as parameter
//        AppiumDriver iOSDriver = new iOSManager().create(caps);

        LauncherScreen launcherScreen=new LauncherScreen(driver);
        launcherScreen.navToClientSignIn();
        launcherScreen.navToLogin();
        User client = new User("testuser03@gmail.com",
                "testuser@03", "TestUser03",
                "1234567890","02/2/2023");

        //Act
        SignInScreen signInScreen=new SignInScreen(driver);
        HomeScreen homeScreen = signInScreen.signIn(client);
        homeScreen.navToProfile();
        ProfileScreen profileScreen = new ProfileScreen(driver);
        User clientProfile = profileScreen.getProfileDetails();

        //Assert

        Assert.assertEquals(clientProfile.getEmail(),client.getEmail());
        //Assert.assertEquals(clientProfile.getFullName(),client.getFullName());
        //Assert.assertEquals(clientProfile.getMobile(),client.getMobile());
        Assert.assertEquals(clientProfile.getMembershipStartDate(),"8/17/2023");
        driver.quit();
    }
}

