package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame("iframeResult");
        // driver.switchTo().defaultContent(); this swtiches back to basic url
        WebElement f1 = driver.findElement(By.xpath("//input[@id='field1']"));
        f1.clear();
        f1.sendKeys("Welcome");

        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        Actions act = new Actions(driver);
        act.doubleClick(button).build().perform();// this will perfrom the double click field2

        WebElement f2 = driver.findElement(By.xpath("//input[@id='field2']"));

        String copiedText = f2.getAttribute("value");
        System.out.println("Copied Text is "+copiedText);


        if(copiedText.equals("Welcome")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        }
    }
}

/**
 * how to handle frame
 * id
 * name
 * index if all 3 then use directly like the syntax aboove
 */
