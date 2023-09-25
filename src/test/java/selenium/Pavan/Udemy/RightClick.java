package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClick = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));

        Actions act = new Actions(driver);
        act.contextClick(rightClick).build().perform();  //right click
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click(); //click on copy options
        driver.switchTo().alert().accept();// close the alert window


    }
}
