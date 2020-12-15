package com.ishatrainingsolutions.mobiletests.pageobejcts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class FiltersScreen {

    private AndroidDriver<MobileElement> driver;


    @AndroidFindBy(id = "com.hostelworld.app:id/bottom_nav_stw")
    private MobileElement speakIcon;

    @AndroidFindBy(id = "com.hostelworld.app:id/sort_by_text")
    private MobileElement sortDropDown;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Price']")
    private MobileElement priceSelectionText;

    @AndroidFindBy(xpath = "//*[starts-with(@text,'Show')]")
    private MobileElement sortResultElement;


    public FiltersScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }


    public FiltersScreen sortResultsByPrice() {
        sortDropDown.click();
        priceSelectionText.click();
        return new FiltersScreen(driver);
    }

    public int getNumberOfSortedResults() {
        int i = Integer.parseInt(sortResultElement.getText().replaceAll("[^0-9]", ""));
        return i;
    }
}
