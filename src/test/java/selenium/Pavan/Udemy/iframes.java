package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iframes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        //frame1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("ALiKhan");
        driver.switchTo().defaultContent(); //swtich to


        //frame3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        //driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("LoruBashw");


        //inner frame of frame3
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
        driver.quit();
    }
}
