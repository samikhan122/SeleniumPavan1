package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownsWithoutSelectTag {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        List<WebElement> options = driver.findElements(By.xpath("//options[@value='Select Country']"));
        // List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]"));
        //  System.out.println(options.size());
        for (WebElement option : options) {
            String text = option.getText();
            if (text.equals("USA")) {
                option.click();
            }

        }
    }
}
