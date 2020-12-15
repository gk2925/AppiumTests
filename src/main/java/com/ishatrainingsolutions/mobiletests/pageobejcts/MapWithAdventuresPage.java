package com.ishatrainingsolutions.mobiletests.pageobejcts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MapWithAdventuresPage {

    public AndroidDriver driver;

    public MapWithAdventuresPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }
    @AndroidFindBy(id = "com.hostelworld.app:id/profileLogoutJoinButton")
    private MobileElement joinUsButton;


    @AndroidFindBy(id = "com.hostelworld.app:id/profileLogoutLoginButton")
    private MobileElement logInButton;


    @AndroidFindBy(id = "com.hostelworld.app:id/arrow")
    private MobileElement settingsButton;


    @AndroidFindBy(id = "com.hostelworld.app:id/arrow")
    private MobileElement helpButton;

    public void clickLoginButton(){

        logInButton.click();
    }



}
