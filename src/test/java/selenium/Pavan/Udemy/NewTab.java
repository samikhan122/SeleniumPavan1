package selenium.Pavan.Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.opencart.com/index.php?route=account/login");

    }
}
