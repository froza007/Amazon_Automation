package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void capture(WebDriver driver){

        try {

            TakesScreenshot ts = (TakesScreenshot) driver;

            File src = ts.getScreenshotAs(OutputType.FILE);

            String timestamp =
                    new SimpleDateFormat("yyyyMMdd_HHmmss")
                            .format(new Date());

            File dest = new File(
                    "reports/screenshots/screenshot_" + timestamp + ".png");

            src.renameTo(dest);

        } catch (Exception e){

            System.out.println("Screenshot failed: " + e.getMessage());
        }
    }
}
