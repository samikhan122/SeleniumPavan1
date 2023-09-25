package selenium.Pavan.Udemy;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        TakesScreenshot ts = (TakesScreenshot) driver; // an interface
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File("/Users/devxi.t/Desktop/API/Selenium101/src/test/java/ScreenShots/fullPage.png");

        FileUtils.copyFile(src,trg);

        //capture SC of a specifc area in a page. so the key is write proper Xpath
    }
}
