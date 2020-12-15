package com.ishatrainingsolutions.mobiletests.pageobejcts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BottomNavigationPage {

    private AndroidDriver<MobileElement> driver;

    @AndroidFindBy(id = "com.hostelworld.app:id/bottom_nav_profile")
    private MobileElement profileIcon;

    @AndroidFindBy(id = "com.hostelworld.app:id/bottom_nav_explore")
    private MobileElement searchIcon;

    @AndroidFindBy(id = "com.hostelworld.app:id/bottom_nav_wishlist")
    private MobileElement wishListIcon;

    @AndroidFindBy(id = "com.hostelworld.app:id/bottom_nav_my_trips")
    private MobileElement myTripsIcon;

    @AndroidFindBy(id = "com.hostelworld.app:id/bottom_nav_stw")
    private MobileElement speakIcon;

    public BottomNavigationPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    public MapWithAdventuresPage clickProfileIcon(){

        profileIcon.click();
        return new MapWithAdventuresPage(driver);
    }


}
