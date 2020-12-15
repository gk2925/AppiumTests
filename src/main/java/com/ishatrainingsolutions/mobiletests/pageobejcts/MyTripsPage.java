package com.ishatrainingsolutions.mobiletests.pageobejcts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MyTripsPage {
    private AndroidDriver<MobileElement> driver;

    @AndroidFindBy(id = "com.hostelworld.app:id/arrow")
    private MobileElement arrowElement;

    @AndroidFindBy(xpath = "com.hostelworld.app:id/skip")
    private MobileElement skipElelemt;

    public MyTripsPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    public WishListsPage clickArrowOnMyTripsPage() {
        arrowElement.click();
        return new WishListsPage(driver);
    }

    public SearchPage clickSkipMyTripsPage() {
        skipElelemt.click();
        return new SearchPage(driver);
    }

    public boolean verifyArrowIconIsDisplayed() {

        return arrowElement.isDisplayed();
    }
}
