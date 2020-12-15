package com.ishatrainingsolutions.mobiletests.pageobejcts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class SearchDetailsPage {

    private AndroidDriver<MobileElement> driver;
    @AndroidFindBy(id = "com.hostelworld.app:id/propertyImageBackgroundView")
    private List<MobileElement> backhroundImageViews;


    public SearchDetailsPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }


}
