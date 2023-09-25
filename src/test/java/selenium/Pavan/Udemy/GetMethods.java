package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String name = driver.getTitle();// this return the title of the page
        System.out.println(name);

        String name1 = driver.getCurrentUrl();// this returns the url of the whole site and used for validations
        System.out.println(name1);


        System.out.println("Page source" + driver.getPageSource());// return the html of the webpage and used to validate body tags,html
        // is visible or not.additionally used contains method to verify

        System.out.println("getting window handle " +driver.getWindowHandle());
        // getting a string value from the id that is not present in the UI.and it changes everytime when closed and opened again.

        Thread.sleep(3000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //open new browser handles
        Set<String> windowsID= driver.getWindowHandles(); // return the set collection;
        for(String winID:windowsID){
            System.out.println(winID);
        }


        driver.quit();
    }
}
