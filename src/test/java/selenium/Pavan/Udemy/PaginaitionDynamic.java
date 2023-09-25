package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PaginaitionDynamic {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //login
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        //going to customer page
        if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
            driver.findElement(By.xpath("//button[@class='btn-close']")).click();
        }
        driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
        driver.findElement(By.xpath("//ul[@class='collapse show']//li[1]")).click();

        String page_nation = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
        int total_pages = Integer.parseInt(page_nation.substring(page_nation.indexOf("(") + 1, page_nation.indexOf("Pages") - 1));


        System.out.println(total_pages);

        for (int i = 1; i <=total_pages; i++) {

            if (total_pages >=1) {
                //WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li[" + i + "]"));
                WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+i+"]"));
                System.out.println("Active page :" + active_page.getText());
                active_page.click();
                Thread.sleep(2000);

            }
            int numOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
            System.out.println("Total Number of Rows : " + numOfRows);


            for (int r = 1; r < numOfRows; r++) {
                String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[2]")).getText();
                String customerEmail = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[3]")).getText();
                String customerStatus = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[5]")).getText();

                System.out.println(customerName + "\t" + customerEmail + "\t" + customerStatus);
            }

        }
    }


}
