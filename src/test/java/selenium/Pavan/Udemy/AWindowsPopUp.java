package selenium.Pavan.Udemy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWindowsPopUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();


        Alert alert = driver.switchTo().alert();
        alert.sendKeys("WelcomeToAutomation");
        alert.accept();

        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText = "You entered: WelcomeToAutomation";
        Thread.sleep(3000);
        if (actualText.equals(expectedText)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        //accept - to close alert window
        //dismiss - to close alert window
        //get- text window  all work within (alert class) - predefined class alert is an interface class which is implemented in the class already.

        //3 switch window - frames -windows - alert.
        //javascript alert you can see ok and cancel button
    }
}
