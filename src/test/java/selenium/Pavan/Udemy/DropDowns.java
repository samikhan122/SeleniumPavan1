package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropDowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//select[@id='country-list']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[normalize-space()='France']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.quit();
    }
}
