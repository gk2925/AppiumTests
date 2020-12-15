package com.ishatrainingsolutions.mobiletests.pageobejcts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage {

    private AndroidDriver<MobileElement> driver;
    @AndroidFindBy(id = "com.hostelworld.app:id/propertyImageBackgroundView")
    private List<MobileElement> backhroundImageViews;

    @AndroidFindBy(id = "com.hostelworld.app:id/propertyPriceTv")
    private List<MobileElement> propertyPriceViews;

    @AndroidFindBy(id = "com.hostelworld.app:id/rating")
    private List<MobileElement> propertyRateViews;

    @AndroidFindBy(id = "com.hostelworld.app:id/filterButtonBt")
    private MobileElement filterIcon;

    @AndroidFindBy(id = "com.hostelworld.app:id/propertyNameTv")
    private List<WebElement> listOfSearchedResultsHostelsName;

    @AndroidFindBy(id = "com.hostelworld.app:id/propertyPriceTv")
    private List<WebElement> listOfSearchedResultsHostelsPrice;

    @AndroidFindBy(id = "com.hostelworld.app:id/propertyHeartIconIb")
    private List<MobileElement> heartIcon;


    public SearchResultsPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    public boolean firstSearchResultContainsBackgroundImage() {
        return backhroundImageViews.get(0).isDisplayed();
    }

    public boolean firstSearchResultContainsRatingView() {
        return propertyRateViews.get(0).isDisplayed();
    }

    public boolean firstSearchResultContainsPriceView() {
        return propertyPriceViews.get(0).isDisplayed();
    }


    public void clickFirstSearchResult() {
        backhroundImageViews.get(0).click();
    }

    public FiltersScreen clickFilterIcon() {
        filterIcon.click();
        return new FiltersScreen(driver);
    }


    public void verticalSwipeForSerachResultScreen() {

        int x = driver.manage().window().getSize().getWidth();
        int y = driver.manage().window().getSize().getHeight();
        System.out.println("width and heights are " + x + y);
        int x1 = x / 2;
        int x2 = x / 2;
        int y1 = (int) (y * 0.25);
        int y2 = (int) (y * 0.70);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TouchAction action = new TouchAction(driver);
        action
                .press(PointOption.point(x2, y2))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x1, y1))
                .release()
                .perform();
    }


    public List getAllPricesOfHotel(int frequency) {
        int size = listOfSearchedResultsHostelsPrice.size();
        List<String> nameList = new ArrayList();

        for (int i = 1; i < frequency; i++) {
            for (int j = 0; j < size; j++) {
                String str = listOfSearchedResultsHostelsPrice.get(0).getText();
                nameList.add(str);
            }
            verticalSwipeForSerachResultScreen();
        }

        return nameList;
    }


    public boolean heartIconIsDisplayed() {

        return heartIcon.get(0).isDisplayed();
    }

}
