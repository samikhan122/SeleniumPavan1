package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebTableFormat {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //row
        int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        //column
        int column = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();

        System.out.println("Number Of Rows " + row);
        System.out.println("Number Of Column " + column);

        String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
        System.out.println("for a specific value in the data table " + value);

        System.out.println("Book Name " + "\t"+"Author" + "\t"+"Subject " + "\t"+"Price " + "\t");
        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                String value2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]")).getText();
                System.out.print(value2 + "\t");


            }
            System.out.println();

        }

//        for(int r=2;r<=row;r++)
//        {
//            for(int c=1;c<=column;c++)
//            {
//                String value3=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//                System.out.print(value3+"\t");
//            }
//            System.out.println();
//        }

        driver.quit();
    }
}
