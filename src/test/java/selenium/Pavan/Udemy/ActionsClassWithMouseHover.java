package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsClassWithMouseHover {
    public static void main(String[] args) {
       // WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/Users/alikhan/IdeaProjects/SeleniumPavan1/BrowserDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement desktop = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]//div[@class='dropdown-menu']"));
        WebElement desktop1 =driver.findElement(By.xpath("//a[normalize-space()='Desktops']")); // alternative to the top xpath

        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));


        //mouse hover
        Actions act = new Actions(driver);
        act.moveToElement(desktop1).click().build().perform();
        mac.click();

        driver.findElement(By.xpath("//div[@class='button-group']//button[1]")).click();


    }
}
/**
 Mouse hover  -	 moveToElement(Element)
 Right click      -  contextClick(Element)
 Double click  - doubleClick(Element)
 Drag and drop - dragAndDrop()
 slider --- dragAndDropBy(Element, x,y);
 */