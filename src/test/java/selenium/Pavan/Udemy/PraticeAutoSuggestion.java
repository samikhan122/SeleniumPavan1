package selenium.Pavan.Udemy;

import io.cucumber.java.zh_tw.當;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PraticeAutoSuggestion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.bing.com/");


        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Java");


        Thread.sleep(3000);
        List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@id='sa_ul']//li"));
        System.out.println(dropdown.size());

        for (int i = 0; i < dropdown.size(); i++) {
           String text = dropdown.get(i).getText();
            System.out.println(text);
            if(text.equals("java burn")){
                dropdown.get(i).click();
                break;
            }

        }


    }

}

