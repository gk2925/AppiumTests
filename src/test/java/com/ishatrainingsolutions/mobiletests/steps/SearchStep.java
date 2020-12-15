package com.ishatrainingsolutions.mobiletests.steps;


import com.ishatrainingsolutions.mobiletests.pageobejcts.MyTripsPage;
import com.ishatrainingsolutions.mobiletests.pageobejcts.SearchPage;
import com.ishatrainingsolutions.mobiletests.pageobejcts.SearchResultsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchStep extends BaseSteps {

    private MyTripsPage myTripsPage;
    private SearchPage searchPage;
    private SearchResultsPage searchResultsPage;
    private BaseSteps baseSteps;

    public SearchStep(BaseSteps baseSteps) {
        this.baseSteps = baseSteps;
        myTripsPage = new MyTripsPage(baseSteps.driver);
        searchPage = new SearchPage(baseSteps.driver);
        searchResultsPage = new SearchResultsPage(baseSteps.driver);


    }


    @When("User tries to enter the city name")
    public void userTriesToEnterTheCityName() {

        searchPage
                .searchCity("Berlin");

    }

    @And("User tries to increment the default guests")
    public void userTriesToEnterTheDefaultGuests() {
        searchPage
                .enterGuestsNumber("3");
    }

    @And("User click on search button on search page")
    public void userClickOnSearchButtonOnSearchPage() {

        searchPage
                .performSearch();
    }

    @Then("search results are displayed")
    public void searchResultsAreDisplayed() {

        searchResultsPage.heartIconIsDisplayed();
    }

    @And("All results are having the background image")
    public void allResultsAreHavingTheBackgroundImage() {
        searchResultsPage.firstSearchResultContainsBackgroundImage();
    }

    @And("All results are having some rating")
    public void allResultsAreHavingSomeRating() {
        searchResultsPage.firstSearchResultContainsRatingView();
    }

    @And("All results are having some price")
    public void allResultsAreHavingSomePrice() {
        searchResultsPage.firstSearchResultContainsPriceView();
    }


    @When("User tries to enter the regional {string}")
    public void userTriesToEnterTheRegional(String arg0) {
        searchPage
                .searchCity(arg0);
    }

    @Given("User is at the  launch page and navigates till search screen")
    public void userIsAtTheLaunchPageAndNavigatesTillSearchScreen() {

        myTripsPage
                .clickArrowOnMyTripsPage()
                .clickArrowOnWishListPage()
                .clickArrowOnExplorePage()
                .ClickDoneButton();
    }
}
