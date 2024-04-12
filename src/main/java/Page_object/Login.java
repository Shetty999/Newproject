package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public WebDriver rdriver;
    public Login(WebDriver rdriver)
    {
        this.rdriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath="//input[@name=\"username\"] ")
    @CacheLookup
    WebElement uname;

    @FindBy(xpath="//input[@name=\"password\"]")
    @CacheLookup
    WebElement upass;

    @FindBy(xpath="//button[text()=' Login ']")
    @CacheLookup
    WebElement ulogin;

    @FindBy(xpath="//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")
    @CacheLookup
    WebElement clickout;


    @FindBy(xpath="//ul[@class=\"oxd-dropdown-menu\"]//li/a[text()='Logout']")
    @CacheLookup
    WebElement ulogout;

    public void username(String unam) throws InterruptedException
    {
        //uname.clear();
        Thread.sleep(3000);
        uname.sendKeys(unam);

    }

    public void userpass(String upassword) throws InterruptedException
    {
        //upass.clear();
        Thread.sleep(3000);
        upass.sendKeys(upassword);

    }

    public void userlogin() throws InterruptedException
    {
        Thread.sleep(3000);
        ulogin.click();
        Thread.sleep(5000);
    }


    public void userlogout() throws InterruptedException
    {
        Thread.sleep(3000);
        clickout.click();
        Thread.sleep(3000);
        ulogout.click();
        Thread.sleep(3000);
    }

    public void close_browser()
    {
        rdriver.close();
    }
}
