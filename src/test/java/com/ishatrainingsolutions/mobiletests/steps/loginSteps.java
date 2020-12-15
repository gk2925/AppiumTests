package com.ishatrainingsolutions.mobiletests.steps;



import com.ishatrainingsolutions.mobiletests.pageobejcts.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.net.MalformedURLException;

public class loginSteps extends BaseSteps {

    private BaseSteps baseSteps;
    private MyTripsPage myTripsPage;
    private ExplorePage explorePage;
    private WishListsPage wishListsPage;
    private HostelSpeakPage hostelSpeakPage;
    private SearchPage searchPage;
    private BottomNavigationPage bottomNavigationPage;
    private MapWithAdventuresPage mapWithAdventuresPage;
    private SignInPage signInPage;
    private  HomePage homePage;


    public loginSteps(BaseSteps baseSteps) {

        this.baseSteps = baseSteps;
        myTripsPage = new MyTripsPage(baseSteps.driver);
        explorePage = new ExplorePage(baseSteps.driver);
        wishListsPage = new WishListsPage(baseSteps.driver);
        hostelSpeakPage = new HostelSpeakPage(baseSteps.driver);
        searchPage = new SearchPage(baseSteps.driver);
        bottomNavigationPage = new BottomNavigationPage(baseSteps.driver);
        mapWithAdventuresPage = new MapWithAdventuresPage(baseSteps.driver);
        signInPage = new SignInPage(baseSteps.driver);
        homePage = new HomePage(baseSteps.driver);
    }


    @Given("Application is launched with all desired capabilities")
    public void applicationIsLaunchedWithAllDesiredCapabilities() throws MalformedURLException {


    }


    @And("User clicks on arrow button of MyTrips Screen")
    public void userClicksOnArrowButtonOfMyTripsScreen() {

        myTripsPage.clickArrowOnMyTripsPage();


    }

    @And("User clicks on arrow button of WishList Screen")
    public void userClicksOnArrowButtonOfWishListScreen() {
        wishListsPage.clickArrowOnWishListPage();
    }

    @And("User clicks on arrow button of Explore Screen")
    public void userClicksOnArrowButtonOfExploreScreen() {

        explorePage.clickArrowOnExplorePage();

    }


    @And("User clicks on the done button of HostelsSpeak sceen")
    public void userClicksOnTheDoneButtonOfHostelsSpeakSceen() {

        hostelSpeakPage.ClickDoneButton();

    }

    @Then("Search screen is displayed")
    public void searchScreenIsDisplayed() {


        Assert.assertEquals(searchPage.verifySearchPageIsDisplayed(), true);

    }

    @When("User clicks on the profile icon")
    public void userClicksOnTheProfileIcon() {
        bottomNavigationPage.clickProfileIcon();
    }

    @And("Click on login button on MapAdventure screen")
    public void clickOnLoginButtonOnMapAdventureScreen() {
        mapWithAdventuresPage.clickLoginButton();

    }

    @Then("Login screen is displayed")
    public void loginScreenIsDisplayed() {
        signInPage.isLoginPageDisplayed();

    }

    @When("User enters the valid credentials")
    public void userEntersTheValidCredentials() {
        signInPage.doLogin("jayk2925@gmail.com", "test1234");
    }

    @Then("user is logged successfully")
    public void userIsLoggedSuccessfully() {
        homePage.verifyProperUname("Jai K");
    }

    @Given("User is at the MyTrips screen of the application")
    public void userIsAtTheMyTripsScreenOfTheApplication() {
        myTripsPage.verifyArrowIconIsDisplayed();
        Assert.assertEquals(true, myTripsPage.verifyArrowIconIsDisplayed());

    }

    @When("User enters the invalid {string} and invalid {string}")
    public void userEntersTheInvalidAndInvalid(String arg0, String arg1) {
        signInPage.doLogin(arg0,arg1);
        
    }

    @Then("verify that error message is being displayed")
    public void verifyThatErrorMessageIsBeingDisplayed() {
        Assert.assertTrue(signInPage.verifyThatLoginFailedAlertIsDisplayed());
    }
}
