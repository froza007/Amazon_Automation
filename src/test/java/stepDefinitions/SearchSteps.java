package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.SearchPage;

public class SearchSteps {

    @When("User searches valid product {string}")
    public void validSearch(String product){

        SearchPage search = new SearchPage(BaseClass.getDriver())
;
        search.searchProduct(product);
    }

    @When("User searches invalid product {string}")
    public void invalidSearch(String product){

        SearchPage search = new SearchPage(BaseClass.getDriver())
;
        search.searchProduct(product);
    }

    @When("User searches special characters {string}")
    public void specialSearch(String product){

        SearchPage search = new SearchPage(BaseClass.getDriver())
;
        search.searchProduct(product);
    }

    @Then("Verify results page displayed")
    public void verifyResults(){

        SearchPage search = new SearchPage(BaseClass.getDriver())
;
        Assert.assertTrue(search.isResultsPageDisplayed());
    }

    @Then("Verify products are listed")
    public void verifyProducts(){

        SearchPage search = new SearchPage(BaseClass.getDriver())
;
        Assert.assertTrue(search.areProductsListed());
    }
}
