package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();

       List<WebElement> sliders =  driver.findElements(By.className("homeslider-container"));
        System.out.println(sliders.size());


        List<WebElement> images =  driver.findElements(By.className("item-img"));
        System.out.println(images.size());
        Thread.sleep(2000);
        driver.quit();
    }
}
