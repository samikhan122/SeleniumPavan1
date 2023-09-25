package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.time.Duration;

public class DummyTicket {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //clicking the radio button
        driver.findElement(By.xpath("//input[@id='product_549']")).click();
        driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Ali");
        driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Khan");
        driver.findElement(By.xpath("//input[@id='sex_1']")).click();
        driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("HOUSTON");
        driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("NEW YORK");
        driver.findElement(By.xpath("//input[@id='departon']")).click();

        WebElement monthXapth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select month = new Select(monthXapth);
        month.selectByVisibleText("Nov");

        WebElement yearXpath = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select year = new Select(yearXpath);
        year.selectByVisibleText("2024");


        driver.findElement(By.xpath("//div[@class='menu-container']//button[@type='button']")).click();
        driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("6303237490");
        driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("lorobasheer@gmail.com");
        driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("2000 westborough drive");
        driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Katy");


        //country pick
        driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();
        driver.findElement(By.xpath("//li[@id='select2-billing_country-result-bmns-US']")).click();

        //state pick
        driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();
        driver.findElement(By.xpath("//li[@id='select2-billing_state-result-g3ho-MA']")).click();
        driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("77449");

        //payment details
        driver.findElement(By.xpath("//input[@id='payment_method_yith-stripe']")).click();
        driver.findElement(By.xpath("//div[@id='yith-stripe-card-number']")).sendKeys("1230-5645-5645-1234");
        driver.findElement(By.xpath("//div[@id='yith-stripe-card-expiry']")).sendKeys("06/2028");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='place_order']")).click();

    }
}
