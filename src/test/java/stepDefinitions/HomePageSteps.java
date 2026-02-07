package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.HomePage;

public class HomePageSteps {

    HomePage home = new HomePage(BaseClass.driver);

    @Given("User is on Amazon home page")
    public void verifyHomePage(){

        Assert.assertTrue(home.isHomePageLoaded());
    }

    @Then("Verify search box present")
    public void verifySearch(){

        Assert.assertTrue(home.isSearchBoxPresent());
    }

    @Then("Verify category navigation menu present")
    public void verifyCategory(){

        Assert.assertTrue(home.isCategoryMenuPresent());
    }

    @Then("Verify banner section visible")
    public void verifyBanner(){

        Assert.assertTrue(home.isBannerVisible());
    }

    @When("User handles location popup")
    public void locationPopup(){

        home.clickLocationPopup();
    }
}
