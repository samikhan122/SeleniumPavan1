package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // typecasting due to two different interfaces



        driver.findElement(By.id("inputText1")).sendKeys("Welcome To Automation");
        Actions act = new Actions(driver);
        //ctrl a
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        //ctrl c
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        //tab
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform(); // this is to press the tab
        //ctrl v
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
    }
}
