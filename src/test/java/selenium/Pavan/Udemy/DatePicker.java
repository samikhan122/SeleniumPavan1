package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //switching to iframe
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);

        //going to the element
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2023"); //MM/DD/YYYY

        String year = "2025";
        String month = "June";
        String date = "11";

        List<WebElement> all_dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));//capture all the date in a month

        for (WebElement dt : all_dates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }


    }
}
