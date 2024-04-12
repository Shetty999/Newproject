package Step_defination;

import Page_object.Login;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class step_def {

WebDriver driver;
Login lg;




    @Given("User launch crome browser")
    public void user_launch_crome_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        lg=new Login(driver);

    }


    @When("user opens url {string}")
    public void user_opens_url(String url) {

        driver.get(url);

    }


    @When("user enters email id {string} and password {string}")
    public void user_enters_email_id_and_password(String us, String pass) throws InterruptedException {

        lg.username(us);
        Thread.sleep(3000);
        lg.userpass(pass);

    }

    @When("user click on login")
    public void user_click_on_login() throws InterruptedException{


        lg.userlogin();

    }

    @Then("Page source should contain {string}")
    public void page_source_should_contain(String text) throws InterruptedException {
        if(driver.getPageSource().contains("Invalid credentials"))
        {
            driver.close();
            Assert.assertTrue(false);

        }

        else
        {
            Thread.sleep(3000);

            org.junit.Assert.assertTrue(driver.getPageSource().contains(text));


        }

    }

    @When("user click on logout")
    public void user_click_on_logout() throws InterruptedException {

        lg.userlogout();


    }

    @Then("page title should be {string}")
    public void page_title_should_be(String title) {

        Assert.assertEquals(title, driver.getTitle());
    }

        @Then("close the browser")
        public void close_the_browser() {
            lg.close_browser();

        }
    }

