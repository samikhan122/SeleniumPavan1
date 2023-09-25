package selenium.webdriver.basicTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class firstTestLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/devxi.t/Desktop/API/Selenium101/BrowserDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
