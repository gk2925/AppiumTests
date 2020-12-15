package com.ishatrainingsolutions.mobiletests.pageobejcts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HostelSpeakPage {
    private AndroidDriver<MobileElement> driver;
    /*elements*/
    @AndroidFindBy(id = "com.hostelworld.app:id/done")
    private MobileElement doneElement;

    /*constructor*/
    public HostelSpeakPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    /*functions*/
    public SearchPage ClickDoneButton() {
        doneElement.click();
        return new SearchPage(driver);
    }
}
