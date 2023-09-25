package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDownsWithoutSelectTags {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver.get("https://demo.opencart.com/index.php?route=account/register");
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.findElement(By.xpath("//select[@id='country-list']")).click();
        List<WebElement> options = driver.findElements(By.xpath("//option[normalize-space()='Select Country']"));
        System.out.println(options.size());
        Thread.sleep(4000);
        for(int i=0;i<options.size();i++){
            if (options.get(i).equals("USA")){
                System.out.println(options.get(i));
                options.get(i).click();
            }
        }


    }
}
