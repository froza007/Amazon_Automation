package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public static void setup() {

        // Launch Chrome browser (VISIBLE mode)
        driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Global implicit wait (basic stability)
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
