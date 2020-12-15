package com.ishatrainingsolutions.mobiletests.pageobejcts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SearchPage {
    private AndroidDriver driver;
    @AndroidFindBy(id = "com.hostelworld.app:id/searchBoxDestinationTv")
    private MobileElement searchTextBx;
    @AndroidFindBy(id = "com.hostelworld.app:id/suggestionEt")
    private MobileElement suggestionTextBox;
    @AndroidFindBy(id = "com.hostelworld.app:id/searchButton")
    private MobileElement searchButton;
    @AndroidFindBy(id = "com.hostelworld.app:id/guest_selector_number")
    private MobileElement numberOfDefaultGuests;
    @AndroidFindBy(id = "com.hostelworld.app:id/selectedDateTv")
    private MobileElement textOfDefaultCalendarDate;
    @AndroidFindBy(id = "com.hostelworld.app:id/guest_selector_more")
    private MobileElement guestAutoIncrementor;


    public SearchPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    public SearchPage searchCity(String cityText) {
        searchTextBx.click();
        suggestionTextBox.sendKeys(cityText);
        MobileElement autoSuggestionText =
                (MobileElement) driver.findElementByXPath
                        ("//android.widget.TextView[starts-with(@text,'" + cityText + "')]");
        MobileElement autoSuggestionText2 =
                (MobileElement) driver.findElementByXPath
                        ("//android.widget.TextView[contains(@text,'" + cityText + "')]");

        autoSuggestionText2.click();
        return new SearchPage(driver);

    }

    public SearchPage enterGuestsNumber(String number) {
        guestAutoIncrementor.click();

        return new SearchPage(driver);

    }

    public boolean verifySearchPageIsDisplayed() {
        return searchButton.isDisplayed();

    }

    public SearchResultsPage performSearch() {
        searchButton.click();
        return new SearchResultsPage(driver);
    }

    public String getNumberOfDefaultGuests() {
        return (numberOfDefaultGuests.getText());
    }

    public String getDefaultDateText() {
        return textOfDefaultCalendarDate.getText();
    }


}
