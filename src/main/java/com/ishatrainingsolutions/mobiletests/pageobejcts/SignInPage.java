package com.ishatrainingsolutions.mobiletests.pageobejcts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SignInPage {

    private AndroidDriver<MobileElement> driver;

    @AndroidFindBy(id = "com.hostelworld.app:id/usernameEt")
    private MobileElement unameText;

    @AndroidFindBy(id = "com.hostelworld.app:id/passwordEt")
    private MobileElement passText;

    @AndroidFindBy(id = "com.hostelworld.app:id/loginButton")
    private MobileElement loginButton;

    @AndroidFindBy(id = "com.hostelworld.app:id/alertTitle")
    private MobileElement loginFailedAlertTitke;


    public SignInPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    public HomePage doLogin(String uName, String pass) {

        unameText.sendKeys(uName);
        passText.sendKeys(pass);
        loginButton.click();

        return new HomePage(driver);
    }


    public boolean isLoginPageDisplayed() {

        return unameText.isDisplayed();
    }

    public boolean verifyThatLoginFailedAlertIsDisplayed() {
        return loginFailedAlertTitke.isDisplayed();
    }
}
