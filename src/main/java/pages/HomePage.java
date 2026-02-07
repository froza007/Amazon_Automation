package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // Inspect Amazon search input box
    // Right click search box -> Inspect -> input id="twotabsearchtextbox"
    By searchBox = By.id("twotabsearchtextbox");

    // Inspect top navigation category menu
    // Inspect hamburger menu icon (id="nav-hamburger-menu")
    By categoryMenu = By.id("nav-hamburger-menu");

    // Inspect banner/deals section
    // Inspect main carousel container (id="gw-layout")
    By bannerSection = By.id("gw-layout");

    // Inspect location popup
    // Click location icon -> Inspect id="nav-global-location-popover-link"
    By locationPopup = By.id("nav-global-location-popover-link");

    public boolean isHomePageLoaded(){

        // Verify homepage using search box visibility
        // Inspect search input -> id="twotabsearchtextbox"

        return driver.findElement(searchBox).isDisplayed();
    }


    public boolean isSearchBoxPresent(){

        return driver.findElement(searchBox).isDisplayed();
    }

    public boolean isCategoryMenuPresent(){

        return driver.findElement(categoryMenu).isDisplayed();
    }

    public boolean isBannerVisible(){

        return driver.findElement(bannerSection).isDisplayed();
    }

    public void clickLocationPopup(){

        driver.findElement(locationPopup).click();
    }
}
