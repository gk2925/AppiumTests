package com.ishatrainingsolutions.mobiletests.steps;

import com.ishatrainingsolutions.mobiletests.pageobejcts.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DefaultCheckSteps extends BaseSteps {

    private BaseSteps baseSteps;
    private SearchPage searchPage;
    private String defaultNumber;

public DefaultCheckSteps(BaseSteps baseSteps){
    this.baseSteps= baseSteps;
    searchPage  = new SearchPage(baseSteps.driver);

}


    @When("User checks for the default guest")
    public void userChecksForTheDefaultGuest() {

        defaultNumber = searchPage.getNumberOfDefaultGuests();

    }



    @And("Verify that default guest number is {string}")
    public void verifyThatDefaultGuestNumberIs(String arg0) {
        System.out.println(arg0);
        Assert.assertEquals(arg0,defaultNumber);
    }
}
