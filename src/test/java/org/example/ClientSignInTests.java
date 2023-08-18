package org.example;

import io.appium.java_client.AppiumDriver;
import org.example.models.User;
import org.example.screens.HomeScreen;
import org.example.screens.LauncherScreen;
import org.example.screens.ProfileScreen;
import org.example.screens.SignInScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClientSignInTests{

    @Test
    public void ClientSignInTests() {

        //Arrange
        AppiumDriver appiumDriver=null;
        LauncherScreen launcherScreen=new LauncherScreen(appiumDriver);
        launcherScreen.navToClientSignIn();
        User client = new User("randomclient@gmail.com",
                "password", "Automation Client",
                "1234567890","02/2/2023");

        //Act
        SignInScreen signInScreen=new SignInScreen(appiumDriver);
        HomeScreen homeScreen = signInScreen.signIn(client);
        ProfileScreen profileScreen = new ProfileScreen(appiumDriver);
        User clientProfile = profileScreen.getProfileDetails();

        //Assert

        Assert.assertEquals(clientProfile.getEmail(),client.getEmail());
        Assert.assertEquals(clientProfile.getFullName(),client.getFullName());
        Assert.assertEquals(clientProfile.getMobile(),client.getMobile());
        Assert.assertEquals(clientProfile.getMobile(),client.getMobile());

        Assert.assertEquals(clientProfile.getMembershipStartDate(),"02/2/2023");

    }
}

