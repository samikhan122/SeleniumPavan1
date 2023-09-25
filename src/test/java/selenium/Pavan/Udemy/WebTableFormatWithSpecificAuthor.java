package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebTableFormatWithSpecificAuthor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //row
        int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        //column
        int column = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();


//        for (int r = 2; r <= row; r++) {
//            //String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]")).getText();
//            String authorL = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[2]")).getText();
//            if (authorL.equals("Amit")) {
//                String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[1]")).getText();
//                System.out.println(authorL + " " + bookName);
//            }
//
//        }

        // driver.quit();


        	/*for(int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();

			if(author.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(author+"    "+bookname);
			}

		}*/

        //find all number of prices of books
        int sum = 0;
        for (int r = 2; r < row; r++) {
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
            sum = sum + Integer.parseInt(price);
        }
        System.out.println(sum);
            driver.quit();
    }
}
