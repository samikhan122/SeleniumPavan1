package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day017 {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "/Users/devxi.t/Desktop/API/Selenium101/BrowserDriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = driver;
        js.executeScript("window.scroll(0,3000)",""); //scrolling
      //  WebElement username = driver.findElement(By.xpath("//input[@placeholder = 'Username']"));
       // js.executeScript("arguments[0].setAttribute('value,'john')", username);
        driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Admin");
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        ////input[@name = 'username']
        ////input[@placeholder = 'Password']

        driver.quit();



    }
}
