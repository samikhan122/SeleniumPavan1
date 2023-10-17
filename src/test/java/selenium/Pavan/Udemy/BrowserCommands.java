package selenium.Pavan.Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserCommands extends BaseClass {

    BaseClass bc;
    public static WebDriver driver;

    @Test
    public void Test01 () {
        bc.setUp(driver);
        //WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().

                window().

                maximize();
        driver.close();
    }
}
