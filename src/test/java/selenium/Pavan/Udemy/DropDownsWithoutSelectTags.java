package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDownsWithSelectTags {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver.get("https://demo.opencart.com/index.php?route=account/register");
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement slct = driver.findElement(By.xpath("//select[@id='country-list']"));
        Select dropDown = new Select(slct);
        dropDown.selectByVisibleText("USA");
        List<WebElement> options =dropDown.getOptions();
        System.out.println("Total number of DropDowns " + options.size()); // this is giving the number of options avaialble in the drop Down
        for(int i =0;i<options.size();i++){ // this is a for loop to give the values within the dropdown. 
            System.out.println(options.get(i).getText());
        }
        driver.quit();

    }
}
