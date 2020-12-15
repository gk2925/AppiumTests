package com.ishatrainingsolutions.mobiletests.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class sampleSteps extends BaseSteps {
    @Given("User is at the home page of the app")
    public void userIsAtTheHomePageOfTheApp() {
        System.out.println("User is at the home page of the app ");
    }

    @And("User clicks on the hyperlink")
    public void userClicksOnTheHyperlink() {
        System.out.println("User clicks on the hyperlink successfully ");
    }

    @Then("User is navigated successfully to the another screen")
    public void userIsNavigatedSuccessfullyToTheAnotherScreen() {
        System.out.println("User navigaed to the another screen ");
    }

    @And("Application shows the desired action")
    public void applicationShowsTheDesiredAction() {
        System.out.println("Application shows desired action");
    }


}
