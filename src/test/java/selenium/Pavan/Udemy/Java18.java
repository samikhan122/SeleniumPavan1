package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java18 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Macbook");//tag and attibute but without tagname
       // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Macbook"); // this is selector with tag name with class

    }
}
