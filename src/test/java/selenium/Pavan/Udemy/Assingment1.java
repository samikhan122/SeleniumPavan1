package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Assingment1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // List<WebElement> searchlinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
        List<WebElement> searchlinks = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div//a"));
        System.out.println("Number of Links:" + searchlinks.size());

        System.out.println("printing & clicking links................");
        for (WebElement link : searchlinks) {
            System.out.println(link.getText());
            link.click();
        }

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("printing Titles");
        for (String getTitle : windowHandles) {


            String title = driver.switchTo().window(getTitle).getTitle();
            System.out.println(title);

        }
        driver.quit();

    }
}
