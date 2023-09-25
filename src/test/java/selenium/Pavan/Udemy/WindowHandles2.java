package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowsIds = driver.getWindowHandles(); //2 id one is parent and child and this is the only return value

        //list has a get methods
        //set collection does not support index so we have to write a for loop usually but for now covert set to list to use the get method

        //approach 1- capture id for browser windows

        //converted set--> list
        List<String> windowidsList = new ArrayList(windowsIds); //sp this can be used to retreive indidiual id to change between windows

        String parentWindowID = windowidsList.get(0);
        String childWindowID = windowidsList.get(1);
        //switch to child window
        driver.switchTo().window(childWindowID);

        driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[2]//a")).click();

        //switch to parent window id
        driver.switchTo().window(parentWindowID);

        //Approach 2
        for(String winid:windowsIds)
        {
            String title=driver.switchTo().window(winid).getTitle();

            if( title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
            {
                driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
            }
        }

    }
    //OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM
}
