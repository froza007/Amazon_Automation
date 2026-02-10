package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class BaseClass {

    // Thread-safe driver
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setup() {

        String browser = Reporter.getCurrentTestResult()
                .getTestContext()
                .getCurrentXmlTest()
                .getParameter("browser");

        // Default browser if not provided
        if (browser == null) {
            browser = "chrome";
        }

        browser = browser.trim().toLowerCase();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--log-level=3");

        if (browser.equals("chrome")) {

            driver.set(new ChromeDriver(options));

        } else if (browser.equals("brave")) {

            // Brave browser path (Mac)
            options.setBinary("/Applications/Brave Browser.app/Contents/MacOS/Brave Browser");

            driver.set(new ChromeDriver(options));

        } else {

            throw new RuntimeException("Unsupported browser: " + browser);
        }

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().get("https://www.amazon.in");
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void tearDown() {

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
