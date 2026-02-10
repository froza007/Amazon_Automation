package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

    public static WebDriver driver;

    public static void setup() {

        // Chrome options for headless execution
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");   // Headless mode (recommended for latest Chrome)
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");           // Needed for Jenkins/Linux
        options.addArguments("--disable-dev-shm-usage"); // Prevent memory issues in CI
        options.addArguments("--window-size=1920,1080"); // Ensure proper rendering

        // Launch Chrome browser in headless
        driver = new ChromeDriver(options);

        // Global implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Amazon URL
        driver.get("https://www.amazon.in");
    }

    public static void tearDown() {

        if(driver != null) {
            driver.quit();
        }
    }
}
