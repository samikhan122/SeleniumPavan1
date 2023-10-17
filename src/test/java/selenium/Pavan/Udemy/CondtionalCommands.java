package selenium.Pavan.Udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class CondtionalCommands {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demo.nopcommerce.com/register");

        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("is logo displayed? " + logo.isDisplayed());

        boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println(status);

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("is displayed " + searchBox.isDisplayed());
        System.out.println("is Enabled " + searchBox.isEnabled());

        WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println("Female is selected?" + female_rd.isSelected());
        System.out.println("male is selected? " + male_rd.isSelected());

        //after selection of male radio button
        System.out.println("After selection of male radio button");
        male_rd.click();
        System.out.println("male is selected? " + male_rd.isSelected());
        System.out.println("Female is selected?" + female_rd.isSelected());

        //after sellection of both male and female radio button
        System.out.println("After selection of female and male radio button");
        female_rd.click();
        System.out.println("male is selected? " + male_rd.isSelected());
        System.out.println("Female is selected?" + female_rd.isSelected());

        driver.quit();
        //if synchronization issue relies on then wait command is effective otherwise
    }
}
