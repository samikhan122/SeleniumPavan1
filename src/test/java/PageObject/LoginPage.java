package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        driver = driver;
        PageFactory.initElements(driver,this);


    }
    @FindBy(id= "Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath ="//input[@value = 'Login in']")
    @CacheLookup
    WebElement btnLogin;

  //  @FindBy(linkText = "Logout");
    @CacheLookup
    WebElement lnkLogout;

    public void setUserName(String uname){
        txtEmail.clear();
        txtEmail.sendKeys(uname);
    }

}
