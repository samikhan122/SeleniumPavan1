package selenium.Pavan.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

public class DeadLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());


        int brokenLinks = 0;

        for (WebElement linkEle : links) {
            String target = linkEle.getAttribute("href");
            //System.out.println(target);
            if (target == null || target.isEmpty()) {
                System.out.println("attribute is empty");
                continue;
            }
            URL linkURl = new URL(target);//transfers a string value for link to url format
            //send request to server to verify the links are working or not
            //1st open the connection and then connect to the server.

            HttpURLConnection conn = (HttpURLConnection) linkURl.openConnection(); // need http connection not just url. uRLCOnnection is the object

            conn.connect();
            if (conn.getResponseCode() >= 400) {

                System.out.println(linkEle.getText() + " Broken Links");
            }else{
                System.out.println("not a broken link");
            }



        }
    }
}
