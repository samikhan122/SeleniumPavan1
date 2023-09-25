package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();


        WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement unitedStates = driver.findElement(By.xpath("//div[@id='box103']"));

        Thread.sleep(3000);
        Actions act = new Actions(driver); // immediately creating and performing
        act.dragAndDrop(rome, unitedStates).build().perform();// immediatly performing
        //build.perform - mouse action build - create the action //perfrom- does thr action
        //build

        Action myaction = act.click().build();// store this in a variable and use it later
        myaction.perform();// now use this action interface
    }
}
